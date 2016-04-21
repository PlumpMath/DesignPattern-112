package com.blue.dp8.FilterPatternOrCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
