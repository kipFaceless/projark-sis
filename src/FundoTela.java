

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author JuneHendrix
 */
public class FundoTela extends JDesktopPane {
    private Image imagem;
    public FundoTela(String imagem){
       this.imagem = new ImageIcon(imagem).getImage();   
    }
    public void paintcomponent(Graphics g){
        g.drawImage(imagem,0,0, getWidth(), getHeight(), this);
    }
  
}
