package GUI11;
import java.awt.FlowLayout; 
 import java.awt.event.ActionListener; 
  import java.awt.event.ActionEvent; 
   import javax.swing.JFrame; 
    import javax.swing.JTextField; 
     import javax.swing.JPasswordField; 
      import javax.swing.JOptionPane; 
      public class CampoTextoMarco extends JFrame  
       {
        private JTextField campoTexto1; 
         private JTextField campoTexto2; 
          private JTextField campoTexto3; 
           private JPasswordField campoContrasenia; 
           CampoTextoMarco()
           {
            super( "Prueba de JTextField y JPasswordField" ); //Recuerda, super es de herecnia
               setLayout( new FlowLayout() );
               campoTexto1 = new JTextField( 10 );  
                  add( campoTexto1 );
                  campoTexto2 = new JTextField( "Escriba el texto aqui" ); 
                     add( campoTexto2 ); 
                     campoTexto3 = new JTextField( "Campo de texto no editable", 21 ); 
                        campoTexto3.setEditable( false ); 
                           add( campoTexto3 ); 
                           campoContrasenia = new JPasswordField( "Texto oculto" ); 
                              add( campoContrasenia ); 

                              ManejadorCampoTexto manejador = new ManejadorCampoTexto(); 
                                 campoTexto1.addActionListener( manejador ); 
                                    campoTexto2.addActionListener( manejador ); 
                                       campoTexto3.addActionListener( manejador ); 
                                          campoContrasenia.addActionListener( manejador ); 
           }
           private class ManejadorCampoTexto implements ActionListener 
             { 
                public void actionPerformed( ActionEvent evento ) 
                   { 
                    String cadena = "";
                    if ( evento.getSource() == campoTexto1 ) 
                               cadena = String.format( "campoTexto1: %s", 
                                                 evento.getActionCommand() ); 
                                                 else if ( evento.getSource() == campoTexto2 ) 
                                                            cadena = String.format( "campoTexto2: %s", 
                                                                              evento.getActionCommand() ); 
                                                                              else if ( evento.getSource() == campoTexto3 ) 
                                                                                         cadena = String.format( "campoTexto3: %s", 
                                                                                                           evento.getActionCommand() ); 
                                                                                                           else if ( evento.getSource() == campoContrasenia ) 
                                                                                                                      cadena = String.format( "campoContrasenia: %s", 
                                                                                                                                        new String( campoContrasenia.getPassword() ) ); 
                                                                                                                                        JOptionPane.showMessageDialog( null, cadena ); 
                   }
                }
            }
            