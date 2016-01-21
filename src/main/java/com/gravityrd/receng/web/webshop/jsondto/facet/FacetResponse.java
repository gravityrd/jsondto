package com.gravityrd.receng.web.webshop.jsondto.facet;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.	NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl=TermFacetResponse.class)
@JsonSubTypes({
	@Type(value = TermFacetResponse.class, name=TermFacetResponse.TYPE),
	@Type(value = RangeFacetResponse.class, name=RangeFacetResponse.TYPE),
	@Type(value = DynamicRangeFacetResponse.class, name=DynamicRangeFacetResponse.TYPE),
})
public abstract class FacetResponse {
}
