/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.SemesterDaoImpl;
import com.vernanda.entity.Semester;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "SemesterWS")
public class SemesterWS {

    private SemesterDaoImpl semesterDaoImpl;

    public SemesterWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddSemesterWS")
    public Integer AddSemesterWS(
            @WebParam(name = "name") String name) {
        Semester semester = new Semester();
        semester.setName(name);
        return semesterDaoImpl.save(semester);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateSemesterWS")
    public Integer UpdateSemesterWS(
            @WebParam(name = "id") int id,
            @WebParam(name = "name") String name) {
        Semester semester = new Semester();
        semester.setId(id);
        semester.setName(name);
        return semesterDaoImpl.update(semester);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteSemesterWS")
    public Integer DeleteSemesterWS(
            @WebParam(name = "id") int id) {
        Semester semester = new Semester();
        semester.setId(id);
        return semesterDaoImpl.delete(semester);
    }
}
