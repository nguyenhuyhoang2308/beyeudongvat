package entities;

import entities.Animal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-04T18:50:35")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile ListAttribute<Category, Animal> animalList;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Integer> id;

}