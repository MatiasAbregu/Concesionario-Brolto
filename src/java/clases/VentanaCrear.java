package clases;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Matias
 */
public class VentanaCrear extends javax.swing.JFrame {

    private int x, y;
    private String usuario = "";
    private File imagenSeleccionada = null;
    private ImageIcon imagenMuestra;
    private Icon iconoMuestra;

    public VentanaCrear(String usuarioRecibido) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        usuario = usuarioRecibido;
        setTitle("Ventana de Creación - Brolto - Usuario: " + usuario);
        labelBienvenida.setText(getTitle());

        String texto = "<html>" + "Solo archivos:" + "<br>" + ".png" + "<br>" + ".jpg" + "<br>" + ".jpeg" + "</html>";

        labelConTiposDeDatos.setText(texto);

        ImageIcon fondoImg = new ImageIcon("src/java/img/fondo.jpg");
        Icon fondoIcon = new ImageIcon(fondoImg.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fondoIcon);
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
        Volver = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        leyenda = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        labelModelo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        labelVistaPrevia = new javax.swing.JLabel();
        VistaImagen = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        botonImagen = new javax.swing.JButton();
        labelConTiposDeDatos = new javax.swing.JLabel();
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

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2023");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 620, 20));

        Crear.setBackground(new java.awt.Color(51, 51, 51));
        Crear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Crear");
        Crear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Crear.setFocusPainted(false);
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CrearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CrearMouseReleased(evt);
            }
        });
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        body.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 335, 160, 30));

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
        body.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 90, -1));

        labelImagen.setBackground(new java.awt.Color(51, 51, 51));
        labelImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelImagen.setForeground(new java.awt.Color(255, 255, 255));
        labelImagen.setText("Imagen:");
        body.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        labelVistaPrevia.setBackground(new java.awt.Color(51, 51, 51));
        labelVistaPrevia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        labelVistaPrevia.setText("Vista previa (Imagen):");
        body.add(labelVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        VistaImagen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        VistaImagen.setForeground(new java.awt.Color(255, 255, 255));
        VistaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VistaImagen.setText("Aqui se cargara la imagen");
        VistaImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VistaImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VistaImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VistaImagenMouseExited(evt);
            }
        });
        body.add(VistaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 110));

        textModelo.setBackground(new java.awt.Color(51, 51, 51));
        textModelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textModelo.setForeground(new java.awt.Color(255, 255, 255));
        textModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textModelo.setCaretColor(new java.awt.Color(255, 255, 255));
        textModelo.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 220, 25));

        textMarca.setBackground(new java.awt.Color(51, 51, 51));
        textMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMarca.setForeground(new java.awt.Color(255, 255, 255));
        textMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textMarca.setCaretColor(new java.awt.Color(255, 255, 255));
        textMarca.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 25));

        textDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        textDescripcion.setColumns(20);
        textDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        textDescripcion.setRows(5);
        textDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        textDescripcion.setSelectionColor(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(textDescripcion);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 270, 260));

        botonImagen.setBackground(new java.awt.Color(51, 51, 51));
        botonImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonImagen.setForeground(new java.awt.Color(255, 255, 255));
        botonImagen.setText("Cargar Imagen");
        botonImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        botonImagen.setFocusPainted(false);
        botonImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonImagenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonImagenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonImagenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonImagenMouseReleased(evt);
            }
        });
        botonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenActionPerformed(evt);
            }
        });
        body.add(botonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 30));

        labelConTiposDeDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelConTiposDeDatos.setForeground(new java.awt.Color(255, 255, 255));
        labelConTiposDeDatos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        body.add(labelConTiposDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 140, 80));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, 390));

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

    private void botonImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonImagenMouseClicked

    private void botonImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonImagenMouseEntered

    private void botonImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonImagenMouseExited

    private void botonImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMousePressed
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonImagenMousePressed

    private void botonImagenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonImagenMouseReleased

    private void botonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenActionPerformed

        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtroDeArchivos = new FileNameExtensionFilter("Archivos .png, .jpg, .jpeg", "png", "jpg", "jpeg");
        fc.setFileFilter(filtroDeArchivos);

        int aprobado = fc.showOpenDialog(Crear);

        if (aprobado == JFileChooser.APPROVE_OPTION) {
            imagenSeleccionada = fc.getSelectedFile();

            if (imagenSeleccionada.getAbsolutePath().contains(".png") || imagenSeleccionada.getAbsolutePath().contains(".jpg") || imagenSeleccionada.getAbsolutePath().contains(".jpeg")) {
                imagenMuestra = new ImageIcon(imagenSeleccionada.getAbsolutePath());
                iconoMuestra = new ImageIcon(imagenMuestra.getImage().getScaledInstance(VistaImagen.getWidth(), VistaImagen.getHeight(), Image.SCALE_DEFAULT));
                VistaImagen.setText("");
                VistaImagen.setIcon(iconoMuestra);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo con las extensiones ya mencionadas.");
            }
        }
    }//GEN-LAST:event_botonImagenActionPerformed

    private void VistaImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseClicked
        if (imagenSeleccionada != null) {
            VentanaDeImagen ventanaImagen = new VentanaDeImagen(this, true, imagenSeleccionada.getAbsolutePath());
            ventanaImagen.setVisible(true);
        }
    }//GEN-LAST:event_VistaImagenMouseClicked

    private void VistaImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseEntered
        if (imagenSeleccionada != null) {
            setCursor(new Cursor(HAND_CURSOR));
        }
    }//GEN-LAST:event_VistaImagenMouseEntered

    private void VistaImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseExited
        if (imagenSeleccionada != null) {
            setCursor(new Cursor(NORMAL));
        }
    }//GEN-LAST:event_VistaImagenMouseExited

    private void CrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_CrearMouseEntered

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        if (textModelo.getText() != null && textMarca.getText() != null && textDescripcion.getText() != null && imagenSeleccionada != null) {  
            
            try{
                byte[] bytes = Files.readAllBytes(Paths.get(imagenSeleccionada.getAbsolutePath()));
                Blob imagenBlob = new SerialBlob(bytes);
                
                Conexion cn = new Conexion();
                PreparedStatement pst = cn.conectar().prepareStatement("insert into vehiculos(Modelo, Marca, Descripcion, Imagen) values (?, ?, ?, ?)");
                
                pst.setString(1, textModelo.getText());
                pst.setString(2, textMarca.getText().trim());
                pst.setString(3, textDescripcion.getText());
                pst.setBlob(4, imagenBlob);
                
                pst.executeUpdate();
                
                cn.conectar().close();
                pst.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "¡Hubo un error en la base de datos!");
                System.out.println(e);
            } catch (IOException ex) {
                Logger.getLogger(VentanaCrear.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "¡Se creó con éxito!");
            textModelo.setText("");
            textMarca.setText("");
            textDescripcion.setText("");
            VistaImagen.setText("Aqui se cargara la imagen");
            imagenSeleccionada = null;
            VistaImagen.setIcon(null);
            
        } else {
            JOptionPane.showMessageDialog(null, "¡No se pudo completar la operación porque un campo no se rellenó!");
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void CrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_CrearMouseExited

    private void CrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMousePressed
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_CrearMousePressed

    private void CrearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_CrearMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel VistaImagen;
    private javax.swing.JLabel Volver;
    private javax.swing.JPanel body;
    private javax.swing.JButton botonImagen;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelConTiposDeDatos;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelVistaPrevia;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    // End of variables declaration//GEN-END:variables
}
