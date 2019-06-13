import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
* <h1>Price Range Test!</h1>
* <p>The Price Range Test class implements several funcitons
* designed to test functions of the PriceRange class
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-04-03
*/
public class PriceRangeTest {
  @Test
  public void testGetUpper() {
    PriceRange sampleRange = new PriceRange(-10, -5);
    int output = sampleRange.getUpper();
    assertTrue(output == -5);
    PriceRange sampleRange2 = new PriceRange(15,35);
    int output2 = sampleRange2.getUpper();
    assertTrue(output2 == 35);
    PriceRange sampleRange3 = new PriceRange(104,357);
    int output3 = sampleRange3.getUpper();
    assertFalse(output3 != 357);
  }

  @Test
  public void testGetLower() {
    PriceRange sampleRange = new PriceRange(5, 10);
    int output = sampleRange.getLower();
    assertTrue(output == 5);
    PriceRange sampleRange2 = new PriceRange(-15,35);
    int output2 = sampleRange2.getLower();
    assertTrue(output2 == -15);
    PriceRange sampleRange3 = new PriceRange(0,67);
    int output3 = sampleRange3.getLower();
    assertFalse(output3 != 0);
  }

  @Test
  public void testContains() {
    PriceRange sampleRange = new PriceRange(5, 10);
    assertTrue(sampleRange.contains(7));
    assertFalse(sampleRange.contains(20));
    PriceRange sampleRange2 = new PriceRange(-15, 4);
    assertTrue(sampleRange2.contains(-8));
    assertFalse(sampleRange2.contains(-45));
  }

  @Test
  public void testOverlaps() {
    PriceRange sampleRange = new PriceRange(6, 12);
    PriceRange sampleRange2 = new PriceRange(8, 15);
    PriceRange sampleRange3 = new PriceRange(-13, 2);
    assertTrue(sampleRange.overlaps(sampleRange2));
    assertFalse(sampleRange.overlaps(sampleRange3));
  }

  @Test
  public void testIsEquals() {
    PriceRange sampleRange = new PriceRange(40, 50);
    PriceRange sampleRange2 = new PriceRange(40, 50);
    PriceRange sampleRange3 = new PriceRange(-13, 2);
    assertTrue(sampleRange.isEquals(sampleRange2));
    assertFalse(sampleRange.isEquals(sampleRange3));
  }
 
  @Test
  public void testSize() {
    PriceRange sampleRange = new PriceRange(60, 85);
    PriceRange sampleRange2 = new PriceRange(40, 50);
    assertEquals(26, sampleRange.size());
    assertEquals(11, sampleRange2.size());
  }

}