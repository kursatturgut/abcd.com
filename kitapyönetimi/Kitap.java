package kitapyönetimi;

public class Kitap {
	
	
	public Kitap(int no, String kitapAdý, String yazarAdý, int yayýnYýlý, double fiyat) {
		super();
		this.no = no;
		this.kitapAdý = kitapAdý;
		this.yazarAdý = yazarAdý;
		this.yayýnYýlý = yayýnYýlý;
		this.fiyat = fiyat;
	}
	
	public Kitap() {
		
	}
	
	private String yazarAdý;
	private int yayýnYýlý;
	private double fiyat;
	private  int no;
	private  String kitapAdý;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKitapAdý() {
		return kitapAdý;
	}
	public void setKitapAdý(String kitapAdý) {
		this.kitapAdý = kitapAdý;
	}
	public String getYazarAdý() {
		return yazarAdý;
	}
	public void setYazarAdý(String yazarAdý) {
		this.yazarAdý = yazarAdý;
	}
	public int getYayýnYýlý() {
		return yayýnYýlý;
	}
	public void setYayýnYýlý(int yayýnYýlý) {
		this.yayýnYýlý = yayýnYýlý;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Kitap [yazarAdý=" + yazarAdý + ", yayýnYýlý=" + yayýnYýlý + ", fiyat=" + fiyat + ", no=" + no
				+ ", kitapAdý=" + kitapAdý + "]";
	}
	
	
	 
	
	
	/*
	1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi  sSECME VAR SWÝTCCASE
		iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.

	2.	Program, kitaplara 1001’den baþlayarak sýralý ve otomatik numara vermeli.
		Bunun yanýnda, her bir kitap için Kitap Adý, Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.
                        OBJE DEMEKTÝR    CUNSROCKTER VE ADI OLACAK YAZARI OLACAK FYAT OLACAK BUNLAR PARAMETRE 
	3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
		Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.   DÖVGÜ VAR 

		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplarý listele
			4: Bitir

 */

}
