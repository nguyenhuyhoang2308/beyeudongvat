/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Animal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.EntityFactory;

/**
 *
 * @author NgNha
 */
@Controller
@RequestMapping(value = "/")
public class AnimalController
{
    @RequestMapping(value = "/animal-view", method = RequestMethod.GET)
    public String showAnimalList()
    {
//        EntityManager em = EntityFactory.getEntityManager();
//        
//        Query q = em.createNamedQuery("Animal.findAll", Animal.class);
//        
//        List<Animal> animalList = q.getResultList();
//        
//        modelMap.put("animalList", animalList);
        
        return "animal/view";
    }
    
    @RequestMapping(value = "/animal/details", method = RequestMethod.GET)
    public String view()
    {
        return "details";
    }
    
    @RequestMapping(value = "/animal/save", method = RequestMethod.POST)
    public String save()
    {
        return "list";
    }
    
    @RequestMapping(value = "/animal/delete", method = RequestMethod.POST)
    public String delete()
    {
        return "list";
    }

}
