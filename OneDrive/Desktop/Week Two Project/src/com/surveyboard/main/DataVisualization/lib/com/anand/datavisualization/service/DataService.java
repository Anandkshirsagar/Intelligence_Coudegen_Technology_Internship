package lib.com.anand.datavisualization.service;

import java.util.ArrayList;
import java.util.List;

import lib.com.anand.datavisualization.model.Student;

public class DataService {

    public List<Student> getStudentData() {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Java", 85));
        list.add(new Student("Python", 78));
        list.add(new Student("C++", 90));
        list.add(new Student("DBMS", 70));

        return list;

    }

}
