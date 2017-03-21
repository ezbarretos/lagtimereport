/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.lagtimereport;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openmrs.module.lagtimereport.api.dao.LagTimeReportSetupDao;
import org.openmrs.module.lagtimereport.api.impl.LagTimeReportSetupServiceImpl;

/**
 * This is a unit test, which verifies logic in LagTimeReportService. It doesn't extend
 * BaseModuleContextSensitiveTest, thus it is run without the in-memory DB and Spring context.
 */
public class LagTimeReportServiceTest {
	
	@InjectMocks
	LagTimeReportSetupServiceImpl basicModuleService;
	
	@Mock
	LagTimeReportSetupDao dao;
	
	/*	@Mock
		UserService userService;*/
	
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void saveItem_shouldSetOwnerIfNotSet() {
		//Given
		LagTimeReportSetup item = new LagTimeReportSetup();
		item.setDescription("some description");
		
		when(dao.saveLagTimeReportSetup(item)).thenReturn(item);
		
		/*		User user = new User();
				when(userService.getUser(1)).thenReturn(user);*/
		
		//When
		basicModuleService.saveLagTimeReportSetup(item);
		
		//Then
		//assertThat(item, hasProperty("owner", is(user)));
	}
	
	@Test
	public void listAll() {
		LagTimeReportSetup item = new LagTimeReportSetup();
		item.setDescription("some description");
		List<LagTimeReportSetup> list = new ArrayList<LagTimeReportSetup>();
		list.add(item);
		basicModuleService.getAllLagTimeReportSetup();
		//when(basicModuleService.getAllLagTimeReportSetup()).thenReturn(list);
		
	}
}
