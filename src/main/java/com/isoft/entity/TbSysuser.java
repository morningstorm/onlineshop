package com.isoft.entity;


public class TbSysuser {

  private long id;
  private String sname;
  private String spass;
  private String smobile;
  private long status;
  private long srole;

  public TbSysuser(long id, String sname, String spass, String smobile, long status, long srole) {
    this.id = id;
    this.sname = sname;
    this.spass = spass;
    this.smobile = smobile;
    this.status = status;
    this.srole = srole;
  }

  public TbSysuser() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getSpass() {
    return spass;
  }

  public void setSpass(String spass) {
    this.spass = spass;
  }


  public String getSmobile() {
    return smobile;
  }

  public void setSmobile(String smobile) {
    this.smobile = smobile;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getSrole() {
    return srole;
  }

  public void setSrole(long srole) {
    this.srole = srole;
  }


  @Override
  public String toString() {
    return "TbSysuser{" +
            "id=" + id +
            ", sname='" + sname + '\'' +
            ", spass='" + spass + '\'' +
            ", smobile='" + smobile + '\'' +
            ", status=" + status +
            ", srole=" + srole +
            '}';
  }
}
