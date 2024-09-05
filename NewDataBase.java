
import classesBase.MyTableModel;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NewDataBase extends javax.swing.JFrame {

    List <Produto> produto2024 = new LinkedList<Produto>();
    
    public NewDataBase() {
        initComponents();
        lerProdutos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Codigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnapagar = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btninserir = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtprocurar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Produto");

        Codigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Codigo.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Preço");

        btnapagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\micae\\OneDrive\\Documentos\\NetBeansProjects\\DataBase\\src\\Imagem.Xamp\\lixo.png")); // NOI18N
        btnapagar.setText("Apagar");
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });

        btnatualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\micae\\OneDrive\\Documentos\\NetBeansProjects\\DataBase\\src\\Imagem.Xamp\\editar.png")); // NOI18N
        btnatualizar.setText("Atualizar");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btninserir.setIcon(new javax.swing.ImageIcon("C:\\Users\\micae\\OneDrive\\Documentos\\NetBeansProjects\\DataBase\\src\\Imagem.Xamp\\success.png")); // NOI18N
        btninserir.setText("Insere");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
            }
        });

        btnlimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\micae\\OneDrive\\Documentos\\NetBeansProjects\\DataBase\\src\\Imagem.Xamp\\eraser.png")); // NOI18N
        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnsair.setIcon(new javax.swing.ImageIcon("C:\\Users\\micae\\OneDrive\\Documentos\\NetBeansProjects\\DataBase\\src\\Imagem.Xamp\\sair.png")); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(255, 255, 51));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtpreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprecoFocusLost(evt);
            }
        });
        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Procurar");

        txtprocurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprocurarKeyReleased(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabelaProdutoFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtprocurar, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btninserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtprocurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnapagar)
                    .addComponent(btnatualizar)
                    .addComponent(btnlimpar)
                    .addComponent(btnsair)
                    .addComponent(btninserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        this.limpartela();
        
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed
        if((!"".equals(this.txtnome.getText().trim())) && (!"".equals(this.txtpreco.getText().trim()))){
            try {
            Produto p = new Produto();
            
            p.setNome(this.txtnome.getText()); 
            p.setPreco(Double.parseDouble(this.txtpreco.getText().replace(',', '.')));
           // replace serve para trocar ',' com '.'
            //JOptionPane.showMessageDialog(null, p.toString());//Mostrar mensagem em cima

        ProdutoDAO dao= new ProdutoDAO("database2024","root");
        dao.inserir(p);
        limpartela();
        lerProdutos();

        } catch (SQLException ex) {
            //Logger.getLogger(NewDataBase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro - "+ ex.getMessage());
        }}
        else {
            if((!"".equals(this.txtnome.getText().trim())) && ("".equals(this.txtpreco.getText().trim()))){
                JOptionPane.showMessageDialog(null, " O campo preço devem ser preenchidos"
                    ," Erro", JOptionPane.ERROR_MESSAGE);
                this.txtpreco.requestFocus();
            }
            else
                if(("".equals(this.txtnome.getText().trim())) && (!"".equals(this.txtpreco.getText().trim()))){
                JOptionPane.showMessageDialog(null, " O campo nome devem ser preenchidos"
                    ," Erro", JOptionPane.ERROR_MESSAGE);
                this.txtpreco.requestFocus();
            }
             else
            JOptionPane.showMessageDialog(null, " Os campos nomes e preços devem ser preenchidos"
                    ," Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btninserirActionPerformed
    
    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
        int n = this.tabelaProduto.getSelectedRow();
        //System.out.println(n);
                
        if(n==-1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar o produto a ser apagado !");
            
        }else{
        int resposta = JOptionPane.showConfirmDialog(null,"Você deseja apagar "+
                this.produto2024.get(n).getNome() + " ?");
        if(resposta ==0){
            try {
                ProdutoDAO dao = new ProdutoDAO("database2024","root");
                dao.apagar(this.produto2024.get(n).getCodigo());
                this.lerProdutos();
            } catch (SQLException ex) {
                System.out.println("Erro = "+ex.getMessage());
                
            }
        }
            }
  
        
    }//GEN-LAST:event_btnapagarActionPerformed

    private void txtprecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecoFocusLost
       /* String numeroComPonto = this.txtpreco.getText().trim();
        boolean resultado = numeroComPonto.matches("[-+]?\\d+\\.d+\\d+");
        if(!resultado){
            JOptionPane.showMessageDialog(null,"O campo preço deve ser preenchido corretamente",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            this.txtpreco.requestFocus();
        }*/        
    }//GEN-LAST:event_txtprecoFocusLost

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        if("Atualizar".equals(this.btnatualizar.getText())){//this.btnatualizar.getText() == "Atualizar"
            int r = this.tabelaProduto.getSelectedRow();
           if(r ==-1){
               JOptionPane.showMessageDialog(null,"Você deve selecionar o item! ");
           }
           else {
               this.txtnome.setText(produto2024.get(r).getNome());
               this.txtpreco.setText(String.valueOf(produto2024.get(r).getPreco()));
               this.txtcodigo.setText(String.valueOf(produto2024.get(r).getCodigo()));

               this.btnapagar.setEnabled(false);//desabilitar botões
               this.btninserir.setEnabled(false);
               this.btnlimpar.setEnabled(false);

               this.btnatualizar.setText("Confirmar");
           }
       }else{
            Produto p = new Produto();
            this.txtcodigo.getText();
            p.setCodigo(Integer.parseInt(this.txtcodigo.getText()));
            p.setNome(this.txtnome.getText());
            p.setPreco(Double.parseDouble(this.txtpreco.getText().replace(',','.')));
            
            ProdutoDAO dao = new ProdutoDAO("database2024","root");
            try {
                dao.atualizar(p);
            } catch (SQLException ex) {
                System.out.println("Erro - "+ ex.getMessage());
            }
            limpartela();
            lerProdutos();
            this.btnapagar.setEnabled(true);
            this.btninserir.setEnabled(true);
            this.btnlimpar.setEnabled(true);
            this.btnatualizar.setText("Atualizar");
        }
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void tabelaProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaProdutoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutoFocusLost

    private void txtprocurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprocurarKeyReleased
        try {
            ProdutoDAO dao = new ProdutoDAO("database2024","root");
            
            produto2024 = dao.lerProduto(this.txtprocurar.getText()); //for(int i=0;i<produto2024.size();i++){
            // System.out.println(produto2024.get(i).toString());
            
            MyTableModel tab = new MyTableModel(Produto.class,produto2024,tabelaProduto);
            this.tabelaProduto.setModel(tab);
        } catch (SQLException ex) {
            Logger.getLogger(NewDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtprocurarKeyReleased

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDataBase().setVisible(true);
            }
        });
    }
    
    public void limpartela(){
        this.txtcodigo.setText(" ");
        this.txtnome.setText(" ");
        this.txtpreco.setText(" ");
        this.txtprocurar.setText(" ");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtprocurar;
    // End of variables declaration//GEN-END:variables

    private void lerProdutos() {
        
        ProdutoDAO dao = new ProdutoDAO("database2024","root");
        
        try {
            produto2024 = dao.lerProduto();
        } catch (SQLException ex) {
            System.out.println("Erro - "+ex.getMessage());
        }
        //for(int i=0;i<produto2024.size();i++){
       // System.out.println(produto2024.get(i).toString());
        
         MyTableModel tab = new MyTableModel(Produto.class,produto2024,tabelaProduto);
      this.tabelaProduto.setModel(tab);
    }
     
    }


