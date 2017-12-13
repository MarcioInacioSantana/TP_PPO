package gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroUsuario extends JFrame implements ActionListener{
    private JLabel lbNome;
    private JLabel lbEmail;
    private JLabel lbSenha;
    private JLabel lbConfSenha;
    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextField campoSenha;
    private JTextField campoConfSenha;
    private JButton btnSalvar;
    private JButton btnSair;
    
    private GridBagLayout gbl;
    private GridBagConstraints gbc;
    
    private TelaPrincipal telaPrincipal;
    
    public TelaCadastroUsuario(TelaPrincipal tp){
        super("Cadastrar usuário");
        
        super.setIconImage((new ImageIcon(this.getClass().
                getResource("/img/iconAddUser.png"))).getImage());
        
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setSize(500, 180);
        super.setResizable(false);
        
        this.gbl = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        super.setLayout(gbl);
        
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                getTelaPrincipal().setEnabled(true);
            }
        });
        
        this.telaPrincipal = tp;
        
        this.montarTela();
    }
    
    public TelaCadastroUsuario getTelaCadastroUsuario(){
        return this;
    }

    public TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }
    
    private void montarTela(){
        int esq = GridBagConstraints.WEST;
        int dir = GridBagConstraints.EAST;
        int cent = GridBagConstraints.CENTER;
        int hor = GridBagConstraints.HORIZONTAL;
        int nenhum = GridBagConstraints.NONE;
        
        this.gbc.insets = new Insets(5, 3, 3, 3);
        
        this.lbNome = new JLabel("Nome:");
        this.AddComponente(lbNome, dir, nenhum, 0, 0, 1, 1);
        
        this.gbc.insets.top = 3;
        
        this.lbEmail = new JLabel("Email:");
        this.AddComponente(lbEmail, dir, nenhum, 1, 0, 1, 1);
        
        this.lbSenha = new JLabel("Senha:");
        this.AddComponente(lbSenha, dir, nenhum, 2, 0, 1, 1);
        
        this.gbc.insets.top = 5;
        this.campoNome = new JTextField(30);
        this.AddComponente(campoNome, esq, hor, 0, 1, 5, 1);
        
        this.gbc.insets.top = 3;
        this.campoEmail = new JTextField(30);
        this.AddComponente(campoEmail, esq, hor, 1, 1, 5, 1);
        
        this.campoSenha = new JTextField(8);
        this.AddComponente(campoSenha, esq, nenhum, 2, 1, 1, 1);
        
        this.gbc.insets.left = 40;
        this.lbConfSenha = new JLabel("Confirmar Senha:");
        this.AddComponente(lbConfSenha, dir, nenhum, 2, 4, 1, 1);
        
        this.gbc.insets.left = 3;
        this.campoConfSenha = new JTextField(8);
        this.AddComponente(campoConfSenha, dir, nenhum, 2, 5, 1, 1);
        
        this.gbc.insets.top = 20;
        this.gbc.insets.right = 5;
        this.gbc.ipadx  = 100;
        this.btnSalvar = new JButton("Salvar");
        this.AddComponente(btnSalvar, esq, nenhum, 4, 0, 6, 1);
        
        this.gbc.ipadx = 110;
        this.gbc.insets.right = 3;
        this.gbc.insets.left = 10;
        this.btnSair = new JButton("Sair");
        this.AddComponente(btnSair, dir, nenhum, 4, 0, 6, 1);
        this.btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getTelaPrincipal().setEnabled(true);
                getTelaCadastroUsuario().dispose();
            }
        });
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
