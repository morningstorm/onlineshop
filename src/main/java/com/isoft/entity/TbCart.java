package com.isoft.entity;


public class TbCart {

  private long id;
  private long auserId;
  private long goodsId;
  private long num;
  private long status;
  private long orderId;

  public TbCart() {
  }

  public TbCart(long id, long auserId, long goodsId, long num, long status, long orderId) {
    this.id = id;
    this.auserId = auserId;
    this.goodsId = goodsId;
    this.num = num;
    this.status = status;
    this.orderId = orderId;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return "TbCart{" +
            "id=" + id +
            ", auserId=" + auserId +
            ", goodsId=" + goodsId +
            ", num=" + num +
            ", status=" + status +
            ", orderId=" + orderId +
            '}';
  }
}
