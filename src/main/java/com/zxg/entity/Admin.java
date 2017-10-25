package com.zxg.entity;

public class Admin {
    private Integer id;

    private String adminname;

    private String adminpwd;

    private Integer adminstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public Integer getAdminstate() {
        return adminstate;
    }

    public void setAdminstate(Integer adminstate) {
        this.adminstate = adminstate;
    }
}