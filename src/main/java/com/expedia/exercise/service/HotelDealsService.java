package com.expedia.exercise.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.expedia.exercise.service.urlbuilder.HotelDealsUrlBuilder;
import com.expedia.exercise.vo.SearchFilterInfo;

@Service
public class HotelDealsService {

	public String getHotelDeals(SearchFilterInfo searchFilterInfo) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(HotelDealsUrlBuilder.getInstance().build(searchFilterInfo), String.class);
	}
}