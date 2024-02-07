
/*
 * Class to test "Practice" test
 * At this point, I did not know good naming practice
 * This was likely coded in 2019, the first year I ever learned programming
 * 
 */
public class PracticeTester {

  // add javadoc style header
  /**
   * 
   * @return boolean
   */
  public static boolean testIndexOfOverSizeArray() {
    // create an over size array of strings
    String[] data = new String[] {"S", "Z", "U", "O", "R", null, null, null, null};
    int size = 5;
    // successful search
    if (Practice.indexOf("S", data, size) != 0) {
      System.out.println("First successful search test scenario failed");
      return false;
    }
    // unsuccessful search
    if (Practice.indexOf("T", data, size) != -1) {
      System.out.println("Second unsuccessful search test scenario failed");
      return false;
    }
    // successful search2
    if (Practice.indexOf("U", data, size) != 2) {
      System.out.println("Second successful search test scenario failed");
      return false;
    }
    // unsuccessful search2
    if (Practice.indexOf("A", data, size) != -1) {
      System.out.println("Second unsuccessful search test scenario failed");
      return false;
    }



    return true; // return false is default, return true if string is found

  }

  public static void main(String[] args) {
    System.out.println("testIndexOfOversizeArray():" + testIndexOfOverSizeArray());
  }
}


