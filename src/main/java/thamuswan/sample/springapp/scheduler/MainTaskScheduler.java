/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * A task scheduler.
 *
 * @author Thanawat Muangsawang
 */
@Component
@ConditionalOnProperty(name = "app.scheduler.enabled", havingValue = "true")
public class MainTaskScheduler {

    // Spring uses Logback by default.
    Logger logger = LoggerFactory.getLogger(MainTaskScheduler.class);

    @Scheduled(initialDelay = 1000, fixedDelay = 15000)
    public void lauchTaskA() {
        logger.info("Executing Task 'A'");
    }

}
