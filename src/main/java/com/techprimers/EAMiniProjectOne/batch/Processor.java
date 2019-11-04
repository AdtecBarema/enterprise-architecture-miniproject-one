package com.techprimers.EAMiniProjectOne.batch;

import com.techprimers.EAMiniProjectOne.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

@Component
public class Processor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        //Converting the Age to First day of the Year
        LocalDate currentDate=LocalDate.now();
        Integer currentYear=currentDate.getYear();
        Integer age=Integer.parseInt(student.getAge());
        Integer birthYear=currentYear-age;
        LocalDate birthDate= LocalDate.of(birthYear, 1, 1);
        String DOB=birthDate.toString();
        student.setAge(DOB);

        return  student;
    }
}