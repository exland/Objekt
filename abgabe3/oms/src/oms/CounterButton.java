package oms;

import javax.swing.*;
import java.awt.*;
// Add that if clicked then + or -
public class CounterButton extends JButton {

    private int nums_pressed;


    public int getNums_pressed() {
        return nums_pressed;
    }

    public void setNums_pressed(int nums_pressed) {
        this.nums_pressed = nums_pressed;
    }


    public CounterButton(String name, Dimension k)
    {
        this.setText(name);
        this.setPreferredSize(k);

    }
}