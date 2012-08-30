package com.jonsion.controller;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
 
@ContextConfiguration(locations={
		"file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/spring3-servlet*.xml"
		})
public abstract class AbstractTestCase extends AbstractTestNGSpringContextTests {

}
