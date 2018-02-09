function renderDeals() {
	$.getJSON("expedia/hotel_deals?" + getParams(), function(data) {

	}).always(function(data) {
		if (data.error) {
			renderErrorMessage(data.error);
			return;
		}

		if (data.offers != null) {
			renderDealsData(data.offers.Hotel);
		} else {
			renderNoResultsFound();
		}
	});
}

function getParams() {
	var isAdded = false;
	var params = "";
	if ($('#destinationName').val().length != 0) {
		params = params.concat("destinationName=" + $('#destinationName').val());
		isAdded = true;
	}

	if ($('#destinationCity').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}
		params = params.concat("destinationCity=" + $('#destinationCity').val());
		isAdded = true;
	}

	if ($('#regionIds').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("regionIds=" + $('#regionIds').val());
		isAdded = true;
	}

	if ($('#minTripStartDate').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		var splittedMinTripStartDate = $('#minTripStartDate').val().split("-");
		params = params.concat("minTripStartDate=" + new Date(splittedMinTripStartDate[0], splittedMinTripStartDate[1], splittedMinTripStartDate[2]).getTime());
		isAdded = true;
	}

	if ($('#maxTripStartDate').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		var splittedMaxTripStartDate = $('#maxTripStartDate').val().split("-");
		params = params.concat("maxTripStartDate=" + new Date(splittedMaxTripStartDate[0], splittedMaxTripStartDate[1], splittedMaxTripStartDate[2]).getTime());
		isAdded = true;
	}

	if ($('#minStarRating').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("minStarRating=" + $('#minStarRating').val());
		isAdded = true;
	}

	if ($('#maxStarRating').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&maxStarRating=" + $('#maxStarRating').val());
		isAdded = true;
	}

	if ($('#minTotalRate').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&minTotalRate=" + $('#minTotalRate').val());
		isAdded = true;
	}

	if ($('#lengthOfStay').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&lengthOfStay=" + $('#lengthOfStay').val());
		isAdded = true;
	}

	if ($('#maxTotalRate').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&maxTotalRate=" + $('#maxTotalRate').val());
		isAdded = true;
	}

	if ($('#minGuestRating').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&minGuestRating=" + $('#minGuestRating').val());
		isAdded = true;
	}

	if ($('#maxGuestRating').val().length != 0) {
		if (isAdded) {
			params = params.concat("&");
		}

		params = params.concat("&maxGuestRating=" + $('#maxGuestRating').val());
		isAdded = true;
	}

	return params;
}

function renderDealsData(hotels) {
	$('#dealsResults').remove();
	$('#error').remove();
	
	var htmlDeals = "";
	htmlDeals = htmlDeals.concat("<div id=\"dealsResults\">");

	for (var i = 0; i < hotels.length; i++) {
		var hotel = hotels[i];

		htmlDeals = htmlDeals.concat('<div class="col-sm-6"> <div class="well">');
		htmlDeals = htmlDeals.concat('<img class="card-img-top" src="');
		htmlDeals = htmlDeals.concat(hotel.hotelInfo.hotelImageUrl);
		htmlDeals = htmlDeals.concat('"><div class="card-block"><h4 class="card-title">');
		htmlDeals = htmlDeals.concat(hotel.hotelInfo.hotelName);
		htmlDeals = htmlDeals.concat('</h4><p class="card-text"> City: ');
		htmlDeals = htmlDeals.concat(hotel.hotelInfo.hotelCity);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat("average price: ");
		htmlDeals = htmlDeals.concat(hotel.hotelPricingInfo.averagePriceValue);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat("Price per night: ");
		htmlDeals = htmlDeals.concat(hotel.hotelPricingInfo.originalPricePerNight);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat("Total Price: ");
		htmlDeals = htmlDeals.concat(hotel.hotelPricingInfo.totalPriceValue);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat("Length of stay: ");
		htmlDeals = htmlDeals.concat(hotel.offerDateRange.lengthOfStay);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat("Start Date: ");
		var travelStartDate = hotel.offerDateRange.travelStartDate;
		htmlDeals = htmlDeals.concat(travelStartDate[0] + "-" + travelStartDate[1] + "-" + travelStartDate[2]);
		htmlDeals = htmlDeals.concat('<br/>');

		var travelEndDate = hotel.offerDateRange.travelEndDate;
		htmlDeals = htmlDeals.concat("End Date: ");
		var travelStartDate = hotel.offerDateRange.travelStartDate;
		htmlDeals = htmlDeals.concat(travelEndDate[0] + "-" + travelEndDate[1] + "-" + travelEndDate[2]);
		htmlDeals = htmlDeals.concat('<br/>');

		htmlDeals = htmlDeals.concat('</p></div></div></div>');
	}

	htmlDeals = htmlDeals.concat('</div>');
	$('#data_container').append(htmlDeals);
}

function renderNoResultsFound() {
	$('#error').remove();
	$('#dealsResults').remove();
	$('#data_container').append("<div id=\"dealsResults\">No results found</div>");
}

function renderErrorMessage(error) {
	$('#error').remove();
	$('#dealsResults').remove();
	$('#error_container').append("<div id=\"error\"><p style=\"color:red;\">" + error + "</p></div>");
}