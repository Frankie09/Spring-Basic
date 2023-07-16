package com.frankie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frankie.domain.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Author author = (Author) applicationContext.getBean("author");
        System.out.println("author : "+author.getName());
        System.out.println("id "+author.getId());
        System.out.println("birthdate"+author.getBirtDate());
        
    }
}
