package oppg1;

import java.util.Random;

public class Main {//
	public static void main(String[] args) {
		Integer[] tab = new Integer[10];
		Random tilf = new Random();
		
		Integer[] tab3 = new Integer[] {null, 31, 43, 89, 10, 23, 45, 62, 34, 19, 22};
		
		
		//legg til i tabell
		for (int i = 0; i < tab.length; i++) {
			Integer r = tilf.nextInt();
			tab[i] = r;
		}
		long st = System.nanoTime();
//		 SorterTabell.utvalgssortering(tab, tab.length);
		SorterTabell.sorteringVedInnsetting(tab, tab.length);
		
		long fr = System.nanoTime();
		System.out.println("nanoTime elapsed: " + (fr-st) + "\nSeconds elapsed: " + ((fr-st)/1000000000));
		
		SorterTabell.s2Element(tab, tab.length);
//		for (Integer e : tab) {
//			System.out.print(e + " ");
//		}
//		
//		System.out.println();

	
	}
}
