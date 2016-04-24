package com.blue.dp27.BusinessDelegatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
