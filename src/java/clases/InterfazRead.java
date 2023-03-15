package clases;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Matias
 */
public class InterfazRead extends javax.swing.JFrame {

    private String usuario;
    private int x, y;

    public InterfazRead(String usuarioRecibido) {
        initComponents();
        usuario = usuarioRecibido;
        JOptionPane.showMessageDialog(null, "¡Para visualizar la imagen se pide encarecidamente que se vea desde el Update, gracias!");
        
        setLocationRelativeTo(null);
        setResizable(false);

        setTitle("Ventana de Lectura - Brolto - Usuario: " + usuario);
        labelBienvenida.setText(getTitle());

        ImageIcon imagenFondo = new ImageIcon("src/java/img/fondo.jpg");
        Icon iconoFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(iconoFondo);

        try {
            Conexion cn = new Conexion();
            Statement st = cn.conectar().createStatement();

            ResultSet rs = st.executeQuery("select * from vehiculos");

            DefaultTableModel modelo = new DefaultTableModel();
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            tablaMuestra = new JTable(modelo);
            jScrollPane1.setViewportView(tablaMuestra);
            dtcr.setHorizontalAlignment((int) CENTER_ALIGNMENT);

            modelo.addColumn("ID");
            modelo.addColumn("Modelo");
            modelo.addColumn("Marca");
            modelo.addColumn("Descripción");
            modelo.addColumn("Imagen");

            tablaMuestra.setBackground(new Color(51, 51, 51));
            tablaMuestra.setForeground(new Color(255, 255, 255));
            tablaMuestra.setGridColor(new Color(102, 102, 102));
            tablaMuestra.setSelectionBackground(new Color(51, 153, 255));

            tablaMuestra.setRowHeight(30);
            tablaMuestra.setEnabled(false);

            tablaMuestra.getColumnModel().getColumn(0).setMinWidth(50);
            tablaMuestra.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaMuestra.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaMuestra.getColumnModel().getColumn(0).setCellRenderer(dtcr);

            tablaMuestra.getColumnModel().getColumn(1).setCellRenderer(dtcr);

            tablaMuestra.getColumnModel().getColumn(2).setMinWidth(90);
            tablaMuestra.getColumnModel().getColumn(2).setPreferredWidth(90);
            tablaMuestra.getColumnModel().getColumn(2).setMaxWidth(90);
            tablaMuestra.getColumnModel().getColumn(2).setCellRenderer(dtcr);

            tablaMuestra.getColumnModel().getColumn(3).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(3).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(3).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(3).setCellRenderer(dtcr);

            tablaMuestra.getColumnModel().getColumn(4).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(4).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(4).setMinWidth(120);
            tablaMuestra.getColumnModel().getColumn(4).setCellRenderer(dtcr);

            while (rs.next()) {
                Object[] filas = new Object[5];

                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }

            cn.conectar().close();
            st.close();
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Hubo un error al intentar cargar los datos!");
            System.out.println(e);
        }
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
        textBuscar = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        buscarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMuestra = new javax.swing.JTable();
        leyenda = new javax.swing.JLabel();
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
        header.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, 30));

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
        header.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

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
        header.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        body.setBackground(new java.awt.Color(102, 102, 102));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textBuscar.setBackground(new java.awt.Color(51, 51, 51));
        textBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textBuscar.setForeground(new java.awt.Color(255, 255, 255));
        textBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        textBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        textBuscar.setSelectionColor(new java.awt.Color(51, 51, 255));
        body.add(textBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 500, 20));

        labelBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar.setText("Buscar por Modelo:");
        body.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        buscarBoton.setBackground(new java.awt.Color(51, 51, 51));
        buscarBoton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buscarBoton.setForeground(new java.awt.Color(255, 255, 255));
        buscarBoton.setText("Buscar");
        buscarBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        body.add(buscarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 80, 22));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tablaMuestra.setBackground(new java.awt.Color(51, 51, 51));
        tablaMuestra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tablaMuestra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaMuestra.setForeground(new java.awt.Color(255, 255, 255));
        tablaMuestra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMuestra.setGridColor(new java.awt.Color(102, 102, 102));
        tablaMuestra.setRowHeight(30);
        tablaMuestra.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tablaMuestra.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaMuestra);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 310));

        leyenda.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        leyenda.setForeground(new java.awt.Color(255, 255, 255));
        leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leyenda.setText("© Derechos reservados a Matias Abregú - 2023");
        body.add(leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 800, 20));

        fondo.setBackground(new java.awt.Color(102, 102, 102));
        body.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 390));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 390));

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
    private javax.swing.JLabel Volver;
    private javax.swing.JPanel body;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTable tablaMuestra;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
}

/*
            ResultSetMetaData rsmd = rs.getMetaData(); //Se recupera los metadatos (tabla vehiculo)
            DefaultTableModel tablaModelo = (DefaultTableModel) tablaMuestra.getModel(); //Se crea el modelo de tabla
            int columnas = rsmd.getColumnCount(); //Se recupera las columnas de los metadatos (columnas de tabla vehiculos)
            
            String[] nombreColumnas = new String[columnas]; //String que contiene los nombres de las columnas
            
            for(int i = 0; i < columnas; i++){ //Recorremos la tabla de los metadatos para ir guardando los nombres en nombreColumnas
                nombreColumnas[i] = rsmd.getColumnName(i + 1);
            }
            
            tablaModelo.setColumnIdentifiers(nombreColumnas); //Se establecen los nombres de las columnas en la tabla
     
            //Declaración de variables que iria en cada columna
            String modelo, marca, descripcion;
            int id; 
            Blob imagen;
            
            while(rs.next()){
                id = rs.getInt(1);
                modelo = rs.getString(2);
                marca = rs.getString(3);
                descripcion = rs.getString(4);
                imagen = rs.getBlob(5);
                
                Object[] fila = {id, modelo, marca, descripcion, imagen};
                
                tablaModelo.addRow(fila);
            }*/
