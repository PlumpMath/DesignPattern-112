package com.blue.dp8.FilterPatternOrCriteriaPattern;

import java.util.List;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
