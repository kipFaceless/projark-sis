
package com.projark.model;


public class ProjectModel {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

   

    public String getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(String neighbour) {
        this.neighbour = neighbour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSearchProj() {
        return searchProj;
    }

    public void setSearchProj(String searchProj) {
        this.searchProj = searchProj;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    int id;
    String ProjectName;
    float price;
    String projectType;
    String paymentType;
    float length;
    float width;
    String state;
    
    String neighbour;
    String date;
    String searchProj;
    String customer;
    int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

  

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
    String projectStatus;
    
}
