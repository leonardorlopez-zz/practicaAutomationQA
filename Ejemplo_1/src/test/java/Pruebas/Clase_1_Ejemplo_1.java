package Pruebas;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Clase_1_Ejemplo_1 {

	public static void main (String [] args) throws IOException {
	    
		String filepath = "C:\\Users\\lrlopez\\Desktop\\COMAFI\\APLICACIONES\\Prueba.xlsx";
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		
        XSSFWorkbook wb = new XSSFWorkbook();  
		XSSFCellStyle style = wb.createCellStyle();
        //prueba
		XSSFColor myColor = new XSSFColor(Color.YELLOW);
		//Creamos la letra
		XSSFFont font = wb.createFont();
		//Negrita
		font.setBold(true);
		//asociamos la letra al style
		style.setFont(font);
		
		//Le indicamos que tipo de Pattern tendra el estilo
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		style.setFillForegroundColor(myColor);
		//creamos la hoja
		XSSFSheet sheet = wb.createSheet("Prueba");
		
		XSSFRow row = sheet.createRow(0);
	    XSSFCell cell = row.createCell(1);
		cell.setCellValue("Hola Mundo");
		
		cell.setCellStyle(style);
		
		OutputStream out = new FileOutputStream(filepath);
		wb.write(out);
		
		out.close();
		
	}
}
