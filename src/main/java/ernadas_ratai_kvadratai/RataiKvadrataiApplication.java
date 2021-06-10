package ernadas_ratai_kvadratai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RataiKvadrataiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RataiKvadrataiApplication.class, args);
		PlokstumuErdve plokstumu_erdve = new PlokstumuErdve ( 
				// new FigurosMusuIsFailo( "figuros.csv" )
				new FigurosMusu()
		);
		plokstumu_erdve.parodytiFiguruSarasa();
	}

}
