package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p><code>RecEngException</code> is thrown by the Recommendation Engine if it
 * cannot execute a business method with the given parameters.</p>
 * <p>It usually indicates that something is wrong with the input parameters,
 * for example null value where not allowed, or referencing a user identifier which was not created previously.</p>
 * <p>It can also indicate an internal error in the recommendation engine, in this case the details of the error can be found in the log files of the recommendation engine.</p>
 * <p>The message of the exception contains a human readable description of the problem.</p>
 */
@SuppressWarnings({ "unused", "WeakerAccess" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class GravityRecEngException extends Exception {

	@JsonProperty("faultInfo")
	public String faultInfo;

	public GravityRecEngException() {}

	@JsonCreator
	public GravityRecEngException(@JsonProperty("message") String message, @JsonProperty("faultInfo") String faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	@JsonIgnore
	@Override
	public String getLocalizedMessage() {
		return super.getLocalizedMessage();
	}

	@JsonIgnore
	@Override
	public synchronized Throwable getCause() {
		return super.getCause();
	}

	@Override
	public String toString() {
		return "GravityRecEngException{" + "message='" + getMessage() + '\'' + ", faultInfo='" + faultInfo + '\'' + '}';
	}

	@JsonIgnore
	@Override
	public StackTraceElement[] getStackTrace() {
		return super.getStackTrace();
	}
}
