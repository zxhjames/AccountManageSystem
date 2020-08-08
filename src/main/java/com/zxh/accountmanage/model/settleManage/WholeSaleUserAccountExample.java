package com.zxh.accountmanage.model.settleManage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WholeSaleUserAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public WholeSaleUserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andElectricChargeIsNull() {
            addCriterion("electric_charge is null");
            return (Criteria) this;
        }

        public Criteria andElectricChargeIsNotNull() {
            addCriterion("electric_charge is not null");
            return (Criteria) this;
        }

        public Criteria andElectricChargeEqualTo(Double value) {
            addCriterion("electric_charge =", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeNotEqualTo(Double value) {
            addCriterion("electric_charge <>", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeGreaterThan(Double value) {
            addCriterion("electric_charge >", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("electric_charge >=", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeLessThan(Double value) {
            addCriterion("electric_charge <", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeLessThanOrEqualTo(Double value) {
            addCriterion("electric_charge <=", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeIn(List<Double> values) {
            addCriterion("electric_charge in", values, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeNotIn(List<Double> values) {
            addCriterion("electric_charge not in", values, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeBetween(Double value1, Double value2) {
            addCriterion("electric_charge between", value1, value2, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andElectricChargeNotBetween(Double value1, Double value2) {
            addCriterion("electric_charge not between", value1, value2, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeIsNull() {
            addCriterion("deviate_charge is null");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeIsNotNull() {
            addCriterion("deviate_charge is not null");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeEqualTo(Double value) {
            addCriterion("deviate_charge =", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeNotEqualTo(Double value) {
            addCriterion("deviate_charge <>", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeGreaterThan(Double value) {
            addCriterion("deviate_charge >", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("deviate_charge >=", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeLessThan(Double value) {
            addCriterion("deviate_charge <", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeLessThanOrEqualTo(Double value) {
            addCriterion("deviate_charge <=", value, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeIn(List<Double> values) {
            addCriterion("deviate_charge in", values, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeNotIn(List<Double> values) {
            addCriterion("deviate_charge not in", values, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeBetween(Double value1, Double value2) {
            addCriterion("deviate_charge between", value1, value2, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andDeviateChargeNotBetween(Double value1, Double value2) {
            addCriterion("deviate_charge not between", value1, value2, "deviateCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeIsNull() {
            addCriterion("term_gap_charge is null");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeIsNotNull() {
            addCriterion("term_gap_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeEqualTo(Double value) {
            addCriterion("term_gap_charge =", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeNotEqualTo(Double value) {
            addCriterion("term_gap_charge <>", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeGreaterThan(Double value) {
            addCriterion("term_gap_charge >", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("term_gap_charge >=", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeLessThan(Double value) {
            addCriterion("term_gap_charge <", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeLessThanOrEqualTo(Double value) {
            addCriterion("term_gap_charge <=", value, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeIn(List<Double> values) {
            addCriterion("term_gap_charge in", values, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeNotIn(List<Double> values) {
            addCriterion("term_gap_charge not in", values, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeBetween(Double value1, Double value2) {
            addCriterion("term_gap_charge between", value1, value2, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermGapChargeNotBetween(Double value1, Double value2) {
            addCriterion("term_gap_charge not between", value1, value2, "termGapCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeIsNull() {
            addCriterion("term_settle_charge is null");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeIsNotNull() {
            addCriterion("term_settle_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeEqualTo(Double value) {
            addCriterion("term_settle_charge =", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeNotEqualTo(Double value) {
            addCriterion("term_settle_charge <>", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeGreaterThan(Double value) {
            addCriterion("term_settle_charge >", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("term_settle_charge >=", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeLessThan(Double value) {
            addCriterion("term_settle_charge <", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeLessThanOrEqualTo(Double value) {
            addCriterion("term_settle_charge <=", value, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeIn(List<Double> values) {
            addCriterion("term_settle_charge in", values, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeNotIn(List<Double> values) {
            addCriterion("term_settle_charge not in", values, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeBetween(Double value1, Double value2) {
            addCriterion("term_settle_charge between", value1, value2, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andTermSettleChargeNotBetween(Double value1, Double value2) {
            addCriterion("term_settle_charge not between", value1, value2, "termSettleCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeIsNull() {
            addCriterion("share_charge is null");
            return (Criteria) this;
        }

        public Criteria andShareChargeIsNotNull() {
            addCriterion("share_charge is not null");
            return (Criteria) this;
        }

        public Criteria andShareChargeEqualTo(Double value) {
            addCriterion("share_charge =", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeNotEqualTo(Double value) {
            addCriterion("share_charge <>", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeGreaterThan(Double value) {
            addCriterion("share_charge >", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("share_charge >=", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeLessThan(Double value) {
            addCriterion("share_charge <", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeLessThanOrEqualTo(Double value) {
            addCriterion("share_charge <=", value, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeIn(List<Double> values) {
            addCriterion("share_charge in", values, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeNotIn(List<Double> values) {
            addCriterion("share_charge not in", values, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeBetween(Double value1, Double value2) {
            addCriterion("share_charge between", value1, value2, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andShareChargeNotBetween(Double value1, Double value2) {
            addCriterion("share_charge not between", value1, value2, "shareCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeIsNull() {
            addCriterion("market_return_charge is null");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeIsNotNull() {
            addCriterion("market_return_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeEqualTo(Double value) {
            addCriterion("market_return_charge =", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeNotEqualTo(Double value) {
            addCriterion("market_return_charge <>", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeGreaterThan(Double value) {
            addCriterion("market_return_charge >", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("market_return_charge >=", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeLessThan(Double value) {
            addCriterion("market_return_charge <", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeLessThanOrEqualTo(Double value) {
            addCriterion("market_return_charge <=", value, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeIn(List<Double> values) {
            addCriterion("market_return_charge in", values, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeNotIn(List<Double> values) {
            addCriterion("market_return_charge not in", values, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeBetween(Double value1, Double value2) {
            addCriterion("market_return_charge between", value1, value2, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andMarketReturnChargeNotBetween(Double value1, Double value2) {
            addCriterion("market_return_charge not between", value1, value2, "marketReturnCharge");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated do_not_delete_during_merge Sat Aug 08 11:25:33 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bus_wholesale_useraccount
     *
     * @mbg.generated Sat Aug 08 11:25:33 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}