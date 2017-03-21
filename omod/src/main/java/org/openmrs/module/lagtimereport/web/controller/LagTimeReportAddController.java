/**
 * 
 */
package org.openmrs.module.lagtimereport.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ossemaeb
 */
@Controller
public class LagTimeReportAddController {
	
	@RequestMapping(value = "/module/lagtimereport/addLagtimereport.form", method = RequestMethod.GET)
	public void onGet() {
		//return VIEW;
	}
	
}
