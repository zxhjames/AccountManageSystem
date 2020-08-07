package com.zxh.accountmanage.service.excel_service;

import com.zxh.accountmanage.dto.ResultDTO;
import com.zxh.accountmanage.service.form_service.FormService;
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
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Service
public class ExcelService {
    @Autowired
    OrderService orderService;
    @Autowired
    FormService formService;


    /**
     * fixme 导出的属性是乱掉的
     * 导出数据库的excel文件
     * @param tabName
     * @return
     * @throws IOException
     */
    public ResponseEntity<byte[]> Orderexcel(String tabName) throws IOException {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet();
        List<Map<String,Object>> lists = formService.getTableInfo(tabName);
        if(lists == null) return null;
        //创建属性行列
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = null;
        row = sheet.createRow(0);
        int index = 0;
        //生成属性列
        for(String key : lists.get(0).keySet()){
            cell = row.createCell(index++);
            cell.setCellValue(key);
        }
        for(int i=0;i<lists.size();++i){
            Map<String,Object> list = lists.get(i);
            //生成详细数据列
            row = sheet.createRow(i+1);
            index = 0;
            for(Object obj : list.values()){
                cell = row.createCell(index++);
                cell.setCellValue(obj.toString());
            }
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        wb.write(outputStream);
        outputStream.close();
        HttpHeaders httpHeaders = new HttpHeaders();
        String fileName = new String((tabName+".xls").getBytes("UTF-8"), "iso-8859-1");
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


    /**
     * 将报表的数据插入到数据库中
     * @param file
     * @return
     * @throws IOException
     * @throws InvalidFormatException
     */
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
