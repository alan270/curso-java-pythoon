//Dao =Data access objet, vas a crear inserte, update, cualquier logica que especifique el manejo de datos


package Clase10.Agenda_Java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ContactDao {

    public void insert(Contact c) {
        
        String sql = "INSERT INTO contacts_java (name, phone, email) VALUES (?, ?, ?)";
        try (Connection cn = Db.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, c.getName()); //lista de parametros para el sql
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());
            ps.executeUpdate();
            System.out.println("✔ Contacto agregado.");
        } catch (SQLException e) {
            System.out.println("Error insert: " + e.getMessage());

        }


    } 
    
    public List<Contact> list_all () { // le estas asignando al metodo un tipo
        String sql = "Select * from contacts_java";
        List<Contact> salida = new ArrayList<>(); 
        try (Connection cn = Db.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                salida.add(new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("phone"), rs.getString("email")));
            } //recorra los resultados que te dio el execute
            
        } catch (SQLException e) {
            System.out.println("Error List All: " + e.getMessage());

        }
        return salida;
    }
    
    public List<Contact> list_contact (String Nombre) {
        
       String sql = "select * from contacts_java where name = ?";
       List<Contact> salida = new ArrayList<>();
        try (Connection cn = Db.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {           
            ps.setString( 1, Nombre); //lista de parametros para el sql
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                salida.add(new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("phone"), rs.getString("email")));
            } //recorre
            System.out.println("✔ Contacto Econtrado: ");
        } catch (SQLException e) {
            System.out.println("No encontrado: " + e.getMessage());

        }
        return salida;
    }    

    public void update(Contact c) {
        
        String sql = "update contacts_java set name=?, phone=?, email = ? where id=? ";
        try (Connection cn = Db.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, c.getName()); //lista de parametros para el sql
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());
            ps.setInt(4, c.getId());
            ps.executeUpdate();
            System.out.println("✔ Actualización exitosa.");
        } catch (SQLException e) {
            System.out.println("Error de actualización: " + e.getMessage());

        }
    }
    
    public void erase(Integer c) {
        
        String sql = "delete from contacts_java where id=? ";
        try (Connection cn = Db.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, c);
            ps.executeUpdate();
            System.out.println("✔ Contacto eliminado Exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());

        }
    } 

    




    

    

}
