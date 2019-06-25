package com.isoft.entity;


import java.sql.Date;

public class TbUser {

  private long id;
  private String uname;
  private String upass;
  private String usex;
  private String umobile;
  private String uaddress;
  private String _Uemail;
  private java.sql.Date birthday;

  public TbUser(){}
  public TbUser(long id, String uname, String upass, String usex, String umobile, String uaddress, String _Uemail, Date birthday) {
    this.id = id;
    this.uname = uname;
    this.upass = upass;
    this.usex = usex;
    this.umobile = umobile;
    this.uaddress = uaddress;
    this._Uemail = _Uemail;
    this.birthday = birthday;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUpass() {
    return upass;
  }

  public void setUpass(String upass) {
    this.upass = upass;
  }


  public String getUsex() {
    return usex;
  }

  public void setUsex(String usex) {
    this.usex = usex;
  }


  public String getUmobile() {
    return umobile;
  }

  public void setUmobile(String umobile) {
    this.umobile = umobile;
  }


  public String getUaddress() {
    return uaddress;
  }

  public void setUaddress(String uaddress) {
    this.uaddress = uaddress;
  }


  public String get_Uemail() {
    return _Uemail;
  }

  public void set_Uemail(String _Uemail) {
    this._Uemail = _Uemail;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "id=" + id +
            ", uname='" + uname + '\'' +
            ", upass='" + upass + '\'' +
            ", usex='" + usex + '\'' +
            ", umobile='" + umobile + '\'' +
            ", uaddress='" + uaddress + '\'' +
            ", _Uemail='" + _Uemail + '\'' +
            ", birthday=" + birthday +
            '}';
  }
}
