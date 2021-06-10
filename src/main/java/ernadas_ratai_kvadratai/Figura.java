package ernadas_ratai_kvadratai;

public class Figura {
	
	public Integer z_index;
	public Double x_min, y_min, x_max, y_max; 
	
	public Figura() {
		
	}
	
	public boolean arPersidengia( Figura kita ) {
		
		boolean persidengia = false;
		
		if ( 
					( z_index == kita.z_index )
				&&
					( 
							MakeLifeEasy.between( kita.x_min, x_min, x_max )
						||
							MakeLifeEasy.between( kita.x_max, x_min, x_max )
						||
							MakeLifeEasy.between( kita.y_min, y_min, y_max )
						||
							MakeLifeEasy.between( kita.y_max, y_min, y_max )
					)
		) {
			persidengia = true;
		}
		
		return persidengia;
	}
	
	public void parodyti() {
		
		 System.out.println( "x_min : " +  x_min );
		 System.out.println( "x_max : " +  x_max );
		 System.out.println( "y_min : " +  y_min );
		 System.out.println( "y_max : " +  y_max );		 
	}
	
}
