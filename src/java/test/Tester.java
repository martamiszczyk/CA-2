/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import facade.Facade;
import facade.FacadeikkeStatic;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jeanette
 */
public class Tester
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");
//        System.out.println("Person: " + Facade.getPerson(1));
        FacadeikkeStatic f = new FacadeikkeStatic(emf);
        
        System.out.println(f.getPerson(1));
    }
}
