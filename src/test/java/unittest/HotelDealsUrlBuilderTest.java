package unittest;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import com.expedia.exercise.service.urlbuilder.HotelDealsUrlBuilder;
import com.expedia.exercise.vo.SearchFilterInfo;

public class HotelDealsUrlBuilderTest {

	@Test
	public void testEmptySearchFilter() {
		String url = HotelDealsUrlBuilder.getInstance().build(new SearchFilterInfo());
		Assert.assertEquals(url, HotelDealsUrlBuilder.SERVICE_URL);
	}

	@Test
	public void testDestinationName() {
		SearchFilterInfo searchFilterInfo = new SearchFilterInfo();
		searchFilterInfo.setDestinationName("London");
		searchFilterInfo.setDestinationCity("London City");
		searchFilterInfo.setRegionIds("111");

		String url = HotelDealsUrlBuilder.getInstance().build(searchFilterInfo);
		Assert.assertEquals(url, HotelDealsUrlBuilder.SERVICE_URL + "&destinationName=London");
	}

	@Test
	public void testDestinationCity() {
		SearchFilterInfo searchFilterInfo = new SearchFilterInfo();
		searchFilterInfo.setDestinationCity("London City");
		searchFilterInfo.setRegionIds("111");

		String url = HotelDealsUrlBuilder.getInstance().build(searchFilterInfo);
		Assert.assertEquals(url, HotelDealsUrlBuilder.SERVICE_URL + "&destinationCity=London City");
	}

	@Test
	public void testRegioinIDs() {
		SearchFilterInfo searchFilterInfo = new SearchFilterInfo();
		searchFilterInfo.setRegionIds("111");

		String url = HotelDealsUrlBuilder.getInstance().build(searchFilterInfo);
		Assert.assertEquals(url, HotelDealsUrlBuilder.SERVICE_URL + "&regionIds=111");
	}

	@Test
	public void testAllSearchFilter() {
		SearchFilterInfo searchFilterInfo = new SearchFilterInfo();
		searchFilterInfo.setDestinationName("London");
		searchFilterInfo.setDestinationCity("London City");
		searchFilterInfo.setRegionIds("111");
		
		Calendar minStartDateCalendar = Calendar.getInstance();
		minStartDateCalendar.set(Calendar.YEAR, 2018);
		minStartDateCalendar.set(Calendar.MONTH, 2);
		minStartDateCalendar.set(Calendar.DAY_OF_MONTH, 1);
		searchFilterInfo.setMinTripStartDate(minStartDateCalendar.getTimeInMillis());

		Calendar maxStartDateCalendar = Calendar.getInstance();
		maxStartDateCalendar.set(Calendar.YEAR, 2018);
		maxStartDateCalendar.set(Calendar.MONTH, 3);
		maxStartDateCalendar.set(Calendar.DAY_OF_MONTH, 1);
		searchFilterInfo.setMaxTripStartDate(maxStartDateCalendar.getTimeInMillis());

		searchFilterInfo.setLengthOfStay(Integer.valueOf(4));
		searchFilterInfo.setMinStarRating(Integer.valueOf(1));
		searchFilterInfo.setMaxStarRating(Integer.valueOf(4));
		searchFilterInfo.setMinTotalRate(Integer.valueOf(1));
		searchFilterInfo.setMaxTotalRate(Integer.valueOf(4));
		searchFilterInfo.setMinGuestRating(Integer.valueOf(1));
		searchFilterInfo.setMaxGuestRating(Integer.valueOf(4));
		
		
		String url = HotelDealsUrlBuilder.getInstance().build(searchFilterInfo);
		Assert.assertEquals(url, HotelDealsUrlBuilder.SERVICE_URL + "&destinationName=London&minTripStartDate=2018-02-01&maxTripStartDate=2018-03-01&lengthOfStay=4&minStarRating=1&maxStarRating=4&minTotalRate=1&maxTotalRate=4&minGuestRating=1&maxGuestRating=4");
	}
}
