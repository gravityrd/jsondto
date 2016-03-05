package com.gravityrd.receng.web.webshop.jsondto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Holds information about the gravity recommendation request scenario.
 */
@SuppressWarnings({ "unused", "WeakerAccess" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GravityScenario {

	/**
	 * Holds an internal number identification.
	 */
	public int id;

	/**
	 * An unique id usable when interacting with the API.
	 */
	public String apiName;

	/**
	 * A human readable name for the scenario.
	 */
	public String humanReadableName;

	/**
	 * A more verbose description about the API.
	 */
	public String description;

	/**
	 * On the DASH the scenarios may have set a custom order, this holds their current position.
	 */
	public int order;

	/**
	 * This number is the upper limit of items the scenario may return upon recommendation request.
	 */
	public int numberLimit;

	/**
	 * A string token describing the type of the scenario, such as web, ad, mail and so on.
	 */
	public String type;

	/**
	 * Holds the name of the last modifier.
	 */
	public String modifierName;

	public GravityScenario() {}

	/**
	 * Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object.
	 * @return String the string representation of the object
	 */
	@Override
	public String toString() {
		return "GravityScenario{" + "id=" + id +
				", apiName='" + apiName + '\'' +
				", humanReadableName='" + humanReadableName + '\'' +
				", description='" + description + '\'' +
				", order=" + order +
				", numberLimit=" + numberLimit +
				", type='" + type + '\'' +
				", modifierName='" + modifierName + '\'' +
				'}';
	}
}
