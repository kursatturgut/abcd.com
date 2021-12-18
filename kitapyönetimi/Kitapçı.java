package kitapyönetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapçý {
	static List<Kitap>Liste=new ArrayList<>();
	static Scanner scan=new Scanner (System.in);
	static int kitapNo=1000;
	
	public static void main(String[] args) {
		menu(Liste);

	}
	public static void menu(List<Kitap>Liste) {
		System.out.println("KÝTAP PROGRAMI \n 1 kitap ekle \n 2 numaraile kitap sil\n 3 kitaplarý listele\n 4 bitir  ");
		System.out.println("iþleminizi seciniz");
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
			System.out.println("yanlis griþ yeniden dene ");
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
		System.out.println(silinecekNo+"ait kitap bulunamadý ");
		menu(Liste);
	}
	private static void kitapEkle(List<Kitap> Liste) {
		System.out.print("kitp ismi griniz ");
		String kitapAdý=scan.next();
		System.out.print("kitp yazar ismi griniz ");
		String kitapYazar=scan.next();
		System.out.println();
		System.out.print("kitp yayýn yýlýný griniz ");
		int yayýnYýlý=scan.nextInt();
		System.out.print("kitp fiyatý griniz ");
		double fiyat=scan.nextDouble();
	Kitap kitap=new Kitap(++kitapNo,kitapAdý,kitapYazar,yayýnYýlý,fiyat);	
		Liste.add(kitap);
		System.out.println(kitap.toString()+"eklendi");
		menu(Liste);
		
	}
	private static void bitir() {
		System.out.println("yine bekleriz ");
		
	}
	
	
	

}
