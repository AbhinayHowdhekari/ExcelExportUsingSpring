package in.ExcelExport.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ExcelExport.service.ExcelService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ExcelController {
	@Autowired
	private ExcelService service;
	@GetMapping("/excel")
	public void GenerateExcelData(HttpServletResponse response) throws Exception {
		
		response.setContentType("applicaton/octet-stream");
		String headerkey="content-Disposition";
		String headervalue="attachment;filename=Student.xls";
		response.setHeader(headerkey,headervalue);
		service.GenerateExcel(response);
	}
}
