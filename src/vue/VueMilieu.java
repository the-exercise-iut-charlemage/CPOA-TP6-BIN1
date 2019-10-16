package vue;

import modele.ModeleListe;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class VueMilieu extends JPanel implements Observer {

    private ModeleListe m;
    private JTextArea liste;

    public VueMilieu(ModeleListe m){
        liste = new JTextArea(5,5);
        add(liste);
        this.m = m;
    }

    @Override
    public void update(Observable o, Object arg) {
        m = (ModeleListe) o;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i=0; i< m.getSize(); i++){
            liste.insert(m.getLine(i), i);
        }
    }
}
