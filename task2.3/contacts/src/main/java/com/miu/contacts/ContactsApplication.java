package com.miu.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class ContactsApplication {

    public static void main(String[] args) {
        List<Contact> contacts=new ArrayList<>(){{
           add(new Contact(
                   1,
                   "David",
                   "Sanger",
                   "Argos LLC","Sales Manager",List.of(
                           new PhoneNumber(2,"Home","240-133-0011")
                        ,new PhoneNumber(3,"Mobile","240-112-0123"))
                   ,List.of(
                   new Email(4,"Home","dave.sang@gmail.com")
                   ,new Email(5,"Work","dsanger@argos.com")
           )));
           add(new Contact(
                   1,
                   "Carlos",
                   "Jimenez",
                   "Zappos","Director",new ArrayList<>(),
                   new ArrayList<>()));
            add(new Contact(
                    1,
                    "Ali",
                    "Gafar",
                    "BMI Services","HR Manager",List.of(
                    new PhoneNumber(2,"Work","412-116-9988"))
                    ,List.of(
                    new Email(5,"Work","ali@bmi.com")
            )));
        }};


        System.out.println(contacts
                .stream()
                .sorted(Comparator.comparing(Contact::getLastName))
                .collect(Collectors.toList())
        );






        SpringApplication.run(ContactsApplication.class, args);
    }

}
