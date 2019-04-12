package manager.app.com.hotels.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import manager.app.com.hotels.R;
import manager.app.com.hotels.model.Rooms;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.RecycleviewAdapter> {

    private Context context;
    private List<Rooms> roomsList;
    ItemClickListener itemClickListener;

    public MainAdapter(Context context, List<Rooms> roomsList, ItemClickListener itemClickListener) {
        this.context = context;
        this.roomsList = roomsList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public RecycleviewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(context).inflate(R.layout.item_main_car,viewGroup,false);
        return new RecycleviewAdapter(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleviewAdapter recycleviewAdapter, int i) {
        Rooms rooms =roomsList.get(i);
        recycleviewAdapter.tvEmployeeName.setText(rooms.getRoom_number());
        recycleviewAdapter.tvEmployeeSalary.setText(rooms.getDetail());
        recycleviewAdapter.tvEmployeeAge.setText(rooms.getPrice());


    }

    @Override
    public int getItemCount() {
        return roomsList.size();
    }

    public class RecycleviewAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {
        private CardView cardItem;
        private LinearLayout line;
        private TextView tvEmployeeName;
        private TextView tvEmployeeSalary;
        private TextView tvEmployeeAge;
        ItemClickListener itemClickListener;

        public RecycleviewAdapter(@NonNull View itemView,ItemClickListener itemClickListener) {
            super(itemView);
            cardItem = (CardView) itemView.findViewById(R.id.card_item);
            line = (LinearLayout) itemView.findViewById(R.id.line);
            tvEmployeeName = (TextView) itemView.findViewById(R.id.tv_employee_name);
            tvEmployeeSalary = (TextView) itemView.findViewById(R.id.tv_employee_salary);
            tvEmployeeAge = (TextView) itemView.findViewById(R.id.tv_employee_age);

            this.itemClickListener=itemClickListener;
            cardItem.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onItemClick(v,getAdapterPosition());

        }
    }
    public interface ItemClickListener{
        void  onItemClick(View view, int position);
    }
}
