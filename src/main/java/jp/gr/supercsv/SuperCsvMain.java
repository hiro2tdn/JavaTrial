package jp.gr.supercsv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
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
		CsvPreference preference = new CsvPreference.Builder(
				CsvPreference.EXCEL_PREFERENCE).useQuoteMode(
				new AlwaysQuoteMode()).build();

		try (Writer writer = new FileWriter("target/employees.csv");
				CsvAnnotationBeanWriter<Employee> csvwriter = new CsvAnnotationBeanWriter<>(
						Employee.class, writer, preference)) {

			// CSVファイルを生成する
			csvwriter.writeHeader();
			for (Employee employee : employees) {
				csvwriter.write(employee);
			}
			csvwriter.flush();
		}

		// 生成したCSVファイルの内容を出力する
		try (InputStream is = new FileInputStream("target/employees.csv");
				Reader r = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(r)) {
			br.lines().forEach(System.out::println);
		}
	}
}
