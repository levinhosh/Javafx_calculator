/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_calculator;

import java.beans.Expression;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 *
 * @author Alternative Admin
 */
public class FXMLDocumentController implements Initializable  {
    
    @FXML
    private Label labelAnswer;
    
    @FXML
    private Label labelDisplay;
    
    @FXML
    private void handleButton1(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("1");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"1");
        }
            
        
        
    }
    
    @FXML
    private void handleButton2(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("2");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"2");
        }
    }
    
    @FXML
    private void handleButton3(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("3");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"3");
        }
    }
    
    @FXML
    private void handleButton4(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("4");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"4");
        }
    }
    
    @FXML
    private void handleButton5(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("5");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"5");
        }
    }
    
    @FXML
    private void handleButton6(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("6");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"6");
        }
    }
    
    @FXML
    private void handleButton7(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("7");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"7");
        }
    }
    
    @FXML
    private void handleButton8(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("8");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"8");
        }
    }
    
    @FXML
    private void handleButton9(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("9");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"9");
        }
    }
    
    @FXML
    private void handleButton0(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("0");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"0");
        }
    }
    
    @FXML
    private void handleButtonAdd(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("+");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"+");
        }
    }
    
    @FXML
    private void handleButtonMinus(ActionEvent event) {
       if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("-");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"-");
        }
    }
    
    @FXML
    private void handleButtonMultiply(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"*");
        }
    }
    
    @FXML
    private void handleButtonDivide(ActionEvent event) {
        if(labelDisplay.getText().isEmpty()){
            labelDisplay.setText("");
        }else{
            labelDisplay.setText(labelDisplay.getText()+"/");
        }
    }
    
    @FXML
    private void handleButtonClear(ActionEvent event) {
        
        labelDisplay.setText("");
    }
    
    @FXML
    private void handleButtonDelete(ActionEvent event) {
        if(! (labelDisplay.getText().isEmpty()) ){
           String content = labelDisplay.getText().toString();
           content = content.substring(0,content.length()-1);
           labelDisplay.setText(content);
        }
    }
    
    @FXML
    private void handleButtonEqual(ActionEvent event) throws ScriptException {
        if(labelDisplay.getText().isEmpty()){
            labelAnswer.setText("");
        }else{
            String Answer = labelDisplay.getText();
            
            
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            
            Integer res = (Integer)engine.eval(Answer);
            
            labelAnswer.setText(Integer.toString(res));
                    
                    
        }
    }
    
    @FXML
    private void operationEqual(){
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
