package uygulama4Map;

import java.util.HashMap;
import java.util.Map;

public class Uygulama4 {

	public static void main(String[] args) {

		/*
		 * Map -> Her bir degeri key value ili�kisiyle tutuyor.
		 * 		-> Her key bir de�er al�r.
		 * 		kullan�c�adi - "Hakan";
		 *
		 */
		
		Map<String, String> map = new HashMap<>();
		
		map.put("kullaniciadi", "Hakan");
		
		map.put("sifre", "hakan01");
		
		String sonuc = map.get("sifre");
		
		System.out.println(sonuc);
		
		
		Map<String,Ogrenci > map2 = new HashMap<>();
		
		Ogrenci ogrenci1 = new Ogrenci("Hakan", "Erdo�an");
		Ogrenci ogrenci2 = new Ogrenci("O�uzhan", "Erdo�an");
		
		map2.put("java", ogrenci1);
		
		map2.put("python", ogrenci2);
		
		System.out.println(map2.get("python"));
		
		

	}
}
