package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gameplay extends JPanel {

    private ImageIcon titleImage;



public void paint (Graphics g) {
    //draw title image border
    g.setColor(Color.white);
    g.drawRect(24, 10, 851, 51);

    //draw the little image
    titleImage = new ImageIcon ("snaketitle.jpg");
    titleImage.paintIcon(this, g, 25, 11);

    // draw border for gameplay
    g.setColor(Color.WHITE);
    g.drawRect(24, 74, 851, 577);

    //draw background for the gameplay
    g.setColor(Color.black);
    g.fillRect(25, 75, 850,575 );




}




}