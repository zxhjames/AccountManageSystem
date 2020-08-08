package com.zxh.accountmanage.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

@Data
public class ReportFormDetailDTO implements java.io.Serializable{
    @Excel(name = "模版ID")
    Long tableId;
    @Excel(name = "模版数据ID")
    Long id;
    @Excel(name = "格式时间")
    String formatName;
    @Excel(name = "开始时间")
    Date beginTime;
    @Excel(name = "结束时间")
    Date endTime;
    @Excel(name = "转换格式类型")
    String formatType;
    @Excel(name = "创建者")
    String createUser;
    @Excel(name = "创建时间")
    Date createTime;
    @Excel(name = "操作类型")
    Integer opType;
}

