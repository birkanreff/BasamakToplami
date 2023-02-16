package basamakSayisi;

import java.util.Scanner;

public class basamakSayisiTest {

	public static void main(String[] args) {
		
		int sayi,basamaksayisi;
		int counter = 0;
		int toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		sayi = input.nextInt();
		
		while(sayi != 0) {
			
			toplam += sayi % 10;
			sayi = sayi/10;
			counter++;
			
			}
		System.out.println("Sayınızın basamak sayısı: " + counter);
		System.out.println("Sayınızın basamaklarındaki rakamların toplamı: " + toplam);
		
		
		

	}

}
