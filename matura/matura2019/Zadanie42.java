package matura2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie42 {
	static int silnia2[] = new int[10]; //0..9
		
	public static Boolean testuj(String napis) {
		int liczba = Integer.parseInt( napis );
		int suma = 0;
		for(int i = 0; i<napis.length(); i++ ) {
			char cyfraC = napis.charAt( i );
			String cyfraS = cyfraC+"";
			int cyfra = Integer.parseInt(cyfraS);
			suma = suma + silnia2[cyfra];
		}
		return ( suma == liczba );
	}
	
	public static void main(String[] args) {
		silnia2[0]=1;
		silnia2[1]=1;
		for(int i=2; i<10; i++) {
			silnia2[i] = silnia2[i-1] *i;
		}
		
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
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
