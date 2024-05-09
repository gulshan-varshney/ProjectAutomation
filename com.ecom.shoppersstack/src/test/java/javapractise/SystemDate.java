package javapractise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemDate {

	public static void main(String[] args) {
		
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(dateObj);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String reqDate = sdf.format(cal.getTime());
		System.out.println(reqDate);
	}
}
