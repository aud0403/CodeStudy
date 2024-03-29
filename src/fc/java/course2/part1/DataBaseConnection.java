package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MSSQLDriver;
import fc.java.model2.MySQLDriver;
import fc.java.model2.OracleDrive;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracleDB 를 접속
        Connection conn = new OracleDrive();
        conn.getConnection("jdbc:oracle:thin:@","system","manager");

        //mysql DB 접속
        Connection conn2 = new MySQLDriver();
        conn2.getConnection("jdbc:mysql://localhost","root","12345");

        Connection conn3 = new MSSQLDriver();
        conn3.getConnection("jdbc:sqlsever://localhost","sa","12345");
    }
}
