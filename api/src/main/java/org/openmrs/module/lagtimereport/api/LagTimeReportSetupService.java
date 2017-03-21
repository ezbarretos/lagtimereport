/**
 * 
 */
package org.openmrs.module.lagtimereport.api;

import java.util.List;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.lagtimereport.LagTimeReportConfig;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ossemaeb
 */
@Transactional
public interface LagTimeReportSetupService extends OpenmrsService {
	
	@Authorized()
	@Transactional(readOnly = true)
	public LagTimeReportSetup getLagTimeReportSetupByUuid(String uuid) throws APIException;
	
	@Authorized(LagTimeReportConfig.MODULE_PRIVILEGE)
	public LagTimeReportSetup saveLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException;
	
	public LagTimeReportSetup updateLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException;
	
	public List<LagTimeReportSetup> getAllLagTimeReportSetup() throws APIException;
	
	public List<LagTimeReportSetup> getAllLagTimeReportSetup(Boolean includeRetired) throws APIException;
	
	public LagTimeReportSetup getLagTimeReportSetup(Integer lagTimeReportById) throws APIException;
	
	public LagTimeReportSetup retireLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException;
}
