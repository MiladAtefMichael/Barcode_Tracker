package bct.barcodetracker.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bct.barcodetracker.R;
import bct.barcodetracker.dataModel;


public class itemAdapter  extends RecyclerView.Adapter<itemAdapter.itemHolder> {
    ArrayList<dataModel> listItems;
    Context context;
    int fragementNumber;

    public itemAdapter(ArrayList<dataModel> listItems, Context context, int FragementNumber) {
        this.listItems = listItems;
        this.context = context;
        fragementNumber = FragementNumber;
    }

    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        final itemHolder listHolder = new itemHolder(view);
        return listHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder holder, final int position) {


    }


    @Override
    public int getItemCount() {

        return listItems.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        TextView id;
        TextView name;
        TextView type;
        TextView expiredDate;


        public itemHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.product_id);
            name = itemView.findViewById(R.id.product_name);
            type = itemView.findViewById(R.id.product_type);
            expiredDate = itemView.findViewById(R.id.product_ex);

        }
    }


}
