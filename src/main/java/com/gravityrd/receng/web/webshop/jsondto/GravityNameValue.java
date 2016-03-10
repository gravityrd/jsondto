package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * A name and a value. This can be used to provide information about items, users and events.
 */
@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class GravityNameValue {
	public String name;
	public String value;

	public GravityNameValue() {}

	public GravityNameValue(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Transform grouped into a map of name to a linked set of values
	 * @param nameValues the list of name values
	 * @return nameValues grouped
	 */
	static Map<String, Set<String>> groupNameToSet(GravityNameValue[] nameValues) {
		Map<String, Set<String>> result = new HashMap<>();
		for (GravityNameValue nameValue : nameValues) {
			if (nameValue.name == null || nameValue.value == null) continue;
			if (!result.containsKey(nameValue.name)) result.put(nameValue.name, new LinkedHashSet<String>());
			Collections.addAll(result.get(nameValue.name), nameValue.value);
		}
		return result;
	}

	@SuppressWarnings("Duplicates")
	@Override
	public String toString() {
		return "GravityNameValue{" + "name='" + name + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
