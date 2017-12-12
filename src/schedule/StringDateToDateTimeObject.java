package schedule;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringDateToDateTimeObject {

	public static void main(String[] args) {
		
		String date = "2019-08-07T16:00:00";// input string for date 
		String sailDate = "2019-10-07T16:30:00";
		// The String date needs a pattern to be converted to
		DateTimeFormatter bookingDate =	DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");//the 'T' needs to be a char literal in order for it to be parsed 
		DateTimeFormatter voyageDate   =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime formatBookingDate = LocalDateTime.parse(date, bookingDate);
		LocalDateTime formatvoyageDate = LocalDateTime.parse(sailDate, voyageDate);
	    int	finalBookingDate = formatBookingDate.toLocalDate().getDayOfYear();
	    int	finalVoyageDate = formatvoyageDate.toLocalDate().getDayOfYear();
		System.out.println(finalVoyageDate - finalBookingDate);
		System.out.println(finalVoyageDate);
		
		//System.out.println(formatDateTime.getClass().getSimpleName());		
		

	}
}
