package com.vernanda.entity;
// Generated Apr 12, 2018 4:13:21 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name="role"
    ,catalog="ujitarobby_attendance_system"
)
public class Role  implements java.io.Serializable {


     private int idRole;
     private String keterangan;

    public Role() {
    }

	
    public Role(int idRole) {
        this.idRole = idRole;
    }
    public Role(int idRole, String keterangan) {
       this.idRole = idRole;
       this.keterangan = keterangan;
    }
   
     @Id 

    
    @Column(name="idRole", unique=true, nullable=false)
    public int getIdRole() {
        return this.idRole;
    }
    
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    
    @Column(name="keterangan", length=50)
    public String getKeterangan() {
        return this.keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }




}

