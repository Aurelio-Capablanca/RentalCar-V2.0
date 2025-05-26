package com.aib.domain.businessLogic;

import com.aib.persistence.repository.MockCarRepository;

public class MockCarLogic {

    private final MockCarRepository carRepository;

    public MockCarLogic(MockCarRepository repo){
        this.carRepository = repo;
    }

    public void printName(String name){
        System.out.println("Name is: "+carRepository.carName(name));
    }
}
