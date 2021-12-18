package kitapy�netimi;

public class Kitap {
	
	
	public Kitap(int no, String kitapAd�, String yazarAd�, int yay�nY�l�, double fiyat) {
		super();
		this.no = no;
		this.kitapAd� = kitapAd�;
		this.yazarAd� = yazarAd�;
		this.yay�nY�l� = yay�nY�l�;
		this.fiyat = fiyat;
	}
	
	public Kitap() {
		
	}
	
	private String yazarAd�;
	private int yay�nY�l�;
	private double fiyat;
	private  int no;
	private  String kitapAd�;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKitapAd�() {
		return kitapAd�;
	}
	public void setKitapAd�(String kitapAd�) {
		this.kitapAd� = kitapAd�;
	}
	public String getYazarAd�() {
		return yazarAd�;
	}
	public void setYazarAd�(String yazarAd�) {
		this.yazarAd� = yazarAd�;
	}
	public int getYay�nY�l�() {
		return yay�nY�l�;
	}
	public void setYay�nY�l�(int yay�nY�l�) {
		this.yay�nY�l� = yay�nY�l�;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Kitap [yazarAd�=" + yazarAd� + ", yay�nY�l�=" + yay�nY�l� + ", fiyat=" + fiyat + ", no=" + no
				+ ", kitapAd�=" + kitapAd� + "]";
	}
	
	
	 
	
	
	/*
	1.	Kullan�c�n�n Kitap ekleme, silme ve listeleme gibi  sSECME VAR SW�TCCASE
		i�lemleri yapmas�na imkan tan�yan bir uygulama yaz�n�z.

	2.	Program, kitaplara 1001�den ba�layarak s�ral� ve otomatik numara vermeli.
		Bunun yan�nda, her bir kitap i�in Kitap Ad�, Yazar Ad�, Yay�n Y�l� ve Fiyat gibi bilgiler girilebilmelidir.
                        OBJE DEMEKT�R    CUNSROCKTER VE ADI OLACAK YAZARI OLACAK FYAT OLACAK BUNLAR PARAMETRE 
	3.	Program�n ba�lang�c�nda Kullan�c�ya a�a��daki gibi bir men� sunulmal�d�r.
		Kullan�c� program� bitirene kadar i�lemlere devam edebilmelidir.   D�VG� VAR 

		========= K�TAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: T�m kitaplar� listele
			4: Bitir

 */

}
