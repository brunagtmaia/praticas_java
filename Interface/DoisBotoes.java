package Interface;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
/* A classe DoisBotoes é a principal e contém o método main que instancia um
objeto da mesma classe e chama o método vai(). O método vai() cria uma nova
janela e adiciona os componentes usando o gerenciador de layout
BorderLayout.*/
public class DoisBotoes{
    JFrame quadro;
    JLabel rotulo;

    public static void main(String[] args){
        DoisBotoes gui = new DoisBotoes();
        gui.vai();
    }

    public void vai(){
        quadro = new JFrame();
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btnRotulo = new JButton("Altera Rotulo");
        btnRotulo.addActionListener(new RotuloListener());
        /* O botão "Altera Rotulo" é responsável por alterar o texto do rótulo quando
        pressionado. */
        JButton btnMensagem = new JButton("Exibe Mensagem");
        btnMensagem.addActionListener(new MensagemListener());
        /* O botão "Exibe Mensagem" abre uma caixa de diálogo mostrando uma mensagem
        de parabéns.*/
        rotulo = new JLabel("Eu sou um rótulo!");
        quadro.getContentPane().add(BorderLayout.SOUTH, btnMensagem);
        quadro.getContentPane().add(BorderLayout.NORTH, btnRotulo);
        quadro.getContentPane().add(BorderLayout.WEST,rotulo);
        quadro.setSize(300,300);
        quadro.setVisible(true);
    }

    /* As classes internas RotuloListener e MensagemListener implementam a interface ActionListener e são responsáveis por executar ações quando os botões são pressionados. O método actionPerformed() é chamado quando um evento de ação é disparado em um dos botões.*/
    class RotuloListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
        rotulo.setText("Mudando...");
        }
    }
    class MensagemListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Parabens, tudo funcionando bem!");
        }
    }


}