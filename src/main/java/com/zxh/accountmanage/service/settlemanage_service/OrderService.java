package com.zxh.accountmanage.service.settlemanage_service;

import com.zxh.accountmanage.mapper.OrderMapper;
import com.zxh.accountmanage.model.Order;
import com.zxh.accountmanage.model.OrderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/****
 * 结算管理模块服务
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<Order> SelectOrderAll(){
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria();
        List<Order> orders = orderMapper.selectByExample(orderExample);
        System.out.println("end");
        return orders;
    }
}
