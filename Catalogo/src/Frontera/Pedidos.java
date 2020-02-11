/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.CalcularPrecioPedido;
import DAO.PedidoItemDAO;
import DAO.ProductoDAO;
import Entidad.Pedido;
import Entidad.PedidoItem;
import Entidad.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author wilde
 */
public class Pedidos extends javax.swing.JPanel {

    Pedido pedido;
    List<PedidoItem> items = new ArrayList<>();
    ArrayList<ItemPanel> pItems = new ArrayList<>();
    /**
     * Creates new form Pedidos
     */
    public Pedidos() {
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

        documentoCompradorL = new javax.swing.JLabel();
        nombreCompradorL = new javax.swing.JLabel();
        productosL = new javax.swing.JLabel();
        documentoCompradorTF = new javax.swing.JTextField();
        nombreCompradorTF = new javax.swing.JTextField();
        anadirItemB = new javax.swing.JButton();
        itemsSP = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();
        precioTotalL = new javax.swing.JLabel();
        PrecioTotalMostrarL = new javax.swing.JLabel();
        nuevoPedidoB = new javax.swing.JButton();
        aprobarPedidoB = new javax.swing.JButton();

        documentoCompradorL.setText("Documento comprador");

        nombreCompradorL.setText("Nombre comprador");

        productosL.setText("Productos");

        documentoCompradorTF.setText("0");
        documentoCompradorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoCompradorTFActionPerformed(evt);
            }
        });

        anadirItemB.setText("Añadir item");
        anadirItemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirItemBActionPerformed(evt);
            }
        });

        itemsPanel.setLayout(new java.awt.GridLayout(0, 1));
        itemsSP.setViewportView(itemsPanel);

        precioTotalL.setText("Precio total");

        nuevoPedidoB.setText("Nuevo pedido");
        nuevoPedidoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPedidoBActionPerformed(evt);
            }
        });

        aprobarPedidoB.setText("Aprobar pedido");
        aprobarPedidoB.setEnabled(false);
        aprobarPedidoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprobarPedidoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemsSP)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(documentoCompradorL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(documentoCompradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productosL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anadirItemB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCompradorL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(precioTotalL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCompradorTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(PrecioTotalMostrarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoPedidoB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aprobarPedidoB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentoCompradorL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documentoCompradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCompradorL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCompradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productosL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(anadirItemB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PrecioTotalMostrarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precioTotalL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemsSP, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoPedidoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aprobarPedidoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void documentoCompradorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoCompradorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoCompradorTFActionPerformed

    private void nuevoPedidoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPedidoBActionPerformed
        pedido = new Pedido();
        CalcularPrecioPedido calcular = new CalcularPrecioPedido();
        Random random = new Random();
        pedido.setCodigoPedido(random.nextInt());
        pedido.setDocumentoComprador(Integer.parseInt(documentoCompradorTF.getText()));
        pedido.setNombreComprador(nombreCompradorTF.getText());
        
        for(ItemPanel ip : pItems){
            ip.getItem().setCantidadItem((int) ip.getCantidadS().getValue());
            ip.getItem().setSubtotalItem(ip.getItem().getPrecioActualItem() * ip.getItem().getCantidadItem());
            ip.getMostrarSubtotalL().setText(String.valueOf(ip.getItem().getSubtotalItem()));
        }
        
        pedido.setItems(items);
        calcular.verificarExistencias(pedido);
        nuevoPedidoB.setEnabled(false);
        aprobarPedidoB.setEnabled(true);
        PrecioTotalMostrarL.setText(String.valueOf(pedido.getPrecioTotal()));
    }//GEN-LAST:event_nuevoPedidoBActionPerformed

    private void anadirItemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirItemBActionPerformed
        PedidoItemDAO iDao = new PedidoItemDAO();
        ProductoDAO prDao = new ProductoDAO();
        String nombreProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto");
        Producto producto = new Producto();
        producto.setNombreProducto(nombreProducto);
        producto = prDao.leer(producto);
        PedidoItem item = new PedidoItem();
        Random random = new Random();
        item.setCodigoItem(random.nextInt());
        item.setProducto(producto);
        item.setPrecioActualItem(producto.getPrecio());
        items.add(item);
        itemsPanel.setVisible(false);   
        ItemPanel itemMostrar = new ItemPanel(item);
        itemsPanel.add(itemMostrar);
        itemsPanel.setVisible(true);
    }//GEN-LAST:event_anadirItemBActionPerformed

    private void aprobarPedidoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprobarPedidoBActionPerformed
        CalcularPrecioPedido calcular = new CalcularPrecioPedido();
        calcular.aprobarPedido(pedido);
        nuevoPedidoB.setEnabled(true);
        aprobarPedidoB.setEnabled(false);
    }//GEN-LAST:event_aprobarPedidoBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrecioTotalMostrarL;
    private javax.swing.JButton anadirItemB;
    private javax.swing.JButton aprobarPedidoB;
    private javax.swing.JLabel documentoCompradorL;
    private javax.swing.JTextField documentoCompradorTF;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JScrollPane itemsSP;
    private javax.swing.JLabel nombreCompradorL;
    private javax.swing.JTextField nombreCompradorTF;
    private javax.swing.JButton nuevoPedidoB;
    private javax.swing.JLabel precioTotalL;
    private javax.swing.JLabel productosL;
    // End of variables declaration//GEN-END:variables
}