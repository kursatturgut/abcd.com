package kitapy�netimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitap�� {
	static List<Kitap>Liste=new ArrayList<>();
	static Scanner scan=new Scanner (System.in);
	static int kitapNo=1000;
	
	public static void main(String[] args) {
		menu(Liste);

	}
	public static void menu(List<Kitap>Liste) {
		System.out.println("K�TAP PROGRAMI \n 1 kitap ekle \n 2 numaraile kitap sil\n 3 kitaplar� listele\n 4 bitir  ");
		System.out.println("i�leminizi seciniz");
		int tercih=scan.nextInt();
		
		switch (tercih) {
		case 1:
			kitapEkle(Liste);
			break;
		case 2:
			noIleSil(Liste);
			break;
		case 3:
			Listele(Liste);
			break;
		case 4:
			bitir();
		default:
			System.out.println("yanlis gri� yeniden dene ");
			break;
		}
		
		
		
	}
	private static void Listele(List<Kitap> Liste) {
		for (Kitap k : Liste) {
			System.out.println(k.toString());
		}
		menu(Liste);
	}
	private static void noIleSil(List<Kitap> Liste) {
	System.out.println("silinecek kitap no griniz");	
		int silinecekNo=scan.nextInt();
		for (Kitap k : Liste) {
			if (k.getNo()==silinecekNo) {
				Liste.remove(k);
				menu(Liste);
				
			}
		}
		System.out.println(silinecekNo+"ait kitap bulunamad� ");
		menu(Liste);
	}
	private static void kitapEkle(List<Kitap> Liste) {
		System.out.print("kitp ismi griniz ");
		String kitapAd�=scan.next();
		System.out.print("kitp yazar ismi griniz ");
		String kitapYazar=scan.next();
		System.out.println();
		System.out.print("kitp yay�n y�l�n� griniz ");
		int yay�nY�l�=scan.nextInt();
		System.out.print("kitp fiyat� griniz ");
		double fiyat=scan.nextDouble();
	Kitap kitap=new Kitap(++kitapNo,kitapAd�,kitapYazar,yay�nY�l�,fiyat);	
		Liste.add(kitap);
		System.out.println(kitap.toString()+"eklendi");
		menu(Liste);
		
	}
	private static void bitir() {
		System.out.println("yine bekleriz ");
		
	}
	
	
	

}
