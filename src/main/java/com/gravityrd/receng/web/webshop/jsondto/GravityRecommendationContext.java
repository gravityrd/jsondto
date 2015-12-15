package com.gravityrd.receng.web.webshop.jsondto;

import com.gravityrd.receng.web.webshop.jsondto.facet.FacetRequest;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * The context of recommendation.
 */
public class GravityRecommendationContext {

	/**
	 * The time of the recommendation, the time when it will be shown to the end user (seconds in UNIX time).
	 * The default value is the current timestamp.
	 */
	public int recommendationTime = (int) (System.currentTimeMillis() / 1000);

	/**
	 * The maximum number of items in the result.
	 */
	public int numberLimit;

	/**
	 * Scenarios are defined by the scenario management API.
	 * A scenario describes a way how recommended items will be filtered, ordered.
	 */
	public String scenarioId;

	/**
	 *
	 * The NameValues for the context.
	 * NameValues can describe the parameters for the actual scenario, like current item id, filtering by category etc.
	 * Item-to-item recommendation is possible by a specific scenario which parses a NameValue describing the current item,
	 * or multiple NameValues if there are multiple actual items.
	 * The list of allowed names depends on the actual scenario.
	 * <p>The scenario can also specify that the result is not a list of items, but a list of values of item NameValues.</p>
	
	 * <table border="1"  summary="parameters">
	 *	<tr><th>Name</th><th>Description</th></tr>
	 *	<tr><td>CurrentItemId</td><td>The identifier of the actual item, if the current page is an item page.</td></tr>
	 *	<tr><td>ItemOnPage</td><td>Identifier of item displayed elsewhere on the page. They will be excluded from recommendation. This namevalue can be used multiple times to provide a list of items.</td></tr>
	 *	<tr><td>CartItemId</td><td>Identifier of item in the current shopping cart. This can provide additional information to improve the quality of recommendation. This namevalue must be used as many times as many items the shopping cart contains.</td></tr>
	 *	<tr><td>CartItemQuantity</td><td>The quantity of items in the current shopping cart, in the same order as CartItemId namevalues.</td></tr>
	 *	<tr><td>Filter.*</td><td>If specified, only items having the specified name and value as metadata will be in the result.
	 *			For example, the namevalue with name='Filter'.'CategoryId' and value='A' means that only items belonging to category 'A' will be in the result.</td></tr>
	 *
	 * </table>
	 *
	 * The recommendation engine can accept arbitrary namevalues, the list above is just an example of basic properties that are used almost everywhere.
	 *
	 */
	public GravityNameValue[] nameValues;

	/**
	 * If not null, specifies which NameValues of the recommended items should be included in the result.
	 * If null, the returned NameValues are determined by the actual scenario.
	 */
	public String[] resultNameValues;

	public HashMap<String, String[]> resultNameValueFilters;

	@JsonInclude(content = JsonInclude.Include.NON_NULL)
	public List<FacetRequest<?>> facets;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("GravityRecommendationContext{");
		sb.append("recommendationTime=").append(recommendationTime);
		sb.append(", numberLimit=").append(numberLimit);
		sb.append(", scenarioId='").append(scenarioId).append('\'');
		sb.append(", nameValues=").append(Arrays.toString(nameValues));
		sb.append(", resultNameValues=").append(Arrays.toString(resultNameValues));
		sb.append(", resultNameValueFilters=").append(resultNameValueFilters);
		sb.append(", facets=").append(facets);
		sb.append('}');
		return sb.toString();
	}
}
