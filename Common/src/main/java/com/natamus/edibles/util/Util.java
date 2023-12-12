package com.natamus.edibles.util;

import com.natamus.edibles.config.ConfigHandler;

import java.util.Date;
import java.util.HashMap;

public class Util {
	private static final HashMap<String, Date> playerlastuse = new HashMap<String, Date>();
	
	public static boolean canPlayerUse(String playername) {
		if (!playerlastuse.containsKey(playername)) {
			return true;
		}
		
		int mscooldown = ConfigHandler._cooldownInMsBetweenUses;
		if (mscooldown == 0) {
			return true;
		}
		
		Date now = new Date();
		Date lastuse = playerlastuse.get(playername);
		long ms = (now.getTime()-lastuse.getTime());
		return ms >= mscooldown;
	}
	
	public static void setPlayerUse(String playername) {
		playerlastuse.put(playername, new Date());
	}
}
