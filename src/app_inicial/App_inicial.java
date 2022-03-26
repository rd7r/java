package app_inicial;

import Controller.CtrlProducto;
import Model.ConsultasProducto;
import Model.Producto;
import vista.frmProducto;

public class App_inicial {

    public static void main(String[] args) {
        
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmProducto frm = new frmProducto();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
