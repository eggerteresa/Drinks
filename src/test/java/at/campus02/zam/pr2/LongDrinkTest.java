package at.campus02.zam.pr2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@DisplayName("Testing LongDrink implementation")
public class LongDrinkTest {
    private Liquid f;
    private Liquid s;
    private LongDrink gt;

    @BeforeEach
    void setup() {
        f = new Liquid("Tonic Water", 0.16, 0);
        s = new Liquid("Gin", 0.04, 48);
        gt = new LongDrink("Gin Tonic", s, f);
    }
    @Test
    @DisplayName("Testing constructor")
    public void testConstructor(){
        assertEquals("Gin Tonic", gt.getName());
        assertEquals(s, gt.getSpirit());
        assertEquals(f, gt.getFiller());
    }
    @Test
    @DisplayName("Testing getVolume method")
    public void testGetVolume(){
        assertEquals(0.2, gt.getVolume() , 0.001);
    }
    @Test
    @DisplayName("Testing isAlcoholic method")
    public void testIsAlcoholic(){
        assertTrue(gt.isAlcoholic());
    }
    @Test
    @DisplayName("Testing getAlcoholPercent method")
    public void testGetAlcoholPercent(){
        // why? (0.04 * 48 + 0.16 * 0) / 0.2 =
        assertEquals(9.6, gt.getAlcoholPercent(), 0.001);
    }
}
