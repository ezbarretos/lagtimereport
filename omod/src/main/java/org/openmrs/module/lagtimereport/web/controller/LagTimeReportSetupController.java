/**
 * 
 */
package org.openmrs.module.lagtimereport.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.openmrs.module.lagtimereport.api.LagTimeReportSetupService;
import org.openmrs.module.lagtimereport.propertyeditor.LagTimeReportSetupEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ossemaeb
 */
@Controller
public class LagTimeReportSetupController {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	LagTimeReportSetupService lagtimeService;
	
	private final String VIEW = "/module/lagtimereport/setupLagtimereport";
	
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
	
	//@RequestMapping(value = "/module/lagtimereport/setupLagtimereport.form", method = RequestMethod.GET)
	public void showForm() {
		
	}
	
	/*@ModelAttribute("lagtimereport")
	LagTimeReportSetup formBackingObject(@RequestParam(value = "lagtimereportId", required = false) Integer lagtimereportId) {
		if (lagtimereportId != null) {
			LagTimeReportSetup agTimeReportSetup = lagtimeService.getLagTimeReportSetup(lagtimereportId);
			
			return agTimeReportSetup;
		}
		LagTimeReportSetup lagTimeReportSetup = new LagTimeReportSetup();
		
		return lagTimeReportSetup;
	}*/
	
	/*@RequestMapping(value = "/module/lagtimereport/setupLagtimereport", method = RequestMethod.POST)
	public String saveLagTimeReportSetup(HttpSession httpSession,
	        @ModelAttribute("lagtimereport") LagTimeReportSetup lagtimereport, BindingResult errors) {
		
		if (errors.hasErrors()) {
			return VIEW;
		}
		
		lagtimeService.saveLagTimeReportSetup(lagtimereport);
		
		return "redirect:lagtimereport.list";
	}
	
	@RequestMapping(value = "/module/lagtimereport/editReport", method = RequestMethod.GET)
	public String updateLagTimeReportSetup(@PathVariable("lagTimeReportId") int lagTimeReportId, BindingResult result,
	        HttpServletRequest request, Model model) {
		LagTimeReportSetup report = lagtimeService.getLagTimeReportSetup(lagTimeReportId);
		model.addAttribute("report", report);
		return "redirect:setupLagtimereport.form";
	}
	*/
}
