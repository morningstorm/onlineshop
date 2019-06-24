package com.isoft.entity;

import java.sql.Timestamp;

public class TbOrder {

  private long id;
  private double amount;
  private long status;
  private java.sql.Timestamp orderdate;
  private String message;
  private String address;
  private long auserId;

  public TbOrder(long id, double amount, long status, Timestamp orderdate, String message, String address, long auserId) {
    this.id = id;
    this.amount = amount;
    this.status = status;
    this.orderdate = orderdate;
    this.message = message;
    this.address = address;
    this.auserId = auserId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getOrderdate() {
    return orderdate;
  }

  public void setOrderdate(java.sql.Timestamp orderdate) {
    this.orderdate = orderdate;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getAuserId() {
    return auserId;
  }

  public void setAuserId(long auserId) {
    this.auserId = auserId;
  }

  @Override
  public String toString() {
    return "TbOrder{" +
            "id=" + id +
            ", amount=" + amount +
            ", status=" + status +
            ", orderdate=" + orderdate +
            ", message='" + message + '\'' +
            ", address='" + address + '\'' +
            ", auserId=" + auserId +
            '}';
  }
}
