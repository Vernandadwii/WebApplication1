/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.CourseDaoImpl;
import com.vernanda.entity.Course;
import com.vernanda.entity.Department;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "CourseWS")
public class CourseWS {

    private CourseDaoImpl courseDaoImpl;

    public CourseWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddCourseWS")
    public Integer AddCourseWS(
            @WebParam(name = "name") String name,
            @WebParam(name = "theory_credits") int theory_credits,
            @WebParam(name = "practicum_credits") int practicum_credits,
            @WebParam(name = "department_id") int department_id) {
        Course course = new Course();
        course.setName(name);
        course.setTheoryCredits((short) theory_credits);
        course.setPracticumCredits((short) practicum_credits);
        Department department = new Department();
        department.setId(department_id);
        course.setDepartment(department);
        return courseDaoImpl.save(course);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateCourseWS")
    public Integer UpdateCourseWS(
            @WebParam(name = "id") String id,
            @WebParam(name = "name") String name,
            @WebParam(name = "theory_credits") int theory_credits,
            @WebParam(name = "practicum_credits") int practicum_credits,
            @WebParam(name = "department_id") int department_id) {
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setTheoryCredits((short) theory_credits);
        course.setPracticumCredits((short) practicum_credits);
        Department department = new Department();
        department.setId(department_id);
        course.setDepartment(department);
        return courseDaoImpl.update(course);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteCourseWS")
    public Integer DeleteCourseWS(
            @WebParam(name = "id") String id) {
        Course course = new Course();
        course.setId(id);
        return courseDaoImpl.delete(course);
    }

}
