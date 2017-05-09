/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Ortega
 */
public class PrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public PrincipalAdmin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    ImageIcon ii;
    static boolean maximizar = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Principal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Cerrar = new javax.swing.JLabel();
        jLabel_Maximizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Minmizar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel_Hotel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_icn_ht = new javax.swing.JLabel();
        jPanel_Lavdr = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_icn_lv = new javax.swing.JLabel();
        jPanel_Parqd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_icn_pq = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel_Principal.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La Virgen");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Cerrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close Window_20px_1.png"))); // NOI18N
        jLabel_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseExited(evt);
            }
        });

        jLabel_Maximizar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Maximizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/External Link Squared_20px_1.png"))); // NOI18N
        jLabel_Maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MaximizarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User_30px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel_Minmizar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Minmizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minmizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Minimize Window_20px.png"))); // NOI18N
        jLabel_Minmizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinmizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinmizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinmizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 650, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel_Minmizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Maximizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Cerrar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Maximizar)
                    .addComponent(jLabel_Cerrar)
                    .addComponent(jLabel_Minmizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jPanel_Hotel.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Hotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Hotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_HotelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_HotelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_HotelMouseExited(evt);
            }
        });
        jPanel_Hotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Encabezados");
        jPanel_Hotel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel_icn_ht.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_icn_ht.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_icn_ht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Play_20px.png"))); // NOI18N
        jPanel_Hotel.add(jLabel_icn_ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jPanel_Lavdr.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Lavdr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Lavdr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_LavdrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_LavdrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_LavdrMouseExited(evt);
            }
        });
        jPanel_Lavdr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuarios");
        jPanel_Lavdr.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 20));

        jLabel_icn_lv.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_icn_lv.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_icn_lv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Play_20px.png"))); // NOI18N
        jPanel_Lavdr.add(jLabel_icn_lv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jPanel_Parqd.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Parqd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Parqd.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Parqd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_ParqdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_ParqdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_ParqdMouseExited(evt);
            }
        });
        jPanel_Parqd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tarifas");
        jPanel_Parqd.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Parqd.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, 30));

        jLabel_icn_pq.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_icn_pq.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_icn_pq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Play_20px.png"))); // NOI18N
        jPanel_Parqd.add(jLabel_icn_pq, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Parqd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel_Lavdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Hotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel_Parqd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Lavdr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_ParqdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ParqdMouseClicked
        // TODO add your handling code here:

        Parqueadero p = new Parqueadero();
        jPanel_Principal.removeAll();
        jPanel_Principal.setLayout(new BorderLayout());
        jPanel_Principal.add(p, BorderLayout.CENTER);
        jPanel_Principal.repaint();
        jPanel_Principal.revalidate();
    }//GEN-LAST:event_jPanel_ParqdMouseClicked

    private void jPanel_LavdrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_LavdrMouseClicked
        // TODO add your handling code here:
        Lavadero l = new Lavadero();
        jPanel_Principal.removeAll();
        jPanel_Principal.setLayout(new BorderLayout());
        jPanel_Principal.add(l, BorderLayout.CENTER);
        jPanel_Principal.repaint();
        jPanel_Principal.revalidate();
    }//GEN-LAST:event_jPanel_LavdrMouseClicked

    private void jPanel_HotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HotelMouseClicked
        // TODO add your handling code here:
        Hotel h = new Hotel();
        jPanel_Principal.removeAll();
        jPanel_Principal.setLayout(new BorderLayout());
        jPanel_Principal.add(h, BorderLayout.CENTER);
        jPanel_Principal.repaint();
        jPanel_Principal.revalidate();
    }//GEN-LAST:event_jPanel_HotelMouseClicked

    private void jLabel_MaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MaximizarMouseClicked
        // TODO add your handling code here:
        if (maximizar) {

            PrincipalAdmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            PrincipalAdmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximizar = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximizar = true;
        }

    }//GEN-LAST:event_jLabel_MaximizarMouseClicked


    private void jLabel_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_CerrarMouseClicked

    private void jPanel_ParqdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ParqdMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px_1.png"));
        jLabel_icn_pq.setIcon(ii);
    }//GEN-LAST:event_jPanel_ParqdMouseEntered

    private void jPanel_ParqdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ParqdMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px.png"));
        jLabel_icn_pq.setIcon(ii);
    }//GEN-LAST:event_jPanel_ParqdMouseExited

    private void jPanel_LavdrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_LavdrMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px_1.png"));
        jLabel_icn_lv.setIcon(ii);
    }//GEN-LAST:event_jPanel_LavdrMouseEntered

    private void jPanel_LavdrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_LavdrMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px.png"));
        jLabel_icn_lv.setIcon(ii);
    }//GEN-LAST:event_jPanel_LavdrMouseExited

    private void jPanel_HotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HotelMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px_1.png"));
        jLabel_icn_ht.setIcon(ii);
    }//GEN-LAST:event_jPanel_HotelMouseEntered

    private void jPanel_HotelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_HotelMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Play_20px.png"));
        jLabel_icn_ht.setIcon(ii);
    }//GEN-LAST:event_jPanel_HotelMouseExited

    private void jLabel_MinmizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinmizarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Minimize Window_20px_1.png"));
        jLabel_Minmizar.setIcon(ii);
    }//GEN-LAST:event_jLabel_MinmizarMouseEntered

    private void jLabel_MinmizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinmizarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Minimize Window_20px.png"));
        jLabel_Minmizar.setIcon(ii);
    }//GEN-LAST:event_jLabel_MinmizarMouseExited

    private void jLabel_MaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MaximizarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/External Link Squared_20px_2.png"));
        jLabel_Maximizar.setIcon(ii);
    }//GEN-LAST:event_jLabel_MaximizarMouseEntered

    private void jLabel_MaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MaximizarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/External Link Squared_20px_1.png"));
        jLabel_Maximizar.setIcon(ii);
    }//GEN-LAST:event_jLabel_MaximizarMouseExited

    private void jLabel_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Close Window_20px.png"));
        jLabel_Cerrar.setIcon(ii);
    }//GEN-LAST:event_jLabel_CerrarMouseEntered

    private void jLabel_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Close Window_20px_1.png"));
        jLabel_Cerrar.setIcon(ii);
    }//GEN-LAST:event_jLabel_CerrarMouseExited

    private void jLabel_MinmizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinmizarMouseClicked
        // TODO add your handling code here:

        PrincipalAdmin.this.setExtendedState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_MinmizarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         //Cerrar sesion
        Sesion instanciaSesion = Sesion.getInstanciaSesion();
        boolean cerrarSesion = instanciaSesion.cerrarSesion();
        if(cerrarSesion)
        {
            JOptionPane.showMessageDialog(null, "Sesion finalizada con exito");
            Login obj = new Login();
            obj.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha presentado un problema al cerrar sesion");
        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Cerrar;
    private javax.swing.JLabel jLabel_Maximizar;
    private javax.swing.JLabel jLabel_Minmizar;
    private javax.swing.JLabel jLabel_icn_ht;
    private javax.swing.JLabel jLabel_icn_lv;
    private javax.swing.JLabel jLabel_icn_pq;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Hotel;
    private javax.swing.JPanel jPanel_Lavdr;
    private javax.swing.JPanel jPanel_Parqd;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
