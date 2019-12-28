package Chapter6.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class lambda {
    public static void main(String[] args){
        repeatMessage("Hello",1000);
    }

    public static void repeatMessage(String text,int delay){
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();
    }
}
