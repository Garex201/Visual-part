/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproyecto1;

import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1
 */
public class Pb02 extends javax.swing.JPanel {
JButton boton1= new JButton("Agregar");
    
    /**
     * Creates new form Pb01
     */
    public Pb02() {
        initComponents();
        propiedadesTabla();
    }
//definimos el men� en si
   private void propiedadesTabla(){
       Tabla1.setDefaultRenderer(Object.class, new imgTabla());
       String titulos[] = {"Nombre","Precio","","Agregar"};
       DefaultTableModel prop = new DefaultTableModel(null,titulos);
        prop.addRow(new Object[]{"Pollo al horno","60",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo1.png")) )});
        prop.addRow(new Object[]{"Spageti con albondigas","30",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo2.png")) )});
        prop.addRow(new Object[]{"Pizza de la casa","60",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo4.png")) )});
        prop.addRow(new Object[]{"Ramen de Camaron","60",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo5.png")) )});
        prop.addRow(new Object[]{"Sopa Mein","40",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo5.png")) )});
        prop.addRow(new Object[]{"Sopa de Tomate","20",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo6.png")) )});
        prop.addRow(new Object[]{"Flautas","15",new JLabel(new ImageIcon(getClass().getResource("/iconos-proyecto/almuerzo7.png")) )});
        
        Tabla1.setRowHeight(120);
       Tabla1.setModel(prop);
   }
   
   public class imgTabla extends DefaultTableCellRenderer{

         @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) 
        {
            if(o instanceof JLabel){
                JLabel lbl = (JLabel)o;
                return lbl;
            }
            
            return super.getTableCellRendererComponent( jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
        }

       
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Almuerzos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 1, 24), new java.awt.Color(0, 255, 204))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Tabla1.setBackground(new java.awt.Color(51, 51, 51));
        Tabla1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Tabla1.setForeground(new java.awt.Color(255, 255, 255));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jPanel1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Seleccione lo que desee:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
