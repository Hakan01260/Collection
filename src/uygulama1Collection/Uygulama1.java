package uygulama1Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Uygulama1 {
	
	public static void main(String[] args) {
		
		
		Collection<String> isimler = new ArrayList<>();
		
		isimler.add("Hakan");
		isimler.add("Oðuzhan");
		
		for(String isim : isimler) {
			
			System.out.println(isim);
		}
		
	}

}
