package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Blind Alarm
 * \else
 * M<OqUZ521(>/
 * \endif
 */
public class SDK_BLIND_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public byte                byBlindEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity 1~6,1 lowest,6 highest
	 * \else
	 * AiCt6H1~6#,1JGWn5M#,6JGWn8_
	 * \endif
	 */
	public byte                byBlindLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process Mode
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE(); 
	
	public SDK_BLIND_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
    			stSect[i][j] = new SDK_TSECT();
    		}
    	}
	}
}
