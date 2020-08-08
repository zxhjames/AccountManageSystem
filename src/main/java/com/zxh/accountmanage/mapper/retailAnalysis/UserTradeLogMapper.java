package com.zxh.accountmanage.mapper.retailAnalysis;

import com.zxh.accountmanage.model.retailAnalysis.UserTradeLog;
import com.zxh.accountmanage.model.retailAnalysis.UserTradeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserTradeLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    long countByExample(UserTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    int deleteByExample(UserTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    int insert(UserTradeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    int insertSelective(UserTradeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    List<UserTradeLog> selectByExampleWithRowbounds(UserTradeLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    List<UserTradeLog> selectByExample(UserTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserTradeLog record, @Param("example") UserTradeLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_trade_log
     *
     * @mbg.generated Sat Aug 08 11:26:47 CST 2020
     */
    int updateByExample(@Param("record") UserTradeLog record, @Param("example") UserTradeLogExample example);
}