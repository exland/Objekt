package com.company;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(String name, Dimension k)
    {
         this.setText(name);
         this.setPreferredSize(k);

    }
}
