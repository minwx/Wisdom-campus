package com.example.mwx0309.qilusoftware.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mwx on 2017/7/28.
 */

public class user_tech extends DataSupport {
    private int Tno;
    private String Tname;
    private String Tel;
    private String pasword;
    private String email;

    public int getTno() {
        return Tno;
    }

    public void setTno(int tno) {
        Tno = tno;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
