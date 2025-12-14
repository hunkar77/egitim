package tr.com.egitim;

public class İlkelPas {

	public static void main(String[] args) {
		double a = 5;
		f(a);
		System.out.println("a --> " + a);

	}

	static void f(double a) {
		System.out.println(a + " gonderildi");
		a = 10;
		System.out.println("gonderilen parametrenin degeri " + a + " 'a” “esitlendi");
	}

}
