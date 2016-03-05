package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.List;

@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TermFacetResponse extends FacetResponse {

	public static final String TYPE = "term";
	private List<TermBucket> buckets;
	private long missing;
	private long other;
	private String label;

	protected TermFacetResponse() {}

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

	public String getLabel() {
		return label;
	}

	@SuppressWarnings("unused")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class TermBucket {
		public String term;
		public long count;
		public String label;

		protected TermBucket() {}

		public TermBucket(String term, long count, String label) {
			super();
			this.term = term;
			this.count = count;
			this.label = label;
		}

		@Override
		public String toString() {
			return "TermBucket{" +
					"term='" + term + '\'' +
					", count=" + count +
					", label='" + label + '\'' +
					'}';
		}
	}

	@Override
	public String toString() {
		return "TermFacetResponse{" +
				"buckets=" + buckets +
				", missing=" + missing +
				", other=" + other +
				", label='" + label + '\'' +
				'}';
	}
}
