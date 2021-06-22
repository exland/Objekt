package com.company;

import javax.swing.*;
import java.awt.*;


public class MyDialog extends JDialog {

    private  JFrame frame_;
    private   JPanel TextFieldPanel =  new JPanel();
    private JPanel ButtonFieldPanel = new JPanel();
    private   JLabel label = new JLabel();

    public JFrame getFrame_() {
        return frame_;
    }

    public void setFrame_(JFrame frame_) {
        this.frame_ = frame_;
    }

    public JPanel getTextFieldPanel() {
        return TextFieldPanel;
    }

    public void setTextFieldPanel(JPanel textFieldPanel) {
        TextFieldPanel = textFieldPanel;
    }

    public JPanel getButtonFieldPanel() {
        return ButtonFieldPanel;
    }

    public void setButtonFieldPanel(JPanel buttonFieldPanel) {
        ButtonFieldPanel = buttonFieldPanel;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getButtonConfirm_() {
        return buttonConfirm_;
    }

    public void setButtonConfirm_(JButton buttonConfirm_) {
        this.buttonConfirm_ = buttonConfirm_;
    }

    public JTextField[] getField() {
        return field;
    }

    public void setField(MyTextField[] field) {
        this.field = field;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    private JButton buttonConfirm_;

    private  MyTextField field[] = new MyTextField[8];
    private   String [] names = {"First Name", "Last Name","Id Number","Gender", "Date Of Birth", "Email", "Phone", "Address"};

    public void setLabelTextField(String data)
    {
        label.setText(data);
    }
    private  void JTextFieldSetup()
    {
        int i = 0;
        for(; i < 8 ; i++)
        {
            field[i] = new MyTextField(names[i]);
            field[i].setText(names[i]);
            field[i].setSize(60,20);
            field[i].setVisible(true);
            TextFieldPanel.add(field[i]);
        }
        buttonConfirm_ = new MyButton("Add", new Dimension(80,20));
        label =   new JLabel();
       ButtonFieldPanel.add(buttonConfirm_);
       ButtonFieldPanel.add(label);
    }

    public JTextField[] getData()
    {
        return field;
    }


    private void init(JFrame k)
    {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        BorderLayout layout =  new BorderLayout();
        this.setLayout(layout);
        frame_ = k;
        this.setTitle("Add new Employee");
        this.setSize(200 ,200);
        this.setLocationRelativeTo(k);
        this.setVisible(true);
        JTextFieldSetup();
        TextFieldPanel.setLayout(new BoxLayout(TextFieldPanel, BoxLayout.Y_AXIS));
        ButtonFieldPanel.setLayout(new BoxLayout( ButtonFieldPanel, BoxLayout.Y_AXIS));
        this.add(ButtonFieldPanel, BorderLayout.EAST);
        this.add(TextFieldPanel,  BorderLayout.WEST);
       // System.out.println("HERE");
    }

  public  MyDialog(JFrame k)
    {
        init(k);
    }






}


