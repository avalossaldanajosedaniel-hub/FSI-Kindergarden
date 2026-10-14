import java.sql.*;
public class Bitacora {
    static String todos = "SELECT * FROM  bitacora ORDER BY folio DESC"; 
String folio, tiempo, tipo, observaciones,infantiles_curp,infantiles_nombrei,responsables_curpr,educadores_curpe ;
    public  Bitacora() {
    }
    
    public Bitacora(String folio, String tiempo, String tipo,
        String observaciones, String infantiles_curp, String infantiles_nombrei,
        String responsables_curpr, String educadores_curpe) {
        this.folio = folio;
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.observaciones = observaciones;

    }

     public int insertar(Connection con){
      int resultado = 0;
      try {
          String sql = "INSERT INTO bitacora VALUES(?,?,?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(sql);
          ps.setString(1, folio);
          ps.setString(2, tiempo);
          ps.setString(3, tipo);
          ps.setString(4, observaciones);
          ps.setString(4, infantiles_curp);
          ps.setString(5, infantiles_nombrei);
          ps.setString(6, responsables_curpr);
          ps.setString(7, educadores_curpe);
         
         
         return ps.executeUpdate();
      } catch (Exception e) {
          System.out.println("Error" +e.getMessage());
          return resultado;
      }
  }
  
  public int borrar(Connection con){
      int resultado = 0;
      try {
          String sql ="DELETE FOM bitacora WHERE folio = ?";
          PreparedStatement ps= con.prepareStatement(sql);
          ps.setString(1, folio);
          return ps.executeUpdate();
         
      } catch (Exception e) {
           System.out.println("Error:" +e.getMessage());
           return resultado;
      }
      
  }
  
  public int actualiza(Connection con){
      int resultado = 0;
      try {
          String  sql = "UPDATE bitacora SET tiempo=?, tipo=?, observaciones=?,infantiles_curp,infantiles_nombrei,responsables_curpr,educadores_curpe WHERE folio =?";
          PreparedStatement ps = con.prepareStatement(sql);
         
          
          ps.setString(1, tiempo);
          ps.setString(2, tipo);
          ps.setString(3, observaciones);
          ps.setString(4, infantiles_curp);
          ps.setString(5, infantiles_nombrei);
          ps.setString(6, responsables_curpr);
          ps.setString(7, educadores_curpe);
          
          return ps.executeUpdate();
      } catch (Exception e) {
           System.out.println("Error:" +e.getMessage());
           return resultado;
      }
 }
    
    
}
