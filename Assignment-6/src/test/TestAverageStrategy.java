import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
* <h1>Test Average Strategy!</h1>
* <p>The Average Test class implements several funcitons
* designed to test both average functions and exceptions
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-04-22
*/
public class TestAverageStrategy {

  @Test
  public void testModifiedCompute() throws EmptyListException{

    List<Integer> listNumbers = new ArrayList<>();
    listNumbers.add(1);
    listNumbers.add(2);
    listNumbers.add(3);
    listNumbers.add(4);
    listNumbers.add(5);
    listNumbers.add(6);
    AverageContext ctx = new AverageContext();
    ctx.setAverageStrategy(new ModifiedAverageStrategy());
    assertEquals(4, ctx.computeAverage(listNumbers));

    List<Integer> listNumbers2 = new ArrayList<>();
    listNumbers2.add(10);
    listNumbers2.add(24);
    listNumbers2.add(37);
    listNumbers2.add(49);
    listNumbers2.add(53);
    listNumbers2.add(69);
    assertEquals(52, ctx.computeAverage(listNumbers2));

    List<Integer> listNumbers3 = new ArrayList<>();
    listNumbers3.add(87);
    listNumbers3.add(92);
    listNumbers3.add(14);
    listNumbers3.add(79);
    listNumbers3.add(55);
    assertEquals(86, ctx.computeAverage(listNumbers3));
  }

  @Test
  public void testNormalCompute() throws EmptyListException {
    List<Integer> listNumbers = new ArrayList<>();
    listNumbers.add(1);
    listNumbers.add(2);
    listNumbers.add(3);
    listNumbers.add(4);
    listNumbers.add(5);
    listNumbers.add(6);
    AverageContext ctx = new AverageContext();
    ctx.setAverageStrategy(new NormalAverageStrategy());
    assertEquals(3, ctx.computeAverage(listNumbers));

    List<Integer> listNumbers2 = new ArrayList<>();
    listNumbers2.add(10);
    listNumbers2.add(24);
    listNumbers2.add(37);
    listNumbers2.add(49);
    listNumbers2.add(53);
    listNumbers2.add(69);
    assertEquals(40, ctx.computeAverage(listNumbers2));

    List<Integer> listNumbers3 = new ArrayList<>();
    listNumbers3.add(44);
    listNumbers3.add(63);
    listNumbers3.add(146);
    listNumbers3.add(729);
    listNumbers3.add(55);
    assertEquals(207, ctx.computeAverage(listNumbers3));
  }

  @Test (expected = EmptyListException.class)
  public void testNormalComputeException() throws Exception{
    List<Integer> listNumbers = new ArrayList<>();
    AverageContext ctx = new AverageContext();
    ctx.setAverageStrategy(new NormalAverageStrategy());
    ctx.computeAverage(listNumbers);
  }

  @Test (expected = EmptyListException.class)
  public void testModifiedComputeException() throws Exception{
    List<Integer> listNumbers = new ArrayList<>();
    listNumbers.add(1);
    listNumbers.add(2);
    AverageContext ctx = new AverageContext();
    ctx.setAverageStrategy(new ModifiedAverageStrategy());
    ctx.computeAverage(listNumbers);

    List<Integer> listNumbers2 = new ArrayList<>();
    listNumbers2.add(104);
    ctx.computeAverage(listNumbers2);

    List<Integer> listNumbers3 = new ArrayList<>();
    ctx.computeAverage(listNumbers3);
  }
  
}