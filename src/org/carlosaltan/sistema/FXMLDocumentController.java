package org.carlosaltan.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLDocumentController implements Initializable {
    double  valor1, valor2, auxSR; 
    int contador = 0;
    int contador2 = 0; 
    int op; 
    
    @FXML private TextField txtPantalla; 
    @FXML private Button btnCero;
    @FXML private Button btnUno; 
    @FXML private Button btnDos; 
    @FXML private Button btnTres; 
    @FXML private Button btnCuatro; 
    @FXML private Button btnCinco; 
    @FXML private Button btnSeis; 
    @FXML private Button btnSiete; 
    @FXML private Button btnOcho; 
    @FXML private Button btnNueve; 
    @FXML private Button btnMas; 
    @FXML private Button btnMenos; 
    @FXML private Button btnMulti; 
    @FXML private Button btnDiv; 
    @FXML private Button btnIgual; 
    @FXML private Button btnPunto; 
    @FXML private Button btnMasMenos; 
    @FXML private Button btnRaiz; 
    @FXML private Button btnCuadrado; 
    @FXML private Button btnUnoX; 
    @FXML private Button btnPorciento; 
    @FXML private Button btnCe; 
    @FXML private Button btnC; 
    @FXML private ImageView imgCerrar; 
    
    
   
    
    @FXML 
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if(event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis  )
            txtPantalla.setText(txtPantalla.getText()+ "6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+ "7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+ "8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        else if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        else if (event.getSource() == btnCe) 
            txtPantalla.setText("");  
        else if (event.getSource() == btnC) {
            txtPantalla.setText("");  
            valor1 = 0; 
            valor2 = 0; 
            contador = 0;
            contador2 = 0;
            btnPunto.setDisable(false);
        }else if (event.getSource() == btnMas){
            contador++; 
            if (contador <= 1){
                valor1 = Double.parseDouble(txtPantalla.getText()); 
                btnPunto.setDisable(false);
                txtPantalla.setText("");
              
            }else{
                valor2 =  Double.parseDouble(txtPantalla.getText()); 
                valor1  = valor1 + valor2; 
                txtPantalla.setText("");
            }
            op = 1;            
            btnPunto.setDisable(false); 
        }else if (event.getSource() == btnMenos){
            contador2++; 
            if (contador2 <= 1){
                valor1 = Double.parseDouble(txtPantalla.getText()); 
                btnPunto.setDisable(false);
                txtPantalla.setText("");
              
            }else{
                valor2 =  Double.parseDouble(txtPantalla.getText()); 
                valor1  = valor1 - valor2; 
                txtPantalla.setText("");
            }
            op = 2;            
            btnPunto.setDisable(false); 
        }else if (event.getSource() == btnMulti){
            valor1 = Double.parseDouble(txtPantalla.getText()); 
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            op = 3; 
        }else if (event.getSource() == btnDiv){
            valor1 = Double.parseDouble(txtPantalla.getText()); 
            txtPantalla.setText("");
            btnPunto.setDisable(false);
            op = 4; 
        }else if (event.getSource() == btnCuadrado){
            valor1 = Double.parseDouble(txtPantalla.getText()); 
            double resultado =  (double) Math.pow(valor1, 2); 
            txtPantalla.setText(String.valueOf(resultado));
            
        }else if (event.getSource() == btnRaiz){
            valor1 = Double.parseDouble(txtPantalla.getText()); 
            double resultado =  (double) Math.sqrt(valor1); 
            txtPantalla.setText(String.valueOf(resultado)); 
            
        }else if (event.getSource() == btnUnoX){
            valor1 = Double.parseDouble(txtPantalla.getText()); 
            double resultado =  1/valor1; 
            txtPantalla.setText(String.valueOf(resultado)); 
            
        }else if(event.getSource() == btnPorciento){
            valor2 = Double.parseDouble(txtPantalla.getText());
            double opr;
            if (op == 3 || op == 4){
               opr = valor2/100;  
            }else{
              opr = (valor1 * valor2)/100;    
            }
            txtPantalla.setText(String.valueOf(opr));
            
        }else if (event.getSource() == btnPunto){
            if(txtPantalla.getText().equals("")){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            }else {
                String aux = txtPantalla.getText(); 
                txtPantalla.setText(aux + ".");
                btnPunto.setDisable(true);
            }
        }else if (event.getSource() == btnMasMenos){
            double val = Double.parseDouble(txtPantalla.getText()); 
            val = val*-1; 
            txtPantalla.setText( String.valueOf(val));
        }else if(event.getSource()== btnIgual){
            double resultado;
            valor2 = Double.parseDouble(txtPantalla.getText()); 
            txtPantalla.setText("");
            switch(op){
                case 1: 
                    if (contador < 2){
                        contador = 0; 
                        resultado = valor1 + valor2; 
                        txtPantalla.setText(String.valueOf(resultado)); 
                    }else {
                        txtPantalla.setText(String.valueOf(valor1 + valor2));
                    }
                    break; 
                case 2: 
                    if (contador2 < 2){
                        contador2 = 0; 
                        resultado = valor1 - valor2; 
                        txtPantalla.setText(String.valueOf(resultado)); 
                    }else {
                        txtPantalla.setText(String.valueOf(valor1 - (valor2)));
                    }
                    break;
                case 3: 
                    resultado = valor1 * valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
                case 4: 
                    resultado = valor1 / valor2; 
                    txtPantalla.setText(String.valueOf(resultado));
                    break;
         
            }
            btnPunto.setDisable(false);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
