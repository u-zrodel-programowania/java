package matura2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie43 {
	private static int dzielnik = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("liczby.txt");
		try {
			FileWriter fw = new FileWriter( "wynik4.txt", true );
			fw.write("4.3: \n");
			Scanner s = new Scanner( f );
			
			// w³aœciwa czêœæ zadania
			int[] liczby = new int[500];  //0..499
			for( int i=0; i<500; i++) {
				liczby[i] = s.nextInt();
			}
			
			int maxDl = 0;
			int p = 0;
			int d = 0;
			for( int i=0; i<499; i++) {
				int dl = podciag( liczby , i);
				if( dl > maxDl ) {
					maxDl = dl;
					p = liczby[i];
					d = dzielnik;	
				}
			}
			//System.out.print("ile="+maxDl);
			//System.out.print(" pierwszy="+p);
			//System.out.println(" dzielnik="+d);
			
			fw.write("ile="+maxDl);
			fw.write(" pierwszy="+p);
			fw.write(" dzielnik="+d);
			s.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int podciag(int[] liczby, int i) {
		int a = liczby[i];  
		int dziel = 1;
		int ile = 0;
		do {
			i++; 
			ile++;
			dzielnik = dziel;
			if( i >= 500 ) {
				ile++;
				break;
			}
			int b = liczby[i]; 
			dziel = NWD(a,b);
			a = dziel;
		} while( dziel > 1);
		
		return ile;
	}

	private static int NWD(int a, int b) {
	    while( b != 0 ) {
	        int c = a % b;
	        a = b;
	        b = c;
	    }
	    return a;
	}

}
