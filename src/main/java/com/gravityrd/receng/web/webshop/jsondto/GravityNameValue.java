package com.gravityrd.receng.web.webshop.jsondto;

/**
 * A name and a value. This can be used to provide information about items, users and events.
 */
public class GravityNameValue {
	public String name;
	public String value;

	public GravityNameValue() {
	}

	public GravityNameValue(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@SuppressWarnings("Duplicates")
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("GravityNameValue{");
		sb.append("name='").append(name).append('\'');
		sb.append(", value='").append(value).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
