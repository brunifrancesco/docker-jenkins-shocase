package com.dunno.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;

/**
 * Created by bruni on 18/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirBNBRestModelResponse {

    @JsonProperty("search_results")
    private ArrayList<SearchResult> searchResults;

    public ArrayList<SearchResult> getSearchResults() {
        return searchResults;
    }

    public AirBNBRestModelResponse() {
    }

    public void setSearchResults(ArrayList<SearchResult> searchResults) {
        this.searchResults = searchResults;


    }

    @JsonIgnoreProperties(ignoreUnknown = false)
    private static class SearchResult {

        @JsonProperty("listing")
        private Listing listing;

        public Listing getListing() {
            return listing;
        }

        public void setListing(Listing listing) {
            this.listing = listing;
        }

        public SearchResult() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = false)
    private static class Listing {

        @JsonProperty("id")
        private Integer id;

        @JsonProperty("bathrooms")
        private Float bathrooms;

        @JsonProperty("bedrooms")
        private Integer bedrooms;

        @JsonProperty("lat")
        private Float lat;

        @JsonProperty("lng")
        private Float lng;

        @JsonProperty("property_type")
        private String propertyType;

        @JsonProperty("picture_urls")
        private ArrayList<String> pictureUrls;

        @JsonProperty("reviews_count")
        private Integer reviewsCount;

        @JsonProperty("pricing_quote")
        private PricingQuote pricing_quote;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Listing() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = false)
    private static class Rate {

        @JsonProperty("amount")
        private Integer amount;

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Rate() {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = false)
    private static class PricingQuote {

        @JsonProperty("rate")
        private Rate rate;

        public Rate getRate() {
            return rate;
        }

        public void setRate(Rate rate) {
            this.rate = rate;
        }
    }
}

