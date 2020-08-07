package com.zxh.accountmanage.mapper.settleManage;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ReportFormDetailExtMapper {
    List<Map<String,Object>> getTableInfo(@Param("tableName") String tableName);
}
