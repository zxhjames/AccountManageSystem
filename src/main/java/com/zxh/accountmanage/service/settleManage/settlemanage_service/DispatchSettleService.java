package com.zxh.accountmanage.service.settlemanage_service;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.mapper.settleManage.WholeSaleUserAccountMapper;
import com.zxh.accountmanage.model.settleManage.WholeSaleUserAccount;
import com.zxh.accountmanage.model.settleManage.WholeSaleUserAccountExample;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchSettleService {
    @Autowired
    private WholeSaleUserAccountMapper wholeSaleUserAccountMapper;
    public ResultDTO<T> Inspect(){
        WholeSaleUserAccountExample wholeSaleUserAccountExample = new WholeSaleUserAccountExample();
        wholeSaleUserAccountExample.createCriteria();
        List<WholeSaleUserAccount> lists = wholeSaleUserAccountMapper.selectByExample(wholeSaleUserAccountExample);
        //todo 下面就是具体的业务交易算法
        return ResultDTO.okOf(lists);
    }
}
