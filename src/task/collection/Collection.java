package task.collection;

import java.util.*;

public class Collection {

    public int findMaxElement(List<Integer> list) {
        return Collections.max(list);
    }

    public List<Integer> removeDuplicates(List<Integer> list) {

        List<Integer> list2 = new ArrayList<>();

        for (Integer x : list) {
            if (!list2.contains(x)) {
                list2.add(x);
            }
        }
        return list2;
    }

    public List<Integer> sortDescending(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
        return list;
    }

    public boolean containsElement(Set<Integer> set, int element) {
        return set.contains(element);
    }

    public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> set3 = new HashSet<>();

        for (int i : set1) {
            for (int s : set2) {
                if (i == s) set3.add(i);
            }
        }
        return set3;
    }

    public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> set3 = new HashSet<>();

        for (int i : set1) {
            for (int s : set2) {
                if (i == s) set3.add(i);
            }
        }
        set1.removeAll(set3);
        return set1;
    }

    public boolean containsKey(Map<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
        return map.get(key);
    }

    public void removeEntriesByValue(Map<String, Integer> map, int value) {
        map.values().removeIf(v -> v == value);
    }

    public void addToQueue(Queue<Integer> queue, int element) {
        queue.add(element);
    }

    public Integer pollFromQueue(Queue<Integer> queue) {
        return queue.poll();
    }

    public boolean isQueueEmpty(Queue<Integer> queue) {
        return queue.isEmpty();
    }

    public void printOrdersWithMaxAmount(List<Order> orders) {
        List<Integer> list = new ArrayList<>();
        for (Order order : orders) {
            list.add(order.getTotalAmount());
        }
        int maxAmount = Collections.max(list);
        for (Order order : orders) {
            if (maxAmount == order.getTotalAmount()) {
                System.out.println(order.getId() + " " + order.getCustomer() + " " + order.getTotalAmount());
            }
        }
    }

    public int getTotalAmountOfOrders(List<Order> orders) {
        int totals = 0;
        for (Order order : orders) {
            totals += order.getTotalAmount();
        }
        return totals;
    }

    public void printIncompleteTasks(List<Task> tasks) {
        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println(t.getId() + " " + t.getTitle() + " " + t.isCompleted());
            }
        }
    }

    public List<Task> getTasksByTitle(List<Task> tasks, String title) {
        List<Task> tasksByTitles = new ArrayList<>();
        for (Task task : tasks) {
            if (Objects.equals(title, task.getTitle())) {
                tasksByTitles.add(task);
            }
        }
        return tasksByTitles;
    }

    public void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }

    public List<Student> getStudentsOlderThan(List<Student> students, int age) {
        List<Student> studentsOlderThan = new ArrayList<>();
        for (Student student : students){
            if (age < student.getAge()){
                studentsOlderThan.add(student);
            }
        }
        return studentsOlderThan;
    }

    public void printProductsWithZeroQuantity(List<Product> products) {
        for (Product p : products) {
            if (p.getQuantity() == 0) {
                System.out.println(p.getName());
            }
        }
    }

    public int getTotalQuantityOfProducts(List<Product> products) {
        int totalQuantity = 0;
        for (Product p : products) {
            totalQuantity += p.getQuantity();
        }
        return totalQuantity;
    }

    public void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
        int minValue = Integer.MAX_VALUE;
        for (AttendanceStudent s : students) {
            int studentAttendance = Integer.parseInt(s.getAttendance());
            if (studentAttendance < minValue) {
                minValue = studentAttendance;
            }
        }
        for (AttendanceStudent x : students) {
            if (minValue == Integer.parseInt(x.getAttendance())) {
                System.out.println(x.getName() + " " + x.getAttendance());
            }
        }
    }

    public double getAverageAttendance(List<AttendanceStudent> students) {
        double totalAttendance = 0;
        for(AttendanceStudent student : students){
            totalAttendance+=Double.parseDouble(student.getAttendance());
        }
        return totalAttendance/students.size();
    }
}