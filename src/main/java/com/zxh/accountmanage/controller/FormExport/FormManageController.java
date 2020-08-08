package com.zxh.accountmanage.controller.FormExport;

import com.zxh.accountmanage.dto.ReportFormDetailDTO;
import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.form.FormService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.InvocationTargetException;

@RestController
public class FormManageController {

    @Autowired
    private FormService formService;

    /**
     * 获取所有报表的列表
     * @return
     */
    @GetMapping("/forms/get")
    public ResultDTO<T> GetReportFormsList(){
        return formService.GetReportFormsInfoList();
    }

    /**
     * 根据报表id获取报表结构
     * @param Id
     * @return
     */
    @PostMapping("/formsdetail/get")
    public ResultDTO<T> GetFormsDetail(@RequestParam("id") Long Id) {
        return formService.GetReportFormDetail(Id);
    }

    @PostMapping("/formsdetail/add")
    public ResultDTO<T> AddFormsDetail(@RequestBody ReportFormDetailDTO reportFormDetailDTO) throws InvocationTargetException, IllegalAccessException {
        return formService.AddReportFormDetail(reportFormDetailDTO);
    }
    @PostMapping("/formsdetail/delete")
    public ResultDTO<T> DeleteReportFormsDetail(@RequestParam("id") Long Id){
        return formService.DeleteReportFormDetail(Id);
    }
    /**
     * 本地上传文件至服务器
     */
    @PostMapping("/formsdetail/put")
    public ResultDTO<T> PutFormsDetail(@RequestParam("file") MultipartFile multipartFile){
        //todo 因为服务器在虚拟机里，这个先放一下
        return formService.PutReportFormDetail(multipartFile);
    }


}
