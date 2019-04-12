package manager.app.com.hotels.api;

import java.util.List;

import manager.app.com.hotels.model.Rooms;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface Service {
    @GET("/")
    Call<ResponseBody> getRooms();

}
