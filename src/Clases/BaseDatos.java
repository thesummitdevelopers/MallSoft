package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class BaseDatos {
    String driver  = "com.mysql.jdbc.Driver";
    String url     = "jdbc:mysql://localhost:3306/wo";
    String usuario = "root";
    String clave   = "";
    
    public Connection Conectar(){
        try{
            Class.forName(driver);
            Connection xcon  = DriverManager.getConnection(url,usuario,clave);
            return xcon;
        }
        catch(Exception e){
            System.out.println(e.toString());            
        }
        return null;
    }
    
        public boolean validarUsuario(String xusu,String xcla){
        try {
            Connection xcon = this.Conectar();
            String sql = "select count(*) from usuarios where usuario=? AND contraseña=?";
            PreparedStatement ps = xcon.prepareStatement(sql);
            ps.setString(1, xusu);
            ps.setString(2, xcla);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String cantidad = rs.getString(1);
            int xcant = Integer.parseInt(cantidad);
            if (xcant > 0){
                return true;}
            xcon.close();
            return false;
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
        public boolean frameNormal(String xusu, String xcla){
        try{    
            Connection xcon = this.Conectar();
            String sql = "select tipo from usuarios where usuario=? AND contraseña=?";
            PreparedStatement ps = xcon.prepareStatement(sql);
            ps.setString(1, xusu);
            ps.setString(2, xcla);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String tipo = rs.getString(1);
            if (tipo.equals("normal")){
                return true;}
            else{
                xcon.close();
                return false;
            }           
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
        public void registrarUsuario(String xnom, String xape, String xusu, String xcon, String xcel, String xdir, String xema, String xtip) throws SQLException{                                  
            
            String cod = this.generarCodigo("usuarios", "usuario_id");          
            String sql = "insert into usuarios (usuario_id, usuario, contraseña, tipo) values (?,?,?,?)";
            
            Connection xcone = this.Conectar();
            PreparedStatement ps = xcone.prepareStatement(sql);
            ps.setString(1, cod);
            ps.setString(2, xusu);
            ps.setString(3, xcon);
            ps.setString(4, xtip);
            
            ps.executeUpdate();            
                                         
            
            cod = this.generarCodigo("perfiles", "perfil_id");
            sql = "insert into perfiles (perfil_id, usuario_id, nombre, apellidos, celular, direccion, email) values(?,?,?,?,?,?,?)";
            
            ps = xcone.prepareStatement(sql);
            ps.setString(1, cod);
            ps.setString(2, cod);
            ps.setString(3, xnom);
            ps.setString(4, xape);
            ps.setString(5, xcel);
            ps.setString(6, xdir);
            ps.setString(7, xema);                        
            
            ps.executeUpdate(); 
                        
            cod = this.generarCodigo("billeteras", "billetera_id");
            sql = "insert into billeteras (billetera_id, perfil_id, saldo) values(?,?,?)";
            
            ps = xcone.prepareStatement(sql);
            ps.setString(1, cod);
            ps.setString(2, cod);
            ps.setString(3, ""+150);                       
            
            ps.executeUpdate(); 
            
            xcone.close();
    }
    protected String generarCodigo(String tabla, String campo) throws SQLException {
        String rpta = "";
        String sql = "select count(*) from " + tabla;
        Connection xcon = this.Conectar();
        Statement st = xcon.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        int cant = Integer.parseInt(rs.getString(1).toString());
            if ( cant <= 0 )
                rpta = "1";
            else {
                sql = "select max(" + campo + ") from " + tabla;
                rs = st.executeQuery(sql);
                rs.next();
                cant = Integer.parseInt(rs.getString(1).toString()) + 1;
                rpta = "" + cant;
            }
        xcon.close();
        return rpta;
    }
    public Vector ResultSetToVector(ResultSet rs) throws SQLException {
        Vector vRows = new Vector();
        while(rs.next()) {
            Vector vCol = new Vector();
            int nroFields = rs.getMetaData().getColumnCount();
            for(int i=1 ; i <=nroFields; i++) {
                String strTmp = rs.getString(i);
                vCol.add(strTmp);
            }
            vRows.add(vCol);
        }
        return vRows;
    }
    public void guardarImagen(String ruta) throws FileNotFoundException, SQLException{
        Connection xcon = this.Conectar();
        String sql="update imagenes set imagen=? where imagen_id=?";        
        String id = "1";
        
        FileInputStream fi = null;
        PreparedStatement ps = null;        
        
        File file = new File(ruta);
        fi = new FileInputStream(file);

        ps = xcon.prepareStatement(sql);        
        ps.setBinaryStream(1, fi);
        ps.setString(2, id);
               
        ps.executeUpdate();
    }
    /*
        Connection xcon = this.Conectar();
        
        String id = generarCodigo("imagenes", "imagen_id");
        String sql="insert into imagenes (imagen, imagen_id) values (?,"+id+")";        
        
        FileInputStream fi = null;
        PreparedStatement ps = null;        
        
        File file = new File(ruta);
        fi = new FileInputStream(file);

        ps = xcon.prepareStatement(sql);        
        ps.setBinaryStream(1, fi);
        
        ps.executeUpdate();        */
}
    
