package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Range {
	private Double from;
	private Double to;

	public Range(Long from, Long to) {
		super();
		this.from = from != null ? from.doubleValue() : null;
		this.to = to != null ? to.doubleValue() : null;
	}

	public Range(Double from, Double to) {
		super();
		this.from = from;
		this.to = to;
	}

	protected Range() {}

	public Double getFrom() {
		return from;
	}

	public Double getTo() {
		return to;
	}

	@Override
	public String toString() {
		return "Range{" +
				"from=" + from +
				", to=" + to +
				'}';
	}
}
