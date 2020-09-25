package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private final JTextPane htmlTextPane = new JTextPane();
    private final JEditorPane plainTextPane = new JEditorPane();
    private Controller controller;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void init() {

    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void exit() {
        controller.exit();
    }
}
