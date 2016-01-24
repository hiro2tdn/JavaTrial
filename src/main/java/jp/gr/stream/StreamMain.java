package jp.gr.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import jp.gr.beanpredicate.Employee;

public class StreamMain {

    public static void main(String[] args) {
        // リストを作成する
        List<Employee> employees = Arrays.asList(
            new Employee(0, "Adam"),
            new Employee(2, "Brian"),
            new Employee(1, "Cliff"),
            new Employee(2, "Brian"),
            new Employee(0, "Abel"));

        // 動作確認
        sorted(employees);
        filter(employees);
        distinct(employees);
    }

    /**
     * Stream#sortedの場合
     */
    private static void sorted(List<Employee> employees) {
        // リストをid, nameの昇順にソートする
        System.out.println("[Stream#sortedの結果]");
        employees.stream()
            .sorted(
                    Comparator.comparing(Employee::getId)
                .thenComparing(Employee::getName))
            .forEach(System.out::println);
    }

    /**
     * Stream#filterの場合
     */
    private static void filter(List<Employee> employees) {
        // リストからidが0のEmployeeを抽出する
        System.out.println("[Stream#filterの結果]");
        employees.stream().filter(s -> s.getId() == 0)
                .forEach(System.out::println);
    }

    /**
     * Stream#distinctの場合
     */
    private static void distinct(List<Employee> employees) {
        // リストから重複を排除する(EmployeeはhashCode, equalsの実装が必要)
        System.out.println("[Stream#distinctの結果]");
        employees.stream().distinct().forEach(System.out::println);
    }
}
