package Mockito;
import org.junit.Before;
import org.junit.Test;
public class TestCalculator 
{
    Calculator c = null;
    @Before
    public void setUp()
    {
        c = new Calculator();
    }
    @Test
    public void testAdd()
    {
        assertEquals(10,c.perform(2,3));
    }
    
}
