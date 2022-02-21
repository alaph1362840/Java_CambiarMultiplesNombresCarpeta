package editornombres;

//Importacion de librerias necesarias
import java.util.ArrayList;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Reemplazo extends javax.swing.JFrame {
    //Para Reemplazo
    public String url = "";
    public String fraseEliminar = "";
    public String fraseInsertar = "";
    public int tipo_edicion=-1;   
    //Para Insercion
    public String fraseInsertar2 = "";
    public int posicion_edicion = -1;
    
    public Reemplazo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInsertar = new javax.swing.JTextField();
        btnReemplazar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtDirectorio = new javax.swing.JTextField();
        btnSelectDirectorio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        listEdicion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtInsertar2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        listPosicion = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editor de Nombres");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario para Reemplazar Texto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        jLabel3.setText("Texto a Eliminar:");

        txtEliminar.setBackground(new java.awt.Color(242, 206, 207));
        txtEliminar.setToolTipText("");
        txtEliminar.setName("txtEliminar"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
        jLabel4.setText("Texto de Remplazo:");

        txtInsertar.setBackground(new java.awt.Color(228, 236, 201));
        txtInsertar.setToolTipText("");
        txtInsertar.setName("txtInsertar"); // NOI18N

        btnReemplazar.setBackground(new java.awt.Color(192, 218, 159));
        btnReemplazar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReemplazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reload.png"))); // NOI18N
        btnReemplazar.setText("Reemplazar!");
        btnReemplazar.setName("btnReemplazar"); // NOI18N
        btnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemplazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReemplazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReemplazar)
                .addGap(50, 50, 50))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Directorio de Carpeta a Trabajar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDirectorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDirectorio.setToolTipText("Ingrese directorio Ejem: C:\\Users\\");
            txtDirectorio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtDirectorioActionPerformed(evt);
                }
            });

            btnSelectDirectorio.setBackground(new java.awt.Color(230, 242, 244));
            btnSelectDirectorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            btnSelectDirectorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Carpeta.png"))); // NOI18N
            btnSelectDirectorio.setText("Seleccionar directorio");
            btnSelectDirectorio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSelectDirectorioActionPerformed(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
            jLabel5.setText("Que Deseas Renombrar?");

            listEdicion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            listEdicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carpetas", "Archivos" }));

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtDirectorio, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSelectDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(listEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectDirectorio))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(listEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19))
            );

            jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario para Añadir Texto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12))); // NOI18N

            jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
            jLabel7.setText("Texto a Insertar:");

            txtInsertar2.setBackground(new java.awt.Color(249, 249, 219));
            txtInsertar2.setToolTipText("");
            txtInsertar2.setName("txtInsertar"); // NOI18N

            jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 17)); // NOI18N
            jLabel8.setText("Donde Insertar?");

            listPosicion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            listPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicio", "Final" }));

            btnInsertar.setBackground(new java.awt.Color(229, 184, 91));
            btnInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reload.png"))); // NOI18N
            btnInsertar.setText("Insertar");
            btnInsertar.setName("btnReemplazar"); // NOI18N
            btnInsertar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnInsertarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(93, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtInsertar2)
                                .addComponent(listPosicion, 0, 177, Short.MAX_VALUE))))
                    .addGap(72, 72, 72))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(listPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnInsertar)
                    .addContainerGap(20, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addContainerGap(25, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemplazarActionPerformed
        this.fraseEliminar = txtEliminar.getText();
        this.fraseInsertar = txtInsertar.getText();
        this.tipo_edicion = listEdicion.getSelectedIndex(); //obtiene el indice del elemento seleccionado
        // 0 - Carpetas
        // 1 - Archivos        
        this.url = txtDirectorio.getText();        
        File carpeta = new File(url);
        
        if (carpeta.isDirectory()) {
            ArrayList<File> list_carpetas = new ArrayList<File>();
            ArrayList<File> list_archivos = new ArrayList<File>();
            //Trabajando con el arreglo de objetos File
            File[] list_elementos = carpeta.listFiles();
            if (list_elementos == null || list_elementos.length == 0) {
                System.out.println("No hay elementos dentro de la carpeta actual");
            }else{
                //se clasifican los elementos en archivos y carpetas 
                for (int i = 0; i < list_elementos.length; i++) {
                    if (list_elementos[i].isDirectory()) {
                        list_carpetas.add(list_elementos[i]);
                    }else{
                        list_archivos.add(list_elementos[i]);
                    }                    
                }
                //Renombrar Carpetas
                if (this.tipo_edicion == 0) {
                    this.Renombrar(list_carpetas);
                }
                //Renombrar Archivos
                if (this.tipo_edicion == 1) {
                   this.Renombrar(list_archivos);
                }                
            }            
        }else{
            System.out.println("El directorio ingresado no es una Carpeta Valida :(");
        }
    }//GEN-LAST:event_btnReemplazarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        this.fraseInsertar2 = this.txtInsertar2.getText();
        this.tipo_edicion = this.listEdicion.getSelectedIndex();
        this.posicion_edicion = this.listPosicion.getSelectedIndex();
        this.url = txtDirectorio.getText();
        File carpeta = new File(url);
        
        if (carpeta.isDirectory()) {
            ArrayList<File> list_carpetas = new ArrayList<File>();
            ArrayList<File> list_archivos = new ArrayList<File>();
            //Trabajando con el arreglo de objetos File
            File[] list_elementos = carpeta.listFiles();
            if (list_elementos == null || list_elementos.length == 0) {
                System.out.println("No hay elementos dentro de la carpeta actual");
            }else{
                //se clasifican los elementos en archivos y carpetas 
                for (int i = 0; i < list_elementos.length; i++) {
                    if (list_elementos[i].isDirectory()) {
                        list_carpetas.add(list_elementos[i]);
                    }else{
                        list_archivos.add(list_elementos[i]);
                    }                    
                }
                //Renombrar Carpetas
                if (this.tipo_edicion == 0) {
                    this.Renombrar2(list_carpetas);
                }
                //Renombrar Archivos
                if (this.tipo_edicion == 1) {
                   this.Renombrar2(list_archivos);
                }                
            }            
        }else{
            System.out.println("El directorio ingresado no es una Carpeta Valida :(");
        }       
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnSelectDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDirectorioActionPerformed
        //Creamos el objeto JFileChooser
        JFileChooser fc=new JFileChooser();
        //Indicamos lo que podemos seleccionar
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(this);
        //Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION){
            //Seleccionamos el fichero
            File fichero=fc.getSelectedFile();
            //Ecribe la ruta del fichero seleccionado en el campo de texto
            this.txtDirectorio.setText(fichero.getAbsolutePath());            
        }
    }//GEN-LAST:event_btnSelectDirectorioActionPerformed

    private void txtDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirectorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirectorioActionPerformed
    
    public void Renombrar(ArrayList<File> list_items){
        //Renombra una lista de elementos (Files pasados)
        for (int j = 0; j < list_items.size(); j++) {
            String nombre1 = list_items.get(j).getName();
            nombre1=nombre1.replace(this.fraseEliminar, this.fraseInsertar);
            nombre1= this.url+"\\"+nombre1;
            System.out.println(nombre1);
            File nuevo = new File(nombre1);
            list_items.get(j).renameTo(nuevo);
        }
    }
    
    public void Renombrar2(ArrayList<File> list_items){
        //Renombra una lista de elementos (Files pasados)
        for (int j = 0; j < list_items.size(); j++) {
            String nombre1 = list_items.get(j).getName();
            if (this.posicion_edicion == 0) {
                nombre1 = this.fraseInsertar2 + nombre1;
            }
            if (this.posicion_edicion == 1) {
                if (this.tipo_edicion==0) {
                    nombre1 = nombre1 + this.fraseInsertar2;
                }else{
                    //localizar la extencion (partir en dos subcadenas el nombre)
                    
                    int indice = nombre1.lastIndexOf(".");                    
                    String nombre_se=nombre1.substring(0, indice);
                    String extension = nombre1.substring(indice, nombre1.length());
                    System.out.println("Nombre sin extension: "+nombre_se);
                    System.out.println("Extension: "+ extension);
                    nombre1 = nombre_se + this.fraseInsertar2 + extension;
                }                
            }
            //nombre1=nombre1.replace(this.fraseEliminar, this.fraseInsertar);
            nombre1= this.url+"\\"+nombre1;
            System.out.println(nombre1);
            File nuevo = new File(nombre1);
            list_items.get(j).renameTo(nuevo);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reemplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reemplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reemplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reemplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reemplazo().setVisible(true);
            }
        });
    }
    
    //Cambiar icono de ventana
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnReemplazar;
    private javax.swing.JButton btnSelectDirectorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> listEdicion;
    private javax.swing.JComboBox<String> listPosicion;
    private javax.swing.JTextField txtDirectorio;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtInsertar;
    private javax.swing.JTextField txtInsertar2;
    // End of variables declaration//GEN-END:variables
}
