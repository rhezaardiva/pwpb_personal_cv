package org.sandec.personalcv;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class InfoCardAdapter extends RecyclerView.Adapter<InfoCardAdapter.ViewHolder> {
    private ArrayList<Information> listInformation;

    public InfoCardAdapter(ArrayList<Information> listInformation){
        this.listInformation = listInformation;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_info, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int i) {

        final Information information = listInformation.get(i);
        Glide.with(holder.itemView.getContext())
                .load(information.getPhoto())
                .apply(new RequestOptions().override(800,800))
                .into(holder.imgPhoto);

        holder.tvName.setText(information.getName());
        holder.tvFrom.setText(information.getFrom());

        holder.card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                DetailActivity detail = new DetailActivity();
                intent.putExtra(detail.EXTRA_PHOTO, information.getPhoto());
                intent.putExtra(detail.EXTRA_NAME, information.getName());
                intent.putExtra(detail.EXTRA_FROM, information.getFrom());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listInformation.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView card_View;
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
            card_View = itemView.findViewById(R.id.card_view);
        }
    }
}
