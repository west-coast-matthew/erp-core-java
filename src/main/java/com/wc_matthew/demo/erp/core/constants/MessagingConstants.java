package com.wc_matthew.demo.erp.core.constants;

public class MessagingConstants {
	
	/*************************************************************** 
	 * Queue definitions
	 ***************************************************************/
		/** Clients interested with a dictionary entities entities is updated should subscribe 
		 * to this queue. This supports the ability to cache seldom changing data.*/ 
		public static String QUE_QUEUE_NAME_ENITY_UPDATED = "QUE_QUEUE_NAME_ENITY_UPDATED";
		/** When composition changes for a given tank, requests are placed onto this queue. There should 
		 * be only 'one' global instance.*/
		public static String QUEUE_NAME_COMP_CAL_REQ = "QUEUE_NAME_COMP_CAL_REQ";
		
	/***************************************************************
	 * Message types
	 ***************************************************************/
	 
		/** Requests for composition calculation. Unique identifier for a movement is
		 * provided. */
		public static String MSG_TYPE_COMP_CALC_REQUEST = "MSG_TYPE_COMP_CALC_REQUEST";
		/** Clients that need real time notification of when com calculation is complete 
		 * will looks for these messages. */
		public static String MSG_TYPE_COMP_CAL_COMPLETE = "MSG_TYPE_COMP_CAL_COMPLETE";
		/** Message representing that a dictionary entry was updated. */
		public static String MSG_TYPE_ENTITY_UPDATE = "MSG_TYPE_ENTITY_UPDATE";
		
}
