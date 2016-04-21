package com.blue.dp8.FilterPatternOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
