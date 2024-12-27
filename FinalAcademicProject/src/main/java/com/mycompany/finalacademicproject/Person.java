/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalacademicproject;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Person {
    private String name;
    private Date birthDay;
    private int age;
    
    public Person() {
        this.name = "";
        this.birthDay = null;
        this.age = 0;
    }
    
    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.age = computeAge(birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    private int computeAge(Date birthDay) {
        LocalDate start = birthDay.toInstant()
                                    .atZone(ZoneId.systemDefault())
                                    .toLocalDate();
        LocalDate end = LocalDate.now();
        int years = (int) ChronoUnit.YEARS.between(start, end);
        return years;
    }
    
    public static Comparator<Person> NameComparatorAsc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            String person1 = p1.getName().toUpperCase();
            String person2 = p2.getName().toUpperCase();
            return person1.compareTo(person2);
        }        
    };
    
    public static Comparator<Person> NameComparatorDesc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            String person1 = p1.getName().toUpperCase();
            String person2 = p2.getName().toUpperCase();
            return person2.compareTo(person1);
        }        
    };
    
    public static Comparator<Person> BirthdayComparatorAsc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            Date person1 = p1.getBirthDay();
            Date person2 = p2.getBirthDay();
            return person1.compareTo(person2);
        }        
    };
    
    public static Comparator<Person> BirthdayComparatorDesc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            Date person1 = p1.getBirthDay();
            Date person2 = p2.getBirthDay();
            return person2.compareTo(person1);
        }        
    };
    
    public static Comparator<Person> AgeComparatorAsc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            int person1 = p1.getAge();
            int person2 = p2.getAge();
            return person1 - person2;
        }        
    };
    
    public static Comparator<Person> AgeComparatorDesc = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            int person1 = p1.getAge();
            int person2 = p2.getAge();
            return person2 - person1;
        }        
    };
}
