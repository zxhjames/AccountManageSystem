package com.zxh.accountmanage.easyPoi;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import com.zxh.accountmanage.dto.ReportFormDetailDTO;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testExcel {
    @Test
    public void test1() throws IOException {
        List<ExcelExportEntity> entity = new ArrayList<>();
        entity.add(new ExcelExportEntity("模版ID","tableId"));
        entity.add(new ExcelExportEntity("数据ID", "id"));
        entity.add(new ExcelExportEntity("格式时间", "formatName"));
        entity.add(new ExcelExportEntity("开始时间","beginTime"));
        entity.add(new ExcelExportEntity("结束时间", "endTime"));
        entity.add(new ExcelExportEntity("转换格式类型", "formatType"));
        entity.add(new ExcelExportEntity("创建者","createUser"));
        entity.add(new ExcelExportEntity("创建时间", "createTime"));
        entity.add(new ExcelExportEntity("操作类型", "opType"));
        List<ReportFormDetailDTO> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            ReportFormDetailDTO reportFormDetailDTO = new ReportFormDetailDTO();
            reportFormDetailDTO.setTableId(1L);
            reportFormDetailDTO.setId(1L);
            reportFormDetailDTO.setBeginTime(new Date());
            reportFormDetailDTO.setEndTime(new Date());
            reportFormDetailDTO.setFormatName("zxh");
            reportFormDetailDTO.setFormatType("1");
            reportFormDetailDTO.setCreateTime(new Date());
            reportFormDetailDTO.setOpType(1);
            reportFormDetailDTO.setCreateUser("adsas");
            list.add(reportFormDetailDTO);
        }
        Date         start    = new Date();
        ExportParams params   = new ExportParams("自由导出对象版本", "测试", ExcelType.HSSF);
        Workbook workbook = ExcelExportUtil.exportExcel(params, entity, list);
        System.out.println(new Date().getTime() - start.getTime());
        File savefile = new File("D:/home/excel/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("D:/home/excel/ExcelExportMsgClient.testExcelExportEntity.xlsx");
        workbook.write(fos);
        fos.close();

    }
}
