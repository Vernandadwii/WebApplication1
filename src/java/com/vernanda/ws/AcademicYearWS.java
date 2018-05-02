/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.AcademicYearDaoImpl;
import com.vernanda.entity.AcademicYear;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "MYWebService")
public class AcademicYearWS {

    private AcademicYearDaoImpl academicYearDaoImpl;

    public AcademicYearWS() {
        academicYearDaoImpl = new AcademicYearDaoImpl();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addAcademicYear")
    public Integer addAcademicYear(
            @WebParam(name = "id") int id,
            @WebParam(name = "name") String name) {
        AcademicYear academicYear = new AcademicYear();
        academicYear.setId(id);
        academicYear.setName(name);
        return academicYearDaoImpl.save(academicYear);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateAcademicYear")
    public Integer UpdateAcademicYear(
            @WebParam(name = "id") int id,
            @WebParam(name = "name") String name) {
        AcademicYear academicYear = new AcademicYear();
        academicYear.setId(id);
        academicYear.setName(name);
        return academicYearDaoImpl.update(academicYear);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteAcademicYear")
    public Integer DeleteAcademicYear(
            @WebParam(name = "id") int id) {
        AcademicYear academicYear = new AcademicYear();
        academicYear.setId(id);
        return academicYearDaoImpl.delete(academicYear);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "showAllAcademicYear")
    public List<AcademicYear> showAllAcademicYear() {
        //TODO write your implementation code here:
        return academicYearDaoImpl.findAll();
    }

}
