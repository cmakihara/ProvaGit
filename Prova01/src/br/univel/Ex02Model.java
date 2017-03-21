package br.univel;

import javax.swing.table.AbstractTableModel;

public class Ex02Model extends AbstractTableModel{

	private static final long serialVersionUID = 1L;

	private int d1 =1,d2 = 6, d3 = 9,d4 = 4, d5 = 7, d6 = 6;
	
	public String getColumnName(int column){
		switch(column){
		
		case 0 : return "F";
		case 1 : return "E";
		case 2 : return "D";
		case 3 : return "C";
		case 4 : return "B";
		case 5 : return "A";
		
		
		}
			
		return "G";
		
		
		
	}
	
	@Override
	public int getColumnCount() {
		
		return 6;
	}

	@Override
	public int getRowCount() {
		
		
		return 100;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		switch(columnIndex){
		
		case 0: return columnIndex + rowIndex + d1 + d5;
		case 1: return columnIndex + rowIndex + d2 * 2;
		case 2: return columnIndex + rowIndex + d3 -1;
		case 3: return 4 * rowIndex;
		case 4: return rowIndex * 2 + d3;
		case 5: return d4 + d6 + rowIndex;
		
		}
		return null;
		
	}
	

}
