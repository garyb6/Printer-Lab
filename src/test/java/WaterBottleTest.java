import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {waterbottle = new WaterBottle ();}

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.takeDrink(10));
    }

    @Test
    public void canEmptyWaterBottle(){
        assertEquals(0, waterbottle.setWaterBottleVolume(0));
    }

    @Test
    public void canFillWaterBottle(){
        assertEquals(100, waterbottle.setWaterBottleVolume(100));
    }
}
