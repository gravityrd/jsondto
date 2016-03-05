package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A name and a value. This can be used to provide information about items, users and events.
 */
@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GravityNameValue {
	public String name;
	public String value;

	public GravityNameValue() {}

	public GravityNameValue(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@SuppressWarnings("Duplicates")
	@Override
	public String toString() {
		return "GravityNameValue{" + "name='" + name + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
