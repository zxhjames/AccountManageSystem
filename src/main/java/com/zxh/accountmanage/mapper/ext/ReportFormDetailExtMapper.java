package com.zxh.accountmanage.mapper.ext;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ReportFormDetailExtMapper {
    List<Map<String,Object>> getTableInfo(@Param("tableName") String tableName);
}
