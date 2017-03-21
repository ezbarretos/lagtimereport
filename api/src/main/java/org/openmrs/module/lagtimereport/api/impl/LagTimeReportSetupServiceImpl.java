/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.lagtimereport.api.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.openmrs.module.lagtimereport.api.LagTimeReportSetupService;
import org.openmrs.module.lagtimereport.api.dao.LagTimeReportSetupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LagTimeReportSetupServiceImpl extends BaseOpenmrsService implements LagTimeReportSetupService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	LagTimeReportSetupDao dao;
	
	@Autowired
	UserService userService;
	
	public LagTimeReportSetupDao getDao() {
		return dao;
	}
	
	public void setDao(LagTimeReportSetupDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public LagTimeReportSetup getLagTimeReportSetupByUuid(String uuid) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LagTimeReportSetup saveLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException {
		//lagTimeReport.setVersion(1.0);
		return dao.saveLagTimeReportSetup(lagTimeReport);
	}
	
	@Override
	public List<LagTimeReportSetup> getAllLagTimeReportSetup() throws APIException {
		return dao.getAllLagTimeReportSetup();
	}
	
	@Override
	public List<LagTimeReportSetup> getAllLagTimeReportSetup(Boolean includeRetired) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LagTimeReportSetup getLagTimeReportSetup(Integer lagTimeReportById) throws APIException {
		return dao.getLagTimeReportSetup(lagTimeReportById);
	}
	
	@Override
	public LagTimeReportSetup retireLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public LagTimeReportSetup updateLagTimeReportSetup(LagTimeReportSetup lagTimeReport) throws APIException {
		
		return dao.updateLagTimeReportSetup(lagTimeReport);
	}
	
}
