package com.demo.dao;

import com.demo.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertUser(User user){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public boolean findUser(String username, String password){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select user from User user where user.username = (:username) and user.password =(:password)");
        query.setParameter("username",username);
        query.setParameter("password",password);
        List<User> ls = query.getResultList();
        em.getTransaction().commit();
        em.close();
        if (ls.size() != 0){
            return true;
        }else
        {
            return false;
        }
    }
}
