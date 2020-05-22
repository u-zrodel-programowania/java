package matura2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie42 {
	public static int silnia( int k ) {
		int sil = 1;
		for(int i = 2; i<=k; i++) {
			sil = sil * i;
		}
		return sil;
	}
	
	public static Boolean testuj(String napis) {
		int liczba = Integer.parseInt( napis );
		int suma = 0;
		for(int i = 0; i<napis.length(); i++ ) {
			char cyfraC = napis.charAt( i );
			String cyfraS = cyfraC+"";
			int cyfra = Integer.parseInt(cyfraS);
			//System.out.println( cyfra + ": " + silnia(cyfra) );
			suma = suma + silnia(cyfra);
		}
		return ( suma == liczba );
		//if( suma == liczba ) return true;
		//else return false;
	}
	
	public static void main(String[] args) {
		
		File f = new File("liczby.txt");
		try {
			FileWriter fw = new FileWriter( "wynik4.txt", true );
			fw.write("4.2: \n");
			Scanner s = new Scanner( f );
			while( s.hasNextInt() ) {
				int a = s.nextInt();
				if( testuj(a+"") == true ) fw.write(a+"\n");
			}
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

}
