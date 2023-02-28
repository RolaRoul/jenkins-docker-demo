import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
	@Test
	public void testNumberIsPositive() {
		assertTrue(Main.checkIfNumberIsPositive(5));
	}
	
	@Test
	public void testNumberIsNegative() {
		assertTrue(Main.checkIfNumberIsNegative(-5));
	}
}