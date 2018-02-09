package com.expedia.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expedia.exercise.controller.response.ResponseError;
import com.expedia.exercise.service.HotelDealsService;
import com.expedia.exercise.utils.SearchFilterValidator;
import com.expedia.exercise.vo.SearchFilterInfo;

@RestController
@RequestMapping(value = "/expedia")
public class HotelDealsController {

	@Autowired
	private HotelDealsService hotelDealsService;

	@RequestMapping(value = "/hotel_deals", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String hotelDeals(SearchFilterInfo searchFilterInfo) {
		try {
			SearchFilterValidator.getInstance().validate(searchFilterInfo);
			return hotelDealsService.getHotelDeals(searchFilterInfo);
		} catch (Exception e) {
			return new ResponseError(e.getMessage()).getJsonResponse();
		}
	}
}