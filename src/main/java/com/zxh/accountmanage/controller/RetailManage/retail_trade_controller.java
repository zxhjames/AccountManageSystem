package com.zxh.accountmanage.controller.RetailManage;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.retail.RetailManage;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class retail_trade_controller {
    @Autowired
    private RetailManage retailManage;
    /**
     * 零售交易分析
     */

    /**
     * 目标用户分析:支持用户电费账单，历史分时电量导入统计处用户24点负荷曲线
     */
    @PostMapping("/Sell/analysis/userElecBill/form")
    public ResultDTO<T> GetSellAnalysisBillByElecRate(){
        return retailManage.GetSellAnalysisElecBill();
    }
    @PostMapping("/Sell/analysis/userElecBill/excel")
    public ResultDTO<T> GetSellAnalysisBillByElecRateExcel(){
        return retailManage.GetSellAnalysisElecBillExcel();
    }
    /**
     * 批发成本分析
     */
    @PostMapping("/Sell/analysis/electricPrice")
    public ResultDTO<T> GetSellAnalysisPrice(@RequestParam("beginTime")Date begin,@RequestParam("endTIme") Date end){
        return retailManage.GetSellAnalysisPrice(begin,end);
    }

    @GetMapping("/test")
    public void test(){
        retailManage.test();
    }

}
