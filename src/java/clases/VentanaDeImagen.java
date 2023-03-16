package clases;

import java.awt.*;
import static java.awt.Frame.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 * @author Matias
 */
public class VentanaDeImagen extends javax.swing.JDialog {

    public VentanaDeImagen(java.awt.Frame parent, boolean modal, String url, BufferedImage imagenConvertida) {
        super(parent, modal);
        initComponents();

        setTitle("Brolto - Muestra de Imagen Agrandada");
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon imagenFondo = new ImageIcon("src/java/img/fondo.jpg");
        Icon iconoFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo1.getWidth(), fondo1.getHeight(), Image.SCALE_DEFAULT));
        fondo1.setIcon(iconoFondo);

        if (url.isEmpty() == false) {
            ImageIcon imagenRecibida = new ImageIcon(url);
            Icon iconoRecibido = new ImageIcon(imagenRecibida.getImage().getScaledInstance(VistaImagen.getWidth(), VistaImagen.getHeight(), Image.SCALE_DEFAULT));
            VistaImagen.setIcon(iconoRecibido);
        } else {
            ImageIcon imagenRecibida = new ImageIcon(imagenConvertida);
            Icon iconoRecibido = new ImageIcon(imagenRecibida.getImage().getScaledInstance(VistaImagen.getWidth(), VistaImagen.getHeight(), Image.SCALE_DEFAULT));
            VistaImagen.setIcon(iconoRecibido);
        }

    }

    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ConcesionarioBroltoBlanco.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new javax.swing.JPanel();
        Cerrar1 = new javax.swing.JLabel();
        body1 = new javax.swing.JPanel();
        VistaImagen = new javax.swing.JLabel();
        leyenda1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(450, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header1.setBackground(new java.awt.Color(51, 51, 51));
        header1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar1.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Cerrar1.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar1.setText("X");
        Cerrar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Cerrar1.setOpaque(true);
        Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cerrar1MouseExited(evt);
            }
        });
        header1.add(Cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        body1.setBackground(new java.awt.Color(102, 102, 102));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body1.add(VistaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 370));

        leyenda1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda1.setForeground(new java.awt.Color(255, 255, 255));
        leyenda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda1.setText("© Derechos reservados a Matias Abregú - 2023");
        body1.add(leyenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 550, 20));

        fondo1.setBackground(new java.awt.Color(102, 102, 102));
        body1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        getContentPane().add(body1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 550, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_Cerrar1MouseClicked

    private void Cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseEntered
        Cerrar1.setBackground(new Color(200, 70, 70));
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_Cerrar1MouseEntered

    private void Cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseExited
        Cerrar1.setBackground(null);
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_Cerrar1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar1;
    private javax.swing.JLabel VistaImagen;
    private javax.swing.JPanel body1;
    private javax.swing.JLabel fondo1;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel leyenda1;
    // End of variables declaration//GEN-END:variables
}
