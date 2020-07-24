package com.company;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Compiler
class ComplimentMachine implements ActionListener {
    //creating this so I can access the variables to do calculations
    private static JLabel lengthLabel;
    private static JLabel widthLabel;
    private static JLabel heightLabel;
    private static JTextField userLengthText;
    private static JTextField userWidthText;
    private static JTextField userHeightText;
    private static JButton calculateButton;
    private static JLabel output;


    public ComplimentMachine(){

    }

    public static void main(String[] args){
        new ComplimentMachine();

        //Creating the box
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));

        /*Length test
        lengthLabel = new JLabel("Length");
        lengthLabel.setBounds(10,20,80,25);
        panel.add(lengthLabel);*/

        /*Width Text
        widthLabel = new JLabel("Width");
        widthLabel.setBounds(10,50,80,25);
        panel.add(widthLabel);*/

        /*Height Text
        heightLabel = new JLabel("Height");
        heightLabel.setBounds(10,80,80,25);
        panel.add(heightLabel);*/

        /*Length Input Box
        userLengthText = new JTextField(20);
        userLengthText.setBounds(100,20,165,25);
        panel.add(userLengthText);

        //Width Input Box
        userWidthText = new JTextField(20);
        userWidthText.setBounds(100,50,165,25);
        panel.add(userWidthText);

        //Height Input Box
        userHeightText = new JTextField(20);
        userHeightText.setBounds(100,80,165,25);
        panel.add(userHeightText);*/

        //Create Calculate Button
        calculateButton = new JButton("Press for Compliment");
        calculateButton.setBounds(130,120,100,25);
        calculateButton.addActionListener(new ComplimentMachine());
        panel.add(calculateButton);


        //Output
        output = new JLabel("");
        output.setBounds(130,120,200,70);
        panel.add(output);



        //Creating the GUI
        JFrame frame = new JFrame();
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Button Test");
        String stringLength = userLengthText.getText();
        String stringWidth = userHeightText.getText();
        String stringHeight = userHeightText.getText();

        int length = Integer.parseInt(stringLength);
        int width = Integer.parseInt(stringWidth);
        int height = Integer.parseInt(stringHeight);

        int volume = length*width*height;
        //System.out.println(volume);
        String volumeString = String.valueOf(volume);

        output.setText("The Volume is: "+volumeString);


    }
}