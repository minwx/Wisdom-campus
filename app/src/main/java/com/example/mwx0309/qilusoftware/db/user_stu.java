package com.example.mwx0309.qilusoftware.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mwx on 2017/7/28.
 */

public class user_stu extends DataSupport {
    private int Sno;
    private String name;
    private String Tel;
    private String password;
    private String email;

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
