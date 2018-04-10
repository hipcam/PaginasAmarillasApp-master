package pe.com.falvarado.paginasamarillasapp.models;

/**
 * Created by Alumno on 5/04/2018.
 */

public class Company {
    private int id;
    private String category;
    private String name;
    private String address;
    private String email;
    private int phone;
    private String url;
    private String logo;
    private String info;

    public Company(int id, String category, String name, String address, String email, int phone, String url, String logo, String info) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.url = url;
        this.logo = logo;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", url='" + url + '\'' +
                ", logo='" + logo + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
