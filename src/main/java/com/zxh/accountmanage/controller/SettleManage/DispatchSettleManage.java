package com.zxh.accountmanage.controller.SettleManage;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.settle.DispatchSettleService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatchSettleManage {
    @Autowired
    private DispatchSettleService dispatchSettleService;
    /**
     * 用于批发电力市场与交易中心订单的核对，接口校验:这里需要知道交易中心接口传递的数据
     */
    @PostMapping("/dispatch/inspect/userform")
    public ResultDTO<T> DispatchSettleInspect(){
        return dispatchSettleService.Inspect();
    }

    /**
     * 用于批发电力市场与交易中心的核对，账单导入校验：这里要导入账单
     */
    @PostMapping("/dispatch/inspect/userexcel")
    public ResultDTO<T> DispatchSettleInspectWithExcel(){return dispatchSettleService.InspectWithExcel();}
}
