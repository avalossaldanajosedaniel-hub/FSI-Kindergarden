
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FPrincipal extends javax.swing.JFrame {

    Conexion cnx = new Conexion();

    public FPrincipal() {
        initComponents();
        setSize(500,700);
        setLocationRelativeTo(this);
        
        
        TQery.setAutoCreateRowSorter(true);
        
        if (cnx.conectar("127.0.0.1","kindergarden","root","")==1) {
            cnx.entablar(Infante.todos,TQery);
        } else {
            JOptionPane.showMessageDialog(this, "Error en la conexion a la BD");
            System.exit(0);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        Binfantes = new javax.swing.JToggleButton();
        BEducaores = new javax.swing.JToggleButton();
        BResponsables = new javax.swing.JToggleButton();
        BBitacora = new javax.swing.JToggleButton();
        BNuevo = new javax.swing.JToggleButton();
        BEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TQery = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 0));
        jToolBar1.setRollover(true);

        buttonGroup1.add(Binfantes);
        Binfantes.setSelected(true);
        Binfantes.setText("Infantes");
        Binfantes.setFocusable(false);
        Binfantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Binfantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Binfantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinfantesActionPerformed(evt);
            }
        });
        jToolBar1.add(Binfantes);

        buttonGroup1.add(BEducaores);
        BEducaores.setText("Educadores");
        BEducaores.setFocusable(false);
        BEducaores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BEducaores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BEducaores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEducaoresActionPerformed(evt);
            }
        });
        jToolBar1.add(BEducaores);

        buttonGroup1.add(BResponsables);
        BResponsables.setText("Responsables");
        BResponsables.setFocusable(false);
        BResponsables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BResponsables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResponsablesActionPerformed(evt);
            }
        });
        jToolBar1.add(BResponsables);

        buttonGroup1.add(BBitacora);
        BBitacora.setText("Bitacora");
        BBitacora.setFocusable(false);
        BBitacora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBitacora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBitacoraActionPerformed(evt);
            }
        });
        jToolBar1.add(BBitacora);

        BNuevo.setText("Nuevo");
        BNuevo.setFocusable(false);
        BNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BNuevo);

        BEditar.setText("Editar");
        BEditar.setFocusable(false);
        BEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(BEditar);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        TQery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TQery);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEducaoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEducaoresActionPerformed
        cnx.entablar(Educador.todos,TQery);
    }//GEN-LAST:event_BEducaoresActionPerformed

    private void BinfantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinfantesActionPerformed
    cnx.entablar(Infante.todos,TQery);
    
    }//GEN-LAST:event_BinfantesActionPerformed

    private void BBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBitacoraActionPerformed
        cnx.entablar(Bitacora.todos,TQery);
    }//GEN-LAST:event_BBitacoraActionPerformed

    private void BResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResponsablesActionPerformed
        cnx.entablar(Responsables.todos,TQery);
    }//GEN-LAST:event_BResponsablesActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
       if (Binfantes.isSelected()) {
    JDinfantes di = new JDinfantes(this, true);
    di.obtenerconexion(cnx);
      di.setVisible(true);
      cnx.entablar(Infante.todos, TQery);
    
} else if (BEducaores.isSelected()) {
    JDeducadores di = new JDeducadores(this, true);
    di.obtenerconexion(cnx);
    di.setVisible(true);
     cnx.entablar(Educador.todos, TQery);
   
    
} else if (BResponsables.isSelected()) {
    JDresponsables di = new JDresponsables(this, true);
    di.obtenerconexion(cnx);
    di.setVisible(true);
     cnx.entablar(Responsables.todos, TQery);
    
} else if (BBitacora.isSelected()) {
    JDbitacora di = new JDbitacora(this, true);
    di.obtenerconexion(cnx);
    di.setVisible(true);
     cnx.entablar(Bitacora.todos, TQery);
}
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        if (TQery.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Primero selecciona un renglon de la tabla para editar");
        }
        if (Binfantes.isSelected()) {
    JDinfantes di = new JDinfantes(this, true);
    di.obtenerconexion(cnx);
    di.obtenerInfante(crearInfante());
      di.setVisible(true);
       cnx.entablar(Infante.todos, TQery);
    
} else if (BEducaores.isSelected()) {
    JDeducadores di = new JDeducadores(this, true);
    di.obtenerconexion(cnx);
    di.obtenerEducador(crearEducador());
    di.setVisible(true);
     cnx.entablar(Educador.todos, TQery);
   
    
} else if (BResponsables.isSelected()) {
    JDresponsables di = new JDresponsables(this, true);
    di.obtenerconexion(cnx);
    di.obtenerResponsables(crearResponsable());
    di.setVisible(true);
     cnx.entablar(Responsables.todos, TQery);
    
} else if (BBitacora.isSelected()) {
    JDbitacora di = new JDbitacora(this, true);
    di.obtenerconexion(cnx);
    di.obtenerBitacora(crearBitacora());
    di.setVisible(true);
     cnx.entablar(Bitacora.todos, TQery);
}
    }//GEN-LAST:event_BEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BBitacora;
    private javax.swing.JButton BEditar;
    private javax.swing.JToggleButton BEducaores;
    private javax.swing.JToggleButton BNuevo;
    private javax.swing.JToggleButton BResponsables;
    private javax.swing.JToggleButton Binfantes;
    private javax.swing.JTable TQery;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    public Infante crearInfante(){
        DefaultTableModel modelo = (DefaultTableModel) TQery.getModel();
        int ren = TQery.getSelectedRow();
        Infante kid = new Infante();
        if (ren >= 0) {
         
            kid.curp = modelo.getValueAt(ren, 0).toString();
            kid.nombre = modelo.getValueAt(ren, 1).toString();
            kid.sexo = modelo.getValueAt(ren, 2).toString();
            kid.fecha = modelo.getValueAt(ren, 3).toString();
            kid.estado = modelo.getValueAt(ren, 4).toString();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return kid;
        
    }
    public Responsables crearResponsable(){
        DefaultTableModel modelo = (DefaultTableModel) TQery.getModel();
        int ren = TQery.getSelectedRow();
        Responsables res = new Responsables();
        if (ren >= 0) {
         
            res.curpr = modelo.getValueAt(ren, 0).toString();
            res.nombrer = modelo.getValueAt(ren, 1).toString();
            res.sexor = modelo.getValueAt(ren, 2).toString();
            res.telefonor = modelo.getValueAt(ren, 3).toString();
            res.parentesco = modelo.getValueAt(ren, 4).toString();
            res.estador = modelo.getValueAt(ren, 5).toString();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return res;
        
    }
       public Educador crearEducador(){
        DefaultTableModel modelo = (DefaultTableModel) TQery.getModel();
        int ren = TQery.getSelectedRow();
        Educador edu = new Educador();
        if (ren >= 0) {
         
            edu.curpe = modelo.getValueAt(ren, 0).toString();
            edu.nombree = modelo.getValueAt(ren, 1).toString();
            edu.sexoe = modelo.getValueAt(ren, 2).toString();
            edu.telefonoe = modelo.getValueAt(ren, 3).toString();
            edu.direccion = modelo.getValueAt(ren, 4).toString();
            edu.estadoe = modelo.getValueAt(ren, 5).toString();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return edu;
        
    }
          public Bitacora crearBitacora(){
        DefaultTableModel modelo = (DefaultTableModel) TQery.getModel();
        int ren = TQery.getSelectedRow();
        Bitacora bit = new Bitacora();
        if (ren >= 0) {
         
            bit.folio = modelo.getValueAt(ren, 0).toString();
            bit.tiempo = modelo.getValueAt(ren, 1).toString();
            bit.tipo = modelo.getValueAt(ren, 2).toString();
            bit.observaciones = modelo.getValueAt(ren, 3).toString();
            bit.infantiles_curp = modelo.getValueAt(ren, 4).toString();
            bit.infantiles_nombrei = modelo.getValueAt(ren, 5).toString();
            bit.responsables_curpr = modelo.getValueAt(ren, 6).toString();
            bit.educadores_curpe = modelo.getValueAt(ren, 7).toString();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return bit;
        
    }
    
     
    
}
