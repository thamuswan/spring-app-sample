/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springapp.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * A task scheduler.
 *
 * @author Thanawat Muangsawang
 */
@Component
public class MainTaskScheduler {

    @Scheduled(initialDelay = 1000, fixedDelay = 15000)
    public void lauchTaskA() {
        System.out.println("Launch a Task 'A'");
    }

}
