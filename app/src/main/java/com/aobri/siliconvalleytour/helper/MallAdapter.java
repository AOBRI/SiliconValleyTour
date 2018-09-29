package com.aobri.siliconvalleytour.helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aobri.siliconvalleytour.R;
import com.aobri.siliconvalleytour.model.Mall;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class MallAdapter extends RecyclerView.Adapter<MallAdapter.ViewHolder> {

    private ArrayList<Mall> mMallsList;
    private Context mContext;

    // Provide a reference to the views for each data item Complex data items may need more than one
    // view per item, and you provide access to all the views for a data item in a view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView mMallImageView;
        TextView mMallNameTextView;
        TextView mMallWorkhoursTextView;
        AppCompatImageButton mMallLocationImageButton;

        ViewHolder(CardView cardView) {
            super(cardView);
            mMallImageView = cardView.findViewById(R.id.mall_iv);
            mMallNameTextView = cardView.findViewById(R.id.mall_name_tv);
            mMallWorkhoursTextView = cardView.findViewById(R.id.mall_workhours_tv);
            mMallLocationImageButton = cardView.findViewById(R.id.mall_location_ib);

            mMallLocationImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mMallsList.get(getAdapterPosition()).getLocation().showAddressInMap(mContext);
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MallAdapter(Context context, ArrayList<Mall> mallsList) {
        mContext = context;
        mMallsList = mallsList;
    }

    @NonNull
    @Override
    public MallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_mall, parent, false);
        return new MallAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MallAdapter.ViewHolder holder, int position) {
        holder.mMallImageView.setImageResource(mMallsList.get(position).getImageResourceId());
        holder.mMallNameTextView.setText(mMallsList.get(position).getName());
        holder.mMallWorkhoursTextView.setText(mMallsList.get(position).getWorkhours());
    }

    @Override
    public int getItemCount() {
        return mMallsList.size();
    }
}