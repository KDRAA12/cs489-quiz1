package com.miu.contacts;

public class Email {
    private Integer id;
    private String label;
    private String email;

    public Email(Integer id, String label, String email) {
        this.id = id;
        this.label = label;
        this.email = email;
    }

    public String toString() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{\n");
        jsonString.append("\t\"id\": \"" + id + "\",\n");
        jsonString.append("\t\"label\": \"" + label + "\",\n");
        jsonString.append("\t\"email\": \"" + email + "\",\n");
        jsonString.append("}");
        return jsonString.toString();
    }
}
