package entities;

import entities.Category;
import entities.Gallery;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-04T18:50:35")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile ListAttribute<Animal, Gallery> galleryList;
    public static volatile SingularAttribute<Animal, String> description;
    public static volatile SingularAttribute<Animal, Integer> id;
    public static volatile SingularAttribute<Animal, String> video;
    public static volatile SingularAttribute<Animal, String> audio;
    public static volatile SingularAttribute<Animal, String> animalName;
    public static volatile SingularAttribute<Animal, Category> categoryId;

}