package oms;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class View
{
    private JFrame window_;
    private JTable TableData;

    View()
    {
        init();
    }

    public void init()
    {
        this.window_ =  new JFrame();
        window_.setVisible(true);
        window_.setTitle("Order Management System");
        window_.setSize(900,400);
        window_.setLocationRelativeTo(null);
        window_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Ramen","Main Ingredients", "Price(Euro)/Portion"};
        // Initializing the JTable
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        TableData = new JTable(model);
        TableData.setBounds(30, 40, 800, 300);
        JScrollPane sp = new JScrollPane(TableData);
        window_.add(sp);
        window_.setVisible(true);
    }

}
