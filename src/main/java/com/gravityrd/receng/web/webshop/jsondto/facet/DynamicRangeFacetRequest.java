package com.gravityrd.receng.web.webshop.jsondto.facet;


public final class DynamicRangeFacetRequest extends FacetRequest<Range> {
	
	private int maxRangeCount;
	private int quantum;

	public DynamicRangeFacetRequest(String field, int maxRangeCount, int quantum, Filter<Range> filter) {
		super(field, filter);
		this.maxRangeCount = maxRangeCount;
		this.quantum = quantum;
	}
	
	protected DynamicRangeFacetRequest() {
		super();
	}
	
	public int getMaxRangeCount() {
		return maxRangeCount;
	}
	
	public int getQuantum() {
		return quantum;
	}
}
