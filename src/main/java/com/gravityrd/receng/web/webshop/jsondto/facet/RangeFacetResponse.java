package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Collections;
import java.util.List;

@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RangeFacetResponse extends FacetResponse {

	public static final String TYPE = "range";
	private List<RangeBucket> buckets;
	private String label;

	protected RangeFacetResponse() {}

	public RangeFacetResponse(List<RangeBucket> buckets, String label) {
		super();
		this.buckets = buckets;
		this.label = label;
	}

	public List<RangeBucket> getBuckets() {
		return buckets != null ? Collections.unmodifiableList(buckets) : null;
	}

	public String getLabel() {
		return label;
	}

	@SuppressWarnings("unused")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonIgnoreProperties(ignoreUnknown = true)
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

		@Override
		public String toString() {
			return "RangeBucket{" +
					"from=" + from +
					", to=" + to +
					", count=" + count +
					'}';
		}
	}

	@Override
	public String toString() {
		return "RangeFacetResponse{" +
				"label='" + label + '\'' +
				", buckets=" + buckets +
				'}';
	}
}
