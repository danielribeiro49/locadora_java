/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu.java
 *
 * Created on 21/10/2009, 20:05:53
 */

package Telas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class Menu extends javax.swing.JFrame {

    /** Creates new form Menu */
    public Menu() {
        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        adicionarCliente = new javax.swing.JMenuItem();
        adicionarFilme = new javax.swing.JMenuItem();
        adicionarAluguel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        consultaCliente = new javax.swing.JMenuItem();
        consultaFilme = new javax.swing.JMenuItem();
        consultaAluguel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Adicionar");

        adicionarCliente.setText("Cliente");
        adicionarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adicionarClienteMousePressed(evt);
            }
        });
        jMenu1.add(adicionarCliente);

        adicionarFilme.setText("Filme");
        adicionarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adicionarFilmeMousePressed(evt);
            }
        });
        jMenu1.add(adicionarFilme);

        adicionarAluguel.setText("Aluguel");
        adicionarAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adicionarAluguelMousePressed(evt);
            }
        });
        jMenu1.add(adicionarAluguel);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Consultar");

        consultaCliente.setText("Cliente");
        consultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consultaClienteMousePressed(evt);
            }
        });
        jMenu4.add(consultaCliente);

        consultaFilme.setText("Filme");
        consultaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consultaFilmeMousePressed(evt);
            }
        });
        jMenu4.add(consultaFilme);

        consultaAluguel.setText("Aluguel");
        consultaAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consultaAluguelMousePressed(evt);
            }
        });
        jMenu4.add(consultaAluguel);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarClienteMousePressed
        CadastroCliente cadCliente = null;
        cadCliente = new CadastroCliente(this, false);
    }//GEN-LAST:event_adicionarClienteMousePressed

    private void adicionarFilmeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarFilmeMousePressed
        CadastroFilme cadFilme = null;
        cadFilme = new CadastroFilme(this, false);
    }//GEN-LAST:event_adicionarFilmeMousePressed

    private void adicionarAluguelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarAluguelMousePressed
        CadastroAluguel cadAluguel = null;
        cadAluguel = new CadastroAluguel(this, false);
    }//GEN-LAST:event_adicionarAluguelMousePressed

    private void consultaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaClienteMousePressed
        ConsultaCliente conCliente = null;
        try {
            conCliente = new ConsultaCliente(this, false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultaClienteMousePressed

    private void consultaFilmeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaFilmeMousePressed
        ConsultaFilme conFilme = null;
        try {
            conFilme = new ConsultaFilme(this, false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultaFilmeMousePressed

    private void consultaAluguelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaAluguelMousePressed
        ConsultaAluguel conAluguel = null;
        try {
            conAluguel = new ConsultaAluguel(this, false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultaAluguelMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem adicionarAluguel;
    private javax.swing.JMenuItem adicionarCliente;
    private javax.swing.JMenuItem adicionarFilme;
    private javax.swing.JMenuItem consultaAluguel;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JMenuItem consultaFilme;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
