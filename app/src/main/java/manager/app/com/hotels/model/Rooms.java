package manager.app.com.hotels.model;

import android.net.Uri;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rooms {
    @Expose
    @SerializedName("id")
    private String id;

    @Expose
    @SerializedName("room_number")
    private String room_number;

    @Expose
    @SerializedName("floor")
    private String floor;

    @Expose
    @SerializedName("single_room")
    private String single_room;

    @Expose
    @SerializedName("price")
    private String price;

    @Expose
    @SerializedName("status")
    private String status;

    @Expose
    @SerializedName("image")
    private  String image;

    @Expose
    @SerializedName("detail")
    private  String detail;

    @Expose
    @SerializedName("hotelid")
    private List<Hotelid> hotelid;


    public Rooms(String room_number, String price, String detail) {
        this.room_number = room_number;
        this.price = price;
        this.detail = detail;
    }

    public Rooms(String room_number, String price, String detail, String image) {
        this.room_number = room_number;
        this.price = price;
        this.image = image;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSingle_room() {
        return single_room;
    }

    public void setSingle_room(String single_room) {
        this.single_room = single_room;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<Hotelid> getHotelid() {
        return hotelid;
    }

    public void setHotelid(List<Hotelid> hotelid) {
        this.hotelid = hotelid;
    }
}
