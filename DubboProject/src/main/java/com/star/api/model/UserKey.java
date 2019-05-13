package com.star.api.model;

import java.io.Serializable;

public class UserKey implements Serializable {

    private Long id;
    private String idno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }
}
