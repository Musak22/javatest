package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testCarpma() {
		
		int sayi1 = 10;
		int sayi2 = 34;
		
		int gerceksonuc = Carpma.carpma(sayi1,sayi2);
		
		
		assertEquals(340,gerceksonuc);
		
		
		
	}

}
