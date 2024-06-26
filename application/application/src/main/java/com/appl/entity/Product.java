package com.appl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=10 , nullable = false)
    private String uid;

    @Column(length=17 , nullable = false)
    private Long create_tms;

    @Column(length=50 , nullable = false)
    private String name;

    @Column(length=100 , nullable = false)
    private int code;

    public Product(Long id, String uid, Long create_tms, String name, int code) {
        this.id = id;
        this.uid = uid;
        this.create_tms = create_tms;
        this.name = name;
        this.code = code;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getCreate_tms() {
        return create_tms;
    }

    public void setCreate_tms(Long create_tms) {
        this.create_tms = create_tms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}