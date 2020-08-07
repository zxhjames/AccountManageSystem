package com.zxh.accountmanage.service.form_service;

import com.zxh.accountmanage.dto.ReportFormDetailDTO;
import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.mapper.settleManage.ReportFormDetailExtMapper;
import com.zxh.accountmanage.mapper.settleManage.ReportFormDetailMapper;
import com.zxh.accountmanage.mapper.settleManage.ReportFormInfoMapper;
import com.zxh.accountmanage.model.settleManage.ReportFormDetail;
import com.zxh.accountmanage.model.settleManage.ReportFormDetailExample;
import com.zxh.accountmanage.model.settleManage.ReportFormInfo;
import com.zxh.accountmanage.model.settleManage.ReportFormInfoExample;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/****
 * 报表业务处理类
 */
@Service
public class FormService {
    @Autowired
    private ReportFormInfoMapper reportFormInfoMapper;
    @Autowired
    private ReportFormDetailMapper reportFormDetailMapper;
    @Autowired
    private ReportFormDetailExtMapper reportFormDetailExtMapper;

    /**
     * 获取报表文件列表
     * @return
     */
    public ResultDTO GetReportFormsInfoList(){
        ReportFormInfoExample reportFormInfoExample = new ReportFormInfoExample();
        reportFormInfoExample.createCriteria();
        return ResultDTO.okOf(reportFormInfoMapper.selectByExampleWithBLOBs(reportFormInfoExample));
    }
    /**
     * 根据id获取表名
     */
    public String getTabName(Long Id){
        ReportFormInfoExample reportFormInfoExample = new ReportFormInfoExample();
        reportFormInfoExample.createCriteria().andFormIdEqualTo(Id);
        ReportFormInfo reportFormInfo = reportFormInfoMapper.selectByExample(reportFormInfoExample).get(0);
        return reportFormInfo.getFormTabName();
    }
    /**
     * 根据表名动态获取表结构
     */
    public ResultDTO GetReportFormDetail(Long Id){
        List<Map<String, Object>> tableInfo = getTableInfo(getTabName(Id));
        return tableInfo.size() == 0  ? ResultDTO.okOf("服务器错误"):ResultDTO.okOf(tableInfo);
    }

    /**
     * 获取表所有结构字段
     * @param tableName
     * @return
     */
    public List<Map<String,Object>> getTableInfo(String tableName){
        return reportFormDetailExtMapper.getTableInfo(tableName);
    }

    /**
     * 添加表结构字段
     * @param reportFormDetailDTO
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public ResultDTO<T> AddReportFormDetail(ReportFormDetailDTO reportFormDetailDTO) throws InvocationTargetException, IllegalAccessException {
        ReportFormDetail reportFormDetail = new ReportFormDetail();
        BeanUtils.copyProperties(reportFormDetail,reportFormDetailDTO);
        //先去检索出表的位置
        //String TabName = getTabName(reportFormDetailDTO.getTableId());
        //先去插入到bus_report_form_detail这个表里
        return reportFormDetailMapper.insert(reportFormDetail) == 1 ? ResultDTO.okOf("添加成功"):ResultDTO.errorOf(400,"失败");
    }

    public ResultDTO<T> DeleteReportFormDetail(Long Id){
        ReportFormDetailExample reportFormDetailExample = new ReportFormDetailExample();
        reportFormDetailExample.createCriteria().andIdEqualTo(Id);
        return reportFormDetailMapper.deleteByExample(reportFormDetailExample) == 1 ? ResultDTO.okOf("你删除了id为"+Id+"的数据"):ResultDTO.errorOf(500,"删除失败");
    }
    /**
     * 上传文件至文件服务器
     */
    public ResultDTO<T> PutReportFormDetail(MultipartFile multipartFile){
        String filename = "";
        return ResultDTO.okOf();
    }
}
