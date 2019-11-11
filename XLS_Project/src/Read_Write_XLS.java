
public class Read_Write_XLS {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("F:\\Testing\\HiteshTest.xlsx");
		System.out.println(d.getRowCount("Data1"));
		
		System.out.println(d.getCellData("Data1", "Name",3));
		
		d.setCellData("Data1", "Name", 6, "Sachin");
		d.setCellData("Data1", "Name", 7, "Aaryan");

	}

}
