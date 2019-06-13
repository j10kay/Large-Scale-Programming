/**
* <h1>Range!</h1>
* <p>The Range interface contains functions
* that can be implented in various classes
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-04-03
*/
public interface Range {
  public boolean contains(int value);
  public boolean overlaps(Range other);
  public int size();
  public boolean isEquals(Range other);
}