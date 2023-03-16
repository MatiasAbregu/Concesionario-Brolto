package clases;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Matias
 */
public class InterfazUpdate extends javax.swing.JFrame {

    private String usuario;
    private int x, y, tipoImagen, ID;
    private BufferedImage imagenConvertida;
    private File imagenSeleccionada;

    public InterfazUpdate(String usuarioRecibido) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        usuario = usuarioRecibido;
        setTitle("Ventana de Actualización - Brolto - Usuario: " + usuario);
        labelBienvenida.setText(getTitle());

        ImageIcon imagenFondo = new ImageIcon("src/java/img/fondo.jpg");
        Icon iconoFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
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
        leyenda = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        labelModelo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        labelVistaPrevia = new javax.swing.JLabel();
        VistaImagen = new javax.swing.JLabel();
        textBuscarID = new javax.swing.JTextField();
        textModelo = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        botonImagen = new javax.swing.JButton();
        labelConTiposDeDatos = new javax.swing.JLabel();
        labelBuscarID = new javax.swing.JLabel();
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
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 620, 20));

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        botonBuscar.setFocusPainted(false);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBuscarMouseReleased(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        body.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 28, 100, 25));

        botonActualizar.setBackground(new java.awt.Color(51, 51, 51));
        botonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        botonActualizar.setEnabled(false);
        botonActualizar.setFocusPainted(false);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonActualizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonActualizarMouseReleased(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        body.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 160, 30));

        labelModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(255, 255, 255));
        labelModelo.setText("Modelo:");
        body.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, -1));

        labelMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(255, 255, 255));
        labelMarca.setText("Marca:");
        body.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        labelDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripción:");
        body.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, -1));

        labelImagen.setBackground(new java.awt.Color(51, 51, 51));
        labelImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelImagen.setForeground(new java.awt.Color(255, 255, 255));
        labelImagen.setText("Imagen:");
        body.add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        labelVistaPrevia.setBackground(new java.awt.Color(51, 51, 51));
        labelVistaPrevia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        labelVistaPrevia.setText("Vista previa (Imagen):");
        body.add(labelVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 220, 160, -1));

        VistaImagen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        VistaImagen.setForeground(new java.awt.Color(255, 255, 255));
        VistaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VistaImagen.setText("Aqui se cargará la imagen");
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
        body.add(VistaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, 110));

        textBuscarID.setBackground(new java.awt.Color(51, 51, 51));
        textBuscarID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textBuscarID.setForeground(new java.awt.Color(255, 255, 255));
        textBuscarID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textBuscarID.setCaretColor(new java.awt.Color(255, 255, 255));
        textBuscarID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textBuscarID.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 28, 160, 25));

        textModelo.setEditable(false);
        textModelo.setBackground(new java.awt.Color(51, 51, 51));
        textModelo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textModelo.setForeground(new java.awt.Color(255, 255, 255));
        textModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textModelo.setCaretColor(new java.awt.Color(255, 255, 255));
        textModelo.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 25));

        textMarca.setEditable(false);
        textMarca.setBackground(new java.awt.Color(51, 51, 51));
        textMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textMarca.setForeground(new java.awt.Color(255, 255, 255));
        textMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textMarca.setCaretColor(new java.awt.Color(255, 255, 255));
        textMarca.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 25));

        textDescripcion.setEditable(false);
        textDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        textDescripcion.setColumns(20);
        textDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        textDescripcion.setRows(5);
        textDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        textDescripcion.setSelectionColor(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(textDescripcion);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 270, 260));

        botonImagen.setBackground(new java.awt.Color(51, 51, 51));
        botonImagen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonImagen.setForeground(new java.awt.Color(255, 255, 255));
        botonImagen.setText("Cargar Imagen");
        botonImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        botonImagen.setEnabled(false);
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
        body.add(botonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 30));

        labelConTiposDeDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelConTiposDeDatos.setForeground(new java.awt.Color(255, 255, 255));
        labelConTiposDeDatos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        body.add(labelConTiposDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 140, 80));

        labelBuscarID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelBuscarID.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarID.setText("Buscar por ID:");
        body.add(labelBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 420));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, 420));

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

    private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonActualizarMouseEntered

    private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonActualizarMouseExited

    private void botonActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMousePressed
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonActualizarMousePressed

    private void botonActualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseReleased
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonActualizarMouseReleased

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        Conexion cn;
                
        if (tipoImagen == 1) { //Imagen Buffered
            try {
                cn = new Conexion();
                PreparedStatement pst = cn.conectar().prepareStatement("UPDATE vehiculos SET Modelo = ?, Marca = ?, Descripcion = ? where ID = ?");
                pst.setString(1, textModelo.getText());
                pst.setString(2, textMarca.getText());
                pst.setString(3, textDescripcion.getText());
                pst.setInt(4, ID);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "¡Datos actualizados correctamente!");
                
                textModelo.setEditable(false);
                textMarca.setEditable(false);
                textDescripcion.setEditable(false);
                botonImagen.setEnabled(false);
                botonActualizar.setEnabled(false);

                tipoImagen = 0;
                imagenConvertida = null;
                imagenSeleccionada = null;
                textModelo.setText("");
                textMarca.setText("");
                textDescripcion.setText("");
                VistaImagen.setIcon(null);
                VistaImagen.setText("Aqui se cargará la imagen");

                cn.conectar().close();
                pst.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Hubo un error en la base de datos!");
            }
        } else { //Imagen Nueva
            try {
                cn = new Conexion();
                PreparedStatement pst = cn.conectar().prepareStatement("UPDATE vehiculos SET Modelo = ?, Marca = ?, Descripcion = ?, Imagen = ? where ID = ?");
                pst.setString(1, textModelo.getText());
                pst.setString(2, textMarca.getText());
                pst.setString(3, textDescripcion.getText());
                
                byte[] imagenByte = Files.readAllBytes(Paths.get(imagenSeleccionada.getAbsolutePath()));
                Blob imagen = new SerialBlob(imagenByte);
               
                pst.setBlob(4, imagen);
                pst.setInt(5, ID);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "¡Datos actualizados correctamente!");
                
                textModelo.setEditable(false);
                textMarca.setEditable(false);
                textDescripcion.setEditable(false);
                botonImagen.setEnabled(false);
                botonActualizar.setEnabled(false);

                tipoImagen = 0;
                imagenConvertida = null;
                imagenSeleccionada = null;
                textModelo.setText("");
                textMarca.setText("");
                textDescripcion.setText("");
                VistaImagen.setIcon(null);
                VistaImagen.setText("Aqui se cargará la imagen");

                cn.conectar().close();
                pst.close();
            } catch (SQLException ex) {
            } catch (IOException ex) {
            }
            
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void VistaImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseExited
        if (tipoImagen == 1 || tipoImagen == 2) {
            setCursor(new Cursor(NORMAL));
        }
    }//GEN-LAST:event_VistaImagenMouseExited

    private void VistaImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseEntered
        if (tipoImagen == 1 || tipoImagen == 2) {
            setCursor(new Cursor(HAND_CURSOR));
        }
    }//GEN-LAST:event_VistaImagenMouseEntered

    private void VistaImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VistaImagenMouseClicked
        if (tipoImagen == 1) {
            VentanaDeImagen vdi = new VentanaDeImagen(this, true, "", imagenConvertida);
            vdi.setVisible(true);
        } else if (tipoImagen == 2) {
            VentanaDeImagen vdi = new VentanaDeImagen(this, true, imagenSeleccionada.getAbsolutePath(), null);
            vdi.setVisible(true);
        }
    }//GEN-LAST:event_VistaImagenMouseClicked

    private void botonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenActionPerformed

        JFileChooser buscador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .png, .jpg, .jpeg", "png", "jpg", "jpeg");
        buscador.setFileFilter(filtro);

        int aprobado = buscador.showOpenDialog(botonBuscar);

        if (aprobado == buscador.APPROVE_OPTION) {
            imagenSeleccionada = buscador.getSelectedFile();

            if (imagenSeleccionada.getAbsolutePath().contains(".png") || imagenSeleccionada.getAbsolutePath().contains(".jpg") || imagenSeleccionada.getAbsolutePath().contains(".jpeg")) {
                tipoImagen = 2;
                ImageIcon imagenMuestra = new ImageIcon(imagenSeleccionada.getAbsolutePath());
                Icon iconoMuestra = new ImageIcon(imagenMuestra.getImage().getScaledInstance(VistaImagen.getWidth(), VistaImagen.getHeight(), Image.SCALE_DEFAULT));
                VistaImagen.setText("");
                VistaImagen.setIcon(iconoMuestra);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo con las extensiones ya mencionadas.");
            }
        }
    }//GEN-LAST:event_botonImagenActionPerformed

    private void botonImagenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseReleased
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonImagenMouseReleased

    private void botonImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMousePressed
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonImagenMousePressed

    private void botonImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseExited
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonImagenMouseExited

    private void botonImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseEntered
        if (botonActualizar.isEnabled())
            setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonImagenMouseEntered

    private void botonImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonImagenMouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonBuscarMousePressed

    private void botonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_botonBuscarMouseReleased

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (textBuscarID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡El cuadro de texto donde se inserta el ID no puede estar vacio!");
        } else {
            try {
                ID = Integer.parseInt(textBuscarID.getText().trim());

                try {
                    Conexion cn = new Conexion();
                    PreparedStatement pst = cn.conectar().prepareStatement("select * from vehiculos where ID = ?");
                    pst.setInt(1, ID);

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        textModelo.setText(rs.getString(2));
                        textMarca.setText(rs.getString(3));
                        textDescripcion.setText(rs.getString(4));

                        Blob imagen = rs.getBlob(5);
                        InputStream conversorImagen = imagen.getBinaryStream();
                        imagenConvertida = ImageIO.read(conversorImagen);

                        ImageIcon imagenObtenida = new ImageIcon(imagenConvertida);
                        Icon iconoDeImagen = new ImageIcon(imagenConvertida.getScaledInstance(VistaImagen.getWidth(), VistaImagen.getHeight(), Image.SCALE_DEFAULT));
                        VistaImagen.setText("");
                        VistaImagen.setIcon(iconoDeImagen);

                        textModelo.setEditable(true);
                        textMarca.setEditable(true);
                        textDescripcion.setEditable(true);
                        botonImagen.setEnabled(true);
                        botonActualizar.setEnabled(true);

                        tipoImagen = 1;
                        cn.conectar().close();
                        pst.close();
                        rs.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Ese ID no existe, por favor pruebe con otro.");
                        textModelo.setEditable(false);
                        textMarca.setEditable(false);
                        textDescripcion.setEditable(false);
                        botonImagen.setEnabled(false);
                        botonActualizar.setEnabled(false);

                        tipoImagen = 0;
                        imagenConvertida = null;
                        imagenSeleccionada = null;
                        textModelo.setText("");
                        textMarca.setText("");
                        textDescripcion.setText("");
                        VistaImagen.setIcon(null);
                        VistaImagen.setText("Aqui se cargará la imagen");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "¡Hubo un error en la base de datos!");
                    System.out.println(ex.fillInStackTrace());
                } catch (IOException ex) {
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "¡El cuadro de texto donde se inserta el ID solo admite números enteros!");
                textBuscarID.setText("");
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel VistaImagen;
    private javax.swing.JLabel Volver;
    private javax.swing.JPanel body;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonImagen;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelBuscarID;
    private javax.swing.JLabel labelConTiposDeDatos;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelVistaPrevia;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTextField textBuscarID;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    // End of variables declaration//GEN-END:variables
}
