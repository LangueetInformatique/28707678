package atelier07;
import java.util.*;



public class execGregorianDate {
	
	public static void main(String[] args) {

	 String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
	 // if no ids were returned, something is wrong. get out.
	 
	 if (ids.length == 0)
	     System.exit(0);
	
	SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
	Calendar calendar = new GregorianCalendar(pdt);
	
	
		System.out.println("Année " + calendar.get(Calendar.YEAR));
		System.out.println("Mois " + calendar.get(Calendar.MONTH));
		System.out.println("Jour " + calendar.get(Calendar.DATE));
		System.out.println("Heure " + calendar.get(Calendar.HOUR));
		System.out.println("Minutes " + calendar.get(Calendar.MINUTE));
		System.out.println("Jour " + calendar.get(Calendar.SECOND));
	}

}
