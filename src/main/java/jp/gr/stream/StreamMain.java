package jp.gr.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        // リストを作成する
        List<Employee> employees = Arrays.asList(
            new Employee(0, "太郎"),
            new Employee(1, "二郎"),
            new Employee(0, "花子"),
            new Employee(1, "二郎"));

        // idが0のEmployeeを抽出する
        System.out.println("filterの結果");
        employees.stream().filter(s -> s.getId() == 0).forEach(System.out::println);
        System.out.println();

        // 重複するEmployeeを取り除く
        System.out.println("distinctの結果");
        employees.stream().distinct().forEach(System.out::println);

        // Streamをリストに戻す場合
        employees.stream().distinct().collect(Collectors.toList());
    }
}
