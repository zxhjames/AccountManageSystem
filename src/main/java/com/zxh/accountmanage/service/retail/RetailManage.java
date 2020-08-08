package com.zxh.accountmanage.service.retail;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.mapper.ElectrityPriceMapper;
import com.zxh.accountmanage.model.settleManage.ElectrityPrice;
import com.zxh.accountmanage.model.settleManage.ElectrityPriceExample;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RetailManage {
    @Autowired
    private ElectrityPriceMapper electrityPriceMapper;

    public ResultDTO<T> GetSellAnalysisPrice(Date begin, Date end) {
        //按照时间跨度查出时间跨度内分组的公司报价名，给前端显示整个波动情况
        ElectrityPriceExample electrityPriceExample = new ElectrityPriceExample();
        electrityPriceExample.createCriteria().andLogTimeBetween(begin, end);
        List<ElectrityPrice> lists = electrityPriceMapper.selectByExample(electrityPriceExample);
        if (lists.size() == 0) return ResultDTO.okOf(lists);
        //分组查询
        Map<Date, List<ElectrityPrice>> res = lists.stream().collect(
                Collectors.groupingBy(ElectrityPrice::getLogTime)
        );
        return ResultDTO.okOf(res);
    }

    public ResultDTO<T> GetSellAnalysisElecBill(){
        return ResultDTO.okOf();
    }

    public ResultDTO<T> GetSellAnalysisElecBillExcel(){
        return ResultDTO.okOf();
    }
}
