package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame implements ActionListener{
    
    private JButton btnLogin;
    private JButton btnCadastrar;
    private JButton btnSair;
    
    private GridBagLayout gbl;
    private GridBagConstraints gbc;
    
    public TelaPrincipal(){
        super("Gerenciador de livros");
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setIconImage(new ImageIcon(this.getClass().
                getResource("/img/mainIcon.png")).getImage());
        super.setBackground(Color.BLUE);
        this.gbl = new GridBagLayout();
        super.setLayout(gbl);
        this.gbc = new GridBagConstraints();
        this.MontarTela();
    }
    
    public TelaPrincipal getTelaPrincipal(){
        return this;
    }
    
    public void MontarTela(){
        int esq = GridBagConstraints.WEST;
        int dir = GridBagConstraints.EAST;
        int cent = GridBagConstraints.CENTER;
        int hor = GridBagConstraints.HORIZONTAL;
        int nenhum = GridBagConstraints.NONE;
        
        this.gbc.insets = new Insets(3, 3, 3, 3);
        
        this.btnLogin = new JButton("Login");
        this.btnLogin.setPreferredSize(new Dimension(300, 30));
        this.AddComponente(this.btnLogin, cent, nenhum, 0, 0, 2, 1);
        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TelaLogin telaLogin = new TelaLogin(getTelaPrincipal());
                telaLogin.setVisible(true);
                telaLogin.setLocationRelativeTo(null);
                getTelaPrincipal().setEnabled(false);
            }
        });
        
        this.gbc.insets.top = 80;
        
        this.btnCadastrar = new JButton("Cadastrar-se");
        this.btnCadastrar.setPreferredSize(new Dimension(300, 30));
        this.AddComponente(this.btnCadastrar, cent, nenhum, 1, 0, 2, 1);
        this.btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TelaCadastroUsuario tlCadUsuario = new TelaCadastroUsuario(getTelaPrincipal());
                tlCadUsuario.setVisible(true);
                tlCadUsuario.setLocationRelativeTo(null);
                getTelaPrincipal().setEnabled(false);
            }
        });
        
        this.gbc.insets.top = 80;
        
        this.btnSair = new JButton("Sair");
        this.btnSair.setPreferredSize(new Dimension(300, 30));
        this.AddComponente(this.btnSair, cent, nenhum, 2, 1, 1, 1);
        this.btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getTelaPrincipal().dispose();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
