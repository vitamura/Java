/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitacoes.java;

/**
 *
 * @author Soares
 */
public class solicit extends javax.swing.JFrame {

    /**
     * Creates new form solicit
     */
    public solicit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolher = new javax.swing.JLabel();
        subsecoes = new javax.swing.JComboBox<>();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 260));
        setResizable(false);
        getContentPane().setLayout(null);

        escolher.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        escolher.setForeground(new java.awt.Color(255, 255, 255));
        escolher.setText("Escolha a subseção:");
        getContentPane().add(escolher);
        escolher.setBounds(210, 80, 170, 20);

        subsecoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adamantina", "Aguaí", "Águas de Lindóia", "Agudos", "Altinópolis ", "Americana", "Américo Brasiliense", "Amparo ", "Andradina ", "Aparecida ", "Apiaí ", "Araçatuba ", "Araraquara", "Araras ", "Artur Nogueira ", "Arujá ", "Assis ", "Atibaia ", "Auriflama ", "Avaré ", "Bariri ", "Barra Bonita ", "Barretos ", "Barueri ", "Bastos ", "Batatais ", "Bauru ", "Bebedouro  ", "Bertioga ", "Birigui ", "Boituva ", "Botucatu ", "Bragança Paulista ", "Brodowski ", "Brotas", "Butantã ", "Cabreúva ", "Caçapava ", "Cachoeira Paulista", "Caconde ", "Cafelândia  ", "Cajuru ", "Campinas ", "Campos do Jordão ", "Cândido Mota ", "Capão Bonito ", "Capivari ", "Caraguatatuba ", "Carapicuíba ", "Cardoso ", "Casa Branca ", "Catanduva ", "Cerqueira César ", "Cerquilho  ", "Conchas ", "Cotia ", "Cruzeiro ", "Cubatão ", "Descalvado ", "Diadema ", "Dois Córregos", "Dracena ", "Embu das Artes ", "Embu-Guaçu ", "Espírito Santo do Pinhal ", "Estrela d'Oeste ", "Fernandópolis ", "Ferraz de Vasconcelos ", "Franca ", "Francisco Morato ", "Franco da Rocha ", "Garça ", "General Salgado ", "Guaíra ", "Guararapes ", "Guará ", "Guaratinguetá ", "Guariba ", "Guarujá ", "Guarulhos ", "Hortolândia ", "Ibitinga ", "Ibiúna ", "Igarapava ", "Iguape ", "Ilha Solteira ", "Ilhabela ", "Indaiatuba ", "Ipiranga ", "Itaí ", "Itanhaém ", "Itapecerica da Serra ", "Itapetininga ", "Itapeva ", "Itapevi", "Itapira ", "Itápolis ", "Itaquaquecetuba ", "Itaquera ", "Itararé ", "Itatiba ", "Itu ", "Ituverava ", "Jabaquara ", "Jaboticabal ", "Jacareí ", "Jacupiranga ", "Jaguariúna ", "Jales ", "Jandira ", "Jaú ", "José Bonifácio ", "Jundiaí ", "Junqueirópolis ", "Lapa ", "Laranjal Paulista ", "Leme ", "Lençois Paulista ", "Limeira", "Lins ", "Lorena ", "Lucélia ", "Mairinque  ", "Mairiporã ", "Marília ", "Matão  ", "Mauá ", "Miguelópolis ", "Miracatu ", "Mirandópolis ", "Mirassol ", "Mococa ", "Mogi das Cruzes ", "Mogi Guaçu ", "Mogi Mirim ", "Monte Alto ", "Monte Aprazível ", "Monte Azul Paulista ", "Morro Agudo ", "Nhandeara ", "Nossa Senhora do Ó ", "Nova Odessa ", "Novo Horizonte ", "Olimpia ", "Orlândia ", "Osasco ", "Osvaldo Cruz ", "Ourinhos  ", "Pacaembu ", "Palmeira D'Oeste ", "Palmital ", "Panorama ", "Paraguaçu Paulista ", "Patrocínio Paulista ", "Paulínia  ", "Paulo de Faria ", "Pederneiras ", "Pedregulho ", "Pedreira ", "Penápolis ", "Penha de França ", "Pereira Barreto ", "Peruíbe ", "Piedade ", "Pindamonhangaba ", "Pinheiros", "Piracaia ", "Piracicaba ", "Piraju ", "Pirajuí ", "Pirapozinho ", "Pirassununga ", "Pitangueiras ", "Poá ", "Pompéia ", "Porto Feliz", "Porto Ferreira ", "Praia Grande ", "Presidente Bernardes ", "Presidente Epitácio ", "Presidente Prudente ", "Presidente Venceslau ", "Promissão  ", "Quatá ", "Rancharia ", "Registro ", "Ribeirão Bonito ", "Ribeirão Pires ", "Ribeirão Preto ", "Rio Claro ", "Rosana ", "Salto ", "Salto de Pirapora ", "Santa Adélia ", "Santa Barbara D'Oeste ", "Santa Cruz das Palmeiras ", "Santa Cruz do Rio Pardo ", "Santa Fé do Sul  ", "Santa Isabel ", "Santa Rita do Passa Quatro", "Santana  ", "Santana de Parnaíba ", "Santo Amaro ", "Santo Anastácio  ", "Santo André ", "Santos  ", "São Bernardo do Campo ", "São Caetano do Sul ", "São Carlos ", "São João da Boa Vista ", "São Joaquim da Barra ", "São José do Rio Pardo ", "São José do Rio Preto ", "São José dos Campos", "São Luiz do Paraitinga ", "São Manuel ", "São Miguel Paulista ", "São Pedro ", "São Roque  ", "São Sebastião ", "São Sebastião da Grama ", "São Vicente", "Serra Negra ", "Sertãozinho ", "Socorro", "Sorocaba", "Sumaré ", "Suzano ", "Taboão da Serra ", "Tambaú ", "Tanabi ", "Taquaritinga ", "Taquarituba ", "Tatuapé ", "Tatuí ", "Taubaté ", "Teodoro Sampaio ", "Tietê ", "Tremembé ", "Tupã ", "Tupi Paulista ", "Ubatuba ", "Urupês ", "Valinhos ", "Valparaíso ", "Vargem Grande do Sul ", "Vargem Grande Paulista ", "Vila Prudente ", "Vinhedo ", "Votorantim", "Votuporanga" }));
        subsecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsecoesActionPerformed(evt);
            }
        });
        getContentPane().add(subsecoes);
        subsecoes.setBounds(210, 110, 150, 20);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solicitacoes/java/oab.jpg"))); // NOI18N
        imagem.setMaximumSize(new java.awt.Dimension(420, 260));
        imagem.setMinimumSize(new java.awt.Dimension(420, 260));
        imagem.setPreferredSize(new java.awt.Dimension(420, 260));
        getContentPane().add(imagem);
        imagem.setBounds(0, 0, 420, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subsecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsecoesActionPerformed
        // TODO add your handling code here:
        callframe ();
    }//GEN-LAST:event_subsecoesActionPerformed

    /**
     * @param args the command line arguments
     */
    private void callframe () {
        System.out.println("Olá");
    }
    
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
            java.util.logging.Logger.getLogger(solicit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(solicit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(solicit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(solicit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new solicit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel escolher;
    private javax.swing.JLabel imagem;
    private javax.swing.JComboBox<String> subsecoes;
    // End of variables declaration//GEN-END:variables
}
