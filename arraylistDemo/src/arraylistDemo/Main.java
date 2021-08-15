package arraylistDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList sayilar = new ArrayList();//b�t�n degerleri tutabilir
		
		sayilar.add(1);
		sayilar.add(5);
		sayilar.add("ankara");
		
		System.out.println(sayilar.size());
		System.out.println(sayilar.get(2));
		sayilar.set(2, "trabzon");//g�nceleme
		System.out.println(sayilar.get(2));
		sayilar.remove(1);//silme
		System.out.println(sayilar.get(1));
		
		for(Object i:sayilar) {
			System.out.println(i);
		}
		
		sayilar.clear();//t�m diziyi siler
		System.out.println(sayilar.size());
		
		System.out.println("************************************************");
		
		ArrayList<String> sehirler= new ArrayList<String>();//sadece string degerleri tutabilir
		sehirler.add("istanbul");
		sehirler.add("ankara");
		sehirler.add("izmir");
		sehirler.add("ad�yaman");
		
		sehirler.remove("izmir");
		Collections.sort(sehirler);//sehirleri harflere g�re s�ralar
		for(String i:sehirler) {
			System.out.println(i);
		}

	}

}
