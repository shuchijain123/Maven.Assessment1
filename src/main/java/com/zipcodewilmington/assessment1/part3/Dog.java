package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     *
     *
     */

    String name = "Dog name";
    Integer age = 0;
    PetOwner expectedOwner = null;


    public Dog(String name, Integer age) {
        this.name =name;
        this.age =age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age =age;
        Dog da = new Dog();


        this.name = da.getName();
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name =name;
        Dog da = new Dog();


        this.age = da.getAge();

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
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "Dog name";
        this.age =0;

    }
    public PetOwner getOwner() {
        return expectedOwner;
    }

    public void setOwner(PetOwner expectedOwner) {
        this.expectedOwner = expectedOwner;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
