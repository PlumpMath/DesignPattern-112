package com.blue.dp8.FilterPatternOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
