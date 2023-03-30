package oppg1;

import java.util.Iterator;

public class BS_Tre<T extends Comparable<? super T>> implements SoektreInterface<T> {
	
	private BinaerTreNode<T> rot;
	
	public BS_Tre() {
		rot = null;
	}
	
	public BS_Tre(T element) {
		rot = new BinaerTreNode<T>(element);
	}
	
	/**
	 * S�ker etter et gitt element i treet.
	 * 
	 * @param element elementet vi s�ker etter.
	 * @return true om elementet finst, false elles.
	 */
	public boolean inneholder(T element) {
		return false;
		
		// Kan kalle finn-metoden nedanfor. Pr�v sj�lv.
	}

	/**
	 * Henter et element i treet.
	 * 
	 * @param element elementet vi leiter etter.
	 * @return Elementet dersom det finst, elles null.
	 */
	public T finn(T element) {
		
		return finn(element, rot);
	}
	

	private T finn(T element, BinaerTreNode<T> p) {

		T svar = null;
		
		// basis: p == null -> tomt undertre, elementet finst ikkje
		
		if (p != null) {
			int sml = element.compareTo(p.getElement());
			if (sml == 0) {  // basistilfelle
				svar = p.getElement();
			} if (sml < 0) {
				svar = finn(element , p.getVenstre());
			} else {
				svar = finn(element , p.getHogre());
			}
		}
		
		return svar;
	}
	
	public int finnHoyde() {
		BinaerTreNode<T> node = rot;
		if(node == null) {
			return -1;
		}
		
		return finnHoyde(node);
	}
	
	public int finnHoyde(BinaerTreNode<T> p) {
		int hoyde = 0;
		if(p == null) {
			return -1;
		}
		
		int venstreH = finnHoyde(p.getVenstre());
		int hoyreH = finnHoyde(p.getHogre());
		
		if(venstreH > hoyreH) {
			hoyde = venstreH + 1;
		} else if (hoyreH > venstreH){
			hoyde = hoyreH + 1;
		}
		
		return hoyde;
		
		
	}

	/**
	 * Legg eit element til treet dersom det ikkje finst fr� f�r. Elles 
	 * blir det gamle elementet erstatta med det nye.
	 * 
	 * @param nyElement elementet som skal leggast til
	 * @return Elementet som vart erstatta, null om det ikkje finst fr� f�r
	 */
	public T  leggTil(T nyElement) {
		T resultat = null;
		if (rot == null) {
			rot = new BinaerTreNode<T>(nyElement);
		} else {
			resultat = leggTil(nyElement, rot);
		}
		return resultat;
	}

	private T leggTil(T nyttElement, BinaerTreNode<T> p) {
		
		// p er ulik null
		
		T resultat = null;
		int sml = nyttElement.compareTo(p.getElement());
		
		if (sml == 0) {  // elementet finst fr� f�r
			resultat = p.getElement();   // tek vare p� gamal verdi
			p.setElement(nyttElement);
		} else if (sml < 0) {
			if (p.getVenstre() != null) {  // p har venstrebarn
				resultat = leggTil(nyttElement, p.getVenstre());
			} else {
				p.setVenstre(new BinaerTreNode<T>(nyttElement));
			}
		} else {
			if (p.getHogre() != null) {  // p har h�grebarn
				resultat = leggTil(nyttElement, p.getHogre());
			} else {
				p.setHogre(new BinaerTreNode<T>(nyttElement));
			}
		}
		
		return resultat;
	}
	/**
	 * Fjernar eit element fr� treet.
	 * 
	 * @param element elementet som skal fjernast.
	 * @return elementet som vart fjerna eller null om det ikkje finst.
	 */
	public T fjern(T element) {
		// Er ikkje pensum � kunne skrive denne
		// Men de m� kunne forklare korleis vi slettar
		// Sj� lyskark
		
		return null;
	}

	/**
	 * Lagar ein iterator som g�r gjennom alle element i treet i inorden.
	 * 
	 * @return ein iterator som elementa i sortert rekkef�lge.
	 */
	public Iterator<T> getInordenIterator() {
		return null;
	}

}
