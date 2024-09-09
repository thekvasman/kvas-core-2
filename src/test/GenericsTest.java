package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import task.generics.Generics;

import java.util.Arrays;
import java.util.List;

public class GenericsTest {

  @Test
  public void testGetFirstElement() {
    // given
    List<String> list = Arrays.asList("A", "B", "C");
    String expectedResult = "A";

    // when
    String actualResult = Generics.getFirstElement(list);

    // then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetLastElement() {
    // given
    List<Integer> list = Arrays.asList(1, 2, 3);
    Integer expectedResult = 3;

    // when
    Integer actualResult = Generics.getLastElement(list);

    // then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testMergeLists() {
    // given
    List<String> list1 = Arrays.asList("A", "B");
    List<String> list2 = Arrays.asList("C", "D");
    List<String> expectedResult = Arrays.asList("A", "B", "C", "D");

    // when
    List<String> actualResult = Generics.mergeLists(list1, list2);

    // then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetUniqueElements() {
    // given
    List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3);

    // when
    List<Integer> actualResult = Generics.getUniqueElements(list);

    // then
    assertEquals(expectedResult, actualResult);
  }
}