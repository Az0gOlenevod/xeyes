package com.company.NetSDK;

import java.io.Serializable;

public class NET_RADIOMETRY_ALARMCONTION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int NET_RADIOMETRY_ALARMCONTION_UNKNOWN = 0;
	public final static int NET_RADIOMETRY_ALARMCONTION_BELOW = 1;          // P!SZ
	public final static int NET_RADIOMETRY_ALARMCONTION_MATCH = 2;          // 5HSZ
	public final static int NET_RADIOMETRY_ALARMCONTION_ABOVE = 3;          // 4sSZ
}
