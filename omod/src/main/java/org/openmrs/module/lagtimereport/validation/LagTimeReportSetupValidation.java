/**
 * 
 */
package org.openmrs.module.lagtimereport.validation;

import org.openmrs.Form;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author ossemaeb
 */
public class LagTimeReportSetupValidation implements Validator {
	
	@Override
	public boolean supports(Class<?> c) {
		return c.equals(LagTimeReportSetup.class);
	}
	
	@Override
	public void validate(Object obj, Errors errors) {
		LagTimeReportSetup lagtimereport = (LagTimeReportSetup) obj;
		
		if (lagtimereport == null) {
			errors.reject("lagtimereport", "lagtimereport.error.general");
		} else {
			ValidationUtils.rejectIfEmpty(errors, "name", "lagtimereport.error.name");
			ValidationUtils.rejectIfEmpty(errors, "description", "lagtimereport.error.description");
			ValidationUtils.rejectIfEmpty(errors, "forms", "lagtimereport.error.forms");
			
			/*Form forms = (Form) lagtimereport.getForms();
			if (forms == null)
				errors.rejectValue("forms", "lagtimereport.form.emptyForm");
			errors.rejectValue("forms", "lagtimereport.form.notSupportedForm");*/
		}
		
	}
	
}
