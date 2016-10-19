package jp.gr.yamada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;

public class BeanPredicateSample {
    public static void main(String[] args) {
        // 処理対象のリストを作成する
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Adam"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(1, "Cliff"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(0, "Abel"));

        // 抽出条件を指定する(idが0の項目を抽出する）
        BeanPredicate beanPredicate = new BeanPredicate("id", PredicateUtils.equalPredicate(0));

        System.out.println("[id=0の項目を取得する(全て)]");
        Iterator<?> it = CollectionUtils.select(employees, beanPredicate).iterator();
        while (it.hasNext()) {
            System.out.println((Employee) it.next());
        }

        System.out.println("[id=0の項目を取得する(1件)]");
        System.out.println(CollectionUtils.find(employees, beanPredicate));

        System.out.println("[id=0の項目の有無]");
        System.out.println(CollectionUtils.exists(employees, beanPredicate));
    }
}
