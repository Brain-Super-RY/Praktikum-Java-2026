/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas.praktikum.pkg07.pkg08;

/**
 *
 * @author ACER NITRO
 */
public class AplikasiKalkulatorNew extends javax.swing.JFrame {
 
    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(AplikasiKalkulatorNew.class.getName());
 
    // ── State kalkulator ──────────────────────────────────────────────────────
    private double  angkaPertama  = 0;   // operand pertama
    private String  operator      = "";  // operator yang dipilih (+, -, *, /, %)
    private boolean operatorDipilih = false; // sudah tekan operator?
 
    public AplikasiKalkulatorNew() {
        initComponents();
        bindActions();   // pasang semua listener di sini
    }
    
    // ── Pasang listener secara programatis ────────────────────────────────────
    private void bindActions() {
 
        // --- Tombol angka ---
        angka0.addActionListener(e -> tambahAngka("0"));
        angka1.addActionListener(e -> tambahAngka("1"));
        angka2.addActionListener(e -> tambahAngka("2"));
        angka3.addActionListener(e -> tambahAngka("3"));
        angka4.addActionListener(e -> tambahAngka("4"));
        angka5.addActionListener(e -> tambahAngka("5"));
        angka6.addActionListener(e -> tambahAngka("6"));
        angka7.addActionListener(e -> tambahAngka("7"));
        angka8.addActionListener(e -> tambahAngka("8"));
        angka9.addActionListener(e -> tambahAngka("9"));
 
        // --- Titik desimal ---
        titik.addActionListener(e -> {
            String teks = inputAngka.getText();
            if (!teks.contains(".")) {
                inputAngka.setText(teks.isEmpty() ? "0." : teks + ".");
            }
        });
 
        // --- Clear ---
        clear.addActionListener(e -> {
            inputAngka.setText("");
            angkaPertama    = 0;
            operator        = "";
            operatorDipilih = false;
        });
 
        // --- Back (hapus karakter terakhir) ---
        back.addActionListener(e -> {
            String teks = inputAngka.getText();
            if (!teks.isEmpty()) {
                inputAngka.setText(teks.substring(0, teks.length() - 1));
            }
        });
 
        // --- Exit ---
        exit.addActionListener(e -> System.exit(0));
 
        // --- Operator aritmatika ---
        simbolTambah.addActionListener(e -> simpanOperator("+"));
        simbolKurang.addActionListener(e -> simpanOperator("-"));
        simbolBintang.addActionListener(e -> simpanOperator("*"));
        simbolPeratauBagi.addActionListener(e -> simpanOperator("/"));
 
        // --- Persen (% dari angkaPertama) ---
        simbolPersen.addActionListener(e -> {
            if (!inputAngka.getText().isEmpty()) {
                double angkaKedua = Double.parseDouble(inputAngka.getText());
                double hasil = angkaPertama * angkaKedua / 100;
                inputAngka.setText(formatHasil(hasil));
                operatorDipilih = false;
            }
        });
 
        // --- Sama dengan ---
        simbolSamaDengan.addActionListener(e -> hitungHasil());
    }
 
    // ── Helper: tambah digit ke display ───────────────────────────────────────
    private void tambahAngka(String digit) {
        if (operatorDipilih) {
            // mulai mengetik angka kedua → bersihkan display
            inputAngka.setText(digit);
            operatorDipilih = false;
        } else {
            String teks = inputAngka.getText();
            // hindari leading zero ganda
            if (teks.equals("0")) {
                inputAngka.setText(digit);
            } else {
                inputAngka.setText(teks + digit);
            }
        }
    }
 
    // ── Helper: simpan operator & angka pertama ───────────────────────────────
    private void simpanOperator(String op) {
        if (!inputAngka.getText().isEmpty()) {
            angkaPertama = Double.parseDouble(inputAngka.getText());
        }
        operator        = op;
        operatorDipilih = true;   // display akan dibersihkan saat digit berikutnya
    }
 
    // ── Helper: hitung dan tampilkan hasil ────────────────────────────────────
    private void hitungHasil() {
        if (operator.isEmpty() || inputAngka.getText().isEmpty()) return;
 
        double angkaKedua = Double.parseDouble(inputAngka.getText());
        double hasil = 0;
 
        switch (operator) {
            case "+": hasil = angkaPertama + angkaKedua; break;
            case "-": hasil = angkaPertama - angkaKedua; break;
            case "*": hasil = angkaPertama * angkaKedua; break;
            case "/":
                if (angkaKedua == 0) {
                    inputAngka.setText("Error: bagi 0");
                    operator = "";
                    return;
                }
                hasil = angkaPertama / angkaKedua;
                break;
            default: return;
        }
 
        inputAngka.setText(formatHasil(hasil));
        angkaPertama    = hasil;   // rantai operasi: bisa lanjut hitung
        operator        = "";
        operatorDipilih = false;
    }
 
