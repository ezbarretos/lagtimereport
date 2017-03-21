/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.lagtimereport.web.controller;

import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.openmrs.module.lagtimereport.api.LagTimeReportSetupService;
import org.openmrs.module.lagtimereport.propertyeditor.LagTimeReportSetupEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

/**
 * This class configured as controller using annotation and mapped with the URL of
 * 'module/${rootArtifactid}/${rootArtifactid}Link.form'.
 */
@Controller
@RequestMapping(value = "/module/lagtimereport")
public class LagTimeReportController {
	
	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	LagTimeReportSetupService lagtimeService;
	
	// @Autowired
	// UserService userService;
	
	/** Success form view name */
	private final String VIEW = "/module/lagtimereport/lagtimereport";
	
	private final String VIEW2 = "/module/lagtimereport/setupLagtimereport.form";
	
	/**
	 * Initially called after the getUsers method to get the landing form name
	 * 
	 * @return String form view name
	 */
	
	/**
	 * All the parameters are optional based on the necessity
	 * 
	 * @param httpSession
	 * @param anyRequestObject
	 * @param errors
	 * @return
	 */
	public LagTimeReportSetupService getLagtimeService() {
		return lagtimeService;
	}
	
	public void setLagtimeService(LagTimeReportSetupService lagtimeService) {
		this.lagtimeService = lagtimeService;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(LagTimeReportSetup.class, new LagTimeReportSetupEditor());
	}
	
	@RequestMapping(value = "/lagtimereport.list", method = RequestMethod.GET)
	public void showForm() {
		//model.addAttribute("lagtimereport", new LagTimeReportSetup());
	}
	
	@RequestMapping(value = "/setupLagtimereport.form", method = RequestMethod.GET)
	public void showSetupLagTimeForm() {
		//model.addAttribute("lagtimereport", new LagTimeReportSetup());
		//return "redirect:setupLagtimereport.form";
	}
	
	@ModelAttribute("setupLagtimereport")
	LagTimeReportSetup formBackingObject(@RequestParam(value = "lagtimereportId", required = false) Integer lagtimereportId) {
		if (lagtimereportId != null) {
			LagTimeReportSetup agTimeReportSetup = lagtimeService.getLagTimeReportSetup(lagtimereportId);
			
			return agTimeReportSetup;
		}
		LagTimeReportSetup lagTimeReportSetup = new LagTimeReportSetup();
		
		return lagTimeReportSetup;
	}
	
	@RequestMapping(value = "/setupLagtimereport", method = RequestMethod.POST)
	public String saveLagTimeReportSetup(HttpSession httpSession, HttpServletRequest request,
	        @ModelAttribute("setupLagtimereport") LagTimeReportSetup lagtimereport, BindingResult errors) {
		
		if (errors.hasErrors()) {
			return VIEW;
		}
		LagTimeReportSetup updateLagtimereport = new LagTimeReportSetup();
		double version = 0;
		double updateVersion = 0;
		DecimalFormat df = new DecimalFormat("#.#");
		if (lagtimereport.getLagTimeReportId() != null && lagtimereport.getVersion() != null) {
			version = lagtimereport.getVersion() + 0.1;
			updateVersion = Double.parseDouble(df.format(version));
			updateLagtimereport.setName(lagtimereport.getName());
			updateLagtimereport.setDescription(lagtimereport.getDescription());
			updateLagtimereport.setVersion(updateVersion);
			
			lagtimeService.saveLagTimeReportSetup(updateLagtimereport);
		} else {
			lagtimereport.setVersion(1.0);
			lagtimeService.saveLagTimeReportSetup(lagtimereport);
		}
		
		return "redirect:lagtimereport.list";
	}
	
	@ModelAttribute("reports")
	protected List<LagTimeReportSetup> getAllLagTimeReportSetup() throws Exception {
		List<LagTimeReportSetup> reports = lagtimeService.getAllLagTimeReportSetup();
		
		return reports;
	}
	
}
