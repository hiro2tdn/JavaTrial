package jp.gr.beanpredicate;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;

public class BeanPredicateMain {

	public static void main(String[] args) {
		// 抽出対象のリストを作成する
		List<Employee> employees = Arrays.asList(
				new Employee(0, "太郎"),
				new Employee(1, "二郎"),
				new Employee(0, "花子"));

		// 抽出条件を指定する(idが0の項目を抽出する）
		BeanPredicate beanPredicate = new BeanPredicate("id",
				PredicateUtils.equalPredicate(0));

		// CollectionUtils.selectの場合
		@SuppressWarnings("unchecked")
		List<Employee> selectedEmployees = (List<Employee>) CollectionUtils
				.select(employees, beanPredicate);
		System.out.println("CollectionUtils.selectの結果");
		selectedEmployees.stream().forEach(System.out::println);
		System.out.println();

		// CollectionUtils.findの場合
		Employee findedEmployee = (Employee) CollectionUtils.find(employees,
				beanPredicate);
		System.out.println("CollectionUtils.findの結果");
		System.out.println(findedEmployee);
		System.out.println();

		// CollectionUtils.existsの場合
		boolean exists = CollectionUtils.exists(employees, beanPredicate);
		System.out.println("CollectionUtils.existsの結果");
		System.out.println(exists);
	}
}
