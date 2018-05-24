package date.proba;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateProba {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss");
		
		System.out.println(sdf.format(date));
		
		

	}

}
