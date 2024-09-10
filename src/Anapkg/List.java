package Anapkg;

public class List {
	Node bas;
	Node son;

	public List() {
		bas = null;
		son = null;
	}

	public void basaekle(int ogrencino, String ad, String soyad) {
		Node yeniDugum = new Node(ogrencino, ad, soyad);
		if (bas == null) {
			bas = yeniDugum;
			son = yeniDugum;
		} else if (bas.ileri == null) {
			bas = yeniDugum;
			yeniDugum.ileri = son;
			son.geri = yeniDugum;
		} else {
			yeniDugum.ileri = bas;
			bas.geri = yeniDugum;
			bas = yeniDugum;

		}
	}

	public void sonaekle(int ogrencino, String ad, String soyad) {
		Node yeniDugum = new Node(ogrencino, ad, soyad);
		if (bas == null) {
			bas = yeniDugum;
			son = yeniDugum;
		} else if (bas.ileri == null) {
			bas.ileri = yeniDugum;
			yeniDugum.geri = bas;
			son = yeniDugum;
		} else {
			Node tmp = bas;
			while (tmp.ileri != null) {
				tmp = tmp.ileri;
			}
			tmp.ileri = yeniDugum;
			yeniDugum.geri = tmp;
			son = yeniDugum;
		}

	}

	public void arayaekle(int ogrencino, String ad, String soyad, int index) {
		Node yeniDugum = new Node(ogrencino, ad, soyad);
		if (bas == null) {
			System.out.println("Liste boş lütfen başa eleman ekleyiniz.");
		} else if (bas.ileri == null) {
			System.out.println("Listede tek eleman var lütfen başına ya da sonuna eleman ekleyiniz.");
		} else {
			Node tmp = bas;
			int sayac = 1;
			if (index == 0) {
				basaekle(ogrencino, ad, soyad);
			} else {
				while (sayac != index) {
					tmp = tmp.ileri;
					sayac++;
				}
				if (tmp.ileri == null) {
					tmp.ileri = yeniDugum;
					yeniDugum.geri = tmp;
				} else {
					yeniDugum.ileri = tmp.ileri;
					tmp.ileri.geri = yeniDugum;
					tmp.ileri = yeniDugum;
					yeniDugum.geri = tmp;

				}

			}

		}

	}

	public void sil(int index) {
		if (bas == null) {
			System.out.println("Liste boş!");
		} else if (index == 0) {
			bas.ileri.geri = null;
			bas = bas.ileri;

		} else {
			Node tmp = bas;
			int sayac = 0;
			while (sayac != index) {
				tmp = tmp.ileri;
				sayac++;
			}
			if (tmp.ileri == null) {
				tmp.geri.ileri = null;
				son = tmp.geri;
			} else {
				tmp.geri.ileri = tmp.ileri;
				tmp.ileri.geri = tmp.geri;

			}

		}
	}

	public void yazdir() {
		Node tmp = bas;
		while (tmp != null) {
			System.out.println("No:" + tmp.ogrencino + " / " + "Ad:" + tmp.ad + " / " + "Soyad:" + tmp.soyad);
			tmp = tmp.ileri;
		}
	}

}
