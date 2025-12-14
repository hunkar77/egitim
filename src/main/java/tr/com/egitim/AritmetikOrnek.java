package tr.com.egitim;

public class AritmetikOrnek {

	public static void main(String[] args) {
		
		// Değişkenler atanan değerler
		int a = 57, b = 42;
		double c = 27.475, d = 7.22;
		System.out.println("Degisken Degerleri...");
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		// Sayıları topluyoruz
		System.out.println("Toplama...");
		System.out.println(" a + b = " + (a + b));
		System.out.println(" c + d = " + (c + d));
		// Sayıları çıkartıyoruz
		System.out.println("Cikartma...");
		System.out.println(" a - b = " + (a - b));
		System.out.println(" c - d = " + (c - d));
		// Sayıları Çarpıyoruz.
		System.out.println("Carpma...");
		System.out.println(" a * b = " + (a * b));
		System.out.println(" c * d = " + (c * d));
		// Sayıları bölüyoruz
		System.out.println("Bolme...");
		System.out.println(" a / b = " + (a / b));
		System.out.println(" c / d = " + (c / d));
		
		// Bölme işlemlerinden kalan sayıyı hesaplıyoruz
		System.out.println("Kalan sayiyi hesaplama...");
		System.out.println(" a % b = " + (a % b));
		System.out.println(" c % d = " + (c % d));
		// double ve int tiplerini karışık şekilde
		//kullanıyoruz.
		System.out.println("Karisik tipler...");
		System.out.println(" b + d = " + (b + d));
		System.out.println(" a * c = " + (a * c));

	}

}
