package bd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosPrincipais.Usuario;

public class ArquivoUsuarios {
    File arqUsuarios;
    ArrayList<Usuario> usuarios; 
    
    public ArquivoUsuarios(){
        this.arqUsuarios = new File("arqUsuarios.bin");
        this.carregarUsuarios();
    }
    
    private void carregarUsuarios(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new 
                FileInputStream(this.arqUsuarios));
            
            Usuario usuario;
            while(usuarios != null){
                usuario = (Usuario) ois.readObject();
                this.usuarios.add(usuario);
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArquivoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
