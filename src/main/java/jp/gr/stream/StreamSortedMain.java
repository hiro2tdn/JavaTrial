package jp.gr.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedMain {

    public static void main(String[] args) {
        // リストを作成する
        List<Employee> employees = Arrays.asList(
            new Employee(0, "Adam"),
            new Employee(2, "Brian"),
            new Employee(1, "Cliff"),
            new Employee(2, "Brian"),
            new Employee(0, "Abel"));

		// リストをid,nameの昇順にソートする
		System.out.println("sortedの結果");
		employees.stream()
			.sorted(Comparator.comparing(Employee::getId)
				.thenComparing(Employee::getName))
			.forEach(System.out::println);
		System.out.println();
	}
}
