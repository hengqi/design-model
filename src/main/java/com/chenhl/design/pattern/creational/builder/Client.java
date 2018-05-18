package com.chenhl.design.pattern.creational.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new CommonRoleBuilder();

        director.construct(builder);
        Role role = builder.getResult();
        System.out.println(role);
    }
}
