package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Productos {
    public static void main (String [] args){
        
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
    public Vector getProductos(){
        Vector vRet=null;
        try{
            String sql ="select producto_id,sector,categoria,marca,precio,disponibilidad from productos order by sector";
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
    
    public Vector ordenarLista(String campo){
        Vector vRet=null;
        try{
            String sql ="select producto_id,sector,categoria,marca,precio,disponibilidad from productos order by "+campo;
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
    
    public void grabarNuevoProducto( String[] datos ) throws SQLException {
        BaseDatos db = new BaseDatos();
        String xpro = db.generarCodigo("productos","producto_id");
        String xsec = datos[0];
        String xcat = datos[1];
        String xmar = datos[2];
        String xpre = datos[3];
        String xdis = datos[4];
        
        String sql = "insert into productos (producto_id,categoria,marca,precio,disponibilidad,sector) values (?,?,?,?,?,?) ";
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, xpro);
        ps.setString(2, xcat);
        ps.setString(3, xmar);
        ps.setString(4, xpre);
        ps.setString(5, xdis);
        ps.setString(6, xsec);
        ps.executeUpdate();
        xcon.close();
    }
    public void modificarProducto(String[] datos, String id) throws SQLException{
        
        String sql = "update productos set categoria=?, marca=?, precio=?, disponibilidad=?, sector=? where producto_id=?";                
        
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, datos[0]);
        ps.setString(2, datos[1]);
        ps.setString(3, datos[2]);
        ps.setString(4, datos[3]);
        ps.setString(5, datos[4]);
        ps.setString(6, id);
        ps.executeUpdate();        
        xcon.close();        
    }
    
    public void eliminarProducto(String id) throws SQLException{
        
        String sql = "delete from productos where producto_id=?";
        
        BaseDatos bd = new BaseDatos();     
        Connection xcon = bd.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, id);
        ps.executeUpdate();
        xcon.close();
                
    }
    
    public Vector buscarProducto(String id, String sec, String cat, String mar, String pre) throws SQLException{
        String oid ="", osec="", ocat="", omar="", opre="", a="";
        Vector vRet = null;
        
        if(id.equals(a)){
            oid="<>";            
        }else oid="LIKE";
               
        if(sec.equals(a)){
            osec="<>";
        }else osec="LIKE";
        
        if(cat.equals(a)){
            ocat="<>";
        }else ocat="LIKE";
        
        if(mar.equals(a)){
            omar="<>";
        }else omar="LIKE";
        
        if(pre.equals(a)){
            opre="<>";
        }else opre="LIKE";
        
        String sql = "Select producto_id,sector,categoria,marca,precio,disponibilidad "
                   + "From productos Where producto_id "+ oid +" '"+id+"' and categoria "+ ocat + "'%"+cat+
                     "%' and marca "+ omar +" '%"+mar+"%' and precio "+opre+" '"+pre+"%' and sector "+ osec +" '"+sec+"'";
                
        BaseDatos bd = new BaseDatos();     
        try (Connection xcon = bd.Conectar(); Statement stm = xcon.createStatement(); ResultSet rs = stm.executeQuery(sql)) {
            
            vRet = ResultSetToVector(rs);
                               
            xcon.close();
        }  
        return vRet;
    }
    
    public void comprarProducto(String[][] datos) throws SQLException{
        String compras[] = new String[(datos.length)*2];
        int indice = 0;
               
        for(int fil = 0; fil < datos.length; fil++){
            for(int col = 0; col < datos[0].length; col++){
                if(col==0 || col==3){
                    compras[indice] = datos[fil][col].toString();
                    indice++;
                }
            }
        }                
        
        BaseDatos bd = new BaseDatos();             
        Connection xcon = bd.Conectar();
        
        for(int i=0; i < compras.length; i+=2){
            
            int disponible = 0;           
            String id = compras[i];
            String cantidad = compras[i+1];                            
            
            String dis  = "select disponibilidad from productos where producto_id="+id;
            
            Statement st = xcon.createStatement();
            ResultSet rs = st.executeQuery(dis);
            rs.next();                
            disponible = (int) rs.getDouble(1);   
            
            String sql = "update productos set disponibilidad=?-? where producto_id=?";
            
            PreparedStatement ps = xcon.prepareStatement(sql);
            ps = xcon.prepareStatement(sql);
            ps.setString(1, ""+disponible);
            ps.setString(2, cantidad);
            ps.setString(3, id);
            ps.executeUpdate();                    
        }                                
        xcon.close();                
    }    
    public void crearCarrito(String[][] productos, double costo, String usuario) throws SQLException{
        BaseDatos bd = new BaseDatos();   
        
        String usuario_id="";
        String sql = "Select usuario_id From usuarios Where usuario='"+usuario+"'";
                               
        Connection xcon = bd.Conectar();
        Statement st = xcon.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        usuario_id = rs.getString(1);
        System.out.println(usuario_id);
        
        String compra_id = bd.generarCodigo("carritos", "compra_id");
        int indice = 0;
        String compras[] = new String[(productos.length)*2];
        
        for(int fil = 0; fil < productos.length; fil++){
            for(int col = 0; col < productos[0].length; col++){
                if(col==0 || col==3){
                    compras[indice] = productos[fil][col].toString();
                    indice++;
                }
            }
        }
                
        for(int i=0; i < compras.length; i+=2){
            
            String carrito_id = bd.generarCodigo("carritos", "carrito_id");
            String producto_id = compras[i];
            String cantidad = compras[i+1];
            
            sql = "Insert into carritos (carrito_id, compra_id, usuario_id, producto_id, cantidad, precio_total_carrito) values (?,?,?,?,?,?)";
            
            PreparedStatement ps = xcon.prepareStatement(sql);
            ps = xcon.prepareStatement(sql);
            ps.setString(1, carrito_id);
            ps.setString(2, compra_id);
            ps.setString(3, usuario_id);
            ps.setString(4, producto_id);
            ps.setString(5, cantidad);
            ps.setString(6, ""+costo);
            ps.executeUpdate();            
        }
    }
}
