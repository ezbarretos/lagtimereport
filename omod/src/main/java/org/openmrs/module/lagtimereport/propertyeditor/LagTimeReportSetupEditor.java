/**
 * 
 */
package org.openmrs.module.lagtimereport.propertyeditor;

import java.beans.PropertyEditorSupport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.openmrs.module.lagtimereport.api.LagTimeReportSetupService;
import org.springframework.util.StringUtils;

/**
 * @author ossemaeb
 */
public class LagTimeReportSetupEditor extends PropertyEditorSupport {
	
	private Log log = LogFactory.getLog(getClass());
	
	public void setAsText(String text) throws IllegalArgumentException {
		LagTimeReportSetupService ls = Context.getService(LagTimeReportSetupService.class);
		if (StringUtils.hasText(text)) {
			try {
				setValue(ls.getLagTimeReportSetup(Integer.valueOf(text)));
			}
			catch (Exception ex) {
				LagTimeReportSetup ts = ls.getLagTimeReportSetupByUuid(text);
				setValue(ts);
				if (ts == null) {
					log.error("Error setting text: " + text, ex);
					throw new IllegalArgumentException("Lag Time Report Setup not found: " + ex.getMessage());
				}
			}
		} else {
			setValue(null);
		}
	}
	
	public String getAsText() {
		LagTimeReportSetup t = (LagTimeReportSetup) getValue();
		if (t == null) {
			return "";
		} else {
			return t.getId().toString();
		}
	}
}
