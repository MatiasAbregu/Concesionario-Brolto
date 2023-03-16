package clases;

import java.awt.*;
import javax.swing.*;

/**
 * @author Matias
 */
public class InterfazCRUD extends javax.swing.JFrame {

    private int x, y;
    private String usuario = "";

    public InterfazCRUD(String usuarioRecibido) {
        initComponents();
        setTitle("CRUD - Brolto");
        setLocationRelativeTo(null);
        setResizable(false);
        
        usuario = usuarioRecibido;
        labelBienvenida.setText("Bienvenido: " + usuario);

        Create.setOpaque(true);
        Read.setOpaque(true);
        Update.setOpaque(true);
        Delete.setOpaque(true);
        Create.setBackground(new Color(0,0,0,0));
        Read.setBackground(new Color(0,0,0,0));
        Update.setBackground(new Color(0,0,0,0));
        Delete.setBackground(new Color(0,0,0,0));
        
        ImageIcon fondoIcono = new ImageIcon("src/java/img/fondo.jpg");
        ImageIcon createIcono = new ImageIcon("src/java/img/create.png");
        ImageIcon readIcono = new ImageIcon("src/java/img/Read.png");
        ImageIcon updateIcono = new ImageIcon("src/java/img/update.png");
        ImageIcon deleteIcono = new ImageIcon("src/java/img/Delete.png");

        Icon iconoFondo = new ImageIcon(fondoIcono.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        Icon iconoCreate = new ImageIcon(createIcono.getImage().getScaledInstance(Create.getWidth(), Create.getHeight(), Image.SCALE_DEFAULT));
        Icon iconoRead = new ImageIcon(readIcono.getImage().getScaledInstance(Read.getWidth(), Read.getHeight(), Image.SCALE_DEFAULT));
        Icon iconoUpdate = new ImageIcon(updateIcono.getImage().getScaledInstance(Update.getWidth(), Update.getHeight(), Image.SCALE_DEFAULT));
        Icon iconoDelete = new ImageIcon(deleteIcono.getImage().getScaledInstance(Delete.getWidth(), Delete.getHeight(), Image.SCALE_DEFAULT));

        fondo.setIcon(iconoFondo);
        Create.setIcon(iconoCreate);
        Read.setIcon(iconoRead);
        Update.setIcon(iconoUpdate);
        Delete.setIcon(iconoDelete);
    }

    @Override
    public Image getIconImage() {
        return getToolkit().getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ConcesionarioBroltoBlanco.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        labelBienvenida = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        leyenda = new javax.swing.JLabel();
        Create = new javax.swing.JLabel();
        Update = new javax.swing.JLabel();
        Read = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        SignOut = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setBackground(new java.awt.Color(51, 51, 51));
        Minimizar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("-");
        Minimizar.setOpaque(true);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });
        header.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        Cerrar.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
        Cerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Cerrar.setOpaque(true);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        header.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        labelBienvenida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenida.setText("Bienvenido: ");
        header.add(labelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        body.setBackground(new java.awt.Color(102, 102, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2023");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 20));

        Create.setBackground(new java.awt.Color(240, 240, 240));
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateMouseExited(evt);
            }
        });
        body.add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 100));

        Update.setBackground(new java.awt.Color(240, 240, 240));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        body.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 100, 100));

        Read.setBackground(new java.awt.Color(240, 240, 240));
        Read.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReadMouseExited(evt);
            }
        });
        body.add(Read, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, 100));

        Delete.setBackground(new java.awt.Color(240, 240, 240));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        body.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 100, 100));

        SignOut.setBackground(new java.awt.Color(51, 51, 51));
        SignOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SignOut.setForeground(new java.awt.Color(255, 255, 255));
        SignOut.setText("Cerrar Sesión");
        SignOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        SignOut.setFocusable(false);
        SignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignOutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignOutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SignOutMouseReleased(evt);
            }
        });
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        body.add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, 30));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        Minimizar.setBackground(new Color(150, 150, 150));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        Minimizar.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_MinimizarMouseExited

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setBackground(new Color(200, 70, 70));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_CerrarMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int xLocal = evt.getXOnScreen();
        int yLocal = evt.getYOnScreen();
        setCursor(new Cursor(MOVE_CURSOR));

        this.setLocation(xLocal - x, yLocal - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_formMouseReleased

    private void CreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseEntered
        Create.setBackground(new Color(240, 240, 240));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_CreateMouseEntered

    private void CreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseExited
        Create.setBackground(new Color(0,0,0,0));
        repaint();
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_CreateMouseExited

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        Update.setBackground(new Color(240, 240, 240));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update.setBackground(new Color(0,0,0,0));
        repaint();
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_UpdateMouseExited

    private void ReadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadMouseEntered
        Read.setBackground(new Color(240, 240, 240));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_ReadMouseEntered

    private void ReadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadMouseExited
        Read.setBackground(new Color(0,0,0,0));
        repaint();
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_ReadMouseExited

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete.setBackground(new Color(240, 240, 240));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(new Color(0,0,0,0));
        repaint();
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_DeleteMouseExited

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        InterfazCreate vc = new InterfazCreate(usuario);
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreateMouseClicked

    private void SignOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_SignOutMouseEntered

    private void SignOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_SignOutMouseExited

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        InterfazInicio II = new InterfazInicio();
        II.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignOutActionPerformed

    private void SignOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMousePressed
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_SignOutMousePressed

    private void SignOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_SignOutMouseReleased

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
       InterfazUpdate iu = new InterfazUpdate(usuario);
       iu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_UpdateMouseClicked

    private void ReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadMouseClicked
        InterfazRead ir =new InterfazRead(usuario);
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReadMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
       InterfazDelete id = new InterfazDelete(usuario);
       id.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_DeleteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Create;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Read;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel Update;
    private javax.swing.JPanel body;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel leyenda;
    // End of variables declaration//GEN-END:variables
}
