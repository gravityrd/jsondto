package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p><code>RecEngException</code> is thrown by the Recommendation Engine if it
 * cannot execute a business method with the given parameters.</p>
 * <p>It usually indicates that something is wrong with the input parameters,
 * for example null value where not allowed, or referencing a user identifier which was not created previously.</p>
 * <p>It can also indicate an internal error in the recommendation engine, in this case the details of the error can be found in the log files of the recommendation engine.</p>
 * <p>The message of the exception contains a human readable description of the problem.</p>
 */
public class GravityRecEngException extends Exception {
	@JsonProperty("faultInfo")
	public String faultInfo;
	@JsonProperty("message")
	public String message;

	public GravityRecEngException() {
	}

	@JsonCreator
	public GravityRecEngException(@JsonProperty("message") String message, @JsonProperty("faultInfo") String faultInfo) {
		super(faultInfo + " : " + message);
		this.faultInfo = faultInfo;
		this.message = message;
	}

	@SuppressWarnings("Duplicates")
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("GravityRecEngException{");
		sb.append("faultInfo='").append(faultInfo).append('\'');
		sb.append(", message='").append(message).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
