package com.imooc.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoggerTest.class)
@Slf4j
public class LoggerTest {


    @Test
    public void test1() {
        String name = "imooc";
        log.debug("debug...");
        log.info(name);
        log.error("error...");
    }

}
