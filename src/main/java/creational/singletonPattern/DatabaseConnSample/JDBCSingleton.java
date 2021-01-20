package creational.singletonPattern.DatabaseConnSample;

import java.sql.*;


public class JDBCSingleton {

    // static member holds only one instance of the JDBCSingleton class.
    private static JDBCSingleton jdbc;

    //JDBCSingleton ctor prevents the instantiation from any other class.
    private JDBCSingleton() {}

    //Now we are providing global point of access.
    public static JDBCSingleton getInstance(){
        if(jdbc == null){
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    // to get the connection from methods like insert, view etc.
    private static Connection getConnection() throws ClassNotFoundException, SQLException{

        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String dbName = "test";
        String userName = "root";
        String password = "";
        Connection conn = null;

        try {
            Class.forName(driver);
            if(conn == null){
                conn = DriverManager.getConnection(url+dbName,userName,password);
                System.out.println("Connection OK!");
            }
            else{
                System.out.println("Connection OK!");
                return conn;
            }
        }catch (Exception e) {
            System.out.println("Error : " +e.getMessage());
        }

        return conn;
    }

    //to insert the record into database
    public int insert(String name, String pass) throws SQLException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;

        try{
            conn = this.getConnection();
            preparedStatement = conn.prepareStatement("INSERT INTO user(uname, upass) VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);
            recordCounter = preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return  recordCounter;
    }
    // to view the data from the database
    public void view(String name) throws SQLException{
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            conn = this.getConnection();
            preparedStatement = conn.prepareStatement("SELECT * FROM user WHERE  uname=?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("Name: " + resultSet.getString(2) + "\t" +
                                    "Password: " + resultSet.getString(3));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            if(resultSet!=null){
                resultSet.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if(conn!=null){
                conn.close();
            }
        }
    }

    // to update the password for the given username
    public int update(String name, String password) throws SQLException  {
        Connection conn=null;
        PreparedStatement prepareStatement=null;
        int recordCounter=0;

        try {
            conn=this.getConnection();
            prepareStatement=conn.prepareStatement(" UPDATE user SET upass=? WHERE uname='"+name+"' ");
            prepareStatement.setString(1, password);
            recordCounter=prepareStatement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if (prepareStatement!=null){
                prepareStatement.close();
            }if(conn!=null){
                conn.close();
            }
        }
        return recordCounter;
    }

    // to delete the data from the database
    public int delete(int userid) throws SQLException{
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try{
            conn = this.getConnection();
            preparedStatement = conn.prepareStatement("DELETE FROM user WHERE uid ='" + userid + "'");
            recordCounter = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return recordCounter;
    }
}
