package com.demo.dao;

import com.demo.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ProductDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertProduct(Product product){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteProduct(int id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Product p = em.find(Product.class, id);
        if (p != null) {
            em.remove(p);
        }
        em.getTransaction().commit();
        em.close();
    }

    public void updateProduct(Product product){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Product pUpdate = em.find(Product.class, product.getId());
        pUpdate.setName(product.getName());
        pUpdate.setPrice(product.getPrice());
        em.getTransaction().commit();
        em.close();
    }

    public List<Product> getAllProduct(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Product> listProduct = em.createQuery("select p from Product p").getResultList();
        em.getTransaction().commit();
        em.close();
        return listProduct;
    }

}
