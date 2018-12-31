package com.yoshallc.greeting;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello");

        Customer customer = new Customer();
        customer.setAge(110);
        customer.setName("Nilesh");
        customer.setSex("Male");

        System.out.println(customer);


    }
}
