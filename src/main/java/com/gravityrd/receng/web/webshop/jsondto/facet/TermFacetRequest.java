package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TermFacetRequest extends FacetRequest<String> {
	private int count;
	private Order order;

	public TermFacetRequest(String field, int count, Order order, Filter<String> filter) {
		super(field, filter);
		this.order = order;
		this.count = count;
	}

	protected TermFacetRequest() {
		super();
	}

	public int getCount() {
		return count;
	}

	public Order getOrder() {
		return order != null ? order : Order.COUNT;
	}

	@Override
	public String toString() {
		return "TermFacetRequest{" +
				"count=" + count +
				", order=" + order +
				'}';
	}

	@SuppressWarnings("unused")
	public enum Order {
		TERM, COUNT
	}
}
