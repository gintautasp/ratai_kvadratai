package ernadas_ratai_kvadratai;

public class Staciakampis extends Figura {
	
	public Double x_prad, x_pab, y_prad, y_pab;	

	public Staciakampis( Double x_prad, Double x_pab, Double y_prad, Double y_pab, Integer z_index ) {
		
		this.x_prad = x_prad;
		this.x_pab = x_pab;
		this.y_prad = y_prad;
		this.y_pab = x_pab;
		
		this.x_min = x_prad;
		this.x_max = x_pab;
		this.y_min = y_prad;
		this.y_max = x_pab;	
		
		this.z_index = z_index;
	}

	public void parodyti() {
		
		 System.out.println( "x_prad : " +  x_min );
		 System.out.println( "x_pab : " +  x_max );
		 System.out.println( "y_prad : " +  y_min );
		 System.out.println( "y_pab : " +  y_max );		 
	}
}
