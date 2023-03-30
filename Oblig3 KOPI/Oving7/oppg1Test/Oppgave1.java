package oppg1Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import oppg1.Soeking;
import oppg1.Soeking.*;

class Oppgave1 {//
	Integer[] sortTab = new Integer[] {2, 5, 6, 9, 12};
	Integer[] usortTab = new Integer[] {9, 3, 5, 10, 4, 3, 7, 8};

	@Test
	public void testsortertTabell() {
		boolean rett = Soeking.sortertTabell(sortTab, 9);
		boolean feil = Soeking.sortertTabell(sortTab, 11);
		assertTrue(rett);
		assertFalse(feil);
	}
	
	@Test
	public void testusortertTabell() {
		boolean rett = Soeking.usortertTabell(usortTab, 10);
		boolean feil = Soeking.usortertTabell(usortTab, 11);
		assertTrue(rett);
		assertFalse(feil);
	}

	@Test
	public void testbinærTabell() {
		boolean rett = Soeking.binaersoek(usortTab, 10);
		boolean feil = Soeking.usortertTabell(usortTab, 11);
		assertTrue(rett);
		assertFalse(feil);
	}
}
