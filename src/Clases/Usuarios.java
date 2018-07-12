package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Usuarios {
    public static void main (String[] args){
        
    }
    private Vector ResultSetToVector(ResultSet rs) throws SQLException {
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
    
    public Vector getUsuarios(){
        Vector vRet=null;
        try{
            String sql ="select u.usuario_id,u.usuario,p.nombre,p.apellidos,p.celular,p.direccion,p.email,u.tipo "
                    + "  from usuarios u,perfiles p "
                    + "  where p.usuario_id=u.usuario_id"
                    + "  order by p.usuario_id";
            
            BaseDatos bd = new BaseDatos();
            Connection xcon = bd.Conectar();
            Statement stm = xcon.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            vRet = ResultSetToVector(rs);                                    
            
            rs.close();
            stm.close();
            xcon.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return vRet;                
    }  
    public Vector buscarUsuarios(String id, String usu, String nom, String ape, String cel, String dir, String ema, String tip) throws SQLException{
        String oid ="", ousu="", onom="", oape="", ocel="", odir="", oema="", otip="", a="";
        Vector vRet = null;
        
        if(id.equals(a)){
            oid="<>";            
        }else oid="LIKE";
               
        if(usu.equals(a)){
            ousu="<>";
        }else ousu="LIKE";
        
        if(nom.equals(a)){
            onom="<>";
        }else onom="LIKE";
        
        if(ape.equals(a)){
            oape="<>";
        }else oape="LIKE";
        
        if(cel.equals(a)){
            ocel="<>";
        }else ocel="LIKE";
        
        if(dir.equals(a)){
            odir="<>";
        }else odir="LIKE";
        
        if(ema.equals(a)){
            oema="<>";
        }else oema="LIKE";
        
        if(tip.equals(a)){
            otip="<>";
        }else otip="LIKE";
                
        String sql = "Select u.usuario_id,u.usuario,p.nombre,p.apellidos,p.celular,p.direccion,p.email,u.tipo "
                   + "From usuarios u, perfiles p "
                   + "Where u.usuario_id "+ oid +" '"+id+"' and u.usuario "+ ousu +" '%"+usu+"%' and p.nombre "+ onom +" '%"+nom+
                     "%' and p.apellidos "+oape+" '%"+ape+"%' and p.celular "+ ocel +" '%"+cel+"%' and p.direccion "+ odir +" '%"+dir+
                     "%' and p.email "+ oema +" '%"+ema+"%' and u.tipo "+otip+" '%"+tip+"%' and u.usuario_id=p.usuario_id";
        BaseDatos bd = new BaseDatos();     
        try (Connection xcon = bd.Conectar(); Statement stm = xcon.createStatement(); ResultSet rs = stm.executeQuery(sql)) {
            
            vRet = ResultSetToVector(rs);
                               
            xcon.close();
        }  
        return vRet;                       
    }
    
    public void eliminarUsuario(String id) throws SQLException{
        
        String sql = "delete from usuarios where usuario_id=?";
        
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
        
        sql = "delete from perfiles where usuario_id=?";
        
        xcon = bd.Conectar();
        ps = xcon.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
        xcon.close();
    }
    
    public void modificarUsuario(String[] datos) throws SQLException{
        String sql = "update usuarios set usuario=? where usuario_id=?";                
        String id=datos[0]; String usu=datos[1]; String nom=datos[2]; String ape=datos[3]; String cel=datos[4]; String dir=datos[5]; String ema=datos[6];
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, usu);
        ps.setString(2, id);
        
        ps.executeUpdate();        
        
        sql = "update perfiles set nombre=?, apellidos=?, celular=?, direccion=?, email=? where usuario_id=?";
        
        ps = xcon.prepareStatement(sql);
        ps.setString(1, nom);
        ps.setString(2, ape);
        ps.setString(3, cel);
        ps.setString(4, dir);
        ps.setString(5, ema);
        ps.setString(6, id);

        ps.executeUpdate();        

        xcon.close();        
    }
    
    public void modificarPerfil(String[] datos, String usuario)throws SQLException{
        String sql = "update perfiles set celular=?, direccion=?, email=? where (Select usuario_id From usuarios Where usuario='"+usuario+"') = perfil_id";              
        String telefono=datos[0]; String direccion=datos[1]; String email=datos[2];
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, telefono);
        ps.setString(2, direccion);
        ps.setString(3, email);
        
        ps.executeUpdate();        
                
        xcon.close();
    }
    
    public void modificarContraseña(String contraseña, String usuario) throws SQLException{
        String sql = "update usuarios set contraseña=? where usuario=?";        
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, contraseña);
        ps.setString(2, usuario);        
        
        ps.executeUpdate();        
                
        xcon.close();
    }
    
    public Vector datosUsuario(String usuario) throws SQLException{                                 
        Vector vRet=null;
        try{
            String sql="Select p.nombre, p.apellidos, p.celular, p.direccion, p.email, u.usuario "
                + " From usuarios u, perfiles p "
                + " Where u.usuario='"+usuario+"' and u.usuario_id = p.usuario_id";
            
            BaseDatos bd = new BaseDatos();
            Connection xcon = bd.Conectar();
            Statement stm = xcon.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            vRet = ResultSetToVector(rs);                                    
            
            rs.close();
            stm.close();
            xcon.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return vRet;
    }

    public double saldoUsuario(String usuario) throws SQLException{
        double saldo=0;
        String sql = "Select saldo "+
                     "From billeteras "+
                     "Where (Select usuario_id From usuarios Where usuario='"+usuario+"') = perfil_id";
        
        BaseDatos bd = new BaseDatos();     
                        
        Connection xcon = bd.Conectar();
        Statement st = xcon.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();                
        
        saldo = rs.getDouble(1);            
        return saldo;                        
    }
    public void restarSaldo(double costo, String usuario) throws SQLException{
        double saldo = saldoUsuario(usuario);
        
        String sql = "update billeteras set saldo=?-? where (Select usuario_id From usuarios Where usuario='"+usuario+"') = perfil_id";
            
        BaseDatos bd = new BaseDatos();             
        Connection xcon = bd.Conectar();
        
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps = xcon.prepareStatement(sql);
        ps.setString(1, ""+saldo);
        ps.setString(2, ""+costo);        
        ps.executeUpdate();                    
    }            
}
