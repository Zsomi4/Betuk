import java.util.Scanner;

public class Betuk {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Számok 1-től 10-ig.");
			int szam = scan.nextInt();
			if (szam < 1 || szam > 10) {
				System.out.print("Nem megfelelő!");
				System.exit(0);
			} switch(szam) {
				case 1: System.out.println("Egy");
				break;
				case 2: System.out.println("Kettő");
				break;
				case 3: System.out.println("Három");
				break;
				case 4: System.out.println("Négy");
				break;
				case 5: System.out.println("Öt");
				break;
				case 6: System.out.println("Hat");
				break;
				case 7: System.out.println("Hét");
				break;
				case 8: System.out.println("Nyolc");
				break;
				case 9: System.out.println("Kilenc");
				break;
				case 10: System.out.println("Tíz");
				break;
			}
		}

	}
}