    // ── Helper: tampilkan tanpa ".0" jika bulat ───────────────────────────────
    private String formatHasil(double nilai) {
        if (nilai == Math.floor(nilai) && !Double.isInfinite(nilai)) {
            return String.valueOf((long) nilai);
        }
        return String.valueOf(nilai);
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
        inputAngka = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        angka8 = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        simbolSamaDengan = new javax.swing.JButton();
        simbolPersen = new javax.swing.JButton();
        simbolPeratauBagi = new javax.swing.JButton();
        simbolBintang = new javax.swing.JButton();
        simbolTambah = new javax.swing.JButton();
        simbolKurang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        inputAngka.setBackground(new java.awt.Color(255, 255, 255));
        inputAngka.setForeground(new java.awt.Color(0, 0, 0));
        inputAngka.addActionListener(this::inputAngkaActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(inputAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(inputAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        angka8.setBackground(new java.awt.Color(0, 204, 255));
        angka8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka8.setForeground(new java.awt.Color(0, 0, 0));
        angka8.setText("8");

        angka7.setBackground(new java.awt.Color(0, 204, 255));
        angka7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka7.setForeground(new java.awt.Color(0, 0, 0));
        angka7.setText("7");
        angka7.addActionListener(this::angka7ActionPerformed);

        angka9.setBackground(new java.awt.Color(0, 204, 255));
        angka9.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka9.setForeground(new java.awt.Color(0, 0, 0));
        angka9.setText("9");

        angka4.setBackground(new java.awt.Color(0, 204, 255));
        angka4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka4.setForeground(new java.awt.Color(0, 0, 0));
        angka4.setText("4");

        angka1.setBackground(new java.awt.Color(0, 204, 255));
        angka1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka1.setForeground(new java.awt.Color(0, 0, 0));
        angka1.setText("1");

        angka2.setBackground(new java.awt.Color(0, 204, 255));
        angka2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka2.setForeground(new java.awt.Color(0, 0, 0));
        angka2.setText("2");

        angka5.setBackground(new java.awt.Color(0, 204, 255));
        angka5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka5.setForeground(new java.awt.Color(0, 0, 0));
        angka5.setText("5");

        angka6.setBackground(new java.awt.Color(0, 204, 255));
        angka6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka6.setForeground(new java.awt.Color(0, 0, 0));
        angka6.setText("6");

        angka3.setBackground(new java.awt.Color(0, 204, 255));
        angka3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka3.setForeground(new java.awt.Color(0, 0, 0));
        angka3.setText("3");

        titik.setBackground(new java.awt.Color(0, 204, 255));
        titik.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        titik.setForeground(new java.awt.Color(0, 0, 0));
        titik.setText(".");

        angka0.setBackground(new java.awt.Color(0, 204, 255));
        angka0.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        angka0.setForeground(new java.awt.Color(0, 0, 0));
        angka0.setText("0");

        clear.setBackground(new java.awt.Color(0, 204, 255));
        clear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("C");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(angka4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(angka8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(angka1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(titik, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka8)
                    .addComponent(angka7)
                    .addComponent(angka9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka4)
                    .addComponent(angka5)
                    .addComponent(angka6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1)
                    .addComponent(angka2)
                    .addComponent(angka3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(angka0)
                    .addComponent(titik))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        back.setBackground(new java.awt.Color(51, 204, 255));
        back.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("B");

        exit.setBackground(new java.awt.Color(51, 204, 255));
        exit.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("E");

        simbolSamaDengan.setBackground(new java.awt.Color(51, 204, 255));
        simbolSamaDengan.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolSamaDengan.setForeground(new java.awt.Color(0, 0, 0));
        simbolSamaDengan.setText("=");

        simbolPersen.setBackground(new java.awt.Color(51, 204, 255));
        simbolPersen.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolPersen.setForeground(new java.awt.Color(0, 0, 0));
        simbolPersen.setText("%");

        simbolPeratauBagi.setBackground(new java.awt.Color(51, 204, 255));
        simbolPeratauBagi.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolPeratauBagi.setForeground(new java.awt.Color(0, 0, 0));
        simbolPeratauBagi.setText("/");

        simbolBintang.setBackground(new java.awt.Color(51, 204, 255));
        simbolBintang.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolBintang.setForeground(new java.awt.Color(0, 0, 0));
        simbolBintang.setText("*");

        simbolTambah.setBackground(new java.awt.Color(51, 204, 255));
        simbolTambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolTambah.setForeground(new java.awt.Color(0, 0, 0));
        simbolTambah.setText("+");

        simbolKurang.setBackground(new java.awt.Color(51, 204, 255));
        simbolKurang.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        simbolKurang.setForeground(new java.awt.Color(0, 0, 0));
        simbolKurang.setText("-");
        simbolKurang.addActionListener(this::simbolKurangActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simbolSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(simbolPersen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(simbolBintang, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(simbolTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simbolPeratauBagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simbolKurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolTambah)
                    .addComponent(simbolKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolBintang)
                    .addComponent(simbolPeratauBagi))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolSamaDengan)
                    .addComponent(simbolPersen))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(exit))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAngkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAngkaActionPerformed

    private void simbolKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolKurangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simbolKurangActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angka7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new AplikasiKalkulatorNew().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputAngka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton simbolBintang;
    private javax.swing.JButton simbolKurang;
    private javax.swing.JButton simbolPeratauBagi;
    private javax.swing.JButton simbolPersen;
    private javax.swing.JButton simbolSamaDengan;
    private javax.swing.JButton simbolTambah;
    private javax.swing.JButton titik;
    // End of variables declaration//GEN-END:variables
}