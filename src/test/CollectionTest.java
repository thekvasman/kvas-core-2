package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import task.collection.AttendanceStudent;
import task.collection.Collection;
import task.collection.Order;
import task.collection.Product;
import task.collection.Student;
import task.collection.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionTest {

  Collection collection = new Collection();

  @Test
  public void testFindMaxElement() {
    //given
    List<Integer> list = Arrays.asList(1, 3, 2, 5, 4);
    int expectedResult = 5;

    //when
    int actualResult = collection.findMaxElement(list);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testRemoveDuplicates() {
    //given
    List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);

    //when
    List<Integer> actualResult = collection.removeDuplicates(list);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSortDescending() {
    //given
    List<Integer> list = Arrays.asList(1, 3, 2, 5, 4);
    List<Integer> expectedResult = Arrays.asList(5, 4, 3, 2, 1);

    //when
    List<Integer> actualResult = collection.sortDescending(list);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testContainsElement() {
    //given
    Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    int element = 3;
    boolean expectedResult = true;

    //when
    boolean actualResult = collection.containsElement(set, element);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testFindIntersection() {
    //given
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> expectedResult = new HashSet<>(Arrays.asList(4, 5));

    //when
    Set<Integer> actualResult = collection.findIntersection(set1, set2);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testRemoveCommonElements() {
    //given
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2, 3));

    //when
    Set<Integer> actualResult = collection.removeCommonElements(set1, set2);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testContainsKey() {
    //given
    Map<String, Integer> map = new HashMap<>();
    map.put("key1", 1);
    map.put("key2", 2);
    String key = "key1";
    boolean expectedResult = true;

    //when
    boolean actualResult = collection.containsKey(map, key);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetValuesByKey() {
    //given
    Map<String, List<Integer>> map = new HashMap<>();
    map.put("key1", Arrays.asList(1, 2, 3));
    map.put("key2", Arrays.asList(4, 5, 6));
    String key = "key1";
    List<Integer> expectedResult = Arrays.asList(1, 2, 3);

    //when
    List<Integer> actualResult = collection.getValuesByKey(map, key);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testRemoveEntriesByValue() {
    //given
    Map<String, Integer> map = new HashMap<>();
    map.put("key1", 1);
    map.put("key2", 2);
    map.put("key3", 1);
    int value = 1;

    //when
    collection.removeEntriesByValue(map, value);

    //then
    assertFalse(map.containsKey("key1"));
    assertFalse(map.containsKey("key3"));
    assertTrue(map.containsKey("key2"));
  }

  @Test
  public void testAddToQueue() {
    //given
    Queue<Integer> queue = new LinkedList<>();
    int element = 1;

    //when
    collection.addToQueue(queue, element);

    //then
    assertEquals(1, queue.size());
  }

  @Test
  public void testPollFromQueue() {
    //given
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    Integer expectedResult = 1;

    //when
    Integer actualResult = collection.pollFromQueue(queue);

    //then
    assertEquals(expectedResult, actualResult);
    assertEquals(1, queue.size());
  }

  @Test
  public void testIsQueueEmpty() {
    //given
    Queue<Integer> queue = new LinkedList<>();
    boolean expectedResult = true;

    //when
    boolean actualResult = collection.isQueueEmpty(queue);

    //then
    assertEquals(expectedResult, actualResult);

    //given
    queue.add(1);
    expectedResult = false;

    //when
    actualResult = collection.isQueueEmpty(queue);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testPrintOrdersWithMaxAmount() {
    //given
    List<Order> orders = Arrays.asList(
        new Order(1, "Customer1", 100),
        new Order(2, "Customer2", 200),
        new Order(3, "Customer3", 200)
    );

    //when
    collection.printOrdersWithMaxAmount(orders);
  }

  @Test
  public void testGetTotalAmountOfOrders() {
    //given
    List<Order> orders = Arrays.asList(
        new Order(1, "Customer1", 100),
        new Order(2, "Customer2", 200),
        new Order(3, "Customer3", 300)
    );
    int expectedResult = 600;

    //when
    int actualResult = collection.getTotalAmountOfOrders(orders);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testPrintIncompleteTasks() {
    //given
    List<Task> tasks = Arrays.asList(
        new Task(1, "Task1", false),
        new Task(2, "Task2", true),
        new Task(3, "Task3", false)
    );

    //when
    collection.printIncompleteTasks(tasks);
  }

  @Test
  public void testGetTasksByTitle() {
    //given
    List<Task> tasks = Arrays.asList(
        new Task(1, "Task1", false),
        new Task(2, "Task2", true),
        new Task(3, "Task1", false)
    );
    List<Task> expectedResult = new ArrayList<>(Arrays.asList(
        new Task(1, "Task1", false),
        new Task(3, "Task1", false)
    ));

    //when
    List<Task> actualResult = collection.getTasksByTitle(tasks, "Task1");

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testPrintStudents() {
    //given
    List<Student> students = Arrays.asList(
        new Student("Student1", 20),
        new Student("Student2", 22),
        new Student("Student3", 24)
    );

    //when
    collection.printStudents(students);
  }

  @Test
  public void testGetStudentsOlderThan() {
    //given
    List<Student> students = Arrays.asList(
        new Student("Student1", 20),
        new Student("Student2", 22),
        new Student("Student3", 24)
    );
    List<Student> expectedResult = Arrays.asList(
        new Student("Student2", 22),
        new Student("Student3", 24)
    );

    //when
    List<Student> actualResult = collection.getStudentsOlderThan(students, 21);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testPrintProductsWithZeroQuantity() {
    //given
    List<Product> products = Arrays.asList(
        new Product(1, "Product1", 0),
        new Product(2, "Product2", 10),
        new Product(3, "Product3", 0)
    );

    //when
    collection.printProductsWithZeroQuantity(products);
  }

  @Test
  public void testGetTotalQuantityOfProducts() {
    //given
    List<Product> products = Arrays.asList(
        new Product(1, "Product1", 10),
        new Product(2, "Product2", 20),
        new Product(3, "Product3", 30)
    );
    int expectedResult = 60;

    //when
    int actualResult = collection.getTotalQuantityOfProducts(products);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testPrintStudentsWithWorstAttendance() {
    //given
    List<AttendanceStudent> students = Arrays.asList(
        new AttendanceStudent("Student1", "50"),
        new AttendanceStudent("Student2", "30"),
        new AttendanceStudent("Student3", "30")
    );

    //when
    collection.printStudentsWithWorstAttendance(students);
  }

  @Test
  public void testGetAverageAttendance() {
    //given
    List<AttendanceStudent> students = Arrays.asList(
        new AttendanceStudent("Student1", "50"),
        new AttendanceStudent("Student2", "30"),
        new AttendanceStudent("Student3", "40")
    );
    double expectedResult = 40.0;

    //when
    double actualResult = collection.getAverageAttendance(students);

    //then
    assertEquals(expectedResult, actualResult, 0.0001);
  }
}