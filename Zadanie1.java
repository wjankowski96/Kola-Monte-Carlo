public class Zadanie1_v2 {

	public static void main(String[] args) {
		
		    Kolo kolo1 = new Kolo(10, "kolo1");
		    System.out.println("Pole kola: " + kolo1.getName() + " obliczone analitycznie to : " + String.format("%1$.2f", kolo1.poleAnal()));
		    System.out.println("Pole kola: " + kolo1.getName() + " obliczone numerycznie : " + String.format("%1$.2f", kolo1.poleMonCar(10000)));

			System.out.println();

		    Kolo kolo2 = new Kolo(2, "kolo2");
		    System.out.println("Pole kola: " + kolo2.getName() + " obliczone analitycznie to : " + String.format("%1$.2f", kolo2.poleAnal()));
		    System.out.println("Pole kola: " + kolo2.getName() + " obliczone numerycznie : " + String.format("%1$.2f", kolo2.poleMonCar(10000)));

		    System.out.println();

		    Kolo kolo3 = new Kolo();
		    kolo3.setName("kolo3");
		    Kolo.wczytajR(kolo3);
		    System.out.println("Pole kola: " + kolo3.getName() + " obliczone analitycznie to : " + String.format("%1$.2f", kolo3.poleAnal()));
		    System.out.println("Pole kola: " + kolo3.getName() + " obliczone numerycznie : " + String.format("%1$.2f", kolo3.poleMonCar(Kolo.wczytajP())));

		    System.out.println();

		    Kolo kolo4 = new Kolo();
		    kolo4.setName("kolo4");
		    Kolo.wczytajR(kolo4);
		    System.out.println("Pole kola: " + kolo4.getName() + " obliczone analitycznie to : " + String.format("%1$.2f", kolo4.poleAnal()));
		    System.out.println("Pole kola: " + kolo4.getName() + " obliczone numerycznie : " + String.format("%1$.2f", kolo4.poleMonCar(Kolo.wczytajP())));
		
		

	}

}
