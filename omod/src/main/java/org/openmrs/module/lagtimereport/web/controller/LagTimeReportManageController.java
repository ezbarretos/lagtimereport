/**
 * 
 */
package org.openmrs.module.lagtimereport.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ossemaeb
 */
@Controller
public class LagTimeReportManageController {
	
	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/lagtimereport/manageLagtimereport.list", method = RequestMethod.GET)
	public void onGet() {
		//return VIEW;
	}
	
}
