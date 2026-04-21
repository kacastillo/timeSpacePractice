import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
@Test
public void testTimeEfficientOneElement() {
  // Arrange
  int[] nums = {4};

  // Act
  int result = Practice.mostCommonTimeEfficient(nums);
  // Assert
  assertEquals(4, result);
}
@Test 
public void testTimeEfficientMultipleElements() {
  // Arrange
  int[] nums = {1, 4, 4, 5, 5, 4};
  // Act
  int result = Practice.mostCommonTimeEfficient(nums);
  // Assert
  // return 4 bc it shows up 3 time, 5 only shows up twice
  assertEquals(4, result);
}
@Test
public void testTimeEfficientEven() {
  // Arrange
  int[] nums = {1, 2, 3, 2, 1, 3};
  // Act
  int result = Practice.mostCommonTimeEfficient(nums);
  // Assert
  // In this case, there is a tie between 1, 2, and 3, but 1 shows frst -> return 1
  assertEquals(1, result);
}
}
