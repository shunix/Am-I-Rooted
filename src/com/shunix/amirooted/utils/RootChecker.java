package com.shunix.amirooted.utils;

import java.io.File;

public final class RootChecker {
	public static boolean checkRootAccess() {
		String buildTags = android.os.Build.TAGS;
		if (buildTags != null && buildTags.contains("test-keys")) {
			return true;
		}
		try {
			String[] strings = new String[] {
					"/data/app/com.noshufou.android.su",
					"/data/app/com.noshufou.android.su.elite",
					"/system/app/Superuser", "/system/app/superuser" };
			for (String string : strings) {
				File file = new File(string);
				if (file.exists()) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return executeCommand("/system/xbin/which su")
				|| executeCommand("/system/bin/which su")
				|| executeCommand("which su");
	}

	private static boolean executeCommand(String command) {
		boolean result;
		try {
			Runtime.getRuntime().exec(command);
			result = true;
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	public static String getBusyboxPath() {
		try {
			String[] strings = new String[] { "/system/xbin/busybox",
					"/system/bin/busybox" };
			for (String string : strings) {
				File file = new File(string);
				if (file.exists()) {
					return string;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Busybox not installed";
	}
	
	public static String getSuPath() {
		try {
			String[] strings = new String[] { "/system/xbin/su",
					"/system/bin/su" };
			for (String string : strings) {
				File file = new File(string);
				if (file.exists()) {
					return string;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Su not installed";
	}
	
	public static String getSudoPath() {
		try {
			String[] strings = new String[] { "/system/xbin/sudo",
					"/system/bin/sudo" };
			for (String string : strings) {
				File file = new File(string);
				if (file.exists()) {
					return string;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Sudo not installed";
	}
	
	public static String getBrand() {
		String brand = "Unknown";
		try {
			brand = android.os.Build.BRAND;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return brand;
	}
	
	public static String getBoard() {
		String board = "Unknown";
		try {
			board = android.os.Build.BOARD;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return board;
	}
	
	public static String getBootloader() {
		String bootloader = "Unknown";
		try {
			bootloader = android.os.Build.BOOTLOADER;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bootloader;
	}
	
	public static String getCpuInstructionSet() {
		String cpuInstructionSet = "Unknown";
		try {
			cpuInstructionSet = android.os.Build.CPU_ABI;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cpuInstructionSet;
	}
	
	public static String getDevice() {
		String device = "Unknown";
		try {
			device = android.os.Build.DEVICE;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return device;
	}
	
	public static String getDisplay() {
		String display = "Unknown";
		try {
			display = android.os.Build.DISPLAY;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return display;
	}
	
	public static String getFingerprint() {
		String fingerprint = "Unknown";
		try {
			fingerprint = android.os.Build.FINGERPRINT;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return fingerprint;
	}
	
	public static String getHardware() {
		String hardware = "Unknown";
		try {
			hardware = android.os.Build.HARDWARE;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return hardware;
	}
	
	public static String getHost() {
		String host = "Unknown";
		try {
			host = android.os.Build.HOST;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return host;
	}
	
	public static String getID() {
		String id = "Unknown";
		try {
			id = android.os.Build.ID;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}
	
	public static String getManufacturer() {
		String manufacturer = "Unknown";
		try {
			manufacturer = android.os.Build.MANUFACTURER;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return manufacturer;
	}
	
	public static String getModel() {
		String model = "Unknown";
		try {
			model = android.os.Build.MODEL;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return model;
	}
	
	public static String getProduct() {
		String product = "Unknown";
		try {
			product = android.os.Build.PRODUCT;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	public static String getRadio() {
		String radio = "Unknown";
		try {
			radio = android.os.Build.getRadioVersion();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return radio;
	}
	
	public static String getSerial() {
		String serial = "Unknown";
		try {
			 serial = android.os.Build.SERIAL;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return serial;
	}
	
	public static String getTags() {
		String tags = "Unknown";
		try {
			tags = android.os.Build.TAGS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tags;
	}
	
	public static String getTime() {
		String time = "Unknown";
		try {
			long t = android.os.Build.TIME;
			time = String.valueOf(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return time;
	}
	
	public static String getType() {
		String type = "Unknown";
		try {
			type = android.os.Build.TYPE;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return type;
	}
	
	public static String getUser() {
		String user = "Unknown";
		try {
			user = android.os.Build.USER;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public static String getCodeName() {
		String codeName = "Unknown";
		try {
			codeName = android.os.Build.VERSION.CODENAME;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return codeName;
	}
	
	public static String getIncremental() {
		String incremental = "Unknown";
		try {
			incremental = android.os.Build.VERSION.INCREMENTAL;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return incremental;
	}
	
	public static String getRelease() {
		String release = "Unknown";
		try {
			release = android.os.Build.VERSION.RELEASE;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return release;
	}
	
	public static String getSDK() {
		String sdk = "Unknown";
		try {
			int sdkint = android.os.Build.VERSION.SDK_INT;
			sdk = String.valueOf(sdkint);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sdk;
	}
}
