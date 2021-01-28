/* ItemDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemDefinitions {
	
	static int anInt1848;
	
	protected int anInt1849;
	
	private short[] originalTextureColors;
	
	protected int anInt1851 = -1;
	
	protected int lendTemplateId;
	
	protected int maleWornModelId1;
	
	static int anInt1854;
	
	static int anInt1855;
	
	private short[] originalModelColors;
	
	protected int certTemplateId;
	
	static int anInt1858;
	
	protected int anInt1859;
	
	protected String name;
	
	static int anInt1861;
	
	protected int anInt1862;
	
	protected int femaleDialogueModel;
	
	protected int anInt1864;
	
	protected short[] modifiedModelColors;
	
	protected int rotationZoom;
	
	protected int maleWornModelId3;
	
	protected Class86 aClass86_1868;
	
	protected int anInt1869;
	
	static int anInt1870;
	
	protected boolean aBoolean1871;
	
	protected int[] stackIds;
	
	protected HashTable aHashTable1873;
	
	protected int anInt1874;
	
	protected int anInt1875;
	
	private int modelLighting;
	
	protected int dummyItem;
	
	protected int maleWornModelId2;
	
	protected int anInt1879;
	
	protected int femaleWornModelId1;
	
	static int anInt1881;
	
	private byte[] aByteArray1882;
	
	protected int femaleWornModelId2;
	
	protected int anInt1884;
	
	static int anInt1885;
	
	private int modelShadowing;
	
	protected int certId;
	
	protected int maleDialogueHat;
	
	protected int anInt1889;
	
	private int anInt1890;
	
	protected int anInt1891;
	
	protected int anInt1892;
	
	private int anInt1893;
	
	static int anInt1894;
	
	private int anInt1895;
	
	private int modelVerticesZ;
	
	protected int femaleDialogueHat;
	
	private int anInt1898;
	
	protected int teamId;
	
	protected int anInt1900;
	
	protected String[] inventoryOptions;
	
	static int anInt1902;
	
	static int anInt1903;
	
	private int modelVerticesX;
	
	protected int anInt1905;
	
	static int anInt1906;
	
	static int anInt1907;
	
	protected int anInt1908;
	
	protected short[] modifiedTextureColors;
	
	static int anInt1910;
	
	private int modelVerticesY;
	
	static int anInt1912;
	
	protected int maleDialogueModel1;
	
	protected int anInt1914;
	
	protected int femaleWornModelId3;
	
	private int anInt1916;
	
	static int anInt1917;
	
	protected int[] stackAmounts;
	
	protected int anInt1919;
	
	protected String[] groundOptions;
	
	static int anInt1921;
	
	static int anInt1922;
	
	static int anInt1923;
	
	protected int anInt1924;
	
	static Node_Sub43 aNode_Sub43_1925;
	
	protected int[] anIntArray1926;
	
	protected int anInt1927;
	
	protected int unknownValue1;
	
	static int anInt1929;
	
	private int anInt1930;
	
	private int anInt1931;
	
	static int anInt1932;
	
	protected boolean showInGrandExchange;
	
	private int equipSlot;
	
	private int equipType;
	
	private boolean exchangeable;
	
	private boolean tradeable;
	
	static final void method1673(int i, int i_0_) {
		anInt1855++;
		if ((Class151.anInt1843 ^ 0xffffffff) == -8 && ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -1 && Class4.anInt124 == 0)) {
			Node_Sub38_Sub23.anInt10347 = i;
			if (i_0_ != 2) {
				method1690((byte) 19);
			}
			Class48.method478(9, (byte) 113);
		}
	}
	
	final ItemDefinitions method1674(int i, int i_1_) {
		if (i_1_ >= -68) {
			return null;
		}
		anInt1902++;
		if (stackAmounts != null && (i ^ 0xffffffff) < -2) {
			int i_2_ = -1;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -11; i_3_++) {
				if ((stackIds[i_3_] ^ 0xffffffff) >= (i ^ 0xffffffff) && (stackIds[i_3_] ^ 0xffffffff) != -1) {
					i_2_ = stackAmounts[i_3_];
				}
			}
			if (i_2_ != -1) {
				return aClass86_1868.method1010(i_2_, 14434);
			}
		}
		return this;
	}
	
	final void method1675(BufferedStream buffer, byte b) {
		anInt1861++;
		for (; ; ) {
			int i_4_ = buffer.readUnsignedByte();
			if (i_4_ == 0) {
				break;
			}
			method1681(buffer, false, i_4_);
		}
	}
	
	final void method1676(byte b, ItemDefinitions itemdefinition_5_, ItemDefinitions itemdefinition_6_) {
		modifiedModelColors = itemdefinition_5_.modifiedModelColors;
		maleDialogueModel1 = itemdefinition_5_.maleDialogueModel1;
		maleDialogueHat = itemdefinition_5_.maleDialogueHat;
		maleWornModelId3 = itemdefinition_5_.maleWornModelId3;
		teamId = itemdefinition_5_.teamId;
		aHashTable1873 = itemdefinition_5_.aHashTable1873;
		aBoolean1871 = itemdefinition_5_.aBoolean1871;
		modifiedTextureColors = itemdefinition_5_.modifiedTextureColors;
		anInt1930 = itemdefinition_5_.anInt1930;
		femaleWornModelId2 = itemdefinition_5_.femaleWornModelId2;
		rotationZoom = itemdefinition_6_.rotationZoom;
		groundOptions = itemdefinition_5_.groundOptions;
		anInt1923++;
		femaleDialogueHat = itemdefinition_5_.femaleDialogueHat;
		aByteArray1882 = itemdefinition_5_.aByteArray1882;
		if (b < 74) {
			method1673(-71, 35);
		}
		anInt1893 = itemdefinition_5_.anInt1893;
		anInt1884 = itemdefinition_6_.anInt1884;
		femaleWornModelId1 = itemdefinition_5_.femaleWornModelId1;
		anInt1898 = itemdefinition_6_.anInt1898;
		inventoryOptions = new String[5];
		anInt1869 = itemdefinition_6_.anInt1869;
		anInt1875 = itemdefinition_6_.anInt1875;
		originalTextureColors = itemdefinition_5_.originalTextureColors;
		anInt1890 = itemdefinition_5_.anInt1890;
		maleWornModelId2 = itemdefinition_5_.maleWornModelId2;
		anInt1924 = 0;
		anInt1895 = itemdefinition_5_.anInt1895;
		originalModelColors = itemdefinition_5_.originalModelColors;
		anInt1905 = itemdefinition_6_.anInt1905;
		anInt1916 = itemdefinition_5_.anInt1916;
		femaleDialogueModel = itemdefinition_5_.femaleDialogueModel;
		anInt1874 = itemdefinition_6_.anInt1874;
		name = itemdefinition_5_.name;
		femaleWornModelId3 = itemdefinition_5_.femaleWornModelId3;
		maleWornModelId1 = itemdefinition_5_.maleWornModelId1;
		anInt1931 = itemdefinition_5_.anInt1931;
		equipSlot = itemdefinition_5_.equipSlot;
		equipType = itemdefinition_5_.equipType;
		if (itemdefinition_5_.inventoryOptions != null) {
			for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
				inventoryOptions[i] = itemdefinition_5_.inventoryOptions[i];
			}
		}
		inventoryOptions[4] = Class22.aClass22_369.method297(aClass86_1868.anInt1161);
	}
	
	final void method1677(ItemDefinitions itemdefinition_7_, int i, ItemDefinitions itemdefinition_8_) {
		anInt1875 = itemdefinition_7_.anInt1875;
		originalModelColors = itemdefinition_7_.originalModelColors;
		anInt1924 = itemdefinition_8_.anInt1924;
		name = itemdefinition_8_.name;
		modifiedTextureColors = itemdefinition_7_.modifiedTextureColors;
		anInt1869 = itemdefinition_7_.anInt1869;
		rotationZoom = itemdefinition_7_.rotationZoom;
		originalTextureColors = itemdefinition_7_.originalTextureColors;
		anInt1898 = itemdefinition_7_.anInt1898;
		anInt1874 = itemdefinition_7_.anInt1874;
		aByteArray1882 = itemdefinition_7_.aByteArray1882;
		anInt1892 = 1;
		anInt1884 = itemdefinition_7_.anInt1884;
		anInt1905 = itemdefinition_7_.anInt1905;
		aBoolean1871 = itemdefinition_8_.aBoolean1871;
		modifiedModelColors = itemdefinition_7_.modifiedModelColors;
		anInt1894++;
	}
	
	final int method1678(int i, int i_10_, int i_11_) {
		anInt1870++;
		if (aHashTable1873 == null) {
			return i_10_;
		}
		Node_Sub32 node_sub32 = (Node_Sub32) aHashTable1873.method1518(i_11_ ^ 0x25bf, (long) i);
		if (i_11_ != 10247) {
			anInt1900 = 69;
		}
		if (node_sub32 == null) {
			return i_10_;
		}
		return node_sub32.anInt7381;
	}
	
	private final int[] method1679(int i, int i_12_, int[] is) {
		anInt1912++;
		int[] is_13_ = new int[1152];
		int i_14_ = 0;
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -33; i_15_++) {
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -37; i_16_++) {
				int i_17_ = is[i_14_];
				if (i_17_ == 0) {
					if ((i_16_ ^ 0xffffffff) >= -1 || (is[-1 + i_14_] ^ 0xffffffff) == -1) {
						if (i_15_ > 0 && (is[i_14_ - 36] ^ 0xffffffff) != -1) {
							i_17_ = i_12_;
						} else if ((i_16_ ^ 0xffffffff) > -36 && (is[i_14_ - -1] ^ 0xffffffff) != -1) {
							i_17_ = i_12_;
						} else if ((i_15_ ^ 0xffffffff) > -32 && is[36 + i_14_] != 0) {
							i_17_ = i_12_;
						}
					} else {
						i_17_ = i_12_;
					}
				}
				is_13_[i_14_++] = i_17_;
			}
		}
		if (i != -1) {
			originalModelColors = null;
		}
		return is_13_;
	}
	
	public static void method1680(byte b) {
		if (b <= 84) {
			anInt1858 = -85;
		}
		aNode_Sub43_1925 = null;
	}
	
	private final void method1681(BufferedStream buffer, boolean bool, int opcode) {
		if (opcode == 1) {
			anInt1898 = buffer.readUnsignedShort();
		} else if (opcode == 2) {
			name = buffer.readString();
		} else if (opcode == 4) {
			anInt1874 = buffer.readUnsignedShort();
		} else if (opcode == 5) {
			anInt1884 = buffer.readUnsignedShort();
		} else if (opcode == 6) {
			anInt1869 = buffer.readUnsignedShort();
		} else if (opcode == 7) {
			anInt1905 = buffer.readUnsignedShort();
			if (anInt1905 > 32767) {
				anInt1905 -= 65536;
			}
		} else if (opcode == 8) {
			anInt1875 = buffer.readUnsignedShort();
			if (anInt1875 > 32767) {
				anInt1875 -= 65536;
			}
		} else if (opcode == 11) {
			anInt1892 = 1;
		} else if (opcode == 12) {
			anInt1924 = buffer.readInt();
		} else if (opcode == 13) {
			equipSlot = buffer.readUnsignedByte();
		} else if (opcode == 14) {
			equipType = buffer.readUnsignedByte();
		} else if (opcode == 15) {
			tradeable = buffer.readUnsignedByte() == 1;
		} else if (opcode == 17) {
			exchangeable = buffer.readUnsignedByte() == 1;
		} else if (opcode == 16) {
			aBoolean1871 = true;
		} else if (opcode == 18) {
			anInt1879 = buffer.readUnsignedShort();
		} else if (opcode == 23) {
			maleWornModelId1 = buffer.readUnsignedShort();
		} else if (opcode == 24) {
			maleWornModelId2 = buffer.readUnsignedShort();
		} else if (opcode == 25) {
			femaleWornModelId1 = buffer.readUnsignedShort();
		} else if (opcode == 26) {
			femaleWornModelId2 = buffer.readUnsignedShort();
		} else if (opcode >= 30 && opcode < 35) {
			groundOptions[opcode - 30] = buffer.readString();
		} else if (opcode >= 35 && opcode < 40) {
			inventoryOptions[opcode - 35] = buffer.readString();
		} else if (opcode == 40) {
			int length = buffer.readUnsignedByte();
			originalModelColors = new short[length];
			modifiedModelColors = new short[length];
			for (int index = 0; length > index; index++) {
				originalModelColors[index] = (short) buffer.readUnsignedShort();
				modifiedModelColors[index] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int length = buffer.readUnsignedByte();
			originalTextureColors = new short[length];
			modifiedTextureColors = new short[length];
			for (int index = 0; index < length; index++) {
				originalTextureColors[index] = (short) buffer.readUnsignedShort();
				modifiedTextureColors[index] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int length = buffer.readUnsignedByte();
			aByteArray1882 = new byte[length];
			for (int index = 0; index < length; index++) {
				aByteArray1882[index] = (byte) buffer.readByte();
			}
		} else if (opcode == 65) {
			showInGrandExchange = true;
		} else if (opcode == 78) {
			maleWornModelId3 = buffer.readUnsignedShort();
		} else if (opcode == 79) {
			femaleWornModelId3 = buffer.readUnsignedShort();
		} else if (opcode == 90) {
			maleDialogueModel1 = buffer.readUnsignedShort();
		} else if (opcode == 91) {
			femaleDialogueModel = buffer.readUnsignedShort();
		} else if (opcode == 92) {
			maleDialogueHat = buffer.readUnsignedShort();
		} else if (opcode == 93) {
			femaleDialogueHat = buffer.readUnsignedShort();
		} else if (opcode == 95) {
			rotationZoom = buffer.readUnsignedShort();
		} else if (opcode == 96) {
			dummyItem = buffer.readUnsignedByte();
		} else if (opcode == 97) {
			certId = buffer.readUnsignedShort();
		} else if (opcode == 98) {
			certTemplateId = buffer.readUnsignedShort();
		} else if (opcode >= 100 && opcode < 110) {
			if (stackAmounts == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackAmounts[opcode - 100] = buffer.readUnsignedShort();
			stackIds[opcode - 100] = buffer.readUnsignedShort();
		} else if (opcode == 110) {
			modelVerticesX = buffer.readUnsignedShort();
		} else if (opcode == 111) {
			modelVerticesY = buffer.readUnsignedShort();
		} else if (opcode == 112) {
			modelVerticesZ = buffer.readUnsignedShort();
		} else if (opcode == 113) {
			modelLighting = buffer.readByte();
		} else if (opcode == 114) {
			modelShadowing = buffer.readByte() * 5;
		} else if (opcode == 115) {
			teamId = buffer.readUnsignedByte();
		} else if (opcode == 121) {
			anInt1927 = buffer.readUnsignedShort();
		} else if (opcode == 122) {
			lendTemplateId = buffer.readUnsignedShort();
		} else if (opcode == 125) {
			anInt1931 = buffer.readByte() << 2;
			anInt1930 = buffer.readByte() << 2;
			anInt1895 = buffer.readByte() << 2;
		} else if (opcode == 126) {
			anInt1890 = buffer.readByte() << 2;
			anInt1893 = buffer.readByte() << 2;
			anInt1916 = buffer.readByte() << 2;
		} else if (opcode == 127) {
			anInt1908 = buffer.readUnsignedByte();
			anInt1889 = buffer.readUnsignedShort();
		} else if (opcode == 128) {
			anInt1849 = buffer.readUnsignedByte();
			anInt1851 = buffer.readUnsignedShort();
		} else if (opcode == 129) {
			anInt1900 = buffer.readUnsignedByte();
			anInt1859 = buffer.readUnsignedShort();
		} else if (opcode == 130) {
			anInt1864 = buffer.readUnsignedByte();
			anInt1862 = buffer.readUnsignedShort();
		} else if (opcode == 132) {
			int length = buffer.readUnsignedByte();
			anIntArray1926 = new int[length];
			for (int index = 0; index < length; index++) {
				anIntArray1926[index] = buffer.readUnsignedShort();
			}
		} else if (opcode == 134) {
			anInt1919 = buffer.readUnsignedByte();
		} else if (opcode == 139) {
			anInt1891 = buffer.readUnsignedShort();
		} else if (opcode == 140) {
			unknownValue1 = buffer.readUnsignedShort();
		} else if (opcode == 249) {
			int length = buffer.readUnsignedByte();
			if (aHashTable1873 == null) {
				int size = Class320_Sub19.method3753(length, -729073628);
				aHashTable1873 = new HashTable(size);
			}
			for (int index = 0; length > index; index++) {
				boolean isString = buffer.readUnsignedByte() == 1;
				int key = buffer.read24BitInteger();
				Node node;
				if (!isString) {
					node = new Node_Sub32(buffer.readInt());
				} else {
					node = new Node_Sub18(buffer.readString());
				}
				aHashTable1873.method1515((long) key, node, -127);
			}
		} else {
			throw new RuntimeException("MISSING OPCODE " + opcode + " FOR ITEM " + name);
		}
		anInt1922++;
	}
	
	final int[] method1682(int i, GraphicsToolkit graphicstoolkit, int i_31_, byte b, int i_32_, boolean bool, PlayerDefinition playerdefinition, GraphicsToolkit graphicstoolkit_33_, Class52 class52, int i_34_) {
		anInt1854++;
		Model model = Renderer.method3448(anInt1898, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if ((model.anInt2614 ^ 0xffffffff) > -14) {
			model.method2081(2, 0);
		}
		if (originalModelColors != null) {
			for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (originalModelColors.length ^ 0xffffffff); i_35_++) {
				if (aByteArray1882 == null || (i_35_ ^ 0xffffffff) <= (aByteArray1882.length ^ 0xffffffff)) {
					model.method2089(originalModelColors[i_35_], modifiedModelColors[i_35_], -126);
				} else {
					model.method2089(originalModelColors[i_35_], Class129.aShortArray1665[0xff & aByteArray1882[i_35_]], -89);
				}
			}
		}
		if (originalTextureColors != null) {
			for (int i_36_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++) {
				model.method2087(originalTextureColors[i_36_], modifiedTextureColors[i_36_], -78);
			}
		}
		if (playerdefinition != null) {
			for (int i_37_ = 0; i_37_ < 10; i_37_++) {
				for (int i_38_ = 0; (Class45.aShortArrayArray5265[i_37_].length ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
					if ((playerdefinition.anIntArray3430[i_37_] ^ 0xffffffff) > (Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_].length ^ 0xffffffff)) {
						model.method2089(Class45.aShortArrayArray5265[i_37_][i_38_], Class117_Sub2.aShortArrayArrayArray5151[i_37_][i_38_][playerdefinition.anIntArray3430[i_37_]], -60);
					}
				}
			}
		}
		int i_39_ = 2048;
		boolean bool_40_ = false;
		if ((modelVerticesX ^ 0xffffffff) != -129 || (modelVerticesY ^ 0xffffffff) != -129 || modelVerticesZ != 128) {
			bool_40_ = true;
			i_39_ |= 0x7;
		}
		DrawableModel drawablemodel = graphicstoolkit_33_.a(model, i_39_, 64, modelLighting + 64, modelShadowing + 768);
		if (!drawablemodel.method612()) {
			return null;
		}
		if (bool_40_) {
			drawablemodel.O(modelVerticesX, modelVerticesY, modelVerticesZ);
		}
		GLSprite glsprite = null;
		if (certTemplateId != -1) {
			glsprite = aClass86_1868.method1002(1, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, 0, 10, true, 0, class52, certId, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if ((lendTemplateId ^ 0xffffffff) != 0) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, anInt1927, -16139);
			if (glsprite == null) {
				return null;
			}
		} else if ((unknownValue1 ^ 0xffffffff) != 0) {
			glsprite = aClass86_1868.method1002(i_34_, graphicstoolkit_33_, graphicstoolkit, playerdefinition, true, i_32_, i_31_, false, 0, class52, anInt1891, -16139);
			if (glsprite == null) {
				return null;
			}
		}
		int i_42_;
		if (bool) {
			i_42_ = (int) (1.5 * (double) anInt1874) << 2;
		} else if (i_34_ != 2) {
			i_42_ = anInt1874 << 2;
		} else {
			i_42_ = (int) ((double) anInt1874 * 1.04) << 2;
		}
		graphicstoolkit_33_.DA(16, 16, 512, 512);
		Class336 class336 = graphicstoolkit_33_.y();
		class336.method3862();
		graphicstoolkit_33_.a(class336);
		graphicstoolkit_33_.xa(1.0F);
		graphicstoolkit_33_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		Class336 class336_43_ = graphicstoolkit_33_.A();
		class336_43_.method3861(-rotationZoom << 3);
		class336_43_.method3856(anInt1869 << 3);
		class336_43_.method3863(anInt1905 << 2, (Class335.anIntArray4167[anInt1884 << 3] * i_42_ >> 14) + -(drawablemodel.fa() / 2) - -(anInt1875 << 2), (Class335.anIntArray4165[anInt1884 << 3] * i_42_ >> 14) - -(anInt1875 << 2));
		class336_43_.method3859(anInt1884 << 3);
		int i_44_ = graphicstoolkit_33_.i();
		int i_45_ = graphicstoolkit_33_.XA();
		graphicstoolkit_33_.f(50, 2147483647);
		graphicstoolkit_33_.ya();
		graphicstoolkit_33_.la();
		graphicstoolkit_33_.aa(0, 0, 36, 32, 0, 0);
		drawablemodel.method611(class336_43_, null, 1);
		graphicstoolkit_33_.f(i_44_, i_45_);
		int[] is = graphicstoolkit_33_.na(0, 0, 36, 32);
		if ((i_34_ ^ 0xffffffff) <= -2) {
			is = method1679(-1, -16777214, is);
			if (i_34_ >= 2) {
				is = method1679(-1, -1, is);
			}
		}
		if ((i_32_ ^ 0xffffffff) != -1) {
			method1688(i_32_, is, -7048);
		}
		graphicstoolkit_33_.method1235(36, 36, 32, is, 0, 7468).method1196(0, 0);
		if ((certTemplateId ^ 0xffffffff) == 0) {
			if (lendTemplateId != -1) {
				glsprite.method1196(0, 0);
			} else if ((unknownValue1 ^ 0xffffffff) != 0) {
				glsprite.method1196(0, 0);
			}
		} else {
			glsprite.method1196(0, 0);
		}
		if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -3 && ((anInt1892 ^ 0xffffffff) == -2 || (i_31_ ^ 0xffffffff) != -2) && i_31_ != -1) {
			class52.method538(0, 9, method1687(22050, i_31_), -16777215, 1, -256);
		}
		is = graphicstoolkit_33_.na(0, 0, 36, 32);
		for (int i_46_ = 0; (is.length ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
			if ((0xffffff & is[i_46_] ^ 0xffffffff) == -1) {
				is[i_46_] = 0;
			} else {
				is[i_46_] = Node_Sub16.method2590(is[i_46_], -16777216);
			}
		}
		return is;
	}
	
	final Model method1683(TemporaryItemDefinition class38, boolean bool, int i) {
		anInt1917++;
		int i_47_;
		int i_48_;
		int i_49_;
		if (!bool) {
			if (class38 != null && class38.maleWornModelIds != null) {
				i_47_ = class38.maleWornModelIds[0];
				i_48_ = class38.maleWornModelIds[1];
				i_49_ = class38.maleWornModelIds[2];
			} else {
				i_49_ = maleWornModelId3;
				i_47_ = maleWornModelId1;
				i_48_ = maleWornModelId2;
			}
		} else if (class38 == null || class38.femaleWornModelIds == null) {
			i_47_ = femaleWornModelId1;
			i_48_ = femaleWornModelId2;
			i_49_ = femaleWornModelId3;
		} else {
			i_49_ = class38.femaleWornModelIds[2];
			i_47_ = class38.femaleWornModelIds[0];
			i_48_ = class38.femaleWornModelIds[1];
		}
		if (i_47_ == -1) {
			return null;
		}
		Model model = Renderer.method3448(i_47_, 7, 0, aClass86_1868.aClass302_1168);
		if (model == null) {
			return null;
		}
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if ((i_48_ ^ 0xffffffff) != 0) {
			Model model_50_ = Renderer.method3448(i_48_, 7, 0, aClass86_1868.aClass302_1168);
			if ((model_50_.anInt2614 ^ 0xffffffff) > -14) {
				model_50_.method2081(2, 0);
			}
			if ((i_49_ ^ 0xffffffff) != 0) {
				Model model_51_ = Renderer.method3448(i_49_, 7, 0, aClass86_1868.aClass302_1168);
				if (model_51_.anInt2614 < 13) {
					model_51_.method2081(2, 0);
				}
				Model[] models = {model, model_50_, model_51_};
				model = new Model(models, 3);
			} else {
				Model[] models = {model, model_50_};
				model = new Model(models, 2);
			}
		}
		if (!bool && (anInt1931 != 0 || (anInt1930 ^ 0xffffffff) != -1 || (anInt1895 ^ 0xffffffff) != -1)) {
			model.method2082(anInt1931, anInt1930, -102, anInt1895);
		}
		if (bool && ((anInt1890 ^ 0xffffffff) != -1 || (anInt1893 ^ 0xffffffff) != -1 || anInt1916 != 0)) {
			model.method2082(anInt1890, anInt1893, 96, anInt1916);
		}
		if (originalModelColors != null) {
			short[] ses;
			if (class38 != null && class38.modifiedModelColors != null) {
				ses = class38.modifiedModelColors;
			} else {
				ses = modifiedModelColors;
			}
			for (int i_52_ = 0; i_52_ < originalModelColors.length; i_52_++) {
				model.method2089(originalModelColors[i_52_], ses[i_52_], 76);
			}
		}
		if (originalTextureColors != null) {
			short[] ses;
			if (class38 != null && class38.modifiedTextureColors != null) {
				ses = class38.modifiedTextureColors;
			} else {
				ses = modifiedTextureColors;
			}
			for (int i_53_ = 0; i_53_ < originalTextureColors.length; i_53_++) {
				model.method2087(originalTextureColors[i_53_], ses[i_53_], -84);
			}
		}
		if (i >= -34) {
			return null;
		}
		return model;
	}
	
	final String method1684(String string, int i, int i_54_) {
		anInt1881++;
		if (aHashTable1873 == null) {
			return string;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) aHashTable1873.method1518(3512, (long) i_54_);
		if (i != -32525) {
			return null;
		}
		if (node_sub18 == null) {
			return string;
		}
		return node_sub18.aString7149;
	}
	
	final Model method1685(boolean bool, TemporaryItemDefinition class38, int i) {
		anInt1848++;
		int i_55_;
		int i_56_;
		if (!bool) {
			if (class38 != null && class38.anIntArray564 != null) {
				i_55_ = class38.anIntArray564[0];
				i_56_ = class38.anIntArray564[1];
			} else {
				i_56_ = maleDialogueHat;
				i_55_ = maleDialogueModel1;
			}
		} else if (class38 == null || class38.anIntArray568 == null) {
			i_55_ = femaleDialogueModel;
			i_56_ = femaleDialogueHat;
		} else {
			i_56_ = class38.anIntArray568[1];
			i_55_ = class38.anIntArray568[0];
		}
		if ((i_55_ ^ 0xffffffff) == 0) {
			return null;
		}
		if (i > -33) {
			return null;
		}
		Model model = Renderer.method3448(i_55_, 7, 0, aClass86_1868.aClass302_1168);
		if (model.anInt2614 < 13) {
			model.method2081(2, 0);
		}
		if (i_56_ != -1) {
			Model model_57_ = Renderer.method3448(i_56_, 7, 0, aClass86_1868.aClass302_1168);
			if ((model_57_.anInt2614 ^ 0xffffffff) > -14) {
				model_57_.method2081(2, 0);
			}
			Model[] models = {model, model_57_};
			model = new Model(models, 2);
		}
		if (originalModelColors != null) {
			short[] ses;
			if (class38 == null || class38.modifiedModelColors == null) {
				ses = modifiedModelColors;
			} else {
				ses = class38.modifiedModelColors;
			}
			for (int i_58_ = 0; (i_58_ ^ 0xffffffff) > (originalModelColors.length ^ 0xffffffff); i_58_++) {
				model.method2089(originalModelColors[i_58_], ses[i_58_], 115);
			}
		}
		if (originalTextureColors != null) {
			short[] ses;
			if (class38 == null || class38.modifiedTextureColors == null) {
				ses = modifiedTextureColors;
			} else {
				ses = class38.modifiedTextureColors;
			}
			for (int i_59_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_59_ ^ 0xffffffff); i_59_++) {
				model.method2087(originalTextureColors[i_59_], ses[i_59_], 101);
			}
		}
		return model;
	}
	
	final boolean method1686(boolean bool, TemporaryItemDefinition class38, int i) {
		anInt1885++;
		int i_60_;
		int i_61_;
		int i_62_;
		if (bool) {
			if (class38 == null || class38.femaleWornModelIds == null) {
				i_61_ = femaleWornModelId1;
				i_60_ = femaleWornModelId3;
				i_62_ = femaleWornModelId2;
			} else {
				i_61_ = class38.femaleWornModelIds[0];
				i_62_ = class38.femaleWornModelIds[1];
				i_60_ = class38.femaleWornModelIds[2];
			}
		} else if (class38 == null || class38.maleWornModelIds == null) {
			i_60_ = maleWornModelId3;
			i_61_ = maleWornModelId1;
			i_62_ = maleWornModelId2;
		} else {
			i_62_ = class38.maleWornModelIds[1];
			i_60_ = class38.maleWornModelIds[2];
			i_61_ = class38.maleWornModelIds[0];
		}
		if (i_61_ == -1) {
			return true;
		}
		boolean bool_64_ = true;
		if (!aClass86_1868.aClass302_1168.method3515(0, i_61_, 0)) {
			bool_64_ = false;
		}
		if (i_62_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_62_, 0)) {
			bool_64_ = false;
		}
		if (i_60_ != -1 && !aClass86_1868.aClass302_1168.method3515(0, i_60_, 0)) {
			bool_64_ = false;
		}
		return bool_64_;
	}
	
	private final String method1687(int i, int i_65_) {
		if (i != 22050) {
			method1693(null, (byte) 39, null);
		}
		anInt1932++;
		if (i_65_ < 100000) {
			return "<col=ffff00>" + i_65_ + "</col>";
		}
		if ((i_65_ ^ 0xffffffff) > -10000001) {
			return "<col=ffffff>" + i_65_ / 1000 + Class22.aClass22_399.method297(aClass86_1868.anInt1161) + "</col>";
		}
		return "<col=00ff80>" + i_65_ / 1000000 + Class22.aClass22_397.method297(aClass86_1868.anInt1161) + "</col>";
	}
	
	private final void method1688(int i, int[] is, int i_66_) {
		if (i_66_ != -7048) {
			anInt1895 = -54;
		}
		for (int i_67_ = 31; (i_67_ ^ 0xffffffff) < -1; i_67_--) {
			int i_68_ = 36 * i_67_;
			for (int i_69_ = 35; i_69_ > 0; i_69_--) {
				if ((is[i_69_ - -i_68_] ^ 0xffffffff) == -1 && is[i_68_ + (i_69_ + -1) - 36] != 0) {
					is[i_69_ + i_68_] = i;
				}
			}
		}
		anInt1907++;
	}
	
	final DrawableModel method1689(Animator animator, int i, PlayerDefinition playerdefinition, int i_70_, GraphicsToolkit graphicstoolkit, int i_71_) {
		anInt1906++;
		if (stackAmounts != null && (i_70_ ^ 0xffffffff) < -2) {
			int i_72_ = -1;
			for (int i_73_ = 0; i_73_ < 10; i_73_++) {
				if ((i_70_ ^ 0xffffffff) <= (stackIds[i_73_] ^ 0xffffffff) && (stackIds[i_73_] ^ 0xffffffff) != -1) {
					i_72_ = stackAmounts[i_73_];
				}
			}
			if (i_72_ != -1) {
				return aClass86_1868.method1010(i_72_, 14434).method1689(animator, i, playerdefinition, 1, graphicstoolkit, 87);
			}
		}
		int i_74_ = i;
		if (animator != null) {
			i_74_ |= animator.method237((byte) -128);
		}
		DrawableModel drawablemodel;
		synchronized (aClass86_1868.aClass61_1176) {
			drawablemodel = (DrawableModel) aClass86_1868.aClass61_1176.method607((long) (anInt1914 | graphicstoolkit.anInt1537 << 29), 0);
		}
		if (i_71_ <= 64) {
			return null;
		}
		if (drawablemodel == null || (graphicstoolkit.b(drawablemodel.ua(), i_74_) ^ 0xffffffff) != -1) {
			if (drawablemodel != null) {
				i_74_ = graphicstoolkit.c(i_74_, drawablemodel.ua());
			}
			int i_75_ = i_74_;
			if (originalTextureColors != null) {
				i_75_ |= 0x8000;
			}
			if (originalModelColors != null || playerdefinition != null) {
				i_75_ |= 0x4000;
			}
			if ((modelVerticesX ^ 0xffffffff) != -129) {
				i_75_ |= 0x1;
			}
			if ((modelVerticesX ^ 0xffffffff) != -129) {
				i_75_ |= 0x2;
			}
			if (modelVerticesX != 128) {
				i_75_ |= 0x4;
			}
			Model model = Renderer.method3448(anInt1898, 7, 0, aClass86_1868.aClass302_1168);
			if (model == null) {
				return null;
			}
			if ((model.anInt2614 ^ 0xffffffff) > -14) {
				model.method2081(2, 0);
			}
			drawablemodel = graphicstoolkit.a(model, i_75_, aClass86_1868.anInt1181, 64 + modelLighting, 850 - -modelShadowing);
			if ((modelVerticesX ^ 0xffffffff) != -129 || modelVerticesY != 128 || (modelVerticesZ ^ 0xffffffff) != -129) {
				drawablemodel.O(modelVerticesX, modelVerticesY, modelVerticesZ);
			}
			if (originalModelColors != null) {
				for (int i_76_ = 0; originalModelColors.length > i_76_; i_76_++) {
					if (aByteArray1882 == null || (aByteArray1882.length ^ 0xffffffff) >= (i_76_ ^ 0xffffffff)) {
						drawablemodel.ia(originalModelColors[i_76_], modifiedModelColors[i_76_]);
					} else {
						drawablemodel.ia(originalModelColors[i_76_], Class129.aShortArray1665[aByteArray1882[i_76_] & 0xff]);
					}
				}
			}
			if (originalTextureColors != null) {
				for (int i_77_ = 0; (originalTextureColors.length ^ 0xffffffff) < (i_77_ ^ 0xffffffff); i_77_++) {
					drawablemodel.aa(originalTextureColors[i_77_], modifiedTextureColors[i_77_]);
				}
			}
			if (playerdefinition != null) {
				for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > -11; i_78_++) {
					for (int i_79_ = 0; (Class45.aShortArrayArray5265[i_78_].length ^ 0xffffffff) < (i_79_ ^ 0xffffffff); i_79_++) {
						if ((Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_].length ^ 0xffffffff) < (playerdefinition.anIntArray3430[i_78_] ^ 0xffffffff)) {
							drawablemodel.ia(Class45.aShortArrayArray5265[i_78_][i_79_], Class117_Sub2.aShortArrayArrayArray5151[i_78_][i_79_][playerdefinition.anIntArray3430[i_78_]]);
						}
					}
				}
			}
			drawablemodel.s(i_74_);
			synchronized (aClass86_1868.aClass61_1176) {
				aClass86_1868.aClass61_1176.method601(drawablemodel, 25566, (long) (anInt1914 | graphicstoolkit.anInt1537 << 29));
			}
		}
		if (animator != null) {
			drawablemodel = drawablemodel.method633((byte) 1, i_74_, true);
			animator.method225(0, drawablemodel, 0);
		}
		drawablemodel.s(i);
		return drawablemodel;
	}
	
	static final void method1690(byte b) {
		Class274.method3325((Class213.aNode_Sub27_2512.aClass320_Sub17_7311.method3747(false) ^ 0xffffffff) == -2, 122, 22050, 2);
		if (b <= -102) {
			anInt1903++;
			AnimableAnimator.aClass42_5498 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 0, 22050, Node_Sub38_Sub20.aCanvas10309);
			AnimableAnimator_Sub1.method256(true, 1405, Class32.method359(null, -9293));
			Packet.aClass42_9402 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 1, 2048, Node_Sub38_Sub20.aCanvas10309);
			Class176.aNode_Sub9_Sub3_2106 = new Node_Sub9_Sub3();
			Packet.aClass42_9402.method441(11757, Class176.aNode_Sub9_Sub3_2106);
			Class361.aClass191_4486 = new Class191(22050, Class365.anInt4523);
			EntityNode_Sub7.method979(17285);
		}
	}
	
	final void method1691(byte b) {
		if (b <= 77) {
			showInGrandExchange = true;
		}
		anInt1910++;
	}
	
	final boolean method1692(int i, TemporaryItemDefinition class38, boolean bool) {
		anInt1921++;
		int i_80_;
		int i_81_;
		if (bool) {
			if (class38 == null || class38.anIntArray568 == null) {
				i_81_ = femaleDialogueModel;
				i_80_ = femaleDialogueHat;
			} else {
				i_81_ = class38.anIntArray568[0];
				i_80_ = class38.anIntArray568[1];
			}
		} else if (class38 != null && class38.anIntArray564 != null) {
			i_80_ = class38.anIntArray564[1];
			i_81_ = class38.anIntArray564[0];
		} else {
			i_80_ = maleDialogueHat;
			i_81_ = maleDialogueModel1;
		}
		if (i_81_ == -1) {
			return true;
		}
		boolean bool_82_ = true;
		if (!aClass86_1868.aClass302_1168.method3515(i, i_81_, 0)) {
			bool_82_ = false;
		}
		if ((i_80_ ^ 0xffffffff) != 0 && !aClass86_1868.aClass302_1168.method3515(0, i_80_, 0)) {
			bool_82_ = false;
		}
		return bool_82_;
	}
	
	final void method1693(ItemDefinitions itemdefinition_83_, byte b, ItemDefinitions itemdefinition_84_) {
		anInt1924 = 0;
		maleWornModelId3 = itemdefinition_84_.maleWornModelId3;
		anInt1892 = itemdefinition_84_.anInt1892;
		aBoolean1871 = itemdefinition_84_.aBoolean1871;
		aByteArray1882 = itemdefinition_84_.aByteArray1882;
		anInt1875 = itemdefinition_83_.anInt1875;
		teamId = itemdefinition_84_.teamId;
		maleWornModelId2 = itemdefinition_84_.maleWornModelId2;
		inventoryOptions = new String[5];
		groundOptions = itemdefinition_84_.groundOptions;
		anInt1930 = itemdefinition_84_.anInt1930;
		maleDialogueModel1 = itemdefinition_84_.maleDialogueModel1;
		anInt1893 = itemdefinition_84_.anInt1893;
		name = itemdefinition_84_.name;
		anInt1874 = itemdefinition_83_.anInt1874;
		originalModelColors = itemdefinition_84_.originalModelColors;
		femaleDialogueHat = itemdefinition_84_.femaleDialogueHat;
		aHashTable1873 = itemdefinition_84_.aHashTable1873;
		femaleWornModelId1 = itemdefinition_84_.femaleWornModelId1;
		anInt1929++;
		anInt1884 = itemdefinition_83_.anInt1884;
		anInt1869 = itemdefinition_83_.anInt1869;
		anInt1890 = itemdefinition_84_.anInt1890;
		maleDialogueHat = itemdefinition_84_.maleDialogueHat;
		femaleWornModelId3 = itemdefinition_84_.femaleWornModelId3;
		modifiedTextureColors = itemdefinition_84_.modifiedTextureColors;
		anInt1931 = itemdefinition_84_.anInt1931;
		femaleDialogueModel = itemdefinition_84_.femaleDialogueModel;
		anInt1898 = itemdefinition_83_.anInt1898;
		modifiedModelColors = itemdefinition_84_.modifiedModelColors;
		femaleWornModelId2 = itemdefinition_84_.femaleWornModelId2;
		anInt1905 = itemdefinition_83_.anInt1905;
		rotationZoom = itemdefinition_83_.rotationZoom;
		if (b > -104) {
			method1687(-128, -32);
		}
		maleWornModelId1 = itemdefinition_84_.maleWornModelId1;
		anInt1916 = itemdefinition_84_.anInt1916;
		anInt1895 = itemdefinition_84_.anInt1895;
		equipSlot = itemdefinition_84_.equipSlot;
		equipType = itemdefinition_84_.equipType;
		originalTextureColors = itemdefinition_84_.originalTextureColors;
		if (itemdefinition_84_.inventoryOptions != null) {
			for (int i = 0; i < 4; i++) {
				inventoryOptions[i] = itemdefinition_84_.inventoryOptions[i];
			}
		}
		inventoryOptions[4] = Class22.aClass22_370.method297(aClass86_1868.anInt1161);
	}
	
	public ItemDefinitions() {
		anInt1849 = -1;
		maleWornModelId1 = -1;
		anInt1864 = -1;
		maleWornModelId2 = -1;
		rotationZoom = 0;
		lendTemplateId = -1;
		anInt1862 = -1;
		anInt1891 = -1;
		maleWornModelId3 = -1;
		modelLighting = 0;
		modelShadowing = 0;
		femaleDialogueModel = -1;
		anInt1874 = 2000;
		anInt1879 = -1;
		teamId = 0;
		aBoolean1871 = false;
		modelVerticesY = 128;
		anInt1905 = 0;
		name = "null";
		anInt1859 = -1;
		modelVerticesX = 128;
		maleDialogueHat = -1;
		femaleDialogueHat = -1;
		anInt1908 = -1;
		anInt1869 = 0;
		anInt1895 = 0;
		anInt1889 = -1;
		anInt1900 = -1;
		anInt1893 = 0;
		femaleWornModelId2 = -1;
		anInt1875 = 0;
		anInt1890 = 0;
		maleDialogueModel1 = -1;
		anInt1919 = 0;
		anInt1892 = 0;
		modelVerticesZ = 128;
		femaleWornModelId3 = -1;
		certTemplateId = -1;
		certId = -1;
		anInt1924 = 1;
		dummyItem = 0;
		unknownValue1 = -1;
		anInt1884 = 0;
		anInt1927 = -1;
		femaleWornModelId1 = -1;
		anInt1930 = 0;
		anInt1916 = 0;
		anInt1931 = 0;
		showInGrandExchange = false;
		equipSlot = -1;
		equipType = -1;
		showInGrandExchange = true;//XXX
	}
	
	public boolean isExchangeable() {
		return exchangeable;
	}
}
