import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.URL;
import java.util.Properties;

@SuppressWarnings("serial")
public class Loader extends Applet {
	
	public static final Properties properties = new Properties();
	
	public JFrame windowFrame;
	
	public JPanel gameLayer = new JPanel();
	
	public JPanel componentsLayer;
	
	public URL getDocumentBase() {
		return getCodeBase();
	}
	
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("http://" + ClientConstants.GAME_SERVER_IP);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return url;
	}
	
	public String getParameter(String string) {
		return (String) properties.get(string);
	}
	
	public void init() {
		loadApplet();
	}
	
	void loadApplet() {
		setParms();
		drawClient();
	}
	
	public static void main(String[] strings) throws Exception {
		Loader loader = new Loader();
		loader.doFrame();
	}
	
	public void doFrame() {
		setParms();
		openFrame();
		drawClient();
	}
	
	void setParms() {
		properties.put("cabbase", "g.cab");
		properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		properties.put("colourid", "0");
		properties.put("worldid", "1");
		properties.put("lobbyid", "1");
		properties.put("lobbyaddress", ClientConstants.GAME_SERVER_IP);
		properties.put("demoid", "0");
		properties.put("demoaddress", "");
		properties.put("modewhere", "0");
		properties.put("modewhat", "0");
		properties.put("lang", "0");
		properties.put("objecttag", "0");
		properties.put("js", "1");
		properties.put("game", "0");
		properties.put("affid", "0");
		properties.put("advert", "1");
		properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		properties.put("country", "0");
		properties.put("haveie6", "0");
		properties.put("havefirefox", "1");
		properties.put("cookieprefix", "");
		properties.put("cookiehost", ClientConstants.GAME_SERVER_IP);
		properties.put("cachesubdirid", "0");
		properties.put("crashurl", "");
		properties.put("unsignedurl", "");
		properties.put("sitesettings_member", "1");
		properties.put("frombilling", "false");
		properties.put("sskey", "");
		properties.put("force64mb", "false");
		properties.put("worldflags", "8");
	}
	
	void openFrame() {
		gameLayer.setLayout(new BorderLayout());
		gameLayer.add(this);
		componentsLayer = new JPanel();
		componentsLayer.setLayout(new BorderLayout());
		componentsLayer.add(gameLayer, BorderLayout.CENTER);
		JMenuBar menuBar = new JMenuBar();
		
		componentsLayer.add(menuBar, BorderLayout.PAGE_START);
		windowFrame = new JFrame((ClientConstants.isJarFile() ? "" : "[LOCAL] ") + "" + ClientConstants.NAME + " - The #1 HD RSPS");
		windowFrame.setLayout(new BorderLayout());
		windowFrame.getContentPane().add(componentsLayer, BorderLayout.CENTER);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setBounds(100, 50, 779, 555);
//		windowFrame.setIconImage(ClientConstants.getImage("./icon.png"));
		windowFrame.setVisible(true);
		windowFrame.setLocationRelativeTo(null);
	}
	
	void drawClient() {
		try {
			GameStub.provideLoaderApplet(this);
			client clnt = new client();
			clnt.init();
			clnt.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public static boolean newInterface(int id) {
		if (id > 1144) {
			return true;
		}
		switch (id) {
			case 320:
			case 751:
				return true;
			default:
				return false;
		}
	}
}
