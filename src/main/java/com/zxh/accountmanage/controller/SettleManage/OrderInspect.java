package com.zxh.accountmanage.controller.SettleManage;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.excel.ExcelService;
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
    private ExcelService excelService;

    //导出excel文件
    @GetMapping("/order/excel/get")
    public ResponseEntity<byte[]> GetOrder(@RequestParam("TableName") String TableName) throws IOException {
        return excelService.Orderexcel(TableName);
    }
    //导入订单报表进行数据录入
    @PostMapping("/order/add")
    public ResultDTO InputOrderExcel(@RequestParam(name = "file") MultipartFile file) throws Exception {
        return excelService.AddExcel(file);
    }
}
