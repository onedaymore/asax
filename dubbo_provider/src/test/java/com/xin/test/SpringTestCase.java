package com.xin.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringRunner.class)
public abstract  class SpringTestCase extends AbstractJUnit4SpringContextTests{
	 protected Logger logger = LoggerFactory.getLogger(getClass());  
}
