/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala.view;

<<<<<<< HEAD
=======
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
>>>>>>> Verzija 1, greska u Svadbe
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sala.controller.ObradaJelo;
import sala.model.Jelo;
<<<<<<< HEAD
import sala.model.Pice;
=======
>>>>>>> Verzija 1, greska u Svadbe
import sala.pomocno.SalatestException;

/**
 *
 * @author Tomislav
 */
public class Jela extends javax.swing.JFrame {
        private ObradaJelo obradaEntitet;
<<<<<<< HEAD
=======
        private DecimalFormat format;
>>>>>>> Verzija 1, greska u Svadbe
    /**
     * Creates new form Jela
     */
    public Jela() {
        initComponents();
        obradaEntitet = new ObradaJelo();
<<<<<<< HEAD
=======
        
        NumberFormat nf = NumberFormat.getInstance( new Locale("hr"));
        
        format = (DecimalFormat) nf;
        format.applyPattern("#,###.00");
        
        ucitajEntitete();
>>>>>>> Verzija 1, greska u Svadbe
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        txtPredjelo = new javax.swing.JTextField();
        btnObrisi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        txtTorte = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        txtGlavnoJelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKolaci = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        txtSvedskiStol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
=======
        btnObrisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        txtNazivJelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCijenaPoGlavi = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
>>>>>>> Verzija 1, greska u Svadbe

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jLabel4.setText("Svedski stol");

        jLabel3.setText("Predjelo");

=======
>>>>>>> Verzija 1, greska u Svadbe
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });

        chbLimitator.setSelected(true);
        chbLimitator.setText("Limitiraj na 20");

<<<<<<< HEAD
        jLabel1.setText("Glavno jelo");

        jLabel2.setText("Kolaci");
=======
        jLabel1.setText("Naziv");

        jLabel2.setText("Cijena po glavi");
>>>>>>> Verzija 1, greska u Svadbe

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jLabel5.setText("Torte");

=======
>>>>>>> Verzija 1, greska u Svadbe
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbLimitator)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
<<<<<<< HEAD
                    .addComponent(txtGlavnoJelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtKolaci, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
=======
                    .addComponent(txtNazivJelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCijenaPoGlavi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> Verzija 1, greska u Svadbe
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
<<<<<<< HEAD
                        .addComponent(btnObrisi))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSvedskiStol, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTorte, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPredjelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
=======
                        .addComponent(btnObrisi)))
>>>>>>> Verzija 1, greska u Svadbe
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbLimitator))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtGlavnoJelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtKolaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(txtPredjelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtSvedskiStol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNazivJelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCijenaPoGlavi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
>>>>>>> Verzija 1, greska u Svadbe
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Jelo entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite jelovnik");
        }

        try {
            obradaEntitet.obrisi(entitet);
            ucitajEntitete();
            ocistiPolja();
        } catch (SalatestException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Jelo entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        ocistiPolja();
        
<<<<<<< HEAD
        txtGlavnoJelo.setText(entitet.getGlavno_jelo());
        txtKolaci.setText(entitet.getKolaci());
        txtPredjelo.setText(entitet.getPredjelo());
        txtTorte.setText(entitet.getTorte());
        txtSvedskiStol.setText(entitet.getSvedski_stol());
=======
        txtNazivJelo.setText(entitet.getNaziv());
        txtCijenaPoGlavi.setText(format.format(entitet.getCijenaPoGlavi()));
        
        

        
>>>>>>> Verzija 1, greska u Svadbe

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Jelo entitet = new Jelo();

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (SalatestException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Jelo entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite jelovnik");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (SalatestException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        ucitajEntitete();
    }//GEN-LAST:event_txtUvjetActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Jelo> lstEntiteti;
    private javax.swing.JTextField txtGlavnoJelo;
    private javax.swing.JTextField txtKolaci;
    private javax.swing.JTextField txtPredjelo;
    private javax.swing.JTextField txtSvedskiStol;
    private javax.swing.JTextField txtTorte;
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Jelo> lstEntiteti;
    private javax.swing.JTextField txtCijenaPoGlavi;
    private javax.swing.JTextField txtNazivJelo;
>>>>>>> Verzija 1, greska u Svadbe
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ucitajEntitete() {
<<<<<<< HEAD
        if (chbLimitator.isSelected()) {
            DefaultListModel<Jelo> n = new DefaultListModel<>();
            for (Jelo s : obradaEntitet.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                n.addElement(s);
            }
            lstEntiteti.setModel(n);
        } else {
            DefaultListModel<Jelo> n = new DefaultListModel<>();
            Jelo j = new Jelo();
            j.setGlavno_jelo("Molim");
            j.setKolaci("pričekati");
            n.addElement(j);
            lstEntiteti.setModel(n);
            DuzeUcitanjeEntiteta d = new DuzeUcitanjeEntiteta();
            d.start();
        }
    }

    private void ocistiPolja() {
        txtGlavnoJelo.setText("");
        txtKolaci.setText("");
        txtPredjelo.setText("");
        txtSvedskiStol.setText("");
        txtTorte.setText("");
    }

    private void preuzmiVrijednosti(Jelo entitet) {
        entitet.setGlavno_jelo(txtGlavnoJelo.getText());
         entitet.setKolaci(txtKolaci.getText());
          entitet.setPredjelo(txtPredjelo.getText());
           entitet.setSvedski_stol(txtSvedskiStol.getText());
            entitet.setTorte(txtTorte.getText());
        
    }

=======
       DefaultListModel<Jelo> m = new DefaultListModel<>();
       for(Jelo j : obradaEntitet.getLista()) {
           m.addElement(j);
       }
       lstEntiteti.setModel(m);
       
       if(m.getSize()>0) {
           lstEntiteti.setSelectedIndex(m.getSize()-1);
       }
    }

    private void ocistiPolja() {
     txtNazivJelo.setText("");
     txtCijenaPoGlavi.setText("");
    }

    private void preuzmiVrijednosti(Jelo entitet) {
      entitet.setNaziv((txtNazivJelo.getText()));
        try {
            entitet.setCijenaPoGlavi(new BigDecimal(format.parse(txtCijenaPoGlavi.getText()).floatValue()));
        } catch (Exception e) {
            entitet.setCijenaPoGlavi(BigDecimal.ZERO);
            txtCijenaPoGlavi.setText("0");
        }
        
    }

   

>>>>>>> Verzija 1, greska u Svadbe
    private  class DuzeUcitanjeEntiteta extends Thread{
@Override
        public void run() {
            DefaultListModel<Jelo> n = new DefaultListModel<>();
            for (Jelo s : obradaEntitet.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                n.addElement(s);
            }
          lstEntiteti.setModel(n);
        }

    }
}
