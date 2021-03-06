package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OpenSplitWindow's interface output param(open window)
 * \else
 * OpenSplitWindow=S?ZJd3v2NJ}(?*40)
 * \endif
 */
public class SDK_OUT_SPLIT_OPEN_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Window ID
	 * \else
	 * 40?ZPr:E
	 * \endif
	 */
	public int			nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndow order	
	 * \else
	 * 40?Z4NPr
	 * \endif
	 */
	public int			nZOrder;
}
