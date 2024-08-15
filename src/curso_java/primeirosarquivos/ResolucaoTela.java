package src.primeirosarquivos;

import java.awt.Dimension;
import java.awt.*;
public class ResolucaoTela {
    public static void main(String[] args){
         Toolkit t = Toolkit.getDefaultToolkit();
         Dimension d = t.getScreenSize();
         System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
    }
}
