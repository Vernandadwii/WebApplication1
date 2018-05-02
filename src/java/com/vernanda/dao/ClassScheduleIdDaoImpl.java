/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vernanda.dao;

import com.vernanda.entity.ClassSchedule;
import com.vernanda.entity.ClassScheduleId;
import com.vernanda.utility.DaoService;
import com.vernanda.utility.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AsusPC
 */
public class ClassScheduleIdDaoImpl implements DaoService<ClassScheduleId> {

    @Override
    public int save(ClassScheduleId t) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(t);
            transaction.commit();
            result = 1;
        } catch (HibernateException e) {
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public int delete(ClassScheduleId t) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(t);
            transaction.commit();
            result = 1;
        } catch (HibernateException e) {
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public int update(ClassScheduleId t) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(t);
            transaction.commit();
            result = 1;
        } catch (HibernateException e) {
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public List<ClassScheduleId> findAll() {
        List<ClassScheduleId> ClassScheduleId = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ClassSchedule.class);
        ClassScheduleId.addAll(criteria.list());
        session.close();
        return ClassScheduleId;
        //ini semua seperti select * from category
    }

    @Override
    public ClassScheduleId find(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ClassSchedule.class)
                .add(Restrictions.eq("name", object.toString()))
                .setMaxResults(1);
        if (criteria.list().isEmpty()) {
            return null;
        }
        return (ClassScheduleId) criteria.list().get(0);
    }

}
