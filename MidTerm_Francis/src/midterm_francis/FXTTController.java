/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_francis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author graffitiAddikt
 */
public class FXTTController implements Initializable {
    
    @FXML
    GridPane        gpTT;
    String []       days;
    String [] []    time;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        days = new String []    { " Time ", " Monday ", " Teusday ", " Wednesday ", " Thursday ", " Friday " };
        time = new String [][]  {{ 
            " 08:30 AM - 10:30 AM ",
            " 11:00 AM - 01:00 PM ",
            " 02:00 PM - 04:00 PM ",
            " 04:30 PM - 08:30 PM ",
            " 06:30 PM - 08:30 PM "
        } ,{ 
            " - ",
            " Adobe After Effects ",
            " Game Dev 001 - Introduction to Game Development (Unity, Unreal) ",
            " - ",
            " Intro to iOS Apps (Swift) "
        } ,{ 
            " - ",
            " - ",
            " Intro to 3D Modelling ",
            " - ",
            " - "
        } ,{ 
            " - ",
            " - ",
            " - ",
            " - ",
            " - "
        } ,{ 
            " Design 003 - UX Design Tools (XD) ",
            " - ",
            " - ",
            " - ",
            " - "
        } ,{ 
            " Emerging Technologies 2 - Blockchain Technology, AI ",
            " Java 003 - Intro to Android/Windows Apps ",
            " - ",
            " - ",
            " - "
        } 
        };
        
        
        
        int dayInt1 = 0;
        
        for (String dayStr  : days) {
            gpTT.add(new Label(dayStr), dayInt1, 0);
            dayInt1++ ;
        }
        
        for (int colInt = 0; colInt < time.length; colInt++) {
                    int time_1Int1 = 1;
               
                    for (String timeStr0 : time[colInt]) {
            
                        gpTT.add(new Label(timeStr0), colInt, time_1Int1);
            
                        time_1Int1++ ;
         
                    }
                }
    }    
    
}

//https://stackoverflow.com/questions/2399590/what-does-the-colon-operator-do
//https://admi.fedena.com/data_palettes
//https://www.callicoder.com/javafx-css-tutorial/
//https://docs.oracle.com/javafx/2/css_tutorial/jfxpub-css_tutorial.htm



