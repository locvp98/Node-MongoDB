package manager.app.com.hotels.api;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static  final  String BASE_URL ="http://192.168.86.103:3000/";
    private static Service service;
    public static Service getService() {
        if (service == null) {
            new ApiClient();
        }
        return service;
    }
    private ApiClient() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)//quy dinh thoi gian client conect den server,qua thoi gian la huy
                .readTimeout(10, TimeUnit.SECONDS);//thoi gian cho du lieu ve

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(BASE_URL) //chi dinh phan dau api la gi
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create()); //dung gson
        service = builder.build().create(Service.class);
    }


}
