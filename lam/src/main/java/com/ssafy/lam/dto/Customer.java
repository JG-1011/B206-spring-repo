package com.ssafy.lam.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User{
    @Column(name="customer_name")
    private String customerName;
    @Column(name="customer_birth")
    private String customerBirth;
    @Column(name="customer_sex")
    private String customerSex;
    @Column(name="customer_phoneNumber")
    private String customerPhoneNumber;

    @Column(name="customer_address")
    private String customerAddress;

    @Column(name="customer_email")
    private String customerEmail;
    @Column(name="customer_reprtCnt")
    private int customerReprtCnt;



}
