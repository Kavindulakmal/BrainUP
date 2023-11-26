package interiewQuestions;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "MM-dd-yyyy";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		 String date = simpleDateFormat.format(new Date(0));
		 System.out.println(date);

	}

}
