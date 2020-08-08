package com.zxh.accountmanage.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class StudentEntity implements java.io.Serializable{
    private String id;
    @Excel(name="学生姓名",height = 20,width = 30,isImportField = "true_st")
    private String name;
    @Excel(name="学生性别",replace = {"男_1","女_2"},suffix = "生",isImportField = "true_st")
    private int sex;
}
