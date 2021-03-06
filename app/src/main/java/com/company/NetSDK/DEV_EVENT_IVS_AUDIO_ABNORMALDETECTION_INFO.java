package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type EVENT_IVS_AUDIO_ABNORMALDETECTION(audio abnormal detection)corresponding data block description info
 * \else
 * JB<~@`PMEVENT_IVS_AUDIO_ABNORMALDETECTION(IyRtRl3#<l2b)6TS&J}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * JB<~7"Iz5DJ1<d
	 * \endif
	 */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * JB<~ID
     * \endif
     */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * The corresponding file info of the event
     * \else
     * JB<~6TS&ND<~PEO"
     * \endif
     */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
     * \if ENGLISH_LANG
     * decubel
     * \else
     * IyRtG?6H
     * \endif
     */
    public int                 nDecibel;
    
    /**
     * \if ENGLISH_LANG
     * frequency
     * \else
     * IyRtF5BJ
     * \endif
     */
    public int                 nFrequency;
    
    /**
     * \if ENGLISH_LANG
     * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
     * \else
     * JB<~6/Ww#,01mJ>Bv3eJB<~,11mJ>3VPxPTJB<~?*J<,21mJ>3VPxPTJB<~=aJx;
     * \endif
     */
    public byte                bEventAction;
    
    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * M<F,5DPr:E, M,R;J1<dDZ(>+H75=Ck)?ID\SP6`UEM<F,, 4S0?*J<
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * Snap flag(by bit),please refer to NET_RESERVED_COMMON
     * \else
     * W%M<1jV>(04N;)#,>_Le<{NET_RESERVED_COMMON
     * \endif
     */
    public int               dwSnapFlagMask;
    
    /**
     * \if ENGLISH_LANG
     * picture resolution
     * \else
     * 6TS&M<F,5D7V1fBJ
     * \endif
     */
    public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();
}
