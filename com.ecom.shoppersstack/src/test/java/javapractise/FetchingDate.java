package javapractise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FetchingDate {

	public static void main(String[] args) {

		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(dateObj);
		System.out.println(currentDate);
	}
}
