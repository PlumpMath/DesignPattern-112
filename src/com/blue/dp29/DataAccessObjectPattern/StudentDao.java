package com.blue.dp29.DataAccessObjectPattern;

import java.util.List;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
