package nezetVezerlo;

import javax.swing.JRadioButton;
import modell.Feladat;
import modell.Lada;

public class GuiNezetVezerlo extends javax.swing.JFrame {

    private boolean vizsgal;
    private Feladat feladat = new Feladat();
    private Lada[] ladak = feladat.getLadak();

    public GuiNezetVezerlo() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arany = new javax.swing.JRadioButton();
        ezust = new javax.swing.JRadioButton();
        bronz = new javax.swing.JRadioButton();
        rogton = new javax.swing.JCheckBox();
        btnviszgal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        eredmeny = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaValasz = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GuiVezerloNezet");
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        arany.setText("jRadioButton1");
        arany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });

        ezust.setText("jRadioButton2");
        ezust.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });
        ezust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezustActionPerformed(evt);
            }
        });

        bronz.setText("jRadioButton3");
        bronz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });
        bronz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bronzActionPerformed(evt);
            }
        });

        rogton.setText("rögtön viszgál");
        rogton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rogtonItemStateChanged(evt);
            }
        });

        btnviszgal.setText("Viszgál");
        btnviszgal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviszgalActionPerformed(evt);
            }
        });

        txa.setColumns(20);
        txa.setRows(5);
        jScrollPane1.setViewportView(txa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arany)
                    .addComponent(bronz)
                    .addComponent(ezust))
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rogton)
                    .addComponent(btnviszgal))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arany)
                    .addComponent(rogton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ezust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bronz)
                    .addComponent(btnviszgal))
                .addContainerGap())
        );

        jLabel1.setText("Eredmény");

        eredmeny.setText("Eredmény");

        txaValasz.setColumns(20);
        txaValasz.setRows(5);
        txaValasz.setText("Mi a választásod?");
        jScrollPane2.setViewportView(txaValasz);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addComponent(eredmeny))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eredmeny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void ezustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezustActionPerformed

    }//GEN-LAST:event_ezustActionPerformed

    private void bronzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bronzActionPerformed

    }//GEN-LAST:event_bronzActionPerformed

    private void btnviszgalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviszgalActionPerformed

        eredmeny();
    }//GEN-LAST:event_btnviszgalActionPerformed

    private void eredmeny() {

        
        JRadioButton[] rdb = {arany, ezust, bronz};
        int i = 0;
        while (i < rdb.length && !rdb[i].isSelected()) {
            i++;
        }
        if (i == 3) {
            txaValasz.setText("Nincs kiválasztva láda");
        } else if (ladak[i].isKincs()) {
            txaValasz.setText("Eltaláltad");
        } else {
            txaValasz.setText("Nem találtad el");
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel1.setText("Csak 1 állítás igaz!");

        String[] feliratok = new String[ladak.length];
        for (int i = 0; i < ladak.length; i++) {
            feliratok[i] = ladak[i].getFelirat();
        }

        String[] anyagok = new String[ladak.length];
        for (int i = 0; i < ladak.length; i++) {
            anyagok[i] = ladak[i].getAnyag();
        }

        JRadioButton[] rdb = {arany, ezust, bronz};
        for (int i = 0; i < rdb.length; i++) {
            String anyag = anyagok[i];
            rdb[i].setText(anyag);
            String f = feliratok[i] + "\n";
            txa.append(anyag + ": " + f + "\n");
        }
    }//GEN-LAST:event_formWindowOpened

    private void rogtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rogtonItemStateChanged
        if (rogton.isSelected() == true) {
            btnviszgal.setEnabled(false);
        } else {
            btnviszgal.setEnabled(true);
        }
        vizsgal = rogton.isSelected();
    }//GEN-LAST:event_rogtonItemStateChanged

    private void kincsVizsgalat(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kincsVizsgalat
        if (vizsgal) {
            eredmeny();
        }
    }//GEN-LAST:event_kincsVizsgalat


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arany;
    private javax.swing.JRadioButton bronz;
    private javax.swing.JButton btnviszgal;
    private javax.swing.JLabel eredmeny;
    private javax.swing.JRadioButton ezust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox rogton;
    private javax.swing.JTextArea txa;
    private javax.swing.JTextArea txaValasz;
    // End of variables declaration//GEN-END:variables

}
