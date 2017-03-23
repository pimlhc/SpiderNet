package com.spidernet.dashboard.service;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml" })
public class LevelServiceTest
{
    @Resource
    LevelService levelService;
    
    @Test
    public void testLevelList(){
        assertNotNull(levelService.queryLevel());
    }
}
