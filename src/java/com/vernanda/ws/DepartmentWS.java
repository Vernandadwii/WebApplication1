/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.DepartmentDaoImpl;
import com.vernanda.entity.Department;
import com.vernanda.entity.Faculty;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "DepartmentWS")
public class DepartmentWS {

    private DepartmentDaoImpl departmentDaoImpl;

    public DepartmentWS() {
        departmentDaoImpl = new DepartmentDaoImpl();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddDepartmentWS")
    public Integer AddDepartmentWS(
            @WebParam(name = "code") int code,
            @WebParam(name = "name") String name,
            @WebParam(name = "faculty_id") int faculty_id) {
        Department department = new Department();
        department.setCode((short) code);
        department.setName(name);
        Faculty faculty = new Faculty();
        faculty.setId(faculty_id);
        department.setFaculty(faculty);
        return departmentDaoImpl.save(department);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateDepartmentWS")
    public Integer UpdateDepartmentWS(
            @WebParam(name = "id") int id,
            @WebParam(name = "code") int code,
            @WebParam(name = "name") String name,
            @WebParam(name = "faculty_id") int faculty_id) {
        Department department = new Department();
        department.setId(id);
        department.setCode((short) code);
        department.setName(name);
        Faculty faculty = new Faculty();
        faculty.setId(faculty_id);
        department.setFaculty(faculty);
        return departmentDaoImpl.save(department);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteDepartmentWS")
    public Integer DeleteDepartmentWS(
            @WebParam(name = "id") int id) {
        Department department = new Department();
        department.setId(id);
        return departmentDaoImpl.delete(department);
    }

}
