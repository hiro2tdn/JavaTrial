package jp.gr.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMain {

    public static void main(String[] args) {
        // リストを作成する
        List<Employee> employees = Arrays.asList(
            new Employee(0, "Adam"),
            new Employee(2, "Brian"),
            new Employee(1, "Cliff"),
            new Employee(2, "Brian"),
            new Employee(0, "Abel"));

		// idが0のEmployeeを抽出する
		System.out.println("filterの結果");
		employees.stream().filter(s -> s.getId() == 0)
				.forEach(System.out::println);
		System.out.println();
	}
}
