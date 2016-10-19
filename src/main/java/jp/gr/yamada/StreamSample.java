package jp.gr.yamada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        // 処理対象のリストを作成する
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Adam"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(1, "Cliff"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(0, "Abel"));

        System.out.println("[id=0の項目を取得する(全て)]");
        employees.stream().filter(s -> s.getId() == 0).forEach(System.out::println);

        System.out.println("[id, nameの昇順にソートする]");
        employees.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)).forEach(System.out::println);

        System.out.println("[重複を排除する]");
        employees.stream().distinct().forEach(System.out::println);
    }
}
