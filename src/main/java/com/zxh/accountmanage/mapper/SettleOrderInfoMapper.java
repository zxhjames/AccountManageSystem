package com.zxh.accountmanage.mapper;

import com.zxh.accountmanage.model.settleManage.SettleOrderInfo;
import com.zxh.accountmanage.model.settleManage.SettleOrderInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface SettleOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    long countByExample(SettleOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int deleteByExample(SettleOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int insert(SettleOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int insertSelective(SettleOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    List<SettleOrderInfo> selectByExampleWithRowbounds(SettleOrderInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    List<SettleOrderInfo> selectByExample(SettleOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int updateByExampleSelective(@Param("record") SettleOrderInfo record, @Param("example") SettleOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_settle_order_info
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int updateByExample(@Param("record") SettleOrderInfo record, @Param("example") SettleOrderInfoExample example);
}