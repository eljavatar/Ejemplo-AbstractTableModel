package com.eljavatar.ejemploabstracttablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andres
 */
public class ModeloDatosTablaPersonas extends AbstractTableModel {

    private final Class[] tipoColumnas;
    private final String[] titleColumnas;
    private List<Persona> personas;

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public ModeloDatosTablaPersonas() {
        personas = new ArrayList();
        this.titleColumnas = new String[]{"Código", "Nombres", "Edad", "Valor Deuda"};
        this.tipoColumnas = new Class[]{String.class, String.class, Integer.class, Double.class};
    }

    @Override
    public String getColumnName(int column) {
        return titleColumnas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return titleColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return personas.get(rowIndex).getCodigo();
            case 1:
                return personas.get(rowIndex).getNombres();
            case 2:
                return personas.get(rowIndex).getEdad();
            case 3: 
                return personas.get(rowIndex).getValorDeuda();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                personas.get(rowIndex).setCodigo(aValue.toString());
                break;
            case 1:
                personas.get(rowIndex).setNombres(aValue.toString());
                break;
            case 2:
                personas.get(rowIndex).setEdad((int) aValue);
                break;
            case 3:
                personas.get(rowIndex).setValorDeuda((double) aValue);
            default: ;
        }
        this.fireTableCellUpdated(rowIndex, columnIndex);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }

}
