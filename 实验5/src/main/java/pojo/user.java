package pojo;

public class user {
    private String username;
    public String password;
    private order order;

    public void setOrder(pojo.order order) {
        this.order = order;
    }

    public order getOrder() {
        order=new order();
        return order;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                '}';
    }
}
