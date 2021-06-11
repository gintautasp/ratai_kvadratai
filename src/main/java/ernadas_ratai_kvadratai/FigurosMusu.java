package ernadas_ratai_kvadratai;

import java.util.ArrayList;

public class FigurosMusu {
	
	protected ArrayList<Figura> testinis_rinkinys;
	
	public FigurosMusu() {
		
		testinis_rinkinys = new ArrayList<Figura>();
	}

	public ArrayList<Figura> atiduokSarasa() {
		
		suformuok();
		return testinis_rinkinys;
	}
	
	public void suformuok() {
		
		testinis_rinkinys.add ( new Staciakampis ( 1.0, 7.3, 4.8, 6.2, 0 ) );
		testinis_rinkinys.add ( new Staciakampis ( 2.0, 9.6, 6.8, 11.2, 0 ) );
		testinis_rinkinys.add ( new Staciakampis ( 12.0, 16.8, 1.8, 3.2, 0 ) );
	}
}
