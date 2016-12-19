package com.view;

import com.market.Product;
import com.sale.PointOfSale;
import com.sale.PointOfSaleImpl;
import com.shoppingcart.ShoppingCartDetail;
import net.miginfocom.swing.MigLayout;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by joschinc on 12/14/16.
 */
public class ShoppingCartView {
    private JFrame principalFrame;
    private JPanel panel;
    private JLabel codeProduct;
    private JComboBox product;
    private JButton btnAdd;
    private JButton btnClear;
    private JLabel total;
    private DefaultTableModel tableModel;
    private JTable detailTable;
    private JScrollPane scrollBarDetailTable;
    private PointOfSale terminal;

    private void setPrincipalFrame(String title){
        this.principalFrame = new JFrame(title);
        principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHigh = screenSize.height;
        int screenWidth = screenSize.width;

        principalFrame.setSize(screenWidth / 2, screenHigh / 2);
        principalFrame.setLocation(screenWidth / 4, screenHigh / 4);
    }

    private void setPanel(String tittle){
        this.panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(tittle));
        panel.setLayout(new MigLayout("", "grow","grow"));
        principalFrame.add(panel);
    }

    private void initComponents(){

        codeProduct = new JLabel("Code Product");
        total = new JLabel("Total: 0.00");

        btnAdd = new JButton("Add Product");
        btnClear = new JButton("New Bill");

        setTableDetail();
    }

    private void setTableDetail(){
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Product");
        tableModel.addColumn("Quantity");
        tableModel.addColumn("Amount");
        detailTable = new JTable(tableModel);
        scrollBarDetailTable = new JScrollPane(detailTable);
    }
    public void setModelProduct(ArrayList products){
        product = new JComboBox();
        product.setModel(new DefaultComboBoxModel(products.toArray()));
    }

    private void btnClearEvent(){
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteRows();
                terminal.getDetailList().clear();
                product.setSelectedIndex(0);
                total.setText("Total: 0.00");
            }
        });
    }

    private void btnAddEvent(){
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String codeProduct = product.getSelectedItem().toString();
                terminal.scan(codeProduct.toString());
                deleteRows();
                Set<Map.Entry<String, ShoppingCartDetail>> values = terminal.getDetailList().entrySet();
                for(Map.Entry<String, ShoppingCartDetail> value: values){
                    Object obj[] = {value.getKey(), value.getValue().getQuantity(), value.getValue().getAmount() };
                    tableModel.addRow(obj);
                }
                total.setText("Total: " + terminal.calculateTotal());
            }
        });
    }

    private void deleteRows(){
        int rowCount = tableModel.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }

    private void addEvents() {
        btnAddEvent();
        btnClearEvent();
    }
    public void setTerminal(Map<String, Product> groceryMarket){
        terminal = new PointOfSaleImpl();
        terminal.setPricing(groceryMarket);
    }

    private void addComponets(){
        panel.add(codeProduct,"split");
        panel.add(product,"pushx, growx, split");
        panel.add(btnAdd,"pushx, growx, split");
        panel.add(btnClear,"pushx, growx, split, wrap");

        panel.add(scrollBarDetailTable,"push, grow, wrap");

        panel.add(total,"right, wrap");
    }

    private void initPrincipalFrame(){
        principalFrame.setVisible(true);
    }
    public void start(String titlePrincipal, String panelTitle){
        setPrincipalFrame(titlePrincipal);
        setPanel(panelTitle);
        initComponents();
        addComponets();
        addEvents();
        initPrincipalFrame();

    }

}
