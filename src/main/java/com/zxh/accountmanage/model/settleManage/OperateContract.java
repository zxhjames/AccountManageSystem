package com.zxh.accountmanage.model.settleManage;

import java.util.Date;

public class OperateContract {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.contract_id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private String contractId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.contract_name
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private String contractName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.contract_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Double contractPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_operate_contract.create_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.id
     *
     * @return the value of bus_operate_contract.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.id
     *
     * @param id the value for bus_operate_contract.id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.contract_id
     *
     * @return the value of bus_operate_contract.contract_id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.contract_id
     *
     * @param contractId the value for bus_operate_contract.contract_id
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.contract_name
     *
     * @return the value of bus_operate_contract.contract_name
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.contract_name
     *
     * @param contractName the value for bus_operate_contract.contract_name
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.company
     *
     * @return the value of bus_operate_contract.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.company
     *
     * @param company the value for bus_operate_contract.company
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.contract_price
     *
     * @return the value of bus_operate_contract.contract_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Double getContractPrice() {
        return contractPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.contract_price
     *
     * @param contractPrice the value for bus_operate_contract.contract_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setContractPrice(Double contractPrice) {
        this.contractPrice = contractPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_operate_contract.create_time
     *
     * @return the value of bus_operate_contract.create_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_operate_contract.create_time
     *
     * @param createTime the value for bus_operate_contract.create_time
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}