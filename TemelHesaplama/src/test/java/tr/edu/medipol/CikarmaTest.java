package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testCikarma() {
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		int gerceksonuc = Cikarma.islemYap(sayi1,sayi2);
		
		
		assertEquals(5,gerceksonuc);
		
	}

}
