package manager.app.com.hotels.uiView;

import java.util.List;

import manager.app.com.hotels.model.Rooms;

public interface MainView {

    void  showLoading();
    void  hideLoading();
    void  OnGetResult(List<Rooms> list);
    void  OnErr(String messang);
}
