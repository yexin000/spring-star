package com.yx.star.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 测试定时器
 */
@Component
public class CronTestTask {
    private Logger logger = LoggerFactory.getLogger(CronTestTask.class);

    /**
     * 测试定时任务
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    private void testTask() {
        logger.info("定时任务：1分钟执行一次");
    }
}
