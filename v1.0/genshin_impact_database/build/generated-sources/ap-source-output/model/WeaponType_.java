package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.GenshinCharacter;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-09T08:21:28")
@StaticMetamodel(WeaponType.class)
public class WeaponType_ { 

    public static volatile SingularAttribute<WeaponType, String> name;
    public static volatile SingularAttribute<WeaponType, String> description;
    public static volatile SingularAttribute<WeaponType, Integer> id;
    public static volatile CollectionAttribute<WeaponType, GenshinCharacter> genshinCharacterCollection;
    public static volatile SingularAttribute<WeaponType, String> picture;

}