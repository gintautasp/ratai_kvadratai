package ernadas_ratai_kvadratai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FigurosMusuIsFailo extends FigurosMusu {
	
	public String failo_vardas;
	
	public FigurosMusuIsFailo() {
		
		super();
	}

	public FigurosMusuIsFailo( String failo_vardas ) {
		
		super();
		this.failo_vardas = failo_vardas;
	}

	public ArrayList<Figura> atiduokSarasa() {
		
		// failo atidarymas ir skaitymas ir naujo saraso sudarymas
		try {
		
			FileReader fr= new FileReader( this.failo_vardas );    
	        BufferedReader br= new BufferedReader( fr );
	        
	        String file_line;
			String[] figuros_parametrai;
	        
	        while( ( file_line = br.readLine() ) != null ) {
	        	
	        	figuros_parametrai = file_line.split(",");
	        	
	        	if ( figuros_parametrai [ 0 ].equals( "St" ) ) {
	        		
	        		testinis_rinkinys.add (
	        				
        				new Staciakampis (
        						
        						Double.parseDouble ( figuros_parametrai [ 1 ] )
        					  , Double.parseDouble ( figuros_parametrai [ 2 ] )
        					  , Double.parseDouble ( figuros_parametrai [ 3 ] )
        					  , Double.parseDouble ( figuros_parametrai [ 4 ] )
        					  , Integer.parseInt ( figuros_parametrai [ 5 ] )
        				)
        			);
	        	}
	        }
	        br.close();
        
		} catch ( Exception e ) {
			
			System.out.println ( "failo " + this.failo_vardas + " skaitymo klaida .." );
			System.out.println ( "imamas testinis rinkinys .." );
			
			testinis_rinkinys = super.atiduokSarasa();
		}	
		// o jei nesigauna grazinam testini rinkimi
		return testinis_rinkinys;
	}
}
