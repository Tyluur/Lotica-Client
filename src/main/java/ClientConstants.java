import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author Tyluur <itstyluur@gmail.com>
 * @since 5/14/2016
 */
public class ClientConstants {
	
	/**
	 * The name
	 */
	public static final String NAME = "Dusk";
	
	/**
	 * The build version
	 */
	public static final Double BUILD = 3.0;
	
	/**
	 * The port of the game server
	 */
	public static final int GAME_SERVER_PORT = 43594;
	
	/**
	 * The port of the update server
	 */
	public static final int UPDATE_SERVER_PORT = 43595;
	
	/**
	 * If we should disable useless packets
	 */
	public static final boolean DISABLE_USELESS_PACKETS = false;
	
	/**
	 * If we should connect to the server or not
	 */
	public static final boolean CONNECTING_TO_SERVER = isJarFile();
	
	/**
	 * The IP to connect to
	 */
	public static final String GAME_SERVER_IP = CONNECTING_TO_SERVER ? "world1.dusk.rs" : "127.0.0.1";
	
	/**
	 * The ip of the update server
	 */
	public static final String UPDATE_SERVER_IP = CONNECTING_TO_SERVER ? "world1.dusk.rs" : "127.0.0.1";
	
	/**
	 * The location the cache is saved to
	 */
	public static final String CACHE_LOCATION = System.getProperty("user.home") + File.separator + NAME + "_Cache";
	
	/**
	 * The url to our website
	 */
	public static final String WEBSITE = "dusk.rs";
	
	/**
	 * The default zoom modifier
	 */
	public static int ZOOM_MODIFIER = 3;

	/**
	 * The login responses that were replaced
	 */
	public static final String[][] REPLACED_LOGINS = new String[][]{
/*			{"Your account has negative membership credit. Please log into the billing system to add credit to your account.", "Your account is not legible to log in. Please submit an application on the forums."},
			{"Invalid login or password.<br><br>For accounts created after the 24th of November 2010, please use your email address to login. Otherwise please login with your username.", "You must log in with the forum <col=23CB1D>username</col> & <col=23CB1D>password</col> you registered with."},
			{"Your session has expired. Please click 'Back' in your browser to renew it.", "Database connection error! Please retry in a few minutes..."},
			{"Invalid loginserver requested. Please try using a different world.", "Your account has been nulled.<br>Post this bug on the forums to join the game."},
			{"The server is being updated. Please wait a few minutes and try again.", "A forum account has just been registered for you with the username & password you entered!<br><br>Go back and log in to play."},
			{"Service unavailable.", "Username must be between 3-12<br>characters be alphanumerical."}*/
	};

	/**
	 * If we are running from a jar file
	 */
	public static boolean isJarFile() {
		String className = ClientConstants.class.getName().replace('.', '/');
		String classJar = ClientConstants.class.getResource("/" + className + ".class").toString();
		return classJar.startsWith("jar:");
	}
	
	/**
	 * Gets the integer version of the current build
	 */
	public static int getIntegerVersion() {
		String text = "" + String.valueOf(BUILD);
		String[] split = text.split("\\.");
		return Integer.parseInt(split[0]);
	}
	
	/**
	 * Gets an image from a location
	 *
	 * @param path The path of the image
	 */
	public static Image getImage(String path) {
		if (isJarFile()) {
			path = path.replace("./resource/", "");
			return new ImageIcon(Loader.class.getClassLoader().getResource(path)).getImage();
		} else {
			return Toolkit.getDefaultToolkit().getImage(path);
		}
	}
	
	public static void adjustZoom(int notches) {
		while (notches > 0) {
			if (ZOOM_MODIFIER < 6) {
				ZOOM_MODIFIER++;
			}
			notches--;
		}
		while (notches < 0) {
			if (ZOOM_MODIFIER > 0) {
				ZOOM_MODIFIER--;
			}
			notches++;
		}
	}
}
