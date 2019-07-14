package ru.otus.qa;

import java.util.UUID;

public class UUIDGenerator {

    public String getUuid() {
        return UUID.randomUUID().toString();
    }
}
