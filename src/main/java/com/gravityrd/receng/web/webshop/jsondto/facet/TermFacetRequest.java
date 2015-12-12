package com.gravityrd.receng.web.webshop.jsondto.facet;

public final class TermFacetRequest extends FacetRequest<String> {
	public static enum Order {
		TERM,
		COUNT
	}
	
	
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
}
