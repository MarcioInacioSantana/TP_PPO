package gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TelaLivrosCadastrados extends JFrame implements ActionListener{
    private JLabel lbSelecLivro;
    
    private JTable tbLivros;
    private final String[] colunas  = {"Título", "#Pontos", "Autor", 
        "Data de publicação"};
    
    //Apenas para testar:
    String[][] livrosTeste = {{"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"},
                              {"O universo", "99", "Stephen Hawking", "1998"}};
    
    private JButton btnVisualizar;
    private JButton btnEditar;
    private JButton btnRemover;
    private JButton btnSair;
    
    private final GridBagLayout gbl;
    private final GridBagConstraints gbc;
    
    
    public TelaLivrosCadastrados(){
        super("Meus Livros");
        super.setIconImage((new ImageIcon(this.getClass().
                getResource("/img/libraryIcon.png"))).getImage());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(580, 480);
        super.setResizable(false);
        this.gbl = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        super.setLayout(gbl);
        this.MontarTela();
    }
    
    private void MontarTela(){
        int esq = GridBagConstraints.WEST;
        int dir = GridBagConstraints.EAST;
        int cent = GridBagConstraints.CENTER;
        int hor = GridBagConstraints.HORIZONTAL;
        int nenhum = GridBagConstraints.NONE;
        
        this.gbc.insets = new Insets(5, 3, 3, 3);
        
        this.gbc.insets.top = 5;
        this.lbSelecLivro = new JLabel("Selecione um livro para "
                + "realizar uma ação:");
        this.AddComponente(lbSelecLivro, esq, nenhum, 0, 0, 4, 1);
        this.gbc.insets.top = 3;
        
        this.tbLivros = new JTable(this.livrosTeste, this.colunas);
        this.gbc.ipady = 300;
        JScrollPane tbScrl = new JScrollPane(this.tbLivros);
        this.AddComponente(tbScrl, esq, hor, 1, 0, 4, 1);
        this.gbc.ipady =  0;
        
        this.gbc.insets.left = 30;
        this.gbc.ipadx  = 50;
        
        this.gbc.insets.top = 30;
        this.gbc.insets.left = 3;
        this.gbc.insets.right = 3;
        this.btnVisualizar = new JButton("Visualizar");
        this.AddComponente(btnVisualizar, cent, nenhum, 12, 0, 1, 1);
        
        this.btnEditar = new JButton("  Editar  ");
        this.AddComponente(btnEditar, cent, nenhum, 12, 1, 1, 1);
        
        
        this.btnRemover = new JButton("  Remover ");
        this.AddComponente(btnRemover, cent, nenhum, 12, 2, 1, 1);
        
        
        this.btnSair = new JButton("   Sair   ");
        this.AddComponente(btnSair, cent, nenhum, 12, 3, 1, 1);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}