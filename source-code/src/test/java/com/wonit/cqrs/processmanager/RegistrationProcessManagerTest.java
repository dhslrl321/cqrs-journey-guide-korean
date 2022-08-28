package com.wonit.cqrs.processmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.id.GUIDGenerator;
import org.junit.jupiter.api.Test;

class RegistrationProcessManagerTest {
    @Test
    void name() {
        String generatorName = GUIDGenerator.GENERATOR_NAME;
        System.out.println("generatorName = " + generatorName);
    }
}