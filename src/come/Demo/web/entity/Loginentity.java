package come.Demo.web.entity;

public class Loginentity {
    private String id;
    private String uname;
    private String pwd;

    //无参构造
    public Loginentity(){

    }

    public Loginentity(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public Loginentity(String id, String uname, String pwd) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
