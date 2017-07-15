package com.pethoalpar;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by petho on 2017-07-15.
 */
public class Main {

    public static void main(String [] args){

        GenericApplicationContext context = new GenericApplicationContext();

        BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
                .addConstructorArgValue(23).addConstructorArgValue("Alpar");

        context.registerBeanDefinition("personBean", beanBuilder.getBeanDefinition());
        context.refresh();

        Person person = context.getBean("personBean", Person.class);
        person.printPerson();

    }
}
