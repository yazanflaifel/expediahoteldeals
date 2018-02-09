package unittest;

import org.junit.Assert;
import org.junit.Test;

import com.expedia.exercise.utils.SearchFilterValidator;
import com.expedia.exercise.vo.SearchFilterInfo;

public class SearchFilterValidatorTest {

	@Test
	public void testValidetWhenThePassedValueIsNull() {
		try {
			SearchFilterValidator.getInstance().validate(null);
		} catch (Exception e) {
			Assert.assertFalse("Null pointer Exception", true);
		}
	}

	@Test
	public void testValidetWhenValidSearchFilterData() {
		SearchFilterInfo searchFilterInfo = new SearchFilterInfo();
		searchFilterInfo.setLengthOfStay(Integer.valueOf(4));
		searchFilterInfo.setMinStarRating(Integer.valueOf(1));
		searchFilterInfo.setMaxStarRating(Integer.valueOf(4));
		searchFilterInfo.setMinTotalRate(Integer.valueOf(1));
		searchFilterInfo.setMaxTotalRate(Integer.valueOf(4));
		searchFilterInfo.setMinGuestRating(Integer.valueOf(1));
		searchFilterInfo.setMaxGuestRating(Integer.valueOf(4));

		try {
			SearchFilterValidator.getInstance().validate(searchFilterInfo);
		} catch (Exception e) {
			Assert.assertFalse("It should pass", true);
		}
	}

	@Test
	public void testValidetWhenInvalidMinStarRaingValueIsMoreThan5() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMinStarRating(10);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Invalid min star rating it shuold be from 0 to 5", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenInvalidMinStarRaingValueIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMinStarRating(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Invalid min star rating it shuold be from 0 to 5", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenInvalidMaxStarRaingValueIsMoreThan5() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMaxStarRating(10);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Invalid max star rating it shuold be from 0 to 5", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenInvalidMaxStarRaingValueIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMaxStarRating(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Invalid max star rating it shuold be from 0 to 5", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenLengthOfStayIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setLengthOfStay(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Length of stay is less than 0", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenMinTotalRateIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMinTotalRate(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Min total rate is less than 0", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenMaxTotalRateIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMaxTotalRate(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Max total rate is less than 0", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenMinGuestRatingIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMinGuestRating(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Min guest rating is less than 0", e.getMessage());
		}
	}

	@Test
	public void testValidetWhenMaxGuestRatingIsLessThan0() {
		try {
			SearchFilterInfo filterInfo = new SearchFilterInfo();
			filterInfo.setMaxGuestRating(-1);
			SearchFilterValidator.getInstance().validate(filterInfo);
		} catch (Exception e) {
			Assert.assertEquals("Max guest rating is less than 0", e.getMessage());
		}
	}
}
