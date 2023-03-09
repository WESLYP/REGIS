package tabless;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf=new JFrame();
		String columnData[]= {"EMPNO","ENAME","SAL","DEPTNO"};
		String rowData[][]= {
				{"101","abc","10000","1"},
				{"102","abc","10000","2"},
				{"103","abc","10000","3"},
				{"104","abc","10000","4"},
				{"105","abc","10000","5"},
				{"106","abc","10000","6"},
				{"107","abc","10000","7"},
				{"108","abc","10000","8"},

		};
		JTable t1=new JTable(rowData,columnData);
		t1.setBounds(40,50,210,310);
		JScrollPane sp=new JScrollPane(t1);
		jf.add(sp);
		jf.setSize(350,500);
		jf.setVisible(true);

	}

}
