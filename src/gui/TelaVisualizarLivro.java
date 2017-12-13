package gui;

/*
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class TelaVisualizarLivro extends JFrame implements ActionListener{
    
     private JLabel lbLivro;
     
     private JButton salvarAvaliacao;
     private JButton Comentar;
     
     private GridBagLayout gbl;
     private GridBagConstraints gbc;
     
     public TelaVisualizarLivro(){
         super("Visualizar livro");
         super.setSize(480, 480);
         super.setIconImage(new ImageIcon(this.getClass().
                 getResource("/img/bookIcon.png")).getImage());
         super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.gbl = new GridBagLayout();
         super.setLayout(this.gbl);
         this.gbc = new GridBagConstraints();
         this.MontarTela();
     }
             
    public void MontarTela(){
        int esq = GridBagConstraints.WEST;
        int dir = GridBagConstraints.EAST;
        int cent = GridBagConstraints.CENTER;
        int hor = GridBagConstraints.HORIZONTAL;
        int nenhum = GridBagConstraints.NONE;
        
        this.Comentar = new JToggleButton(this.starIcon);
        this.Comentar.
        this.AddComponente(this.Comentar, esq, nenhum, 0, 0, 1, 1);
    }
    private void AddComponente(Component comp, int ancora, int preencher,
           int lin, int col, int larg, int alt){
       this.gbc.anchor = ancora;
       this.gbc.fill = preencher;
       this.gbc.gridx = col;
       this.gbc.gridy = lin;
       this.gbc.gridwidth = larg;
       this.gbc.gridheight = alt;

       this.gbl.setConstraints(comp, gbc);
       super.add(comp);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/