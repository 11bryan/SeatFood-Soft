/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ConexionPGA;
import modelo.modelo_entrega;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class ControlEntrega {

    private modelo_entrega mentrega;

    public ControlEntrega() {
    }

    public ControlEntrega(modelo_entrega mentrega) {
        this.mentrega = mentrega;
    }

    private void imprimereporte() {
        ConexionPGA con = new ConexionPGA();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Entregas.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
