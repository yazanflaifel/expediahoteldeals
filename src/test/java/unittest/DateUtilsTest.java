package unittest;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import com.expedia.exercise.utils.DateUtils;

public class DateUtilsTest {

	@Test
	public void testGetDateInSimpleFormatWhenTheValuesIsNull() {
		Assert.assertEquals(DateUtils.getDateInSimpleFormat(null), null);
	}

	@Test
	public void testGetDateInSimpleFormat() {
		Calendar minStartDateCalendar = Calendar.getInstance();
		minStartDateCalendar.set(Calendar.YEAR, 2018);
		minStartDateCalendar.set(Calendar.MONTH, 2);
		minStartDateCalendar.set(Calendar.DAY_OF_MONTH, 1);

		Assert.assertEquals(DateUtils.getDateInSimpleFormat(minStartDateCalendar.getTimeInMillis()), "2018-02-01");
	}
}
