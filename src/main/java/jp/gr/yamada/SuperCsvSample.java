package jp.gr.yamada;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.supercsv.ext.io.CsvAnnotationBeanWriter;
import org.supercsv.prefs.CsvPreference;
import org.supercsv.quote.AlwaysQuoteMode;

public class SuperCsvSample {
    public static void main(String[] args) throws Exception {
        // 処理対象のリストを作成する
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Adam"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(1, "Cliff"));
        employees.add(new Employee(2, "Brian"));
        employees.add(new Employee(0, "Abel"));

        // CSVファイルの形式を指定する
        CsvPreference preference = new CsvPreference.Builder(CsvPreference.EXCEL_PREFERENCE).useQuoteMode(new AlwaysQuoteMode()).build();

        // CSVファイルを生成する
        try (Writer writer = new FileWriter("./target/employees.csv");
                CsvAnnotationBeanWriter<Employee> csvwriter = new CsvAnnotationBeanWriter<>(Employee.class, writer, preference)) {
            csvwriter.writeHeader();
            for (Employee employee : employees) {
                csvwriter.write(employee);
            }
            csvwriter.flush();
        }

        // 生成したCSVファイルの内容を出力する
        try (InputStream is = new FileInputStream("./target/employees.csv");
                Reader r = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(r)) {
            br.lines().forEach(System.out::println);
        }
    }
}
