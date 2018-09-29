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
import com.aobri.siliconvalleytour.model.Hotel;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private ArrayList<Hotel> mHotelsList;
    private Context mContext;

    // Provide a reference to the views for each data item Complex data items may need more than one
    // view per item, and you provide access to all the views for a data item in a view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView mHotelImageView;
        TextView mHotelNameTextView;
        TextView mHotelPriceTextView;
        SimpleRatingBar mHotelClassBar;
        AppCompatImageButton mHotelLocationImageButton;

        ViewHolder(CardView cardView) {
            super(cardView);
            mHotelImageView = cardView.findViewById(R.id.hotel_iv);
            mHotelNameTextView = cardView.findViewById(R.id.hotel_name_tv);
            mHotelClassBar = cardView.findViewById(R.id.hotel_class_rb);
            mHotelPriceTextView = cardView.findViewById(R.id.hotel_price_tv);
            mHotelLocationImageButton = cardView.findViewById(R.id.hotel_location_ib);

            mHotelLocationImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mHotelsList.get(getAdapterPosition()).getLocation().showAddressInMap(mContext);
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public HotelAdapter(Context context, ArrayList<Hotel> hotelsList) {
        mContext = context;
        mHotelsList = hotelsList;
    }

    @NonNull
    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_hotel, parent, false);
        return new HotelAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.ViewHolder holder, int position) {

        holder.mHotelImageView.setImageResource(mHotelsList.get(position).getImageResourceId());
        holder.mHotelNameTextView.setText(mHotelsList.get(position).getName());
        holder.mHotelClassBar.setRating(mHotelsList.get(position).getRating());
        holder.mHotelPriceTextView.setText(mHotelsList.get(position).getPricePerNight());
    }

    @Override
    public int getItemCount() {
        return mHotelsList.size();
    }
}