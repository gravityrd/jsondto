package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TermFacetResponse extends FacetResponse {
	
	public static final String TYPE = "term";
	
	public static class TermBucket {
		public String term;
		public long count;
		protected TermBucket() {}
		public TermBucket(String term, long count) {
			super();
			this.term = term;
			this.count = count;
		}
	}

	private List<TermBucket> buckets;
	private long missing;
	private long other;
	
	protected TermFacetResponse() {
	}

	public TermFacetResponse(List<TermBucket> buckets, long missing, long other) {
		super();
		this.buckets = buckets;
		this.missing = missing;
		this.other = other;
	}

	public List<TermBucket> getBuckets() {
		return buckets != null ? Collections.unmodifiableList(buckets) : null;
	}
	
	public long getMissing() {
		return missing;
	}
	
	public long getOther() {
		return other;
	}
}
