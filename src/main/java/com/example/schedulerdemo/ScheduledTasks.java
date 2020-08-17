package com.example.schedulerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() {
//        System.out.println("Fixed Rate Task :: Execution Time - {}" + dateTimeFormatter.format(LocalDateTime.now()));
    }

    public void scheduleTaskWithFixedDelay() {}

    public void scheduleTaskWithInitialDelay() {}

    @Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression() {
        System.out.println("Fixed Rate Task :: Execution Time - {}" + dateTimeFormatter.format(LocalDateTime.now()));
    }
}
