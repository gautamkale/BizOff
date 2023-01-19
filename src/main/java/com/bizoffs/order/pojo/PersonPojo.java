package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Enumeration;

;

@Data
public class PersonPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String partyId;
    private Date birthDate;
    private String cardId;
    private String comments;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Date deceasedDate;
    private String existingCustomer;
    private String firstName;
    private String firstNameLocal;
    private String gender;
    private double height;
    private String lastName;
    private String lastNameLocal;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String maritalStatus;
    private String memberId;
    private String middleName;
    private String middleNameLocal;
    private Long monthsWithEmployer;
    private String mothersMaidenName;
    private String nickname;
    private String occupation;
    private String otherLocal;
    private Date passportExpireDate;
    private String passportNumber;
    private String personalTitle;
    private String salutation;
    private String socialSecurityNumber;
    private String suffix;
    private double totalYearsWorkExperience;
    private double weight;
    private Long yearsWithEmployer;
    private Enumeration enumeration1;
    private PartyPojo party;
    //private List<PersonTraining> personTrainings;
}