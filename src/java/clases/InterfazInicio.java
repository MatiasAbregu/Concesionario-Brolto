package clases;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author Matias
 */
public class InterfazInicio extends javax.swing.JFrame {

    private int x, y;

    public InterfazInicio() {
        initComponents();
        setTitle("Inicio Sesión - Brolto");
        setLocationRelativeTo(null);

        ImageIcon logoIcono = new ImageIcon("src/java/img/ConcesionarioBroltoBlanco.png");
        Icon iconoL = new ImageIcon(logoIcono.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        labelLogo.setIcon(iconoL);

        ImageIcon fondoIcono = new ImageIcon("src/java/img/fondo.jpg");
        Icon iconoFondo = new ImageIcon(fondoIcono.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(iconoFondo);
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
        body = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        leyendaInicio = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoContra = new javax.swing.JPasswordField();
        etiquetaContra = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JButton();
        leyenda = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(350, 450));
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
        header.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 30));

        Cerrar.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("X");
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
        header.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        body.setBackground(new java.awt.Color(102, 102, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 180));

        leyendaInicio.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        leyendaInicio.setForeground(new java.awt.Color(255, 255, 255));
        leyendaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyendaInicio.setText("INICIO SESIÓN");
        body.add(leyendaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 350, -1));

        campoUsuario.setBackground(new java.awt.Color(51, 51, 51));
        campoUsuario.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(102, 153, 255));
        campoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuario.setBorder(null);
        campoUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        body.add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 22));

        campoContra.setBackground(new java.awt.Color(51, 51, 51));
        campoContra.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        campoContra.setForeground(new java.awt.Color(102, 153, 255));
        campoContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoContra.setBorder(null);
        campoContra.setCaretColor(new java.awt.Color(204, 204, 204));
        body.add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 190, 22));

        etiquetaContra.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        etiquetaContra.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaContra.setText("Contraseña:");
        body.add(etiquetaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 20));

        etiquetaUsuario.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario.setText("Usuario:");
        body.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 20));

        IniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        IniciarSesion.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.setFocusable(false);
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IniciarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseReleased(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        body.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 364, 180, 30));

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2022");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 350, 20));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int localX = evt.getXOnScreen();
        int localY = evt.getYOnScreen();
        setCursor(new Cursor(MOVE_CURSOR));

        this.setLocation(localX - x, localY - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_formMouseReleased

    private void IniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseClicked
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void IniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMousePressed
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_IniciarSesionMousePressed

    private void IniciarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_IniciarSesionMouseReleased

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        try {
            
            Conexion cn = new Conexion();
            PreparedStatement pst = cn.conectar().prepareStatement("select * from usuarios where Usuario=? and Contra=?");
            pst.setString(1, campoUsuario.getText());
            pst.setString(2, campoContra.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "¡Se ha iniciado sesión!");
            } else {
                JOptionPane.showMessageDialog(null, "¡El usuario o la contraseña es incorrecto!");
            }
            
        } catch (SQLException ex) {
            System.out.println("¡No se pudo conectar a la base de datos!");
        }
    }//GEN-LAST:event_IniciarSesionActionPerformed
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel body;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etiquetaContra;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel leyenda;
    private javax.swing.JLabel leyendaInicio;
    // End of variables declaration//GEN-END:variables
}
