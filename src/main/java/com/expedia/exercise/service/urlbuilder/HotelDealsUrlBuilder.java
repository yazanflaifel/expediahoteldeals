package com.expedia.exercise.service.urlbuilder;

import com.expedia.exercise.utils.DateUtils;
import com.expedia.exercise.vo.SearchFilterInfo;

public class HotelDealsUrlBuilder {
	public static final String SERVICE_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	private static final HotelDealsUrlBuilder HOTEL_DEALS_URL_BUILDER = new HotelDealsUrlBuilder();

	private HotelDealsUrlBuilder() {
	}

	public static HotelDealsUrlBuilder getInstance() {
		return HOTEL_DEALS_URL_BUILDER;
	}

	public String build(SearchFilterInfo searchFilterInfo) {
		StringBuilder url = new StringBuilder();
		url.append(SERVICE_URL);
		url.append(getDestinationParam(searchFilterInfo.getDestinationName(), searchFilterInfo.getDestinationCity(), searchFilterInfo.getRegionIds()));
		url.append(getMinTripStartDateParam(searchFilterInfo.getMinTripStartDate()));
		url.append(getMaxTripStartDateParam(searchFilterInfo.getMaxTripStartDate()));
		url.append(getLengthOfStayParam(searchFilterInfo.getLengthOfStay()));
		url.append(getMinStarRatingParam(searchFilterInfo.getMinStarRating()));
		url.append(getMaxStarRatingParam(searchFilterInfo.getMaxStarRating()));
		url.append(getMinTotalRateParam(searchFilterInfo.getMinTotalRate()));
		url.append(getMaxTotalRateParam(searchFilterInfo.getMaxTotalRate()));
		url.append(getMinGuestRatingParam(searchFilterInfo.getMinGuestRating()));
		url.append(getMaxGuestRatingParam(searchFilterInfo.getMaxGuestRating()));
		return url.toString();
	}

	private String getDestinationParam(String destinationName, String destinationCity, String regionIds) {
		if (destinationName != null && destinationName != "") {
			return "&destinationName=" + destinationName;

		} else if (destinationCity != null && destinationCity != "") {
			return "&destinationCity=" + destinationCity;

		} else if (regionIds != null && regionIds.trim() != "") {
			return "&regionIds=" + regionIds;
		}

		return "";
	}

	private String getMinTripStartDateParam(Long minTripStartDate) {
		if (minTripStartDate == null) {
			return "";
		}

		return "&minTripStartDate=" + DateUtils.getDateInSimpleFormat(minTripStartDate);
	}

	private String getMaxTripStartDateParam(Long maxTripStartDate) {
		if (maxTripStartDate == null) {
			return "";
		}

		return "&maxTripStartDate=" + DateUtils.getDateInSimpleFormat(maxTripStartDate);
	}

	private String getLengthOfStayParam(Integer lengthOfStay) {
		if (lengthOfStay == null) {
			return "";
		}

		return "&lengthOfStay=" + lengthOfStay.toString();
	}

	private String getMinStarRatingParam(Integer minStarRating) {
		if (minStarRating == null) {
			return "";
		}

		return "&minStarRating=" + minStarRating.toString();
	}

	private String getMaxStarRatingParam(Integer maxStarRating) {
		if (maxStarRating == null) {
			return "";
		}

		return "&maxStarRating=" + maxStarRating.toString();
	}

	private String getMinTotalRateParam(Integer minTotalRate) {
		if (minTotalRate == null) {
			return "";
		}

		return "&minTotalRate=" + minTotalRate.toString();
	}

	private String getMaxTotalRateParam(Integer maxTotalRate) {
		if (maxTotalRate == null) {
			return "";
		}

		return "&maxTotalRate=" + maxTotalRate.toString();
	}

	private String getMinGuestRatingParam(Integer minGuestRating) {
		if (minGuestRating == null) {
			return "";
		}

		return "&minGuestRating=" + minGuestRating.toString();
	}

	private String getMaxGuestRatingParam(Integer maxGuestRating) {
		if (maxGuestRating == null) {
			return "";
		}

		return "&maxGuestRating=" + maxGuestRating.toString();
	}

}
