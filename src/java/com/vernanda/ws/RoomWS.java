/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.RoomDaoImpl;
import com.vernanda.entity.Room;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "RoomWS")
public class RoomWS {

    private RoomDaoImpl roomDaoImpl;

    public RoomWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddRoomWS")
    public Integer AddRoomWS(
            @WebParam(name = "name") String name) {
        Room room = new Room();
        room.setName(name);
        return roomDaoImpl.save(room);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateRoomWS")
    public Integer UpdateRoomWS(
            @WebParam(name = "id") int id,
            @WebParam(name = "name") String name) {
        Room room = new Room();
        room.setId(id);
        room.setName(name);
        return roomDaoImpl.update(room);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteRoomWS")
    public Integer DeleteRoomWS(
            @WebParam(name = "id") int id) {
        Room room = new Room();
        room.setId(id);
        return roomDaoImpl.delete(room);
    }
}
