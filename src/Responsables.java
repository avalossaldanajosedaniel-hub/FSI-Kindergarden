
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Responsables {
     static String todos = "SELECT * FROM  responsables ORDER BY nombrer";
      static String curps = "SELECT curpr FROM responsables ORDER BY curpr";
      String curpr, nombrer, sexor, telefonor, parentesco, estador;

    public Responsables() {
    }

    public Responsables(String curpr, String nombrer, String sexor, String parentesco, String estador) {
        this.curpr = curpr;
        this.nombrer = nombrer;
        this.sexor = sexor;
        this.sexor = telefonor;
        this.parentesco = parentesco;
        this.estador = estador;
    }
  
  public int insertar(Connection con){
      int resultado = 0;
      try {
          String sql = "INSERT INTO infantes VALUES(?,?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(sql);
          ps.setString(1, curpr);
          ps.setString(2, nombrer);
          ps.setString(3, sexor);
          ps.setString(4, telefonor);
          ps.setString(5, parentesco);
          ps.setString(6, estador);
         
         return ps.executeUpdate();
      } catch (Exception e) {
          System.out.println("Eroor" +e.getMessage());
          return resultado;
      }
  }
  
  public int borrar(Connection con){
      int resultado = 0;
      try {
          String sql ="DELETE FOM responsables WHERE curp = ?";
          PreparedStatement ps= con.prepareStatement(sql);
          ps.setString(1, curpr);
          return ps.executeUpdate();
         
      } catch (Exception e) {
           System.out.println("Error:" +e.getMessage());
           return resultado;
      }
      
  }
  
  public int actualiza(Connection con){
      int resultado = 0;
      try {
          String  sql = "UPDATE responsables SET nombrer=?, sexor=?, parentesco=?, estador=? WHERE curpr =?";
          PreparedStatement ps = con.prepareStatement(sql);
         
          ps.setString(1, nombrer);
          ps.setString(2, sexor);
          ps.setString(3, parentesco);
          ps.setString(4, estador);
          ps.setString(5, curpr);
          
          return ps.executeUpdate();
      } catch (Exception e) {
           System.out.println("Error:" +e.getMessage());
           return resultado;
      }
 }
}
