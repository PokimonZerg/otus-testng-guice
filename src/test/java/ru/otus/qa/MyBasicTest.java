package ru.otus.qa;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Guice(modules = MyModule.class)
public class MyBasicTest {

    @Inject
    @PreprodEnvironment
    private IRandomGenerator randomGenerator;

    @Inject
    private UUIDGenerator uuidGenerator;

    @Test
    public void myTest() {
        System.out.println("Random number is: " + randomGenerator.getRandomNumber());
        System.out.println("Random uuid is: " + uuidGenerator.getUuid());
    }
}
