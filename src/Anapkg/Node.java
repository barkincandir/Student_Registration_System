package Anapkg;

public class Node {
	int ogrencino;
	String ad;
	String soyad;
	Node ileri;
	Node geri;
	
	public Node(int ogrencino, String ad, String soyad) {
		this.ogrencino = ogrencino;
		this.ad = ad;
		this.soyad = soyad;
		ileri = null;
		geri = null;
	}

}
