package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

public final class RangeFacetRequest extends FacetRequest<Range> {
	
	private List<Range> ranges;

	public RangeFacetRequest(String field, List<Range> ranges, Filter<Range> filter) {
		super(field, filter);
		this.ranges = ranges;
	}
	
	protected RangeFacetRequest() {
		super();
	}
	
	public List<Range> getRanges() {
		return ranges != null ? Collections.unmodifiableList(ranges) : null;
	}
}
