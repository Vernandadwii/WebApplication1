/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.StudentDaoImpl;
import com.vernanda.entity.Department;
import com.vernanda.entity.Student;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "StudentWS")
public class StudentWS {

    private StudentDaoImpl studentDaoImpl;

    public StudentWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddStudentWS")
    public Integer AddStudentWS(
            @WebParam(name = "name") String name,
            @WebParam(name = "department_id") int department_id) {
        Student student = new Student();
        student.setName(name);
        Department department = new Department();
        department.setId(department_id);
        student.setDepartment(department);
        return studentDaoImpl.save(student);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateStudentWS")
    public Integer UpdateStudentWS(
            @WebParam(name = "id") String id,
            @WebParam(name = "name") String name,
            @WebParam(name = "department_id") int department_id) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        Department department = new Department();
        department.setId(department_id);
        student.setDepartment(department);
        return studentDaoImpl.update(student);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteStudentWS")
    public Integer DeleteStudentWS(
            @WebParam(name = "id") String id) {
        Student student = new Student();
        student.setId(id);
        return studentDaoImpl.update(student);
    }

}
