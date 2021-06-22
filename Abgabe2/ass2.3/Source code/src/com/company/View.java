package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class View  {

    public JButton getNewEmployee_() {
        return newEmployee_;
    }

    public MyDialog getDial_() {
        return dial_;
    }


    public JTable getTableData() {
        return TableData;
    }

    public JFrame getWindow_() {
        return window_;
    }

    // private Model data_ ;
    private JButton newEmployee_;

    public void setNewEmployee_(JButton newEmployee_) {
        this.newEmployee_ = newEmployee_;
    }

    public void setDial_() {

        dial_ = new MyDialog(window_);

    }

    public void setTableData(JTable tableData) {
        TableData = tableData;
    }

    public void setWindow_(JFrame window_) {
        this.window_ = window_;
    }

    public JTextField[] getJtext()
    {
        return dial_.getData();
    }

    //  private JButton printEmployee_;
    private MyDialog dial_ ;
    private JTable TableData;
    private JFrame window_;

    public void setDial_(MyDialog dial_) {
        this.dial_ = dial_;
    }

    public MyButton getUpdate_btn_() {
        return update_btn_;
    }

    public void setUpdate_btn_(MyButton update_btn_) {
        this.update_btn_ = update_btn_;
    }

    private  MyButton update_btn_;
    //ActionListener
    public View()
    {
        initUI();
    }

    private void initUI()
    {
        update_btn_ = new MyButton("Confirm", new Dimension(120,20));
        window_ = new JFrame();
        window_.setTitle("Employee Management System");
        window_.setSize(800,300);
        window_.setLocationRelativeTo(null);
        window_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel ButtonPannel =  new JPanel();

        newEmployee_ = new MyButton("Add Employee",new Dimension(150,20));
        ButtonPannel.setLayout(new FlowLayout(FlowLayout.LEFT));

        ButtonPannel.add(newEmployee_);
        ButtonPannel.add(update_btn_);
        update_btn_.setVisible(true);
        window_.add(ButtonPannel, BorderLayout.SOUTH);

        String[][] data = {};
        // Column Names
        String[] columnNames = {"First Name", "Last Name","Id Number","Gender", "Date Of Birth", "Email", "Phone", "Address"};
        // Initializing the JTable
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        TableData = new JTable(model);
        TableData.setBounds(30, 40, 800, 300);
        JScrollPane sp = new JScrollPane(TableData);
        window_.add(sp);
        window_.setVisible(true);


    }

}
