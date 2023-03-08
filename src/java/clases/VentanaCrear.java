package clases;

import java.awt.*;
import javax.swing.*;

/**
 * @author Matias
 */
public class VentanaCrear extends javax.swing.JFrame {

    private int x, y;
    private String usuario = "";
    
    public VentanaCrear(String usuarioRecibido) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        usuario = usuarioRecibido;
        setTitle("Ventana de Creación - Brolto - Usuario: " + usuario);
        labelBienvenida.setText(getTitle());
        
        ImageIcon fondoImg = new ImageIcon("src/java/img/fondo.jpg");
        Icon fondoIcon = new ImageIcon(fondoImg.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fondoIcon);
    }

    @Override
    public Image getIconImage(){
        return getToolkit().getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ConcesionarioBroltoBlanco.png"));
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
        leyenda = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        labelModelo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
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
        header.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 30, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        body.setBackground(new java.awt.Color(102, 102, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2022");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 20));

        Crear.setBackground(new java.awt.Color(51, 51, 51));
        Crear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Crear");
        body.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, -1));

        labelModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 255, 255));
        labelModelo.setText("Modelo:");
        body.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, -1));

        labelMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(255, 255, 255));
        labelMarca.setText("Marca:");
        body.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        labelDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripción:");
        body.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 90, -1));

        labelImagen.setText("jLabel2");
        body.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        textModelo.setBackground(new java.awt.Color(51, 51, 51));
        textModelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textModelo.setForeground(new java.awt.Color(255, 255, 255));
        textModelo.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 220, 25));

        textMarca.setBackground(new java.awt.Color(51, 51, 51));
        textMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMarca.setForeground(new java.awt.Color(255, 255, 255));
        body.add(textMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 25));

        textDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        textDescripcion.setColumns(20);
        textDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        textDescripcion.setRows(5);
        jScrollPane1.setViewportView(textDescripcion);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 60, 270, 230));

        jScrollPane2.setViewportView(jTextPane1);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, 50));
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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       x = evt.getX();
       y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int yLocal = evt.getYOnScreen();
       int xLocal = evt.getXOnScreen();
        setCursor(new Cursor(MOVE_CURSOR));
       
       this.setLocation(xLocal - x, yLocal - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Volver;
    private javax.swing.JPanel body;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    // End of variables declaration//GEN-END:variables
}
