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
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TelaCadastrarLivro extends JFrame implements ActionListener{
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbAnoPublic;
    private JLabel lbDescricao;
    private JLabel lbPalavsChave;
    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoAnoPublic;
    private JTextArea campoDescricao;
    private JTextField campoPalavsChave;
 
    private JButton btnSalvar;
    private JButton btnSair;
    
    private GridBagLayout gbl;
    private GridBagConstraints gbc;
    
    
    public TelaCadastrarLivro(){
        super("Cadastrar Livro");
        super.setIconImage((new ImageIcon(this.getClass().
                getResource("/img/cdastLivro.png"))).getImage());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(480, 480);
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
        //this.gbc.weightx = 1;
        //this.gbc.weighty = 0.1;
        
        this.gbc.insets.top = 5;
        this.lbTitulo = new JLabel("Título");
        this.AddComponente(lbTitulo, esq, nenhum, 0, 0, 1, 1);
        this.gbc.insets.top = 3;
        
        this.campoTitulo = new JTextField(40);
        this.AddComponente(campoTitulo, esq, hor, 1, 0, 6, 1);
        
        this.gbc.insets.top = 15;
        this.lbAutor = new JLabel("Autor");
        this.AddComponente(lbAutor, esq, nenhum, 2, 0, 1, 1);
        
        this.gbc.insets.top = 3;
        this.campoAutor = new JTextField(30);
        this.AddComponente(campoAutor, esq, hor, 3, 0, 6, 1);
        
        this.gbc.insets.top = 15;
        this.lbAnoPublic = new JLabel("Ano de publicação");
        this.AddComponente(lbAnoPublic, esq, nenhum, 4, 0, 1, 1);
        
        this.campoAnoPublic = new JTextField(4);
        this.AddComponente(campoAnoPublic, esq, nenhum, 4, 1, 1, 1);
        
        this.gbc.insets.top = 15;
        this.lbDescricao = new JLabel("Descrição");
        this.AddComponente(lbDescricao, esq, nenhum, 5, 0, 1, 1);
        
        this.gbc.insets.top = 3;
        this.campoDescricao = new JTextArea(0, 30);
        this.campoDescricao.setLineWrap(true);
        this.campoDescricao.setWrapStyleWord(true);
        this.gbc.ipady = 100;
        JScrollPane scrollCDesc = new JScrollPane(this.campoDescricao);
        this.AddComponente(scrollCDesc, esq, hor, 6, 0, 6, 1);
        this.gbc.ipady = 0;
        
        this.gbc.insets.top = 15;
        this.lbPalavsChave = new JLabel("Palavras-chave(mínimo  2)");
        this.AddComponente(lbPalavsChave, esq, nenhum, 7, 0, 3, 1);
        
        this.gbc.insets.top = 3;
        this.campoPalavsChave = new JTextField(30);
        this.AddComponente(campoPalavsChave, esq, hor, 8, 0, 6, 1);
        
        this.gbc.insets.left = 30;
        this.gbc.ipadx  = 100;
        
        this.gbc.insets.top = 30;
        this.gbc.insets.left = 3;
        this.gbc.insets.right = 5;
        this.gbc.ipadx  = 100;
        this.btnSalvar = new JButton("Salvar");
        this.AddComponente(btnSalvar, esq, nenhum, 9, 0, 6, 1);
        
        this.gbc.ipadx = 90;
        this.gbc.insets.right = 3;
        this.gbc.insets.left = 10;
        this.btnSair = new JButton("Cancelar");
        this.AddComponente(btnSair, dir, nenhum, 9, 0, 6, 1);
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