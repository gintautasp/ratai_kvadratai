package ernadas_ratai_kvadratai;

import java.util.ArrayList;

public class FigurosMusu {
	
	public ArrayList<Figura> testinis_rinkinys;
	
	public FigurosMusu() {
		
		testinis_rinkinys = new ArrayList<Figura>();

	}

	public ArrayList<Figura> atiduokSarasa() {
		
		testinis_rinkinys.add ( new Staciakampis ( 1.0, 7.3, 4.8, 6.2, 0 ) );
		testinis_rinkinys.add ( new Staciakampis ( 2.0, 9.6, 6.8, 11.2, 0 ) );
		testinis_rinkinys.add ( new Staciakampis ( 12.0, 16.8, 1.8, 3.2, 0 ) );
		return testinis_rinkinys;
	}
}
