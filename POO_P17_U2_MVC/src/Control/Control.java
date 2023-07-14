
package Control;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
    private Vista view;
    private Modelo model;
     
    public Control (Vista view , Modelo model){
        this.view=view;
        this.model=model;
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
        
    }
    public void iniciar(){
       view.setTitle("USTER VA A SUMAR POR MEDIO MVC");
       view.setLocationRelativeTo(null);
       view.txtN1.setText(String.valueOf(model.getV1()));
       view.txtN2.setText(String.valueOf(model.getV2()));
       view.txtResult.setText(String.valueOf(model.getTotal()));
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       model.setV1(Integer.parseInt(view.txtN1.getText()));
       model.setV2(Integer.parseInt(view.txtN2.getText()));
       if(e.getSource() == view.btnSumar){
           model.sumar();
       }
       if(e.getSource() == view.btnDividir){
           model.dividir();
       }
       if(e.getSource() == view.btnMultiplicar){
           model.multiplicar();
       }
       if(e.getSource() == view.btnRestar){
           model.restar();
       }
       view.txtResult.setText(String.valueOf(model.getTotal()));
    }
}
