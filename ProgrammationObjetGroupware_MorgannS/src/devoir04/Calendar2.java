package devoir04;

import java.util.*;

public class Calendar2 extends GregorianCalendar{
	private boolean cours;
	
	public void creation(Calendar dateCrea) {
		Calendar maintenant = Calendar.getInstance();
		
		if (this.get(Calendar.DAY_OF_WEEK)==5 && this.get(Calendar.HOUR_OF_DAY)>9 && this.get(Calendar.HOUR_OF_DAY)<12) {
				if (this.get(Calendar.MINUTE) < 30 && this.get(Calendar.HOUR_OF_DAY) == 9) {
				cours = false;
			} else if (this.get(Calendar.HOUR_OF_DAY) == 9 && this.get(Calendar.MINUTE) >= 30) {
				cours = true;
			} else {
			cours = false;
			}
		
		
		}
	}
	public void afficher(Calendar DateActuelle) {
		String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
		 // if no ids were returned, something is wrong. get out.
		 
		 if (ids.length == 0)
		     System.exit(0);
		
		 
		 TimeZone pdt = TimeZone.getTimeZone("Europe/Paris");
		//SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
		Calendar calendar = new GregorianCalendar(pdt);
		
		
			System.out.println("Année " + calendar.get(Calendar.YEAR));
			System.out.println("Mois " + calendar.get(Calendar.MONTH));
			System.out.println("Jour " + calendar.get(Calendar.DATE));
			System.out.println("Heure " + calendar.get(Calendar.HOUR));
			System.out.println("Minutes " + calendar.get(Calendar.MINUTE));
			System.out.println("Secondes " + calendar.get(Calendar.SECOND));
	}
	
	public void duree() {
		GregorianCalendar dateActuelle = new GregorianCalendar();
		
		int heures = dateActuelle.get(Calendar.HOUR)-this.get(Calendar.HOUR)*3600;
		int minutes = dateActuelle.get(Calendar.MINUTE)-this.get(Calendar.MINUTE)*60;
		int secondes = dateActuelle.get(Calendar.SECOND)-this.get(Calendar.SECOND);
		int secondsTotal = heures + minutes + secondes;
		
		System.out.println("NOMBRE DE SECONDES DEPUIS CREATION" + secondsTotal);
	}

}
