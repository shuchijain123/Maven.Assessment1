package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     *
     * @param age age of this Cat
     *
     *
     */




    String name="Cat name";
    Integer age =0;
    PetOwner expectedOwner = null;


    public Cat(String name, Integer age) {

        this.name =name;
        this.age = age;

    }

    /**
     * @param age age of this Cat
     *
     */
    public Cat(Integer age) {
        this.age =age;
        Cat ca = new Cat();


        this.name = ca.getName();



    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        Cat ca = new Cat();

        this.name=name;
        this.age = ca.getAge();



    }

    @Override
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        //PetOwner po = new PetOwner(null, null);
        this.name = "Cat name";
        this.age = 0;
        expectedOwner = null;



    }

    public PetOwner getOwner() {
        return expectedOwner;
    }

    public void setOwner(PetOwner expectedOwner) {
        this.expectedOwner = expectedOwner;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
