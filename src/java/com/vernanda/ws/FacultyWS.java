/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.FacultyDaoImpl;
import com.vernanda.entity.Faculty;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "FacultyWS")
public class FacultyWS {

    private FacultyDaoImpl facultyDaoImpl;

    public FacultyWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddFacultyWS")
    public Integer AddFacultyWS(
            @WebParam(name = "code") int code,
            @WebParam(name = "name") String name) {
        Faculty faculty = new Faculty();
        faculty.setCode((short) code);
        faculty.setName(name);
        return facultyDaoImpl.save(faculty);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateFacultyWS")
    public Integer UpdateFacultyWS(
            @WebParam(name = "id") int id,
            @WebParam(name = "code") int code,
            @WebParam(name = "name") String name) {
        Faculty faculty = new Faculty();
        faculty.setId(id);
        faculty.setCode((short) code);
        faculty.setName(name);
        return facultyDaoImpl.update(faculty);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteFacultyWS")
    public Integer DeleteFacultyWS(
            @WebParam(name = "id") int id) {
        Faculty faculty = new Faculty();
        faculty.setId(id);
        return facultyDaoImpl.delete(faculty);
    }

}
