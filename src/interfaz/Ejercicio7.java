/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Hora;
import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Ejercicio7 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio7
     */ 
    Hora ZonaHoraria;
    public Ejercicio7() {
        initComponents(); 
        cmdCrear.setEnabled(true);
        cmdValidar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdBorrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoraUno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMinutoUno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSegundoUno = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoraDos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMinutoDos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSegundoDos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdMayor = new javax.swing.JButton();
        cmdIgual = new javax.swing.JButton();
        cmdMenor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cmdValidar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 18)); // NOI18N
        jLabel1.setText("Ejercicio7");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Hora Ingresada");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, -1));

        jLabel3.setText("Hora Uno");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtHoraUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtHoraUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jLabel4.setText("Minuto Uno");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 70, 70, -1));

        txtMinutoUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutoUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtMinutoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        jLabel5.setText("Segundo Uno");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        txtSegundoUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoUnoKeyTyped(evt);
            }
        });
        jPanel2.add(txtSegundoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 170));

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Hora Comparada");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setText("Hora Dos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        txtHoraDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraDosKeyTyped(evt);
            }
        });
        jPanel3.add(txtHoraDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        jLabel8.setText("Minuto Dos");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 70, 70, -1));

        txtMinutoDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutoDosKeyTyped(evt);
            }
        });
        jPanel3.add(txtMinutoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel9.setText("Segundo Dos");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        txtSegundoDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoDosKeyTyped(evt);
            }
        });
        jPanel3.add(txtSegundoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 170));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMayor.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        cmdMayor.setForeground(new java.awt.Color(51, 51, 255));
        cmdMayor.setText("Mayor Hora");
        cmdMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMayorActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        cmdIgual.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        cmdIgual.setForeground(new java.awt.Color(51, 0, 51));
        cmdIgual.setText("Igual Hora");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIgualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, -1));

        cmdMenor.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        cmdMenor.setForeground(new java.awt.Color(153, 153, 0));
        cmdMenor.setText("Menor Hora");
        cmdMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenorActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 130));

        jLabel10.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel10.setText("Galeria De Botones ( >=<)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdValidar.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cmdValidar.setText("Validar Hora");
        cmdValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        cmdMostrar.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cmdMostrar.setText("Mostrar Datos");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 130));

        jLabel11.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("Galeria De Botones (Sistematizacion)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, 20));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(204, 0, 102));
        cmdCrear.setText("Crear Zona Horaria");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel6.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cmdBorrar.setText("Borrar Hora");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 200, 130));

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Galeria De Botones (Registro o Borrar)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        txtDatos.setEditable(false);
        txtDatos.setBackground(new java.awt.Color(255, 204, 0));
        txtDatos.setColumns(20);
        txtDatos.setFont(new java.awt.Font("MS PGothic", 1, 20)); // NOI18N
        txtDatos.setForeground(new java.awt.Color(204, 0, 51));
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 350, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(642, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
    int horas,minutos,segundos;
        
        if(txtHoraUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtHoraUno.requestFocusInWindow();
        }else if(txtMinutoUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtMinutoUno.requestFocusInWindow();
        }else if(txtSegundoUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtSegundoUno.requestFocusInWindow();
        }else if(txtHoraDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtHoraDos.requestFocusInWindow();
        }else if(txtMinutoDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtMinutoDos.requestFocusInWindow();
        }else if(txtSegundoDos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            txtSegundoDos.requestFocusInWindow();
        }else{ 
            txtDatos.setText("Horas Creadas Satisfactoriamente"); 
            horas=Integer.parseInt(txtHoraUno.getText()); 
            minutos=Integer.parseInt(txtMinutoUno.getText()); 
            segundos=Integer.parseInt(txtSegundoUno.getText()); 
            ZonaHoraria= new Hora(horas,minutos,segundos); 
            
            cmdCrear.setEnabled(false);
            cmdValidar.setEnabled(true);
            cmdMostrar.setEnabled(true);
            cmdIgual.setEnabled(true);
            cmdMenor.setEnabled(true);
            cmdMayor.setEnabled(true);
            cmdBorrar.setEnabled(true);
            
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtHoraUno.setText("");
        txtMinutoUno.setText("");
        txtSegundoUno.setText("");
        txtHoraDos.setText("");
        txtMinutoDos.setText("");
        txtSegundoDos.setText("");
        txtDatos.setText("");
        txtHoraUno.requestFocusInWindow(); 
        cmdCrear.setEnabled(true);
        cmdValidar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdBorrar.setEnabled(false);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidarActionPerformed
       String res;
        
        res=ZonaHoraria.Validar();
        txtDatos.setText(res);
        
        cmdCrear.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdIgual.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMayor.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdValidarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String res;
        int horas,minutos,segundos;
        Hora h2;
        
        horas=Integer.parseInt(txtHoraDos.getText());
        minutos=Integer.parseInt(txtMinutoDos.getText());
        segundos=Integer.parseInt(txtSegundoDos.getText());
        
        h2=new Hora(horas,minutos,segundos);
        res=ZonaHoraria.MostrarDatosZonaHoraria(h2);
        txtDatos.setText(res);
        
        cmdCrear.setEnabled(false);
        cmdValidar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMayor.setEnabled(true);
        cmdBorrar.setEnabled(true);
   
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMayorActionPerformed
       String res;
        int horas,minutos,segundos;
        Hora h2;
        
        horas=Integer.parseInt(txtHoraDos.getText());
        minutos=Integer.parseInt(txtMinutoDos.getText());
        segundos=Integer.parseInt(txtSegundoDos.getText());
        
        h2=new Hora(horas,minutos,segundos);
        res=ZonaHoraria.MayorHora(h2);
        txtDatos.setText(res);
        
        cmdCrear.setEnabled(false);
        cmdValidar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdIgual.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMayor.setEnabled(false);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdMayorActionPerformed

    private void cmdIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIgualActionPerformed
     String res;
        int hora,minuto,segundo;
        Hora h2;
        
        hora=Integer.parseInt(txtHoraDos.getText());
        minuto=Integer.parseInt(txtMinutoDos.getText());
        segundo=Integer.parseInt(txtSegundoDos.getText());
        
        h2=new Hora(hora,minuto,segundo);
        res=ZonaHoraria.IgualHora(h2);
        txtDatos.setText(res);
        
        cmdCrear.setEnabled(false);
        cmdValidar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdIgual.setEnabled(false);
        cmdMenor.setEnabled(true);
        cmdMayor.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdIgualActionPerformed

    private void cmdMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenorActionPerformed
      String res; 
        int hora,minuto,segundo;
        Hora h2;
        
        hora=Integer.parseInt(txtHoraDos.getText());
        minuto=Integer.parseInt(txtMinutoDos.getText());
        segundo=Integer.parseInt(txtSegundoDos.getText());
        
        h2=new Hora(hora,minuto,segundo);
        res=ZonaHoraria.MenorHora(h2);
        txtDatos.setText(res);
        
        cmdCrear.setEnabled(false);
        cmdValidar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdIgual.setEnabled(true);
        cmdMenor.setEnabled(false);
        cmdMayor.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdMenorActionPerformed

    private void txtHoraUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraUnoKeyTyped
       char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume();
       }
    }//GEN-LAST:event_txtHoraUnoKeyTyped

    private void txtMinutoUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutoUnoKeyTyped
      char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       } 
       
    }//GEN-LAST:event_txtMinutoUnoKeyTyped

    private void txtSegundoUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoUnoKeyTyped
      char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       } 
    }//GEN-LAST:event_txtSegundoUnoKeyTyped

    private void txtHoraDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraDosKeyTyped
      char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       }
    }//GEN-LAST:event_txtHoraDosKeyTyped

    private void txtMinutoDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutoDosKeyTyped
      char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       }
    }//GEN-LAST:event_txtMinutoDosKeyTyped

    private void txtSegundoDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoDosKeyTyped
       char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       } 
    }//GEN-LAST:event_txtSegundoDosKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdMayor;
    private javax.swing.JButton cmdMenor;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextField txtHoraDos;
    private javax.swing.JTextField txtHoraUno;
    private javax.swing.JTextField txtMinutoDos;
    private javax.swing.JTextField txtMinutoUno;
    private javax.swing.JTextField txtSegundoDos;
    private javax.swing.JTextField txtSegundoUno;
    // End of variables declaration//GEN-END:variables
}
