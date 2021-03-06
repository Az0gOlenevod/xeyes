package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The searched wireless device expended configuration list 
 * \else
 * KQKw5=5DN^O_Ih18@)U9EdVCAP1m
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_LIST_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The wireless device number searched
	 * \else
	 * KQKw5=5DN^O_Ih188vJ}
	 * \endif
	 */
	public byte                bWlanDevCount;
	
	public SDKDEV_WLAN_DEVICE_EX  lstWlanDev[] = new SDKDEV_WLAN_DEVICE_EX[FinalVar.SDK_MAX_WLANDEVICE_NUM_EX];
	
	public SDKDEV_WLAN_DEVICE_LIST_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_WLANDEVICE_NUM_EX; i++) {
			lstWlanDev[i] = new SDKDEV_WLAN_DEVICE_EX();
		}
	}
}
