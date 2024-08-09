package java;
import java.text.SimpleDateFormat;
import java.util.*;

public class Study16Date {

	public static void main(String[] args) {
		Date objDate = new Date();
		System.out.println(objDate);
		
		String StringDateFormat = "yyyy.MM.dd EEEE HH:mm:ss a z";
		SimpleDateFormat SmplDateFormat = new SimpleDateFormat(StringDateFormat);
		System.out.println(SmplDateFormat.format(objDate));
	}

}
