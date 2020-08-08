package com.zxh.accountmanage.service.analysis;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.mapper.OperateContractMapper;
import com.zxh.accountmanage.model.settleManage.OperateContract;
import com.zxh.accountmanage.model.settleManage.OperateContractExample;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OpStatisticsService {
    /**
     * 经营分析业务处理类
     */
    @Autowired
    private OperateContractMapper operateContractMapper;
    //合同分析部分:这里时间用了java.util.Date包
    public ResultDTO<T> getOperateContractByTime(Date begin, Date end){
        OperateContractExample operateContractExample = new OperateContractExample();
        operateContractExample.createCriteria().andCreateTimeBetween(begin,end);
        List<OperateContract> list = operateContractMapper.selectByExample(operateContractExample);
        return ResultDTO.okOf(list);
    }
    public ResultDTO<T> addOperateContractByTime(){
        OperateContract operateContract = new OperateContract();
        operateContract.setCompany("公司1");
        operateContract.setContractId(UUID.randomUUID().toString());
        operateContract.setContractName("电力交易合同");
        operateContract.setContractPrice(1000.00);
        operateContract.setCreateTime(new Date(System.currentTimeMillis()));
        return operateContractMapper.insert(operateContract) == 1 ?
        ResultDTO.okOf() : ResultDTO.errorOf(500,"服务器错误");
    }

    public ResultDTO<T> deleteOperateContractByTime(Long Id){
        OperateContractExample operateContractExample = new OperateContractExample();
        operateContractExample.createCriteria().andIdEqualTo(Id);
        return operateContractMapper.deleteByExample(operateContractExample) == 1 ?
        ResultDTO.okOf("删除成功") : ResultDTO.errorOf(500,"服务器错误");
    }

    public ResultDTO<T> updateOperateContract(Long Id){
        OperateContract operateContract = new OperateContract();
        operateContract.setId(Id);
        operateContract.setCreateTime(new Date());
        operateContract.setCompany("修改后的公司名");
        operateContract.setContractPrice(1.000);
        operateContract.setContractId(UUID.randomUUID().toString());
        operateContract.setContractName("修改后的合同名");
        OperateContractExample operateContractExample = new OperateContractExample();
        operateContractExample.createCriteria().andIdEqualTo(operateContract.getId());
        return operateContractMapper.updateByExampleSelective(operateContract,operateContractExample) == 1 ?
        ResultDTO.okOf("更新成功"):ResultDTO.errorOf(500,"服务器错误，更新失败");
    }

}
