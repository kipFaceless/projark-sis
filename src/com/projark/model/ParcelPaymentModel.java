
package com.projark.model;


public class ParcelPaymentModel {
    
    int parcelId;
    int projId;
    String payDate;
    float parcelValue;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public float getParcelValue() {
        return parcelValue;
    }

    public void setParcelValue(float parcelValue) {
        this.parcelValue = parcelValue;
    }

    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }
}
