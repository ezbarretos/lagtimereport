package org.openmrs.module.lagtimereport.dao;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openmrs.api.context.Context;
import org.openmrs.module.lagtimereport.LagTimeReportSetup;
import org.openmrs.module.lagtimereport.api.dao.LagTimeReportSetupDao;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

public class LagTimeReportSetupDaoTest extends BaseModuleContextSensitiveTest {
	
	@Autowired
	LagTimeReportSetupDao dao;
	
	/*
	 * 
	 * @Test public void getAllLagTimeReportSetupBoolean() { throw new
	 * RuntimeException("Test not implemented"); }
	 * 
	 * @Test public void getLagTimeReportSetup() { throw new
	 * RuntimeException("Test not implemented"); }
	 * 
	 * @Test public void getLagTimeReportSetupByUuid() { throw new
	 * RuntimeException("Test not implemented"); }
	 */
	@Test
	@Ignore
	public void getAllLagTimeReportSetup() {
		LagTimeReportSetup report = new LagTimeReportSetup();
		report.setName("Karen");
		List<LagTimeReportSetup> list = new ArrayList<LagTimeReportSetup>();
		list.add(report);
		when(dao.getAllLagTimeReportSetup()).thenReturn(list);
		dao.getAllLagTimeReportSetup();
		
		Context.flushSession();
		Context.clearSession();
		assertEquals("Number of persons should be: ", list.size());
		// assertThat(report, hasProperty("name", is(report.getName())));
		
	}
	
	@Test
	@Ignore
	public void saveLagTimeReportSetup() {
		LagTimeReportSetup report = new LagTimeReportSetup();
		report.setName("Karen");
		report.setDescription("Teste");
		//when(dao.saveLagTimeReportSetup(report)).thenReturn(report);
		// When
		dao.saveLagTimeReportSetup(report);
		
		// Let's clean up the cache to be sure getItemByUuid fetches from DB and
		// not from cache
		Context.flushSession();
		Context.clearSession();
		
		// Then
		LagTimeReportSetup savedItem = dao.getLagTimeReportSetupByUuid(report.getUuid());
		
		assertThat(savedItem, hasProperty("uuid", is(report.getUuid())));
		assertThat(savedItem, hasProperty("description", is(report.getDescription())));
		assertThat(savedItem, hasProperty("name", is(report.getName())));
	}
	
}
