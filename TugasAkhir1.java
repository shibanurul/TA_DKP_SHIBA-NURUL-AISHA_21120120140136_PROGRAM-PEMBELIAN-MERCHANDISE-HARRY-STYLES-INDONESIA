package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasAkhir1 {
    private JPanel panel;
    private JComboBox nama_barang;
    private JTextField harga_barang;
    private JTextField jumlah_beli;
    private JTextField jumlah_harga;
    private JTextField jumlah_bayar;
    private JTextField jumlah_kembalian;
    private JButton hapus;
    private JButton keluar;
    private JButton hitung_jumlah_barang;
    private JButton bayar;
    private JTextArea textarea;
    private JButton cetak;
    private JTextField nama_pembeli;
    private JTextField alamat;

    public static void main(String[] args){
        JFrame frame = new JFrame("HARRY STYLES'S MERCHANDISE");
        frame.setContentPane(new TugasAkhir1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TugasAkhir1() {
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nama_pembeli.setText("");
                harga_barang.setText("");
                jumlah_beli.setText("");
                jumlah_harga.setText("");
                jumlah_bayar.setText("");
                jumlah_kembalian.setText("");
                textarea.setText("");
                nama_barang.setSelectedIndex(0);

            }
        });
        keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        hitung_jumlah_barang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int JumlahBarang = Integer.parseInt(jumlah_beli.getText());
                int HargaBarang = Integer.parseInt(harga_barang.getText());
                jumlah_harga.setText(Integer.toString(HargaBarang * JumlahBarang));
            }
        });
        nama_barang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NamaBarang = (String) nama_barang.getSelectedItem();
                switch (NamaBarang) {
                    case "Fine Line T-Shirt (Black)":
                        harga_barang.setText("450000");
                        break;
                    case "Fine Line T-Shirt (White)":
                        harga_barang.setText("450000");
                        break;
                    case "Treat People With Kindness Hoodie (Black)":
                        harga_barang.setText("700000");
                        break;
                    case "Treat People With Kindness Hoodie (Grey)":
                        harga_barang.setText("700000");
                        break;
                    case "Watermelon Sugar Totebag":
                        harga_barang.setText("175000");
                        break;

                }
            }
        });
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int JumlahBayar = Integer.parseInt(jumlah_bayar.getText());
                int JumlahHarga = Integer.parseInt(jumlah_harga.getText());
                jumlah_kembalian.setText(Integer.toString(JumlahBayar-JumlahHarga));
            }
        });
        cetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int JumlahKembalian = Integer.parseInt(jumlah_kembalian.getText());
                if(JumlahKembalian>=0){
                    textarea.setText("Pembelian atas nama: " + nama_pembeli.getText()
                            + "\nAlamat: " + alamat.getText()
                            + "\nBarang yang dibeli: " + nama_barang.getSelectedItem()
                            + "\nJumlah Barang: " + jumlah_beli.getText() + "\nTotal Harga: "
                            + jumlah_harga.getText() + "\nPembelian berhasil dilakukan!");

                }else {
                    textarea.setText("Pembelian gagal dilakukan karena uang anda kurang!");
                }
            }
        });
    }
}