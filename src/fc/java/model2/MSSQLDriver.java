package fc.java.model2;

public class MSSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, passwrod 정보를 이용하여 " +
                "MSSQL DB를 접속 시도한다.");
    }
}
