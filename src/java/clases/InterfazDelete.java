package clases;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author Matias
 */
public class InterfazDelete extends javax.swing.JFrame {

    private String usuario;
    boolean encontrado = false;

    public InterfazDelete(String usuarioRecibido) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        usuario = usuarioRecibido;
        setTitle("Ventana de Eliminación - Brolto - Usuario: " + usuario);
        labelBienvenida.setText(getTitle());

        labelAdvertencia.setText("<html>" + "ADVERTENCIA: al hacer click en el boton de eliminar no se podran recuperar" + "<br>"
                + "los datos, se pide encarecidamente pensar antes de borrar la información especificada." + "</html>");

        ImageIcon fondoImg = new ImageIcon("src/java/img/fondo.jpg");
        Icon iconoFondo = new ImageIcon(fondoImg.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(iconoFondo);
    }

    @Override
    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ConcesionarioBroltoBlanco.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        labelBienvenida = new javax.swing.JLabel();
        Volver = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        textID = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        labelAdvertencia = new javax.swing.JLabel();
        leyenda = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
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
        header.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

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
        header.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        labelBienvenida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        header.add(labelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 30));

        Volver.setBackground(new java.awt.Color(51, 51, 51));
        Volver.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Volver.setText("←");
        Volver.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Volver.setOpaque(true);
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverMouseExited(evt);
            }
        });
        header.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        body.setBackground(new java.awt.Color(102, 102, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        botonEliminar.setFocusPainted(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        body.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, 25));

        textID.setBackground(new java.awt.Color(51, 51, 51));
        textID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textID.setForeground(new java.awt.Color(255, 255, 255));
        textID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textID.setCaretColor(new java.awt.Color(255, 255, 255));
        textID.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 128, 200, 25));

        labelID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));
        labelID.setText("Buscar por ID vehiculo a eliminar:");
        body.add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        labelAdvertencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAdvertencia.setForeground(new java.awt.Color(255, 255, 255));
        labelAdvertencia.setText("Advertencia: al hacer click en el boton de eliminar no se podra recuperar los datos");
        body.add(labelAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 70));

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2023");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 620, 20));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 320));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, 320));

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

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        InterfazCRUD ICRUD = new InterfazCRUD(usuario);
        ICRUD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverMouseClicked

    private void VolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseEntered
        Volver.setBackground(new Color(150, 150, 150));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_VolverMouseEntered

    private void VolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseExited
        Volver.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_VolverMouseExited

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (textID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡El cuadro de texto ID no puede estar vacio!");
        } else {
            try {
                int ID = Integer.parseInt(textID.getText().trim());
                try {
                    Conexion cn = new Conexion();
                    PreparedStatement pst = cn.conectar().prepareStatement("DELETE from vehiculos where ID = ?");
                    pst.setInt(1, ID);
                    
                   int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar esto? (No hay vuelta atras)", "¡ADVERTENCIA!",JOptionPane.YES_NO_CANCEL_OPTION);
                
                   if(valor == 0){
                       pst.execute();
                       JOptionPane.showMessageDialog(null, "¡Operación completada!");
                   } else {
                       JOptionPane.showMessageDialog(null, "¡Se canceló la operación!");
                   }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "¡Ese ID no existe!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "¡Solo se admiten números como ID!");
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Volver;
    private javax.swing.JPanel body;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelAdvertencia;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTextField textID;
    // End of variables declaration//GEN-END:variables
}
