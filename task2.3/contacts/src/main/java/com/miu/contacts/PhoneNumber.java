package com.miu.contacts;

import java.util.Arrays;

public class PhoneNumber {
    private Integer id;
    private String label;
    private String phoneNumber;

    public PhoneNumber(Integer id, String label, String phoneNumber) {
        this.id = id;
        this.label = label;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{\n");
        jsonString.append("\t\"id\": \"" + id + "\",\n");
        jsonString.append("\t\"label\": \"" + label + "\",\n");
        jsonString.append("\t\"phoneNumber\": \"" + phoneNumber + "\",\n");
        jsonString.append("}");
        return jsonString.toString();
    }
}
