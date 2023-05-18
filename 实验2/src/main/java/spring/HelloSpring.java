package spring;

public class HelloSpring {
    private String uerName;

    public void setUerName(String uerName) {
        this.uerName = uerName;
    }
    public void show(){
        System.out.print(uerName+"欢迎来到spring");
    }
}
