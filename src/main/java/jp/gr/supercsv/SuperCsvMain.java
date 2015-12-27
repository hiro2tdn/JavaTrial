package jp.gr.supercsv;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

import org.supercsv.ext.io.CsvAnnotationBeanWriter;
import org.supercsv.prefs.CsvPreference;
import org.supercsv.quote.AlwaysQuoteMode;

public class SuperCsvMain {

    public static void main(String[] args) throws Exception {
        // CSV出力するリストを作成する
        List<Employee> employees = Arrays.asList(
                new Employee(0, "太郎"),
                new Employee(1, "二郎"),
                new Employee(0, "花子"));

        // CSVファイルの形式を指定する
        CsvPreference preference = new CsvPreference
            .Builder(CsvPreference.EXCEL_PREFERENCE)
            .useQuoteMode(new AlwaysQuoteMode()).build();

        // CSVファイルを出力する
        try (FileWriter fwriter = new FileWriter("target/employees.csv");
                CsvAnnotationBeanWriter<Employee> cabwriter =
                    new CsvAnnotationBeanWriter<>(Employee.class, fwriter, preference)) {

            cabwriter.writeHeader();

            for (Employee employee : employees) {
                cabwriter.write(employee);
            }
            cabwriter.flush();
        }
    }
}
