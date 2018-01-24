package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.Normalizer.Form;
import java.util.Calendar;
import java.util.Date;

public class FormatDate {
	
	public static String convert(String dates) throws ParseException {
		
		 SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		 SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		 Date date = format1.parse(dates);
		 return format2.format(date); 
	}
}
