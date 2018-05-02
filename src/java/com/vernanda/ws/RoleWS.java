/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.ws;

import com.vernanda.dao.RoleDaoImpl;
import com.vernanda.entity.Role;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author AsusPC
 */
@WebService(serviceName = "RoleWS")
public class RoleWS {

    private RoleDaoImpl roleDaoImpl;

    public RoleWS() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddRoleWS")
    public Integer AddRoleWS(
            @WebParam(name = "keterangan") String keterangan) {
        Role role = new Role();
        role.setKeterangan(keterangan);
        return roleDaoImpl.save(role);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateRoleWS")
    public Integer UpdateRoleWS(
            @WebParam(name = "id") int id,
            @WebParam(name = "keterangan") String keterangan) {
        Role role = new Role();
        role.setId(id);
        role.setKeterangan(keterangan);
        return roleDaoImpl.update(role);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteRoleWS")
    public Integer DeleteRoleWS(
            @WebParam(name = "id") int id) {
        Role role = new Role();
        role.setId(id);
        return roleDaoImpl.delete(role);
    }

}
