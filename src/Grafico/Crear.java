package Grafico;


import Conexiones.Facade;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vicen
 */
public class Crear extends javax.swing.JInternalFrame  {

    /**
     * Creates new form Crear
     */
    public Crear() {
        initComponents();
        
         
        this.getContentPane().setBackground(Color.WHITE);
        txtaPR.setEnabled(false); 
        txtFNocmbre.requestFocus();
      
   
    }
    Encuesta ec=new Encuesta();
    MetodosExtra m=new MetodosExtra();
    iconoMensaje m2=new iconoMensaje();
    Facade f=new Facade();
    
// javax.swing.JInternalFrame {
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtFNocmbre = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        spnR = new javax.swing.JSpinner();
        spnP = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaIntr = new javax.swing.JTextArea();
        lbl4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaPR = new javax.swing.JTextArea();
        lbl5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnMuestra = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);

        btnAceptar.setBackground(new java.awt.Color(153, 153, 153));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setText("REGISTRAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl1.setText("Nombre De Encuesta:");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl3.setText("Numero De preguntas:");

        txtFNocmbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNocmbreActionPerformed(evt);
            }
        });
        txtFNocmbre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFNocmbreKeyPressed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl2.setText("Numero Posible De Respuestas");

        spnR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnRStateChanged(evt);
            }
        });

        spnP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));
        spnP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPStateChanged(evt);
            }
        });

        txtaIntr.setColumns(20);
        txtaIntr.setRows(5);
        jScrollPane1.setViewportView(txtaIntr);

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl4.setText("Instrucciones De La Encuesta:");

        txtaPR.setColumns(20);
        txtaPR.setRows(5);
        jScrollPane2.setViewportView(txtaPR);

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl5.setText("Preguntas Y Respuestas:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("?");
        jButton2.setBorder(null);

        btnMuestra.setBackground(new java.awt.Color(255, 255, 255));
        btnMuestra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMuestra.setText("MUESTRA");
        btnMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuestraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(308, 308, 308))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl2)
                            .addGap(22, 22, 22)
                            .addComponent(spnR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3)
                            .addGap(18, 18, 18)
                            .addComponent(spnP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFNocmbre, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1)
                    .addComponent(txtFNocmbre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2)
                    .addComponent(spnR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl3)
                        .addComponent(spnP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl4)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
 int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);

    if(resp==0){
       
    String texto=txtFNocmbre.getText();
    String texto2=txtaIntr.getText();

    texto=texto.replaceAll(" ", "");
    texto2=texto2.replaceAll(" ", "");
        
     if((int)(spnR.getValue())>=1 && (int)(spnP.getValue())>=1 && 
     texto.length()!=0  && texto2.length()!=0){ 
        
     m.corregirColor(txtFNocmbre, spnR, spnP, txtaIntr, txtaPR, lbl1, lbl2, lbl3, lbl4);
     
      
        if(f.cantidadDeEncuestas()<10){//solo dispondra 1  escuesta
       
          
     
        String t[]=m.obtenerDatosEspeificos(txtaIntr, txtFNocmbre);
        f.crearDatosEspecificos(t);
        
        
        String s[][]= m.guardarPR(txtaPR, spnR, spnP);//exception en caso de haya borrado signos no lo ejecute 
        f.crearEncuesta(s);
      
      
          //System.out.println("recorrido");
         // for(int x=0; x<s.length; x++){
          //for(int y=0; y<s[x].length; y++){       
         //System.out.println(s[x][y]);
         // }
         //}
        m2.setEleccion(1);
        JOptionPane.showMessageDialog(null, "SE HA CREADO CORRECTAMENTE", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE,m2);
        }else{

        m2.setEleccion(0);
        JOptionPane.showMessageDialog(null, "Usted ya dispone de una encuesta(Acceso a solo 10)", "DENEGADO", JOptionPane.INFORMATION_MESSAGE,m2);
        } 
    }else{
        
        
    m.corregirColor(txtFNocmbre, spnR, spnP, txtaIntr, txtaPR, lbl1, lbl2, lbl3, lbl4);
    m2.setEleccion(0);
   JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOS", "DENEGADO", JOptionPane.INFORMATION_MESSAGE,m2);

    }
}else{

}    

   
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void spnRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnRStateChanged

if((int)(spnR.getValue())>=1 & (int)(spnP.getValue())>=1){    
    
      txtaPR.setEnabled(true);   
      //metodo
      m.generarPreguntasMustra(spnP, spnR, txtaPR);
    }
else{
 txtaPR.setEnabled(false);   

}

        // TODO add your handling code here:
    }//GEN-LAST:event_spnRStateChanged

    private void spnPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPStateChanged

if((int)(spnR.getValue())>=1 & (int)(spnP.getValue())>=1){    
    
      txtaPR.setEnabled(true);   
      //metodo
      txtaPR.setText("");//para limpiar
      m.generarPreguntasMustra(spnP, spnR, txtaPR);
    }
else{
  txtaPR.setEnabled(false);  

}
        // TODO add your handling code here:
    }//GEN-LAST:event_spnPStateChanged

    private void txtFNocmbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNocmbreActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNocmbreActionPerformed

    private void txtFNocmbreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNocmbreKeyPressed

if(evt.getKeyCode()==evt.VK_ENTER){
  System.out.println("presiono enter"+evt.VK_ENTER);
 spnR.transferFocus();

}else{


}

  // spnR.transferFocus();
    //spnR.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNocmbreKeyPressed

    private void btnMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuestraActionPerformed
 String texto=txtFNocmbre.getText();
String texto2=txtaIntr.getText();

texto=texto.replaceAll(" ", "");
texto2=texto2.replaceAll(" ", "");
        
 if((int)(spnR.getValue())>=1 && (int)(spnP.getValue())>=1 && 
 texto.length()!=0  && texto2.length()!=0){
     
 m.corregirColor(txtFNocmbre, spnR, spnP, txtaIntr, txtaPR, lbl1, lbl2, lbl3, lbl4);    
 String s[][]= m.guardarPR(txtaPR, spnR, spnP);
 m.muestra(s,this.btnMuestra);
 
 }else{
 
 m.corregirColor(txtFNocmbre, spnR, spnP, txtaIntr, txtaPR, lbl1, lbl2, lbl3, lbl4);
 m2.setEleccion(0);
 JOptionPane.showMessageDialog(null, "RELLENE  LOS CAMPOS NECESARIOS", "DENEGADO", JOptionPane.INFORMATION_MESSAGE,m2);
 
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMuestraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnMuestra;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JSpinner spnP;
    private javax.swing.JSpinner spnR;
    private javax.swing.JTextField txtFNocmbre;
    private javax.swing.JTextArea txtaIntr;
    private javax.swing.JTextArea txtaPR;
    // End of variables declaration//GEN-END:variables
}
