package com.autoyol.xxljob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xxl.job.core.executor.XxlJobExecutor;

@Configuration
public class XxlJobConfiguration {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Bean(initMethod = "start", destroyMethod = "destroy")
    public XxlJobExecutor xxlJobExecutor(XxlJobConfig config) {
        logger.info(">>> xxl-job config init.");
        XxlJobExecutor xxlJobExecutor = new XxlJobExecutor();
        xxlJobExecutor.setAdminAddresses(config.getAdminAddresses());
        xxlJobExecutor.setAppName(config.getExecutorAppName());
        xxlJobExecutor.setIp(config.getExecutorIp());
        xxlJobExecutor.setPort(config.getExecutorPort());
        xxlJobExecutor.setAccessToken(config.getAccessToken());
        xxlJobExecutor.setLogPath(config.getExecutorLogPath());
        xxlJobExecutor.setLogRetentionDays(config.getExecutorLogRetentionDays());
        return xxlJobExecutor;
    }

}
