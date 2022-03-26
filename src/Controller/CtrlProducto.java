package Controller;

import Model.ConsultasProducto;
import Model.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmProducto;

public class CtrlProducto implements ActionListener{

    private Producto mod;
    private ConsultasProducto modC;
    private frmProducto frm;
    
    public CtrlProducto(Producto mod, ConsultasProducto modC, frmProducto frm){
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnguardar.addActionListener(this);
        this.frm.btnmodificar.addActionListener(this);
        this.frm.btneliminar.addActionListener(this);
        this.frm.btnlimpiar.addActionListener(this);
        this.frm.btnbuscar.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == frm.btnguardar) {
            mod.setCodigo(frm.txtcodigo.getText());
            mod.setNombre(frm.txtnombre.getText());
            mod.setPrecio(Double.parseDouble(frm.txtprecio.getText()));
            mod.setCantidad(Integer.parseInt(frm.txtcantidad.getText()));
            
            if (modC.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardado");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnmodificar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));
            mod.setCodigo(frm.txtcodigo.getText());
            mod.setNombre(frm.txtnombre.getText());
            mod.setPrecio(Double.parseDouble(frm.txtprecio.getText()));
            mod.setCantidad(Integer.parseInt(frm.txtcantidad.getText()));
            
            if (modC.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btneliminar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));
            
            if (modC.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnbuscar) {
            mod.setCodigo(frm.txtcodigo.getText());
            
            if (modC.buscar(mod)) {
                frm.txtId.setText(String.valueOf(mod.getId()));
                frm.txtcodigo.setText(mod.getCodigo());
                frm.txtnombre.setText(mod.getNombre());
                frm.txtprecio.setText(String.valueOf(mod.getPrecio()));
                frm.txtcantidad.setText(String.valueOf(mod.getCantidad()));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el resultado");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnlimpiar) {
            limpiar();
        }
        
    }
    
    public void limpiar(){
        frm.txtId.setText(null);
        frm.txtcodigo.setText(null);
        frm.txtnombre.setText(null);
        frm.txtprecio.setText(null);
        frm.txtcantidad.setText(null);
    }
    
}
