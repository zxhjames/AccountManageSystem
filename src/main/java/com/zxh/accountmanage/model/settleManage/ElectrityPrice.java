package com.zxh.accountmanage.model.settleManage;

import java.util.Date;

public class ElectrityPrice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_electricity_price.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_electricity_price.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_electricity_price.price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_electricity_price.log_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Date logTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_electricity_price.id
     *
     * @return the value of bus_electricity_price.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_electricity_price.id
     *
     * @param id the value for bus_electricity_price.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_electricity_price.company
     *
     * @return the value of bus_electricity_price.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_electricity_price.company
     *
     * @param company the value for bus_electricity_price.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_electricity_price.price
     *
     * @return the value of bus_electricity_price.price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_electricity_price.price
     *
     * @param price the value for bus_electricity_price.price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_electricity_price.log_time
     *
     * @return the value of bus_electricity_price.log_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_electricity_price.log_time
     *
     * @param logTime the value for bus_electricity_price.log_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}