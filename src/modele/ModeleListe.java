package modele;

import java.util.ArrayList;
import java.util.Observable;

public class ModeleListe extends Observable {

    private ArrayList<String> liste;
    private String min;
    private String max;

    public ModeleListe(){
        liste = new ArrayList<>();
        min = "";
        max = "";
    }

    public String getMin() {
        return min;
    }

    public String getMax() {
        return max;
    }

    public String getLine(int n){
        if(liste.size() >= n){
            return null;
        }
        return liste.get(n);
    }

    public int  getSize(){
        return liste.size();
    }

    public void ajouter(String s){
        liste.add(s);
        if(s.compareTo(max) > 0){
            max = s;
        }
        if(s.compareTo(min) < 0){
            min = s;
        }
        setChanged();
        notifyObservers();
    }
}
