package jp.gr.supercsv;

import org.supercsv.ext.annotation.CsvBean;
import org.supercsv.ext.annotation.CsvColumn;

@CsvBean(header = true)
public class Employee {

    @CsvColumn(position = 0, label = "ID")
    private int id;

    @CsvColumn(position = 1, label = "名前")
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
