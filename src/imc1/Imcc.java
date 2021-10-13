
package imc1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Imcc extends JFrame {
    private JLabel peso;
    private JLabel altura;
    private JTextField meuTextField;
     private JTextField meuTextField2;
    private JButton calcular;
    
    public Imcc(){
        super ("IMC");
        setLayout(new FlowLayout());
        
        
        peso = new JLabel("\n Digite o Peso: ");               
        meuTextField = new JTextField(15);       
        add(peso);
        add(meuTextField);
        
        altura = new JLabel("\n Digite a altura: ");               
        meuTextField2 = new JTextField(15);       
        add(altura);
        add(meuTextField2);
        
         calcular = new JButton("Calcular IMC");
          add(calcular);
          
         calcular.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    float p1, al1, imc ;
                    
                    p1 = Float.parseFloat(meuTextField.getText());
                    al1 = Float.parseFloat(meuTextField2.getText());
                    imc = p1/(al1*al1);
                    
                    if(imc < 20){
                       JOptionPane.showMessageDialog(null,"Seu Imc eh: "+ imc + " \n Voce esta Abaixo do Peso");
                    }else  if(imc >= 20 && imc < 25){
                           JOptionPane.showMessageDialog(null,"Seu Imc eh: "+ imc + " \n Voce esta com Peso Normal");
                    }else if (imc >= 25 && imc < 30) {
                           JOptionPane.showMessageDialog(null,"Seu Imc eh: "+ imc + " \n Voce esta  Acima do Peso");                                                                           
                    }else {
                           JOptionPane.showMessageDialog(null,"Seu Imc eh: "+ imc + " \n Voce esta com Obeso");
                    }
                                     
                    }
                  }
             );
       
         }
    
      } 
    

