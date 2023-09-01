package org.example;
import org.example.jdbcconnection.Train;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static  Connection connect;

    public static void main(String[] args) {
//        ConnectionClass s=new ConnectionClass();
//        Connection c=s.getconnection();
//        if(c==null)
//            System.out.println("connection is failed");
//        else
//            System.out.println("connection is successfully");

        //System.out.println("Hello world!");
        Train s=new Train();
        try{
            connect =s.getConnect();
            Statement st=connect.createStatement();
//            st.execute("Create table emp(ID int Primary Key auto_increment,"+"Name varchar(200),Gender varchar(10))");
//           String Query ="Insert into emp(Name, Gender) values('Jaswanth', 'male')";
//           st.executeUpdate(Query);
//            System.out.println("create  a table successfully");
//
//            String Query1="UPDATE emp SET Name='Jash' WHERE id=2";
//            st.executeUpdate(Query1);
//            System.out.println("updated  table successfully");



//            String Query2="DELETE FROM emp WHERE id=2";
//            st.executeUpdate(Query2);
//            System.out.println("deleted  table successfully");
//
//            String Query3="DROP TABLE emp ";
//            st.executeUpdate(Query3);
//            System.out.println("dropped  table successfully");




        }catch (SQLException e){
            System.out.println(e.getMessage());

        }finally {
            try{
                if(connect!=null){
                    connect.close();
                }
            }catch (SQLException s1){
                s1.getStackTrace();
            }
        }

    }

}