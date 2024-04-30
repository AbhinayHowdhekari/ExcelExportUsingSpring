package in.ExcelExport.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ExcelExport.entity.ExcelEntity;
import in.ExcelExport.repository.ExcelRepository;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExcelService {
	@Autowired
	private ExcelRepository repo;

	public void GenerateExcel(HttpServletResponse response) throws Exception {
		List<ExcelEntity> list = repo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Student-Information");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("stud_rollno");
		row.createCell(1).setCellValue("stud_name");
		row.createCell(2).setCellValue("stud_percentage");
		row.createCell(3).setCellValue("created_date");
		row.createCell(4).setCellValue("updated_date");

		int datarowindex = 1;
		for (ExcelEntity data : list) {
			HSSFRow datarow = sheet.createRow(datarowindex);
			datarow.createCell(0).setCellValue(data.getStudentRollNo());
			datarow.createCell(1).setCellValue(data.getStudentName());
			datarow.createCell(2).setCellValue(data.getStudentPercentage());
			datarow.createCell(3).setCellValue(data.getStudentStandard());
			datarow.createCell(4).setCellValue(data.getCreateddate());
			datarow.createCell(5).setCellValue(data.getUpdateddate());
			datarowindex++;
		}
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}
}
