/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protonmail.unit10;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author unit
 */
public class Scetch extends JPanel{
    int zeroX = 200;
    int zeroY = 50;
    public void paint(Graphics g){
        g.drawLine(zeroX, zeroY, zeroX, zeroY+600);
        g.drawLine(zeroX, zeroY+300, zeroX+150, zeroY+300);
        g.drawLine(zeroX+200, zeroY+300, zeroX+400, zeroY+300);
        
        g.drawString("Point ID:1", zeroX+10, zeroY+596);
        g.drawString("Point ID:2", zeroX+10, zeroY+496);
        g.drawString("Point ID:3", zeroX+10, zeroY+296);
        g.drawString("Point ID:4", zeroX+10, zeroY-4);
        g.drawString("Point ID:5", zeroX+90, zeroY+296);
        g.drawString("Point ID:6", zeroX+200, zeroY+296);
        g.drawString("Point ID:7", zeroX+340, zeroY+296);
        g.drawString("WATER PIPELINES SCETCH", zeroX+125, zeroY+340);

        g.drawString("Minimal distance is between ", zeroX+125, zeroY+380);
        g.drawString("Id:1 and Id:2 which is 10 miles.", zeroX+125, zeroY+400);
        g.drawString("Id:2 - Id:3 distance 20 miles;", zeroX+125, zeroY+440);
        g.drawString( "Id:3 - Id:4 distance 30 miles;", zeroX+125, zeroY+460);
        g.drawString("Id:4 - Id:5 distance 15 miles;", zeroX+125, zeroY+480);
        g.drawString("Id:6 - Id:7 distance 20 miles.", zeroX+125, zeroY+500);
        g.drawString("For now, other directions do not exist", zeroX+125, zeroY+520);

        g.drawRect(zeroX-3, zeroY+596, 6, 8);
        g.drawRect(zeroX-3, zeroY+296, 6, 8);
        g.drawRect(zeroX-3, zeroY+496, 6, 8);
        g.drawRect(zeroX-3, zeroY-4, 6, 8);
        g.drawRect(zeroX+144, zeroY+296, 6, 8);
        g.drawRect(zeroX+197, zeroY+296, 6, 8);
        g.drawRect(zeroX+397, zeroY+296, 6, 8);
    }
    
    
}
