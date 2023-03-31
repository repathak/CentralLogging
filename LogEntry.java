package com.example.logging.bean;

public class LogEntry {
	    private String applicationId;
		private String traceId;
	    private String severity;
	    private String timestamp;
	    private String message;
	    private String componentName;
	    private String requestId;
	    
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	@Override
	public String toString() {
		return "LogEntry [applicationId=" + applicationId + ", traceId=" + traceId + ", severity=" + severity
				+ ", timestamp=" + timestamp + ", message=" + message + ", componentName=" + componentName
				+ ", requestId=" + requestId + "]";
	}

}
