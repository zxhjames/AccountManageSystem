package com.zxh.accountmanage.model.settleManage;

import java.util.Date;

public class SettleOrderInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.order_id
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.create_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.users
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private String users;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.real_use
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Double realUse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.package_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Integer packageStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.inspect_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Integer inspectStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.modify_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_settle_order_info.op_type
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    private Integer opType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.order_id
     *
     * @return the value of bus_settle_order_info.order_id
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.order_id
     *
     * @param orderId the value for bus_settle_order_info.order_id
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.create_time
     *
     * @return the value of bus_settle_order_info.create_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.create_time
     *
     * @param createTime the value for bus_settle_order_info.create_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.users
     *
     * @return the value of bus_settle_order_info.users
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public String getUsers() {
        return users;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.users
     *
     * @param users the value for bus_settle_order_info.users
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setUsers(String users) {
        this.users = users == null ? null : users.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.real_use
     *
     * @return the value of bus_settle_order_info.real_use
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Double getRealUse() {
        return realUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.real_use
     *
     * @param realUse the value for bus_settle_order_info.real_use
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setRealUse(Double realUse) {
        this.realUse = realUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.package_status
     *
     * @return the value of bus_settle_order_info.package_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Integer getPackageStatus() {
        return packageStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.package_status
     *
     * @param packageStatus the value for bus_settle_order_info.package_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setPackageStatus(Integer packageStatus) {
        this.packageStatus = packageStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.inspect_status
     *
     * @return the value of bus_settle_order_info.inspect_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Integer getInspectStatus() {
        return inspectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.inspect_status
     *
     * @param inspectStatus the value for bus_settle_order_info.inspect_status
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setInspectStatus(Integer inspectStatus) {
        this.inspectStatus = inspectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.modify_time
     *
     * @return the value of bus_settle_order_info.modify_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.modify_time
     *
     * @param modifyTime the value for bus_settle_order_info.modify_time
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_settle_order_info.op_type
     *
     * @return the value of bus_settle_order_info.op_type
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_settle_order_info.op_type
     *
     * @param opType the value for bus_settle_order_info.op_type
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }
}