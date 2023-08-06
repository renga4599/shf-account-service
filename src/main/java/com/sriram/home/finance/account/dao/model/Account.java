package com.sriram.home.finance.account.dao.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ACCOUNTS")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CARD_HOLDER_NAME")
    private String cardHolderName;

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "CARD_PROVIDER")
    private String cardProvider;

    @Column(name = "EXPIRY")
    private String expiry;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_ON")
    private String createdOn;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_ON")
    private String modifiedOn;

}
