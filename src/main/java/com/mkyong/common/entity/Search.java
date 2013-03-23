package com.mkyong.common.entity;

import java.util.List;

public class Search {

	private List available_filters;

	private List available_sorts;

	private List filters;

	private List related_results;

	private List results;

	private List secondary_results;

	private String site_id;

	private Available_sorts sort;

	public List getAvailable_filters() {
		return this.available_filters;
	}

	public void setAvailable_filters( List available_filters ) {
		this.available_filters = available_filters;
	}

	public List getAvailable_sorts() {
		return this.available_sorts;
	}

	public void setAvailable_sorts( List available_sorts ) {
		this.available_sorts = available_sorts;
	}

	public List getFilters() {
		return this.filters;
	}

	public void setFilters( List filters ) {
		this.filters = filters;
	}
	
	public List getRelated_results() {
		return this.related_results;
	}

	public void setRelated_results( List related_results ) {
		this.related_results = related_results;
	}

	public List getResults() {
		return this.results;
	}

	public void setResults( List results ) {
		this.results = results;
	}

	public List getSecondary_results() {
		return this.secondary_results;
	}

	public void setSecondary_results( List secondary_results ) {
		this.secondary_results = secondary_results;
	}

	public String getSite_id() {
		return this.site_id;
	}

	public void setSite_id( String site_id ) {
		this.site_id = site_id;
	}

}
