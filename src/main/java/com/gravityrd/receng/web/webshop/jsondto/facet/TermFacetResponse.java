package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TermFacetResponse extends FacetResponse {
	
	public static final String TYPE = "term";
	
	public static class TermBucket {
		public final String term;
		public final long count;
		public TermBucket(String term, long count) {
			super();
			this.term = term;
			this.count = count;
		}
	}

	private List<TermBucket> buckets;
	
	protected TermFacetResponse() {
	}

	public TermFacetResponse(List<TermBucket> buckets) {
		super();
		this.buckets = buckets;
	}

	public List<TermBucket> getBuckets() {
		return buckets != null ? Collections.unmodifiableList(buckets) : null;
	}
}
