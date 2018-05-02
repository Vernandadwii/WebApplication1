/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import java.sql.Time;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "ClassSchedule")
public class ClassSchedule {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddClassSchedule")
    public Integer AddClassSchedule(
            @WebParam(name = "start_time") Time start_time,
            @WebParam(name = "end_time") Time end_time,
            @WebParam(name = "day") int day,
            @WebParam(name = "lecturer_nik") String lecturer_nik,
            @WebParam(name = "room_id") int room_id,
            @WebParam(name = "academic_year") int academic_year,
            @WebParam(name = "semester_id") int semester_id,
            @WebParam(name = "course_id") String course_id) {
        //TODO write your implementation code here:
        return null;
    }
}
