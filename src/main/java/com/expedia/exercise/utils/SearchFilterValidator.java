package com.expedia.exercise.utils;

import com.expedia.exercise.vo.SearchFilterInfo;

public class SearchFilterValidator {

	private static final SearchFilterValidator SEARCH_FILTER_VALIDATOR = new SearchFilterValidator();

	private SearchFilterValidator() {
	}

	public static SearchFilterValidator getInstance() {
		return SEARCH_FILTER_VALIDATOR;
	}

	public void validate(SearchFilterInfo searchFilterInfo) throws Exception {
		if (searchFilterInfo == null) {
			return;
		}
		
		validateMinStarRating(searchFilterInfo.getMinStarRating());
		validateMaxStarRating(searchFilterInfo.getMaxStarRating());
		validateLengthOfStay(searchFilterInfo.getMaxStarRating());
		validateMinTotalRate(searchFilterInfo.getMinTotalRate());
		validateMaxTotalRate(searchFilterInfo.getMaxTotalRate());
		validateMinGuestRating(searchFilterInfo.getMinGuestRating());
		validateMaxGuestRating(searchFilterInfo.getMaxGuestRating());
	}

	private void validateMinStarRating(Integer minStarRating) throws Exception {
		if (minStarRating != null && (minStarRating.intValue() < 0 || minStarRating.intValue() > 5)) {
			throw new Exception("Invalid min star rating it shuold be from 0 to 5");
		}
	}

	private void validateMaxStarRating(Integer maxStarRating) throws Exception {
		if (maxStarRating != null && (maxStarRating.intValue() < 0 || maxStarRating.intValue() > 5)) {
			throw new Exception("Invalid max star rating it shuold be from 0 to 5");
		}
	}

	private void validateLengthOfStay(Integer lengthOfStay) throws Exception {
		if (lengthOfStay != null && lengthOfStay.intValue() < 0) {
			throw new Exception("Length of stay is less than 0");
		}
	}

	private void validateMinTotalRate(Integer minTotalRate) throws Exception {
		if (minTotalRate != null && minTotalRate.intValue() < 0) {
			throw new Exception("Min total rate is less than 0");
		}
	}

	private void validateMaxTotalRate(Integer maxTotalRate) throws Exception {
		if (maxTotalRate != null && maxTotalRate.intValue() < 0) {
			throw new Exception("Max total rate is less than 0");
		}
	}

	private void validateMinGuestRating(Integer minGuestRating) throws Exception {
		if (minGuestRating != null && minGuestRating.intValue() < 0) {
			throw new Exception("Min guest rating is less than 0");
		}
	}

	private void validateMaxGuestRating(Integer maxGuestRating) throws Exception {
		if (maxGuestRating != null && maxGuestRating.intValue() < 0) {
			throw new Exception("Max guest rating is less than 0");
		}
	}
}
