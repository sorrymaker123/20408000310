package pojo;

public class HelloSpring {
    private String id;
    private String name;
    private int code;

    public HelloSpring(String id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void  show(){
        System.out.println(id+name+code);
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
