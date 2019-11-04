package com.techprimers.EAMiniProjectOne.batch;

import com.techprimers.EAMiniProjectOne.model.Student;
import com.techprimers.EAMiniProjectOne.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Databasewritter implements ItemWriter<Student> {

    @Autowired
    private StudentRepository userRepository;

    @Override
    public void write(List<? extends Student> students) throws Exception {

        System.out.println("Data Saved for Users: " + students);
        userRepository.save(students);
    }
}
