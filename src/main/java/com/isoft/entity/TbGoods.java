package com.isoft.entity;


public class TbGoods {

  private long id;
  private String gname;
  private double gprice;
  private String gpicture;
  private String gmessage;
  private long gstatus;
  private long typeId;

  private TbGoods(){}

  public TbGoods(long id, String gname, double gprice, String gpicture, String gmessage, long gstatus, long typeId) {
    this.id = id;
    this.gname = gname;
    this.gprice = gprice;
    this.gpicture = gpicture;
    this.gmessage = gmessage;
    this.gstatus = gstatus;
    this.typeId = typeId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }


  public double getGprice() {
    return gprice;
  }

  public void setGprice(double gprice) {
    this.gprice = gprice;
  }


  public String getGpicture() {
    return gpicture;
  }

  public void setGpicture(String gpicture) {
    this.gpicture = gpicture;
  }


  public String getGmessage() {
    return gmessage;
  }

  public void setGmessage(String gmessage) {
    this.gmessage = gmessage;
  }


  public long getGstatus() {
    return gstatus;
  }

  public void setGstatus(long gstatus) {
    this.gstatus = gstatus;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }

  @Override
  public String toString() {
    return "TbGoods{" +
            "id=" + id +
            ", gname='" + gname + '\'' +
            ", gprice=" + gprice +
            ", gpicture='" + gpicture + '\'' +
            ", gmessage='" + gmessage + '\'' +
            ", gstatus=" + gstatus +
            ", typeId=" + typeId +
            '}';
  }
}
