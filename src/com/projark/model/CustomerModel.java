
package com.projark.model;


public class CustomerModel {

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the customer_type
     */
    public String getCustomer_type() {
        return customer_type;
    }

    /**
     * @param customer_type the customer_type to set
     */
    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the identification_type
     */
    public String getIdentification_type() {
        return identification_type;
    }

    /**
     * @param identification_type the identification_type to set
     */
    public void setIdentification_type(String identification_type) {
        this.identification_type = identification_type;
    }

    /**
     * @return the identification_number
     */
    public String getIdentification_number() {
        return identification_number;
    }

    /**
     * @param identification_number the identification_number to set
     */
    public void setIdentification_number(String identification_number) {
        this.identification_number = identification_number;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood the neighborhood to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }


    private Integer id;
    private String customer;
    private String customer_type;
    private String city;
    private String identification_type;
    private String identification_number;
    private String tel;
    private String email;
    private String neighborhood;
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
