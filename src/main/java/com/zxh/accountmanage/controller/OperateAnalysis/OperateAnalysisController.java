package com.zxh.accountmanage.controller.OperateAnalysis;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.analysis.OpStatisticsService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class OperateAnalysisController {
    @Autowired
    private OpStatisticsService opStatisticsService;
    /**
     * 用于经营分析
     */

//    @PostMapping("/OperateAnalysis/contact/get")
//    public T GetOperateAnaylysisContact(){return opStatisticsService.toString();}
    /**
     * 合同分析:用户合同数据表:增加，删除，查询功能
     */
    @GetMapping("/operate/contract/get")
    public ResultDTO<T> GetOperateContract(@RequestParam("beginTime") Date begin,
                                           @RequestParam("endTime") Date end){
        return opStatisticsService.getOperateContractByTime(begin,end);
    }
    @PostMapping("/operate/contract/add")
    public ResultDTO<T> AddOperateContract(){
        return opStatisticsService.addOperateContractByTime();
    }
    @PostMapping("/operate/contract/delete")
    public ResultDTO<T> DeleteOperateContract(@RequestParam("id") Long Id){
        return opStatisticsService.deleteOperateContractByTime(Id);
    }
    @PostMapping("/operate/contract/update")
    public ResultDTO<T> UpdateOperateContract(@RequestParam("Id") Long Id){
        return opStatisticsService.updateOperateContract(Id);
    }
    /**
     * 收益分析:公司收益表
     */

    /**
     * 市场交易分析
     */
}
