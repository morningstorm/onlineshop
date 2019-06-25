package com.isoft.entity;


public class TbType {

  private long id;
  private String lbname;

  public TbType(){}
  public TbType(long id, String lbname) {
    this.id = id;
    this.lbname = lbname;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLbname() {
    return lbname;
  }

  public void setLbname(String lbname) {
    this.lbname = lbname;
  }


  @Override
  public String toString() {
    return "TbType{" +
            "id=" + id +
            ", lbname='" + lbname + '\'' +
            '}';
  }
}
