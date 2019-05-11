package com.mphasis.griffin.testcasesdaoimpl;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mphasis.griffin.configurations.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
@Transactional
public class TestAdminDaoImpl {


	
	
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
