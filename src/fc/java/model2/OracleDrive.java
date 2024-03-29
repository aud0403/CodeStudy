package fc.java.model2;
//OracleDriver는 Oracle회사에서 만들어서 제공을 하면 된다(Driver
public class OracleDrive implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, passwrod 정보를 이용하여 " +
                "oracle DB를 접속 시도한다.");
    }
}
