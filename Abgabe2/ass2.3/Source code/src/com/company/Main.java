package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    View ui =  new View();
    Model model =  new Model();
    Controler controler =   new Controler(ui, model);
    controler.initController();

    }
}
