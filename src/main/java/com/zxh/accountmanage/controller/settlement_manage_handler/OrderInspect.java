package com.zxh.accountmanage.controller.settlement_manage_handler;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.excel_service.ExcelService;
import com.zxh.accountmanage.service.settlemanage_service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/***
 * 结算订单检测
 */
@RestController
public class OrderInspect {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ExcelService excelService;
    @GetMapping("/index")
    public String Index(){
        System.out.println("index");
        return "index";
    }
    //结算订单检测
    @PostMapping("order/inspect")
    public boolean orderInspect(){
        return false;
    }


    //生成订单报表
    //todo 可以根据前台传递的表单或者是excel文件直接生成一个结算报表单
    @GetMapping("/order/get")
    public ResponseEntity<byte[] > GetOrderExcel() throws IOException {
        return excelService.excel("order");
    }

    //导入订单报表进行数据录入
    @PostMapping("/order/add")
    public ResultDTO InputOrderExcel(@RequestParam(name = "file") MultipartFile file) throws Exception {
        return excelService.AddExcel(file);
    }
}
