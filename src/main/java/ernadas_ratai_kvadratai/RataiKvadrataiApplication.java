package ernadas_ratai_kvadratai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RataiKvadrataiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RataiKvadrataiApplication.class, args);
		/*
		PlokstumuErdve plokstumu_erdve = new PlokstumuErdve ( 
				// new FigurosMusuIsFailo( "figuros.csv" )
				new FigurosMusu()
		);
		*/

		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		PlokstumuErdve plokstumu_erdve = (PlokstumuErdve) context.getBean( "mainspring" );
		plokstumu_erdve.parodytiFiguruSarasa();
	}

}
