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


public class TelaLogin extends JFrame implements ActionListener{
    private JLabel lbEmail;
    private JLabel lbSenha;
    private JTextField campoEmail;
    private JTextField campoSenha;
    
    private JButton btnNovoUsuario;
    private JButton btnEntrar;
    private JButton btnSair;
    
    private GridBagLayout gbl;
    private GridBagConstraints gbc;
    
    private TelaPrincipal telaPrincipal;
    
    public TelaLogin(TelaPrincipal tp){
        super("Autenticar usuário");
        
        super.setIconImage((new ImageIcon(this.getClass().
                getResource("/img/UserAutenticationIcon.png"))).getImage());
        
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Para tornar a tela princiapl ativa novamente após o fechamento desta tela
        this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    getTelaLogin().telaPrincipal.setEnabled(true);
                }
            });
        
        super.setSize(500, 180);
        super.setResizable(false);
        
        this.gbl = new GridBagLayout();
        this.gbc = new GridBagConstraints();
        super.setLayout(gbl);
        
        this.telaPrincipal = tp;
        
        this.MontarTela();
    }
    
    public TelaLogin getTelaLogin(){
        return this;
    }

    public TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }
    
    private void MontarTela(){
        int esq = GridBagConstraints.WEST;
        int dir = GridBagConstraints.EAST;
        int cent = GridBagConstraints.CENTER;
        int hor = GridBagConstraints.HORIZONTAL;
        int nenhum = GridBagConstraints.NONE;
        
        this.gbc.insets = new Insets(5, 3, 3, 3);
        
        this.gbc.insets.top = 5;
        this.lbEmail = new JLabel("Email:");
        this.AddComponente(lbEmail, dir, nenhum, 0, 0, 1, 1);
        
        this.lbSenha = new JLabel("Senha:");
        this.AddComponente(lbSenha, dir, nenhum, 1, 0, 1, 1);
        
        this.gbc.insets.top = 5;
        this.campoEmail = new JTextField(30);
        this.AddComponente(campoEmail, esq, hor, 0, 1, 5, 1);
        
        this.campoSenha = new JTextField(8);
        this.AddComponente(campoSenha, esq, nenhum, 1, 1, 1, 1);
        
        this.gbc.insets.left = 30;
        this.gbc.ipadx  = 100;
        this.btnNovoUsuario = new JButton("Novo usuário");
        this.AddComponente(btnNovoUsuario, esq, nenhum, 1, 3, 2, 1);
        
        this.gbc.insets.top = 20;
        this.gbc.insets.left = 3;
        this.gbc.insets.right = 5;
        this.gbc.ipadx  = 100;
        this.btnEntrar = new JButton("Entrar");
        this.AddComponente(btnEntrar, esq, nenhum, 2, 0, 6, 1);
        
        this.gbc.ipadx = 110;
        this.gbc.insets.right = 3;
        this.gbc.insets.left = 10;
        this.btnSair = new JButton("Sair");
        this.AddComponente(btnSair, dir, nenhum, 2, 0, 6, 1);
        this.btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getTelaPrincipal().setEnabled(true);
                getTelaLogin().dispose();
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