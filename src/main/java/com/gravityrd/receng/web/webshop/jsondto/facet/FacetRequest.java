package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import java.util.Collections;
import java.util.List;

@SuppressWarnings({ "WeakerAccess", "unused" })
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = TermFacetRequest.class)
@JsonSubTypes({
		@Type(value = TermFacetRequest.class, name = "term"),
		@Type(value = RangeFacetRequest.class, name = "range"),
		@Type(value = DynamicRangeFacetRequest.class, name = "dynamic-range"),
})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FacetRequest<T> {
	private Filter<T> filter;
	private String field;

	public FacetRequest(String field, Filter<T> filter) {
		super();
		this.field = field;
		this.filter = filter;
	}

	protected FacetRequest() {}

	public Filter<T> getFilter() {
		return filter;
	}

	public String getField() {
		return field;
	}

	@Override
	public String toString() {
		return "FacetRequest{" + "field='" + field + '\'' +
				", filter=" + filter +
				'}';
	}

	@SuppressWarnings({ "WeakerAccess", "unused" })
	public enum FilterLogic {
		OR, AND
	}

	@SuppressWarnings("unused")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Filter<T> {
		private FilterLogic logic;
		private List<T> values;

		public Filter(FilterLogic logic, List<T> values) {
			super();
			this.logic = logic;
			this.values = values;
		}

		protected Filter() {}

		public FilterLogic getLogic() {
			return logic != null ? logic : FilterLogic.OR;
		}

		public List<T> getValues() {
			return values != null ? Collections.unmodifiableList(values) : null;
		}

		@Override
		public String toString() {
			return "Filter{" + "logic=" + logic +
					", values=" + values +
					'}';
		}
	}
}
