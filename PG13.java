ROLLNO.	NAME	ENG	HINDI	SCI	MATH
1	Abhi	78	45	67	54
2	venky	78	45	34	45
3	candy	78	45	34	67
4	tony	78	45	23	56
5	alice	78	67	54	89
6	rohit	67	35	65	67
7	eli	23	34	65	78
8	kitty	34	67	65	78
9	jones	56	67	65	78
10	aarti	78	67	65	67



package Test; 
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import jxl.Sheet; 
import jxl.Workbook; 
import jxl.write.Label; 
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook; 
public class pg13 { 
	@BeforeClass 
	public void setUp() throws Exception {}
	@Test 
	public void testImportexport1() throws Exception{ 
	FileInputStream fi = new FileInputStream("C:\\pass\\STUDENT.xls");
 	Workbook w = Workbook.getWorkbook(fi);
 	Sheet s = w.getSheet(0); 
 	
 	String a[][] = new String[s.getRows()][s.getColumns()];

 	FileOutputStream fo = new FileOutputStream("C:\\pass\\RESULT.xls"); 
 	WritableWorkbook wwb = Workbook.createWorkbook(fo);
 	WritableSheet ws = wwb.createSheet("result1", 0); 
 	for (int i = 0; i < s.getRows(); i++) 
 	for (int j = 0;j < s.getColumns();j++) 
 	{ a[i][j] = s.getCell(j, i).getContents(); 
 	Label l2 = new Label(j, i, a[i][j]);
 	ws.addCell(l2); 
 	Label l1 = new Label(6, 0, "Result");
 	ws.addCell(l1); } 
 	for (int i = 1; i < s.getRows(); i++) { 
 	for (int j = 2; j < s.getColumns();j++) 
 	{
 	a[i][j] = s.getCell(j, i).getContents();
 	int x=Integer.parseInt(a[i][j]); 
 	if(x > 35) 
 	{ 
 	Label l1 = new Label(6, i, "pass"); 
 	ws.addCell(l1); 
 	} 
 	else 
 	{ 
 	Label l1 = new Label(6, i, "fail");
 	ws.addCell(l1);
 	break; 
 	}
 	}
 	System.out.println("Records sucessfully updated ");
 	}
 	wwb.write();
 	wwb.close();
	} 
}
