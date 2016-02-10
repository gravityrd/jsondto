package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

public final class TermFacetResponse extends FacetResponse {
	
	public static final String TYPE = "term";
	
	public static class TermBucket {
		public String term;
		public long count;
		
		@JsonInclude(JsonInclude.Include.NON_NULL)
		public String label;
		
		protected TermBucket() {}
		
		public TermBucket(String term, long count, String label) {
			super();
			this.term = term;
			this.count = count;
			this.label = label;
		}
	}

	private List<TermBucket> buckets;
	private long missing;
	private long other;
	private String label;
	
	protected TermFacetResponse() {
	}

	public TermFacetResponse(List<TermBucket> buckets, long missing, long other, String label) {
		super();
		this.buckets = buckets;
		this.missing = missing;
		this.other = other;
		this.label = label;
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

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String getLabel() {
		return label;
	}
}
