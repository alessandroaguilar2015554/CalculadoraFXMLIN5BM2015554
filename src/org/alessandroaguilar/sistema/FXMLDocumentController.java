/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alessandroaguilar.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML private TextField txtresult;
    @FXML private Button btnreset; 
    @FXML private Button btnborrar;  
    @FXML private Button btndivi; 
    @FXML private Button btnmulti; 
    @FXML private Button btnresta; 
    @FXML private Button btnsuma; 
    @FXML private Button btnigual;  
    @FXML private Button btnpunto; 
    @FXML private Button btnmasmenos; 
    @FXML private Button btnporce;
    @FXML private Button btnraiz;
    @FXML private Button btnpotencia;
    @FXML private Button btnunox;
    
    @FXML private Button btnuno; 
    @FXML private Button btndos; 
    @FXML private Button btntres; 
    @FXML private Button btncuatro; 
    @FXML private Button btncinco; 
    @FXML private Button btnseis; 
    @FXML private Button btnsiete; 
    @FXML private Button btnocho; 
    @FXML private Button btnnueve; 
    @FXML private Button btncero; 
    int op;
    double result;
    float  dato1,dato2;
    
    
    
    
    
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()== btnuno)
         txtresult.setText(txtresult.getText()+"1");
        else if (event.getSource()== btndos)
         txtresult.setText(txtresult.getText()+"2");
         else if (event.getSource()== btntres)
         txtresult.setText(txtresult.getText()+"3");
         else if (event.getSource()== btncuatro)
         txtresult.setText(txtresult.getText()+"4");
         else if (event.getSource()== btncinco)
          txtresult.setText(txtresult.getText()+"5");
         else if (event.getSource()== btnseis)
          txtresult.setText(txtresult.getText()+"6");
         else if (event.getSource()== btnsiete)
          txtresult.setText(txtresult.getText()+"7");
         else if (event.getSource()== btnocho)
          txtresult.setText(txtresult.getText()+"8");
         else if (event.getSource()== btnnueve)
          txtresult.setText(txtresult.getText()+"9");
         else if (event.getSource()== btncero)
          txtresult.setText(txtresult.getText()+"0");
      
         
         
      
         
        else if (event.getSource()== btnpunto){
            if (! txtresult.getText().contains("."))
                txtresult.setText(txtresult.getText()+".");
         }
         else if (event.getSource()== btnsuma){
            dato1 = Float.parseFloat(txtresult.getText());
            txtresult.setText("");
            op=1;
         }
        else if (event.getSource()== btnresta){
                dato1 = Float.parseFloat(txtresult.getText());
            txtresult.setText("");    
            op=2;
        }
        else if (event.getSource()== btnmulti){
                 dato1 = Float.parseFloat(txtresult.getText());
                txtresult.setText("");
            op=3; 
        }
        else if (event.getSource()== btndivi){
                dato1 = Float.parseFloat(txtresult.getText());
                txtresult.setText("");
            op=4;
        }
        else if(event.getSource()== btnmasmenos){
                dato1= Float.parseFloat(txtresult.getText());
            op=5;
        }
        else if(event.getSource()== btnporce){
                dato1 = Float.parseFloat(txtresult.getText());
                txtresult.setText("");
            op=6;
        }
        else if (event.getSource()== btnborrar){
                dato1= Float.parseFloat(txtresult.getText());
                txtresult.setText("");
            op=7;
        }
         else if(event.getSource()== btnreset){
                dato1=Float.parseFloat(txtresult.getText());
                txtresult.setText("");
            op=8;
        }
        else if (event.getSource()==btnraiz){
            dato1 = Float.parseFloat(txtresult.getText());
            op=9;
        }
        else if (event.getSource()==btnpotencia){
            dato1 = Float.parseFloat(txtresult.getText());
            op=10;   
        }
        else if (event.getSource()==btnunox){
            dato1 = Float.parseFloat(txtresult.getText());
            txtresult.setText("");
            op=11;
        }
        
        
        
        else if (event.getSource()== btnigual){
                dato2 = Float.parseFloat(txtresult.getText());
            txtresult.setText("");
        switch (op){
         case 1:
                  result = dato1 + dato2; 
                 txtresult.setText(String.valueOf(result));
        break;
        case 2:
                 result = dato1 - dato2; 
                txtresult.setText(String.valueOf(result));
        break; 
        case 3:
                 result = dato1 * dato2; 
                txtresult.setText(String.valueOf(result));
        break;
        case 4:
                 result = dato1 / dato2; 
                txtresult.setText(String.valueOf(result));
        break;
        case 5:
                 result = dato1 * -1;
                txtresult.setText(String.valueOf(result));
        break;
        case 6:
                 result = (dato1 * dato2)/100; 
                txtresult.setText(String.valueOf(result));
        break; 
        case 7:
                txtresult.setText(String.valueOf(""));
        break;
        case 8:
                txtresult.setText(String.valueOf(dato2));
        break;
        case 9:
                result = (float) Math.sqrt(dato1);
                txtresult.setText(String.valueOf(result));
        break;
        case 10:
                result = dato1 * dato1;
                txtresult.setText(String.valueOf(result));
        break;
        case 11:
                result= (1)/dato2;
                txtresult.setText(String.valueOf(result));
        break;
            }
        }
        
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
