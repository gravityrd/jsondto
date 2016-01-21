package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

public class RangeFacetResponse extends FacetResponse {

	public static final String TYPE = "range";

	public static class RangeBucket {
		public Double from;
		public Double to;
		public long count;
		protected RangeBucket() {}
		public RangeBucket(Double from, Double to, long count) {
			super();
			this.from = from;
			this.to = to;
			this.count = count;
		}
	}
	
	private List<RangeBucket> buckets;

	protected RangeFacetResponse() {
	}

	public RangeFacetResponse(List<RangeBucket> buckets) {
		super();
		this.buckets = buckets;
	}

	public List<RangeBucket> getBuckets() {
		return buckets != null ? Collections.unmodifiableList(buckets) : null;
	}
}
