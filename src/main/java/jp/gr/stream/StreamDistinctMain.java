package jp.gr.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctMain {

    public static void main(String[] args) {
        // リストを作成する(EmployeeはhashCode,equalsの実装が必要)
        List<Employee> employees = Arrays.asList(
            new Employee(0, "Adam"),
            new Employee(2, "Brian"),
            new Employee(1, "Cliff"),
            new Employee(2, "Brian"),
            new Employee(0, "Abel"));

		// リストから重複を排除する
        // ソート対象はhashCode,equalsの実装が必要
		System.out.println("distinctの結果");
		employees.stream().distinct().forEach(System.out::println);
		System.out.println();
	}
}
