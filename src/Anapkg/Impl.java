package Anapkg;


public class Impl {

	public static void main(String[] args) {
		List bl = new List();
		
		bl.basaekle(2, "Barış", "Özkan");
		bl.basaekle(1, "Barkın", "Çandır");
		bl.sonaekle(3, "Merve", "Şahin");
		bl.sonaekle(4, "Buğra", "Yıldırım");	
		bl.yazdir();
	}

}
