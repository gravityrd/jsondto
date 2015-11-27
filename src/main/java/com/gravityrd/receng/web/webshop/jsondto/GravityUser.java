package com.gravityrd.receng.web.webshop.jsondto;

import java.util.Arrays;

/**
 * A user in the recommendation system. A user is an entity which generates event, and can get recommendations.
 */
public class GravityUser {

	/**
	 * The userId is an external identifier of the user.
	 */
	public String userId;

	/**
	 * A no more existing user should be set to hidden.
	 * The default value is false.
	 */
	public boolean hidden = false;

	/**
	 *
	 * NameValues provide additional description of the user.
     * There can multiple NameValues with the same name.
	 * The order of NameValues will not be preserved.
	 *
	 * The recommendation engine in most cases does not require detailed information about the users, usually only some basic information can be used to enhance the quality of recommendation.
	 * For example:
	 * <table border="1" summary="parameters">
	 *	<tr><th>Name</th><th>Description</th></tr>
	 *	<tr><td>ZipCode</td><td>The zip code of the user.</td></tr>
	 *	<tr><td>City</td><td>The city of the user.</td></tr>
	 *	<tr><td>Country</td><td>The country of the user.</td></tr>
	 * </table>
	 *
	 * The recommendation engine can accept arbitrary namevalues, the list above is just an example of basic properties that are used almost everywhere.
	 * The NameValues which are relevant to business rules and possible content based filtering should be provided to the recommendation engine.
	 */
	public GravityNameValue[] nameValues;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("GravityUser{");
		sb.append("userId='").append(userId).append('\'');
		sb.append(", hidden=").append(hidden);
		sb.append(", nameValues=").append(Arrays.toString(nameValues));
		sb.append('}');
		return sb.toString();
	}
}
