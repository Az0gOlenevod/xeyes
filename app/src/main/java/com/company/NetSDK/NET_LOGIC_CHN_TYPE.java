package com.company.NetSDK;

import java.io.Serializable;

public class NET_LOGIC_CHN_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknow
	 * \else
	 * N4V*
	 * \endif
	 */
	public static final int LOGIC_CHN_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local channel 
	 * \else
	 * 1>5XM(5@
	 * \endif
	 */
	public static final int LOGIC_CHN_LOCAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Remote access channel
	 * \else
	 * T63LM(5@
	 * \endif
	 */
	public static final int LOGIC_CHN_REMOTE = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Synthesis of channel, for the judicial equipment contains picture in picture channel and mixing channel 
	 * \else
	 * :O3IM(5@, 6TSZM%IsIh180|:,;-VP;-M(5@:M;lRtM(5@
	 * \endif
	 */
	public static final int LOGIC_CHN_COMPOSE = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * matrix channel#,including analog matrix and digital matrix
	 * \else
	 * D#Db>XUsM(5@
	 * \endif
	 */
	public static final int LOGIC_CHN_MATRIX = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * cascading channel
	 * \else
	 * <6A*M(5@
	 * \endif
	 */
	public static final int LOGIC_CHN_CASCADE = 5; 
}
