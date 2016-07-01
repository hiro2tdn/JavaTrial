package jp.gr.yamada;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;

public class BeanPredicateSample {

    public static void main(String[] args) {
        // 抽出対象のリストを作成する
        List<Employee> employees = Arrays.asList(
                new Employee(0, "太郎"),
                new Employee(1, "二郎"),
                new Employee(0, "花子"));

        // 抽出条件を指定する(idが0の項目を抽出する）
        BeanPredicate beanPredicate = new BeanPredicate("id",
                PredicateUtils.equalPredicate(0));

        // 動作確認
        select(employees, beanPredicate);
        find(employees, beanPredicate);
        exists(employees, beanPredicate);
    }

    /**
     * CollectionUtils#selectの場合
     */
    @SuppressWarnings("unchecked")
    private static void select(List<Employee> employees,
            BeanPredicate beanPredicate) {
        System.out.println("[CollectionUtils#selectの結果]");
        CollectionUtils.select(employees, beanPredicate).stream()
                .forEach(System.out::println);
        System.out.println("");
    }

    /**
     * CollectionUtils#findの場合
     */
    private static void find(List<Employee> employees,
            BeanPredicate beanPredicate) {
        System.out.println("[CollectionUtils#findの結果]");
        System.out.println(CollectionUtils.find(employees, beanPredicate));
        System.out.println("");
    }

    /**
     * CollectionUtils#existsの場合
     */
    private static void exists(List<Employee> employees,
            BeanPredicate beanPredicate) {
        System.out.println("[CollectionUtils#existsの結果]");
        System.out.println(CollectionUtils.exists(employees, beanPredicate));
        System.out.println("");
    }
}
