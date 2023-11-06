import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fechas {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		Calendar otroToday = new GregorianCalendar(2021, Calendar.FEBRUARY, 22, 23, 11, 44);
	
		LocalDate hoy = LocalDate.now();

		verFecha(today);
		//verFecha(otroToday);

		verFechaLocalDate(hoy);

	}

	private static void verFecha(Calendar today) {

		Locale locale = Locale.getDefault();

		System.out.println("Year : " + today.get(Calendar.YEAR));
		System.out.println("Month (0 is January): " + today.get(Calendar.MONTH));
		System.out.println("Month (String): " + today.getDisplayName(Calendar.MONTH, Calendar.LONG, locale));
		System.out.println("Day of Month : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Week (0 is Sunday): " + today.get(Calendar.DAY_OF_WEEK));
		System.out
				.println("Day of Week (String): " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, locale));
		System.out.println("Week of Year : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Day of Year : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("24-hour clock : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("12-hour clock : " + today.get(Calendar.HOUR));
		System.out.println("AM/PM : " + today.get(Calendar.AM_PM));
		System.out.println("AM/PM : " + today.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
		System.out.println("Minutes : " + today.get(Calendar.MINUTE));
		System.out.println("Seconds : " + today.get(Calendar.SECOND));
		System.out.println("MiliSeconds : " + today.get(Calendar.MILLISECOND));

		System.out.println("-------------------------------------");

	}

	private static void verFechaLocalDate(LocalDate fecha) {

		System.out.println("Year : " + fecha.getYear());
		System.out.println("Month (1 is January): " + fecha.getMonthValue());
		System.out.println("Month (String): " + fecha.getMonth()); // ver en español
		System.out.println("Day of Month : " + fecha.getDayOfMonth());
		System.out.println("Day of Week (0 is Sunday): ");
		System.out.println("Day of Week (String): " + fecha.getDayOfWeek()); // ver en español
		System.out.println("Week of Year : ");
		System.out.println("Week of Month : ");
		System.out.println("Day of Year : ");
		System.out.println("24-hour clock : ");
		System.out.println("12-hour clock : ");
		System.out.println("AM/PM : ");
		System.out.println("AM/PM : ");
		System.out.println("Minutes : ");
		System.out.println("Seconds : ");
		System.out.println("MiliSeconds : ");

		System.out.println("-------------------------------------");

	}
}
