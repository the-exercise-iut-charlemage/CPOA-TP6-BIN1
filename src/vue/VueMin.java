package vue;

import modele.ModeleListe;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class VueMin extends JLabel implements Observer {
    private ModeleListe m;
    private JTextArea liste;
    private JLabel text;

    public VueMin(ModeleListe m){
    }

    @Override
    public void update(Observable o, Object arg) {
    }

    public void paintComponent(Graphics g){
    }
}
