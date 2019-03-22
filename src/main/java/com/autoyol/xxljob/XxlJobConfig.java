package com.autoyol.xxljob;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "com.autoyol.xxljob")
@Configuration
public class XxlJobConfig {
	
    private String adminAddresses;
    private String executorAppName;
    private String executorIp;
    private int executorPort;
    private String accessToken;
    private String executorLogPath;
    private int executorLogRetentionDays;
    
	public String getAdminAddresses() {
		return adminAddresses;
	}
	public void setAdminAddresses(String adminAddresses) {
		this.adminAddresses = adminAddresses;
	}
	public String getExecutorAppName() {
		return executorAppName;
	}
	public void setExecutorAppName(String executorAppName) {
		this.executorAppName = executorAppName;
	}
	public String getExecutorIp() {
		return executorIp;
	}
	public void setExecutorIp(String executorIp) {
		this.executorIp = executorIp;
	}
	public int getExecutorPort() {
		return executorPort;
	}
	public void setExecutorPort(int executorPort) {
		this.executorPort = executorPort;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getExecutorLogPath() {
		return executorLogPath;
	}
	public void setExecutorLogPath(String executorLogPath) {
		this.executorLogPath = executorLogPath;
	}
	public int getExecutorLogRetentionDays() {
		return executorLogRetentionDays;
	}
	public void setExecutorLogRetentionDays(int executorLogRetentionDays) {
		this.executorLogRetentionDays = executorLogRetentionDays;
	}

}
