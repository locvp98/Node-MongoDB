package manager.app.com.hotels.uiView;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import manager.app.com.hotels.R;
import manager.app.com.hotels.adapter.MainAdapter;
import manager.app.com.hotels.api.ApiClient;
import manager.app.com.hotels.model.Rooms;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/* LocNVPH05730: 12/4/2019
    NodeSrever:

 */

public class MainActivity extends AppCompatActivity  implements MainView{

    private static final String TAG = "mainactivity";
    private SwipeRefreshLayout reflayout;
    private RecyclerView recyMain;
    private MainAdapter adapter;
    private List<Rooms> roomsList;
    private MainAdapter.ItemClickListener itemClickListener;
    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reflayout = (SwipeRefreshLayout) findViewById(R.id.reflayout);
        recyMain = (RecyclerView) findViewById(R.id.recy_main);
        recyMain.setLayoutManager(new LinearLayoutManager(this));
        mainPresenter=new MainPresenter(this);
        mainPresenter.getdata();
        reflayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainPresenter.getdata();
            }
        });
    }

    @Override
    public void showLoading() {
        reflayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        reflayout.setRefreshing(false);
    }

    @Override
    public void OnGetResult(List<Rooms> list) {
        adapter=new MainAdapter(this,list,itemClickListener);
        adapter.notifyDataSetChanged();
        recyMain.setAdapter(adapter);
        roomsList=list;
    }

    @Override
    public void OnErr(String messang) {

    }
}
