package br.com.up.listadepresentes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.apache.http.conn.scheme.LayeredSocketFactory;

import java.util.ArrayList;

import br.com.up.listadepresentes.R;
import br.com.up.listadepresentes.models.Gift;

public class GiftAdapter extends
        RecyclerView.Adapter<GiftAdapter.GiftViewHolder>{

    private final ArrayList<Gift> gifts;

    public GiftAdapter(ArrayList<Gift> gifts){
        this.gifts = gifts;
    }

    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());

        View layout = layoutInflater.inflate(
                R.layout.view_item_gift,
                parent,
               false
        );


        return new GiftViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(
            @NonNull GiftViewHolder holder, int position) {

        Gift gift = gifts.get(position);

        TextView textView =
                holder.itemView.findViewById(R.id.text_gift_name);
        TextView textView3 =
                holder.itemView.findViewById(R.id.text_gift_present);
        TextView textView5 =
                holder.itemView.findViewById(R.id.text_gift_description);

        textView.setText(gift.getName());
        textView3.setText(gift.getName());
        textView5.setText(gift.getName());



    }

    @Override
    public int getItemCount() {
        return gifts.size();
    }

    public static class GiftViewHolder

            extends RecyclerView.ViewHolder{

        public GiftViewHolder(@NonNull View itemView) {

            super(itemView);
        }
    }

}
