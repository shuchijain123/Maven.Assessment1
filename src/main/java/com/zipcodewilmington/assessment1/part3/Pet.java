package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     *
     *

     */


    String name;
    int age;



    PetOwner expectedOwner = null;


    public Pet() {
        this.name =name;
        this.age=age;

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name =name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.age=age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name=name;
        this.age =age;
        PetOwner expectedOwner = null;
    }

    /**
     * @return name of this pet
     */
    public String getName()

    {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }




    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {

        this.expectedOwner = newPetOwner;


    }


    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner()

    {
        Pet p = new Dog();
        PetOwner po = new PetOwner(null,  p);




return po;
    }
}
