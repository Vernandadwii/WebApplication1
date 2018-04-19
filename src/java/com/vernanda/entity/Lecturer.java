package com.vernanda.entity;
// Generated Apr 12, 2018 4:13:21 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Lecturer generated by hbm2java
 */
@Entity
@Table(name="lecturer"
    ,catalog="ujitarobby_attendance_system"
)
public class Lecturer  implements java.io.Serializable {


     private String nik;
     private Department department;
     private String name;
     private Set<ClassSchedule> classSchedules = new HashSet<ClassSchedule>(0);

    public Lecturer() {
    }

	
    public Lecturer(String nik, Department department, String name) {
        this.nik = nik;
        this.department = department;
        this.name = name;
    }
    public Lecturer(String nik, Department department, String name, Set<ClassSchedule> classSchedules) {
       this.nik = nik;
       this.department = department;
       this.name = name;
       this.classSchedules = classSchedules;
    }
   
     @Id 

    
    @Column(name="nik", unique=true, nullable=false, length=8)
    public String getNik() {
        return this.nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="department_id", nullable=false)
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    
    @Column(name="name", nullable=false, length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="lecturer")
    public Set<ClassSchedule> getClassSchedules() {
        return this.classSchedules;
    }
    
    public void setClassSchedules(Set<ClassSchedule> classSchedules) {
        this.classSchedules = classSchedules;
    }




}

