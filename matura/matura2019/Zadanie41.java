package matura2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie41 {

	public static void main(String[] args)  {
		
		ArrayList<Integer> pot = new ArrayList<Integer>();
		int p = 1;
		for(int i = 0; i<11; i++) {
			pot.add( p );
			p = p * 3;
		}
		
//		int i = pot.indexOf(12);
//		System.out.println("Znalaz³em: "+i);
		
		File f = new File("liczby.txt");
		//System.out.println( f.getAbsolutePath() );
		try {
			int licznik = 0;
			Scanner s = new Scanner( f );
			while( s.hasNextInt() ) {
				int a = s.nextInt();
				int i = pot.indexOf( a );
				if( i > -1 ) licznik++;
			}
			s.close();
			//System.out.println("4.1: "+licznik);
			FileWriter fw = new FileWriter( "wynik4.txt", false );
			fw.write("4.1: "+licznik + "\n");
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
