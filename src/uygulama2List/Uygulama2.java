package uygulama2List;

import java.util.ArrayList;
import java.util.List;

public class Uygulama2 {
	
	public static void main(String[] args) {
		
		
	   /* List -> i�ine eklenen verileri s�ral� bir �ekilde tutar.
		*      -> eklenmi� bir veri bir daha eklenebilir.
		*
		*/        
		
		List<String> isimler = new ArrayList<>();
		
		String isim1= "Hakan";
		String isim2= "O�uzhan";
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
