package entities;

import entities.Animal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-04T18:50:35")
@StaticMetamodel(Gallery.class)
public class Gallery_ { 

    public static volatile SingularAttribute<Gallery, String> thumbnail;
    public static volatile SingularAttribute<Gallery, Integer> id;
    public static volatile SingularAttribute<Gallery, Animal> animalId;

}