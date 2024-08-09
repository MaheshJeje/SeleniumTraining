package selenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
	   String ScreenshotName = fileName();
	   System.out.println(ScreenshotName);
	   
	   String ScreenshotName2 = fileName2();
	   System.out.println(ScreenshotName2);
	}
	
	public static String fileName() {
		 LocalDateTime currentDate = LocalDateTime.now();		    
		 DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		 String formattedDate = currentDate.format(expectedFormat);
		 return formattedDate;
	}
	
	public static String fileName2() {
		Date currentDate = new Date();
		String formattedDate = currentDate.toString().replace(" ","_").replace(":","_");
		return formattedDate;
	}
}