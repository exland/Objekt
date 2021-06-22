package com.company;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.event.MouseEvent;

import static com.sun.java.accessibility.util.SwingEventMonitor.addTableModelListener;

public class MyTextField extends JTextField {

    public MyTextField(String name)
    {
        this.setName(name);
    }
}
