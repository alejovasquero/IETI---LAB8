package com.eci.cosw.springbootsecureapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum TaskStatus {
    READY("Ready"),
    IN_PROGRESS("In Progress"),
    TO_DO("To Do");


    private static Map<String, TaskStatus> namesMap = new HashMap<String, TaskStatus>(3);

    static {
        namesMap.put("Ready", READY);
        namesMap.put("In Progress", IN_PROGRESS);
        namesMap.put("To Do", TO_DO);
    }

    @JsonCreator
    public static TaskStatus forValue(String value) {
        return namesMap.get(value);
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, TaskStatus> entry : namesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey();
        }

        return null; // or fail
    }

    private final String name;

    TaskStatus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
