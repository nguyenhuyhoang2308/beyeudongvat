/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author NgNha
 */
public class EntityFactory
{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("KidsLoveAnimalsPU");
    
    public static EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }
}
