package com.gravityrd.receng.web.webshop.jsondto.facet;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.	NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl=TermFacetRequest.class)
@JsonSubTypes({
	@Type(value = TermFacetRequest.class, name="term"),
	@Type(value = RangeFacetRequest.class, name="range"),
	@Type(value = DynamicRangeFacetRequest.class, name="dynamic-range"),
})
public abstract class FacetRequest<T> {
	
	public enum FilterLogic {
		OR,
		AND
	}
	
	public static class Filter<T> {
		private FilterLogic logic;
		private List<T> values;
		
		public Filter(FilterLogic logic, List<T> values) {
			super();
			this.logic = logic;
			this.values = values;
		}
		
		protected Filter() {	
		}
		
		public FilterLogic getLogic() {
			return logic != null ? logic : FilterLogic.OR;
		}
		
		public List<T> getValues() {
			return values != null ? Collections.unmodifiableList(values) : null;
		}
	}

	private Filter<T> filter;
	private String field;
	
	public FacetRequest(String field, Filter<T> filter) {
		super();
		this.field = field;
		this.filter = filter;
	}
	
	protected FacetRequest() {	
	}

	public Filter<T> getFilter() {
		return filter;
	}
	
	public String getField() {
		return field;
	}
}
