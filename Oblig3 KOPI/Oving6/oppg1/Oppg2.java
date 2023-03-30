package oppg1;

import java.util.Random;

import oppg1.SorterTabell.*;

public class Oppg2 {

	public static void main(String [] args){
		long m32I; long m32S; long m32Q; long m32M;
		long m64I; long m64S; long m64Q; long m64M;
		long m128I; long m128S; long m128Q; long m128M;
		long [][] resI = new long [3][10]; 
		long [][] resS = new long [3][10]; 
		long [][] resQ = new long [3][10]; 
		long [][] resM = new long [3][10]; 
		
		Integer[] quick = new Integer[32000];
		
		for(int i = 0; i < quick.length; i++) {
			quick[i] = 2;
		}
		
	long sTil = System.nanoTime();
		
	for(int i = 0; i < resI[2].length ; i++) {
		Random tilf = new Random();
		
		Integer[] tTab = new Integer[10];
		Integer[] aTab = new Integer[32000];
		Integer[] bTab = new Integer[64000];
		Integer[] cTab = new Integer[128000];
		
		for(int j = 0; j < tTab.length; j++) {
			tTab[j] = tilf.nextInt(11);
		}
		for(int k = 0; k < aTab.length; k++) {
			aTab[k] = tilf.nextInt(1000);
		}
		for(int o = 0; o < bTab.length; o++) {
			bTab[o] = tilf.nextInt(1000);
		}
		for(int t = 0; t < cTab.length; t++) {
			cTab[t] = tilf.nextInt(1000);
		}
		
		
		Integer[] itest = tTab;
		Integer[] stest = tTab;
		Integer[] qtest = tTab;
		Integer[] mtest = tTab;
		
		Integer[] iTaba = aTab;
		Integer[] sTaba = aTab;
		Integer[] qTaba = aTab;
		Integer[] mTaba = aTab;
		
		Integer[] iTabb = bTab;
		Integer[] sTabb = bTab;
		Integer[] qTabb = bTab;
		Integer[] mTabb = bTab;
		
		Integer[] iTabc = cTab;
		Integer[] sTabc = cTab;
		Integer[] qTabc = cTab;
		Integer[] mTabc = cTab;
		
		
		System.out.println("\nFerdig lagetabell\n");
		
//		System.out.print("sorteringVedInnsetting(Insertion) test: ");
//		SorterTabell.sorteringVedInnsetting(itest, itest.length);
//		skriv(itest);
//		
//		System.out.print("Utvalgssortering(Selection) test: ");
//		SorterTabell.utvalgssortering(stest, stest.length);
//		skriv(stest);
//		
//		System.out.print("Kvikksortering(Quick) test: ");
//		SorterTabell.quickSort(qtest, qtest.length);
//		skriv(qtest);
//		
//		System.out.print("Flettesortering(Merge) test: ");
//		SorterTabell.flettesortering(mtest, mtest.length);
//		skriv(mtest);
		
		// 0 = 32 000
		// 1 = 64 000
		// 2 = 128 000
		
		//Sortering ved innsetting
		long sIa = System.nanoTime();
		SorterTabell.sorteringVedInnsetting(iTaba, iTaba.length);
		long fIa = System.nanoTime();
		long rIan = fIa - sIa;
		long rIa = (fIa - sIa)/1000000000;
		
		long sIb = System.nanoTime();
		SorterTabell.sorteringVedInnsetting(iTabb, iTabb.length);
		long fIb = System.nanoTime();
		long rIbn = fIb - sIb;
		long rIb = (fIb - sIb)/1000000000;
		
		long sIc = System.nanoTime();
		SorterTabell.sorteringVedInnsetting(iTabc, iTabc.length);
		long fIc = System.nanoTime();
		long rIcn = fIc - sIc;
		long rIc = (fIc - sIc)/1000000000;
		
		System.out.println("\n Ferdig sortering ved insetting: " + i);
		
//		System.out.println("Sortering ved innsetting\n 32 000: " + rIa  + "\tnano: " + rIan + 
//				"\n 64 000: " + rIb + "\tnano: " + rIbn + 
//				"\n128 000: " + rIc + "\tnano: " + rIcn);
//		System.out.println();
		
		resI[0][i] = rIan;
		resI[1][i] = rIbn;
		resI[2][i] = rIcn;
		
		
		//Utvalgssortering
		long sSa = System.nanoTime();
		SorterTabell.utvalgssortering(sTaba, sTaba.length);
		long fSa = System.nanoTime();
		long rSan = fSa - sSa;
		long rSa = (fSa - sSa)/1000000000;
		
		long sSb = System.nanoTime();
		SorterTabell.utvalgssortering(sTabb, sTabb.length);
		long fSb = System.nanoTime();
		long rSbn = fSb - sSb;
		long rSb = (fSb - sSb)/1000000000;
		
		long sSc = System.nanoTime();
		SorterTabell.utvalgssortering(sTabc, sTabc.length);
		long fSc = System.nanoTime();
		long rScn = fSc - sSc;
		long rSc = (fSc - sSc)/1000000000;
		
		System.out.println("\nFerdig utvalgssortering: " + i);
		
//		System.out.println("Utvalgssortering\n 32 000: " + rSa  + "\tnano: " + rSan + 
//				"\n 64 000: " + rSb + "\tnano: " + rSbn + 
//				"\n128 000: " + rSc + "\tnano: " + rScn);
//		System.out.println();
		
		resS[0][i] = rSan;
		resS[1][i] = rSbn;
		resS[2][i] = rScn;
		
		
		long sQa = System.nanoTime();
		SorterTabell.quickSort(qTaba, qTaba.length);
		long fQa = System.nanoTime();
		long rQan = fQa - sQa;
		long rQa = (fQa - sQa)/1000000000;
		
		long sQb = System.nanoTime();
		SorterTabell.quickSort(qTabb, qTabb.length);
		long fQb = System.nanoTime();
		long rQbn = fQb - sQb;
		long rQb = (fQb - sQb)/1000000000;
		
		long sQc = System.nanoTime();
		SorterTabell.quickSort(qTabc, qTabc.length);
		long fQc = System.nanoTime();
		long rQcn = fQc - sQc;
		long rQc = (fQc - sQc)/1000000000;
		
		System.out.println("\nFerdig kvikksortering: " + i);
		
//		System.out.println("Kvikksortering\n 32 000: " + rQa  + "\tnano: " + rQan + 
//				"\n 64 000: " + rQb + "\tnano: " + rQbn + 
//				"\n128 000: " + rQc + "\tnano: " + rQcn);
//		System.out.println();
		
		resQ[0][i] = rQan;
		resQ[1][i] = rQbn;
		resQ[2][i] = rQcn;
		
		
		long sMa = System.nanoTime();
		SorterTabell.flettesortering(mTaba, mTaba.length);
		long fMa = System.nanoTime();
		long rMan = fMa - sMa;
		long rMa = (fMa - sMa)/1000000000;
		
		long sMb = System.nanoTime();
		SorterTabell.flettesortering(mTabb, mTabb.length);
		long fMb = System.nanoTime();
		long rMbn = fMb - sMb;
		long rMb = (fMb - sMb)/1000000000;
		
		long sMc = System.nanoTime();
		SorterTabell.flettesortering(mTabc, mTabc.length);
		long fMc = System.nanoTime();
		long rMcn = fMc - sMc;
		long rMc = (fMc - sMc)/1000000000;
		
		System.out.println("\nFerdig flettesortering: " + i);
		
//		System.out.println("Flettesortering\n 32 000: " + rMa  + "\tnano: " + rMan + 
//				"\n 64 000: " + rMb + "\tnano: " + rMbn + 
//				"\n128 000: " + rMc + "\tnano: " + rMcn);
//		System.out.println();
		
		resM[0][i] = rMan;
		resM[1][i] = rMbn;
		resM[2][i] = rMcn;
		
		
		}
		//For-løkke slutt
		
		long sSlutt = System.nanoTime();
		
		long sek = (sSlutt-sTil)/1000000000/60;
		
		
		System.out.println("Ferdig sortering " + sek + "\n");
		
		//Sortering ved innsetting
		System.out.println("Snitt ved sortering ved insetting");
		for(int u = 0; u < resI.length; u++) {
			if(u == 0) {
				System.out.print(" 32 000: ");
			} else if(u == 1) {
				System.out.print("\n 64 000: ");
			} else {
				System.out.print("\n128 000: ");
			}
			
			long snittI = 0;
			for(int b = 0; b < resI[u].length; b++) {
				snittI =+ resI[u][b];
			}
			
			System.out.print(snittI/resI[u].length + "\n");
		}
		System.out.println();
		
		//Utvalgsortering
				System.out.println("Snitt ved utvalgssortering");
				for(int u = 0; u < resS.length; u++) {
					if(u == 0) {
						System.out.println(" 32 000: ");
					} else if(u == 1) {
						System.out.println("\n 64 000: ");
					} else {
						System.out.println("\n128 000: ");
					}
					
					long snittS = 0;
					for(int b = 0; b < resS[u].length; b++) {
						snittS =+ resS[u][b];
					}
					
					System.out.print(snittS/resS[u].length);
				}
				System.out.println();
				
				//Kvikksortering
				System.out.println("Snitt ved kvikksortering");
				for(int u = 0; u < resQ.length; u++) {
					if(u == 0) {
						System.out.println(" 32 000: ");
					} else if(u == 1) {
						System.out.println("\n 64 000: ");
					} else {
						System.out.println("\n128 000: ");
					}
					
					long snittQ = 0;
					for(int b = 0; b < resQ[u].length; b++) {
						snittQ =+ resQ[u][b];
					}
					
					System.out.print(snittQ/resQ[u].length);
				}
				System.out.println();
				
				//Flettesortering
				System.out.println("Snitt ved flettesortering");
				for(int u = 0; u < resM.length; u++) {
					if(u == 0) {
						System.out.print(" 32 000: ");
					} else if(u == 1) {
						System.out.print("\n 64 000: ");
					} else {
						System.out.print("\n128 000: ");
					}
					
					long snittM = 0;
					for(int b = 0; b < resM[u].length; b++) {
						snittM =+ resM[u][b];
					}
					
					System.out.print(snittM/resM[u].length);
				}
		
		
		long LikB = System.nanoTime();
		SorterTabell.quickSort(quick, quick.length);
		long LikS = System.nanoTime();
		System.out.println("\nQuick med 32000 like elementer i nano: " + (LikS - LikB) + "\nI sekunder: " + (LikS-LikB)/1000000000);
		
	}
		
		
		
	
	public static <T> void skriv(T[] tab) {
		for(int i = 0; i < tab.length-1; i++) {
			System.out.print(tab[i] + ", ");
		}
		System.out.print(tab[tab.length-1]);
		System.out.println("");
	}
}
