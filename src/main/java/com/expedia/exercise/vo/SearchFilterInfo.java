package com.expedia.exercise.vo;

public class SearchFilterInfo {
	
	private String destinationName;
	private String destinationCity;
	private String regionIds;
	private Long minTripStartDate;
	private Long maxTripStartDate;
	private Integer lengthOfStay;
	private Integer minStarRating;
	private Integer maxStarRating;
	private Integer minTotalRate;
	private Integer maxTotalRate;
	private Integer minGuestRating;
	private Integer maxGuestRating;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
	}

	public Long getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(Long minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public Long getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(Long maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Integer getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(Integer minStarRating) {
		this.minStarRating = minStarRating;
	}

	public Integer getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(Integer maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public Integer getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(Integer minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public Integer getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(Integer maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public Integer getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(Integer minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public Integer getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(Integer maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinationCity == null) ? 0 : destinationCity.hashCode());
		result = prime * result + ((destinationName == null) ? 0 : destinationName.hashCode());
		result = prime * result + ((lengthOfStay == null) ? 0 : lengthOfStay.hashCode());
		result = prime * result + ((maxGuestRating == null) ? 0 : maxGuestRating.hashCode());
		result = prime * result + ((maxStarRating == null) ? 0 : maxStarRating.hashCode());
		result = prime * result + ((maxTotalRate == null) ? 0 : maxTotalRate.hashCode());
		result = prime * result + ((maxTripStartDate == null) ? 0 : maxTripStartDate.hashCode());
		result = prime * result + ((minGuestRating == null) ? 0 : minGuestRating.hashCode());
		result = prime * result + ((minStarRating == null) ? 0 : minStarRating.hashCode());
		result = prime * result + ((minTotalRate == null) ? 0 : minTotalRate.hashCode());
		result = prime * result + ((minTripStartDate == null) ? 0 : minTripStartDate.hashCode());
		result = prime * result + ((regionIds == null) ? 0 : regionIds.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SearchFilterInfo other = (SearchFilterInfo) obj;
		if (destinationCity == null) {
			if (other.destinationCity != null) {
				return false;
			}
		} else if (!destinationCity.equals(other.destinationCity)) {
			return false;
		}
		if (destinationName == null) {
			if (other.destinationName != null) {
				return false;
			}
		} else if (!destinationName.equals(other.destinationName)) {
			return false;
		}
		if (lengthOfStay == null) {
			if (other.lengthOfStay != null) {
				return false;
			}
		} else if (!lengthOfStay.equals(other.lengthOfStay)) {
			return false;
		}
		if (maxGuestRating == null) {
			if (other.maxGuestRating != null) {
				return false;
			}
		} else if (!maxGuestRating.equals(other.maxGuestRating)) {
			return false;
		}
		if (maxStarRating == null) {
			if (other.maxStarRating != null) {
				return false;
			}
		} else if (!maxStarRating.equals(other.maxStarRating)) {
			return false;
		}
		if (maxTotalRate == null) {
			if (other.maxTotalRate != null) {
				return false;
			}
		} else if (!maxTotalRate.equals(other.maxTotalRate)) {
			return false;
		}
		if (maxTripStartDate == null) {
			if (other.maxTripStartDate != null) {
				return false;
			}
		} else if (!maxTripStartDate.equals(other.maxTripStartDate)) {
			return false;
		}
		if (minGuestRating == null) {
			if (other.minGuestRating != null) {
				return false;
			}
		} else if (!minGuestRating.equals(other.minGuestRating)) {
			return false;
		}
		if (minStarRating == null) {
			if (other.minStarRating != null) {
				return false;
			}
		} else if (!minStarRating.equals(other.minStarRating)) {
			return false;
		}
		if (minTotalRate == null) {
			if (other.minTotalRate != null) {
				return false;
			}
		} else if (!minTotalRate.equals(other.minTotalRate)) {
			return false;
		}
		if (minTripStartDate == null) {
			if (other.minTripStartDate != null) {
				return false;
			}
		} else if (!minTripStartDate.equals(other.minTripStartDate)) {
			return false;
		}
		if (regionIds == null) {
			if (other.regionIds != null) {
				return false;
			}
		} else if (!regionIds.equals(other.regionIds)) {
			return false;
		}
		return true;
	}
}
