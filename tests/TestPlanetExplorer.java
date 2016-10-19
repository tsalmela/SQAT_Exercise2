import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() throws PlanetExplorerException{
		
		PlanetExplorer pe = new PlanetExplorer(100,100, "(5,5), (6,7)");
		String command = "lrfb";
		String value = pe.executeCommand(command);
		assertEquals("Expected explorer to be at 0.0 facing NORTH", "(0,0,NORTH)", value);
		
	}
}
