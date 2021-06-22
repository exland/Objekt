package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Controler  {
    private View view_;
    private Model model_;


    private   String [] names = {"First Name", "Last Name","Id Number","Gender", "Date Of Birth", "Email", "Phone", "Address"};
    public  Controler(View view , Model model)
    {
        view_ = view;
        model_ = model;
    }
    public void initController()
    {
        
        view_.getNewEmployee_().addActionListener(actionEvent -> DialFunctionality());
       JTable t =  view_.getTableData();
       view_.getUpdate_btn_().addActionListener(actionEvent -> updatePDB());
    }

    private  void initTextfields() {
        for (JTextField itr :
                view_.getDial_().getData()) {
            itr.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    itr.setText("");
                    view_.getDial_().setLabelTextField("");
                }
            });
        }
    }

    private void updatePDB()
    {
        List<List<String>> wholeTable=  new ArrayList<>();
        for (int i = 0; i < view_.getTableData().getRowCount(); i++)
        {
            List<String> data  = new ArrayList<>();
            for(int j = 0; j < 8 ; j++)
            {
                if(view_.getTableData().getValueAt(i,j) != null)
                {
                    data.add(view_.getTableData().getValueAt(i,j).toString());
                }
            }
            wholeTable.add(data);
        }
        for (List<String> itr: wholeTable
             ) {
            try
            {
                Long.parseLong(itr.get(6));
                Integer.parseInt(itr.get(2));
            }
            catch (NumberFormatException e)
            {
                reDraw();
                return;
            }
            try
            {
                LocalDate.parse(itr.get(4));
            }
            catch (DateTimeParseException e)
            {
                reDraw();
                return;
            }

        }

        model_.erase();
        for (List<String> itr: wholeTable
       ) {
            addToList(itr, false);
        }


    }

     private void DialButtonFunctionality()
    {
        List<String> list = new ArrayList<String>();
        String p = "";
        JTextField [] data = view_.getDial_().getData();
        for (int i = 0; i < 8; i++) {
            p = data[i].getText();
            boolean l = false;
            for (int f = 0; f < 8; f++) {

                if (p.compareTo(names[f]) == 0) {
                    p = "#";
                    list.add(p);
                    l = true;
                    break;
                }
            }
            if(!l)
            {
                list.add(p);
            }
        }
        if(validateInput(list))
        {
            view_.getDial_().setLabelTextField("Wrong input");
            for(int i = 0 ; i < 8 ; i++)
            {
                String p2 = names[i];
                data[i].setText(p2);
            }
        }
        else
        {
            addToList(list, true);
            resetfields();
        }


    }

    private void addToList(List<String> data, boolean add)
    {
      //  long  o = ;
        EmployeeModel insertion =  new EmployeeModel(data.get(0), data.get(1),Integer.parseInt(data.get(2)), data.get(3),LocalDate.parse(data.get(4)), data.get(5), Long.parseLong(data.get(6)), data.get(7));
       if(add)
       {
           if(view_.getTableData() != null)
           {
               DefaultTableModel model =(DefaultTableModel) view_.getTableData().getModel();
               model.addRow(new Object[]{data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7)});
           }
       }

        model_.add(insertion);
    }


    private void reDraw()
    {
       List<EmployeeModel> data =  model_.getListOfEmployeeModels();
       for (int i = 0; i <  view_.getTableData().getRowCount(); i++ )
       {
            EmployeeModel emp = data.get(i);
           view_.getTableData().setValueAt(emp.getFirstName_(), i, 0);
           view_.getTableData().setValueAt(emp.getLastName_(), i, 1);
           view_.getTableData().setValueAt(emp.getID_number_(), i, 2);
           view_.getTableData().setValueAt(emp.getGender_(), i, 3);
           view_.getTableData().setValueAt(emp.getDateOfBirth_(), i, 4);
           view_.getTableData().setValueAt(emp.getEmail_(), i, 5);
           view_.getTableData().setValueAt(emp.getPhoneNumber_(), i, 6);
           view_.getTableData().setValueAt(emp.getAddress_(), i, 7);
       }
    }


    private void resetfields()
    {
        JTextField [] data = view_.getDial_().getData();
        for(int i = 0; i < 8 ; i++)
        {
            JTextField tmp = data[i];
            tmp.setText(names[i]);
        }
    }

    private boolean validateInput(List<String> data)
    {
        //System.out.println(data);
        for (String i :
                data) {
            if (i.compareTo("#") == 0)
            {
                return true;
            }
        }
        try
        {
            Long.parseLong(data.get(6));
            Integer.parseInt(data.get(2));
        }
        catch (NumberFormatException e)
        {
            return true;
        }
        try
        {
            LocalDate.parse(data.get(4));
        }
        catch (DateTimeParseException e)
        {
            return true;
        }
        return false;
    }


    private void DialFunctionality()
    {
            view_.setDial_();
            initTextfields();
            view_.getDial_().getButtonConfirm_().addActionListener(actionEvent -> DialButtonFunctionality());
    }
}
