package com.company;

import java.util.*;
import java.util.List;

public class Model {
    public void setListOfEmployeeModels(List<EmployeeModel> listOfEmployeeModels) {
        this.listOfEmployeeModels = listOfEmployeeModels;
    }

    public List<EmployeeModel> getListOfEmployeeModels() {
        return listOfEmployeeModels;
    }

    private List<EmployeeModel> listOfEmployeeModels = new ArrayList<>();

    public Model()
    {

    }

    public void add(EmployeeModel i)
    {
        listOfEmployeeModels.add(i);
    }

    public void erase()
    {
        listOfEmployeeModels.clear();
    }
}
