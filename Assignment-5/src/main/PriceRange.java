/**
* <h1>Price Range!</h1>
* <p>The Price Range class implements the Range interface:
* it has several functions designed to implement, test and
* manipulate Range objects.
* </p>
* @author  Chijioke Kamanu
* @since 2019-04-03
*/

public class PriceRange implements Range {
  private int upperBound;
  private int lowerBound;
  
  /**
    * This method is the PriceRange class constructor
    * @param lowerBound This is the lower value (starting point) in the range
    * @param upperBound This is the higher value (end point) in the range
    * @return Nothing
    */
  PriceRange(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  /**
    * This method gets the end point of a range object
    * @param None
    * @return int This returns the upper bound of the range
    */
  public int getUpper() {
    return this.upperBound;
  }

 /**
    * This method gets the starting point of a range object
    * @param None
    * @return int This returns the lower bound of the range
    */
  public int getLower() {
    return this.lowerBound;
  }

 /**
    * This method determines whether a range contains a value
    * @param value This is the value to be checked for 
    * @return bool This returns true or false depending on if the value
    * is within the range
    */
	public boolean contains(int value) {
    if (value >= this.lowerBound && value <= this.upperBound)
      return true;
    return false;
  }
  
  /**
    * Dummy function
    * @param other This is a Range object 
    * @return bool Returns true always
    */
  public boolean overlaps(Range other){
    return true;
  }

/**
    * This method determines whether two ranges intersect/overlap
    * @param other This is the second range in question
    * @return bool This returns true or false depending on if the 
    * ranges overlap or not
    */
  public boolean overlaps(PriceRange other) {
    if (contains(other.lowerBound) || contains(other.upperBound))
      return true;
    return false;
  }
  
  /**
    * Dummy function
    * @param other This is a Range object 
    * @return bool Returns true always
    */
  public boolean isEquals(Range other) {
    return true;
  }
  
  /**
    * This method determines whether two ranges are equal
    * @param other This is the second range in question
    * @return bool This returns true or false depending on if the 
    * ranges are equal
    */
  public boolean isEquals(PriceRange other) {
    if ((other.lowerBound == this.lowerBound) && (other.upperBound == this.upperBound))
      return true;
    return false;
  }
  
  /**
    * This method determines the size of a range(boundaries inclusive)
    * @param None
    * @return int This returns the range's size
    */
  public int size() {
    return (this.upperBound - this.lowerBound) + 1;
  }

}
