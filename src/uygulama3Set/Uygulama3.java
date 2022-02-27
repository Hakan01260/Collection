package uygulama3Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Uygulama3 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Set -> içine ayný türden veri almaz.
		 * 	   -> içine eklenen verileri sýralý bir þekilde tutmaz.
		 * 
		 */
		
		Set<String> isimler = new HashSet<>();

		String isim1= "Hakan";
		String isim2= "Oðuzhan";
		String isim3 = "Baki";
		
		isimler.add(isim3);
		isimler.add(isim2);
		isimler.add(isim1);
		isimler.add(isim3);
		isimler.add(isim2);
		
		Iterator<String> iterator = isimler.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		
	}

}
