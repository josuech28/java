import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by joschinc on 12/8/16.
 */
public class EmployeeModel extends AbstractTableModel  {

    private Employee employee;

    private List<TableModelListener> suscriptores = new ArrayList<TableModelListener>();
    private List<Employee> data = new ArrayList<Employee>();
    private static final int COLUMN_SIZE = 4;
    protected Class[] types = new Class[]{String.class, String.class, String.class, String.class};



    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return COLUMN_SIZE;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Name";
            case 1:
                return "Last Name";
            case 2:
                return "Email";
            case 3:
                return "Genre";
        }
        return "NULL";
    }

    public Class<?> getColumnClass(int columnIndex) {

      return types[columnIndex];

    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee aux = data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return aux.getName();

            case 1:
                return aux.getName();

            case 2:
                return aux.getEmail();

            case 3:
                return aux.getGenre();

            default:
                System.out.println("Out of attibutes");
                break;
        }
        return null;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Employee aux = (Employee)data.get(rowIndex);
        switch (columnIndex){
            case 0:
                String name = aux.getName();
                name =(String)aValue;
                break;
            case 1:
                String lastname = aux.getLastName();
                lastname =(String)aValue;
                break;
            case 2:
                String email = aux.getEmail();
                email = (String)aValue;
                break;
            case 3:
                String genre = aux.getGenre();
                genre = (String)aValue;
                break;
            default:
                System.out.println("Column out of boun");
                break;
        }
        fireTableDataChanged();

    }

    public void addEmployee(Employee employee){
        data.add(employee);
        fireTableDataChanged();
    }
    public void print(){
        for(Employee e: data){
            System.out.println(e.toString());
        }
    }
}
