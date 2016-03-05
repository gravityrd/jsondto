package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.List;

@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
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

	@Override
	public String toString() {
		return "RangeFacetRequest{" +
				"ranges=" + ranges +
				'}';
	}
}
