package PKG_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MMM-dd-yyyy");
		String dm=sdf.format(d);
		System.out.println(dm);
		
		
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date date = simpleDateFormat.parse("2018-09-09");
		System.out.println(date);
	}

}

