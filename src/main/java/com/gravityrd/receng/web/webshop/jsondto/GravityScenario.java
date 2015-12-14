package com.gravityrd.receng.web.webshop.jsondto;

/**
 * Holds information about the gravity recommendation request scenario.
 */
public class GravityScenario {

	/**
	 * An unique id usable when interacting with the API.
	 */
	public final String apiName;

	/**
	 * A human readable name for the scenario.
	 */
	public final String humanReadableName;

	/**
	 * A more verbose description about the API.
	 */
	public final String description;

	/**
	 * On the DASH the scenarios may have set a custom order, this holds their current position.
	 */
	public final int order;

	/**
	 * This number is the upper limit of items the scenario may return upon recommendation request.
	 */
	public final int numberLimit;

	/**
	 * A string token describing the type of the scenario, such as web, ad, mail and so on.
	 */
	public final String type;

	/**
	 * Allows creating a new scenario object.
	 */
	GravityScenario(final String apiName, final String humanReadableName, final String description, final String type, final int order, final int numberLimit) {
		this.apiName = apiName;
		this.humanReadableName = humanReadableName;
		this.description = description;
		this.type = type;
		this.order = order;
		this.numberLimit = numberLimit;
	}

	/**
	 * Returns a string representation of the object. In general, the toString method returns a string that "textually represents" this object.
	 * @return String the string representation of the object
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("GravityScenario{");
		sb.append("apiName='").append(apiName).append('\'');
		sb.append(", humanReadableName='").append(humanReadableName).append('\'');
		sb.append(", description='").append(description).append('\'');
		sb.append(", order=").append(order);
		sb.append(", numberLimit=").append(numberLimit);
		sb.append(", type='").append(type).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
