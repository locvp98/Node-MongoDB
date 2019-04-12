package manager.app.com.hotels.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotelid {
    @Expose
    @SerializedName("city")
    private String city;

    @Expose
    @SerializedName("address")
    private String address;

    @Expose
    @SerializedName("owner")
    private  String owner;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("license_number")
    private  String license_number;

    @Expose
    @SerializedName("total_floor")
    private  String total_floor;

    @Expose
    @SerializedName("image")
    private  String image;

    public Hotelid() {
    }

    public Hotelid(String city, String address, String owner, String name, String license_number, String total_floor, String image) {
        this.city = city;
        this.address = address;
        this.owner = owner;
        this.name = name;
        this.license_number = license_number;
        this.total_floor = total_floor;
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getTotal_floor() {
        return total_floor;
    }

    public void setTotal_floor(String total_floor) {
        this.total_floor = total_floor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
