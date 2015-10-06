/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pernille
 */
public class Facade
{

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");

    public static Person getPersonByID(int id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person p = em.createQuery("SELECT p FROM Person p WHERE p.id = :id", Person.class).setParameter("id", id).getSingleResult();
            em.getTransaction().commit();
            return p;
        } finally
        {
            em.close();
        }
    }

}
