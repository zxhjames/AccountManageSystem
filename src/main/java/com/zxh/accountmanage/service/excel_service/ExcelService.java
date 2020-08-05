package com.zxh.accountmanage.service.excel_service;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.model.Order;
import com.zxh.accountmanage.service.settlemanage_service.OrderService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class ExcelService {
    @Autowired
    OrderService orderService;


    /****
     * 以文件流的形式返回给前端
     */
    @GetMapping("/excel")
    public ResponseEntity<byte[]> excel(String TableName) throws IOException {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet();
        List<Order> orders = orderService.SelectOrderAll();
        String[] tabs = new String[]{
                "订单号",
                "金钱",
                "创建时间"
        };
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        for(int i=0;i<tabs.length;++i){
            cell = row.createCell(i);
            cell.setCellValue(tabs[i]);
        }
        for(int i=1;i<=orders.size();++i){
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(orders.get(i-1).getOrderid());
            cell = row.createCell(1);
            cell.setCellValue(orders.get(i-1).getMoney());
            cell = row.createCell(2);
            cell.setCellValue(orders.get(i-1).getLogtime().toString());
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            wb.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        String fileName = new String((TableName+".xls").getBytes("UTF-8"), "iso-8859-1");
        httpHeaders.setContentDispositionFormData("attachment", fileName);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> filebyte = new ResponseEntity<byte[]>(outputStream.toByteArray(), httpHeaders, HttpStatus.CREATED);
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
        return filebyte;
    }

    public ResultDTO<T> AddExcel(MultipartFile file) throws IOException, InvalidFormatException {
        InputStream inputStream = file.getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        inputStream.close();
        //获取sheet0的rearing
        Sheet sheet = workbook.getSheetAt(0);
        int rowLength = sheet.getLastRowNum() - 1;
        Row row = sheet.getRow(0);
        int colLength = row.getLastCellNum();
        System.out.println("该表总共有:"+rowLength+"行,"+colLength+"列");
        Cell cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());
        return ResultDTO.okOf();
    }

}
