package com.isoft.entity;


public class TbCart {

  private long id;
  private long auserId;
  private long goodsId;
  private long num;
  private double price;
  private long status;


  public TbCart(long id, long auserId, long goodsId, long num, double price, long status) {
    this.id = id;
    this.auserId = auserId;
    this.goodsId = goodsId;
    this.num = num;
    this.price = price;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAuserId() {
    return auserId;
  }

  public void setAuserId(long auserId) {
    this.auserId = auserId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "TbCart{" +
            "id=" + id +
            ", auserId=" + auserId +
            ", goodsId=" + goodsId +
            ", num=" + num +
            ", price=" + price +
            ", status=" + status +
            '}';
  }
}
