package uygulama2List;

import java.util.ArrayList;
import java.util.List;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		
	   /* List -> içine eklenen verileri sýralý bir þekilde tutar.
		*      -> eklenmiþ bir veri bir daha eklenebilir.
		*
		*/        
		
		List<String> isimler = new ArrayList<>();
		
		String isim1= "Hakan";
		String isim2= "Oðuzhan";
		String isim3 = "Baki";
		
		isimler.add(isim3);
		isimler.add(isim2);
		isimler.add(isim1);
		isimler.add(isim3);
		
		
		for(String isim : isimler) {
			
			System.out.println(isim);
		}
		
		
		
		
		
	}

}
