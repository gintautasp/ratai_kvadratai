package ernadas_ratai_kvadratai;

import java.util.ArrayList;

public class PlokstumuErdve {
	
	public ArrayList<Figura> figuros; 
	
	public PlokstumuErdve() {
	
		figuros = new ArrayList<Figura>();
	}
	
	public PlokstumuErdve(FigurosMusu figuros_musu) {
		
		this.figuros = figuros_musu.atiduokSarasa();
	}
	
	
	public void parodytiFiguruSarasa() {
	
		int eil_nr = 0;
		
		for ( Figura figura:figuros) {
			
			System.out.println ( "----------- " + eil_nr  + " -----------" );
			figura.parodyti();
			eil_nr++;
		}
	}
}
