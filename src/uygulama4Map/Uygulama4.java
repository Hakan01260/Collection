package uygulama4Map;

import java.util.HashMap;
import java.util.Map;

public class Uygulama4 {

	public static void main(String[] args) {

		/*
		 * Map -> Her bir degeri key value iliþkisiyle tutuyor.
		 * 		-> Her key bir deðer alýr.
		 * 		kullanýcýadi - "Hakan";
		 *
		 */
		
		Map<String, String> map = new HashMap<>();
		
		map.put("kullaniciadi", "Hakan");
		
		map.put("sifre", "hakan01");
		
		String sonuc = map.get("sifre");
		
		System.out.println(sonuc);
		
		
		Map<String,Ogrenci > map2 = new HashMap<>();
		
		Ogrenci ogrenci1 = new Ogrenci("Hakan", "Erdoðan");
		Ogrenci ogrenci2 = new Ogrenci("Oðuzhan", "Erdoðan");
		
		map2.put("java", ogrenci1);
		
		map2.put("python", ogrenci2);
		
		System.out.println(map2.get("python"));
		
		

	}
}
