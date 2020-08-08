package com.zxh.accountmanage.mapper;

import com.zxh.accountmanage.model.settleManage.ElectrityPrice;
import com.zxh.accountmanage.model.settleManage.ElectrityPriceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
@Mapper
public interface ElectrityPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    long countByExample(ElectrityPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int deleteByExample(ElectrityPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int insert(ElectrityPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int insertSelective(ElectrityPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    List<ElectrityPrice> selectByExampleWithRowbounds(ElectrityPriceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    List<ElectrityPrice> selectByExample(ElectrityPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int updateByExampleSelective(@Param("record") ElectrityPrice record, @Param("example") ElectrityPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_electricity_price
     *
     * @mbg.generated Sat Aug 08 08:59:07 CST 2020
     */
    int updateByExample(@Param("record") ElectrityPrice record, @Param("example") ElectrityPriceExample example);
}