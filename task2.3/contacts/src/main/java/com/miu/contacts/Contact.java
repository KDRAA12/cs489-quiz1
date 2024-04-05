package com.miu.contacts;

import java.util.Arrays;
import java.util.List;

public class Contact {
    private Integer id;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;

    // Constructor with arguments
    public Contact(Integer id, String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers, List<Email> emails) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
public String toString() {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{\n");
        jsonString.append("\t\"id\": \"" + id + "\",\n");
        jsonString.append("\t\"firstName\": \"" + firstName + "\",\n");
        jsonString.append("\t\"lastName\": \"" + lastName + "\",\n");
        jsonString.append("\t\"company\": \"" + company + "\",\n");
        jsonString.append("\t\"jobTitle\": \"" + jobTitle + "\",\n");
        jsonString.append("\t\"phoneNumbers\": " + phoneNumbers.stream().map(PhoneNumber::toString).toList() + ",\n");
        jsonString.append("\t\"emails\": " + emails.stream().map(Email::toString).toList() + "\n");
        jsonString.append("}");
        return jsonString.toString();
    }
}
