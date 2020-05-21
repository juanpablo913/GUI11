package GUI11;
import java.awt.FlowLayout; 
import java.awt.Font; 
import java.awt.event.ItemListener; 
import java.awt.event.ItemEvent; 
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JCheckBox; 
public class MarcoCasillaVeriﬁcacion extends JFrame
{
    private JTextField campoTexto; 
    private JCheckBox negritaJCheckBox;
    private JCheckBox cursivaJCheckBox; 
    MarcoCasillaVeriﬁcacion() 
    {
        super( "Prueba de JCheckBox" ); 
        setLayout( new FlowLayout() );

        campoTexto = new JTextField( "Observe como cambia el estilo de tipo de letra", 20 );  
        campoTexto.setFont( new Font( "Serif", Font.PLAIN, 14 ) ); 
        add( campoTexto );
        negritaJCheckBox = new JCheckBox( "Negrita" ); 
        cursivaJCheckBox = new JCheckBox( "Cursiva" ); 
        add( negritaJCheckBox );
        add( cursivaJCheckBox );

        ManejadorCheckBox manejador = new ManejadorCheckBox(); 
        negritaJCheckBox.addItemListener( manejador ); 
        cursivaJCheckBox.addItemListener( manejador ); 
    }
    private class ManejadorCheckBox implements ItemListener 
    {
        private int valNegrita = Font.PLAIN; 
        private int valCursiva = Font.PLAIN; 
        public void itemStateChanged( ItemEvent evento ) 
        {
            if ( evento.getSource() == negritaJCheckBox ) 
            valNegrita =  
            negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN; 
            if ( evento.getSource() == cursivaJCheckBox ) 
            valCursiva =  
            cursivaJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN; 
            campoTexto.setFont( 
                new Font( "Serif", valNegrita + valCursiva, 14 ) ); 
        }
    }
}