import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;


public class CheckingBracketsTest{

  CheckingBrackets check = new CheckingBrackets();

  @Test
  public void testCheckForCorrectnessOfParentheses() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testCheckForCorrectnessOfParentheses.txt"));
    String input = scn.nextLine();
    input = check.removeAllSymbolsExpectBrackets(input);

    boolean correctResult = check.checkForCorrectness(input);
    Assert.assertTrue(correctResult);
  }

  @Test
  public void testCheckForCorrectnessOfSquareBrackets() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testCheckForCorrectnessOfSquareBrackets.txt"));
    String input = scn.nextLine();
    input = check.removeAllSymbolsExpectBrackets(input);

    boolean correctResult = check.checkForCorrectness(input);
    Assert.assertTrue(correctResult);
  }

  @Test
  public void  testCheckForCorrectnessOfBraces() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testCheckForCorrectnessOfBraces.txt"));
    String input = scn.nextLine();
    input = check.removeAllSymbolsExpectBrackets(input);

    boolean correctResult = check.checkForCorrectness(input);
    Assert.assertTrue(correctResult);
  }

  @Test
  public void testCheckForCorrectnessOfAllBrackets() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testCheckForCorrectnessOfAllBrackets.txt"));
    String input = scn.nextLine();
    input = check.removeAllSymbolsExpectBrackets(input);

    boolean correctResult = check.checkForCorrectness(input);
    Assert.assertTrue(correctResult);
  }

}