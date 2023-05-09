package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testBolme() {
		
		int sayi1 = 10;
		int sayi2 = 2;
		
		
		int gerceksonuc = Bolme.bolme(sayi1, sayi2);
		
		assertEquals(5,gerceksonuc);
		
	}

}
