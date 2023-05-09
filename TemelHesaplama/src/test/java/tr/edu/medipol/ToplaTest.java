package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplaTest {

	@Test
	public void testTopla() {
		
		//given 
	
		int sayi1 = 10;
		int sayi2 = 22;
		
		//when 
		
		int gerceksonuc = Topla.islemYap(sayi1,sayi2);
		
		//result
		
		assertEquals(32,gerceksonuc);
				
				
		
		
		
		
	}

}
