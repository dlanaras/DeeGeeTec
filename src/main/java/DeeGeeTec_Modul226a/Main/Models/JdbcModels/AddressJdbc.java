package DeeGeeTec_Modul226a.Main.Models.JdbcModels;

import DeeGeeTec_Modul226a.Dbconfig.JdbcDb;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Account;
import DeeGeeTec_Modul226a.Main.Models.AbstractModels.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressJdbc extends Address {
    /**
     * This String contains the street of a location
     */
    private String street;
    /**
     * This String contains the PLZ of a location
     */
    private String plz;
    /**
     * This String contains the streetnumber of a location
     */
    private String streetNum;
    /**
     * This String contains the place of a location
     */
    private String place;
    /**
     * This int contains the ID of a location
     */
    private int addressId;

    public AddressJdbc(String street, String plz, String streetNum, String place) {
        this.street = street;
        this.plz = plz;
        this.streetNum = streetNum;
        this.place = place;

        Connection conn = JdbcDb.getConnection();

        //adds the location to the db
        try {
            conn.setAutoCommit(false);

            PreparedStatement addressStatement = conn.prepareStatement("insert into address_tbl (PLZ, Street, Streetnumber, Place) values (?,?,?,?)");
            addressStatement.setString(1, this.plz);
            addressStatement.setString(2, this.street);
            addressStatement.setString(3, this.streetNum);
            addressStatement.setString(4, this.place);

            addressStatement.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch(SQLException e) {
            System.out.printf("Error with account SQL statement %s", e);
        }
    }
    public int getAddressIdfromdb(Address address) {
        Connection conn = JdbcDb.getConnection();
        int addressidreturned = 0;
        try (PreparedStatement statement = conn.prepareStatement("""
            SELECT address_ID
            FROM address_tbl
            WHERE Street = ? AND Streetnumber = ?;
            
        """)) {
            statement.setString(1, address.getStreet());
            statement.setString(2, address.getStreetNum());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                addressidreturned = resultSet.getInt(1); // by column index


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addressidreturned;
    };
    @Override
    public int getAddressId() { return this.addressId; }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getPlz() {
        return plz;
    }

    @Override
    public void setPlz(String plz) {
        this.plz = plz;
    }

    @Override
    public String getStreetNum() {
        return streetNum;
    }

    @Override
    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

}
