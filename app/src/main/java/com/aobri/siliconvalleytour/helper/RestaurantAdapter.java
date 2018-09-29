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
import com.aobri.siliconvalleytour.model.Restaurant;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private ArrayList<Restaurant> mRestaurantsList;
    private Context mContext;

    // Provide a reference to the views for each data item Complex data items may need more than one
    // view per item, and you provide access to all the views for a data item in a view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView mRestaurantImageView;
        TextView mRestaurantNameTextView;
        TextView mRestaurantWorkhoursTextView;
        SimpleRatingBar mRestaurantRatingBar;
        AppCompatImageButton mRestaurantLocationImageButton;

        ViewHolder(CardView cardView) {
            super(cardView);

            mRestaurantImageView = cardView.findViewById(R.id.restaurant_iv);
            mRestaurantNameTextView = cardView.findViewById(R.id.restaurant_name_tv);
            mRestaurantWorkhoursTextView = cardView.findViewById(R.id.restaurant_workhours_tv);
            mRestaurantRatingBar = cardView.findViewById(R.id.restaurant_rating_rb);
            mRestaurantLocationImageButton = cardView.findViewById(R.id.restaurant_location_ib);

            mRestaurantLocationImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mRestaurantsList.get(getAdapterPosition()).getLocation().showAddressInMap(mContext);
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurantsList) {
        mContext = context;
        mRestaurantsList = restaurantsList;
    }

    @NonNull
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_restaurant, parent, false);
        return new RestaurantAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.ViewHolder holder, int position) {

        holder.mRestaurantImageView.setImageResource(mRestaurantsList.get(position).getImageResourceId());
        holder.mRestaurantNameTextView.setText(mRestaurantsList.get(position).getName());
        holder.mRestaurantWorkhoursTextView.setText(mRestaurantsList.get(position).getWorkhours());
        holder.mRestaurantRatingBar.setRating(mRestaurantsList.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return mRestaurantsList.size();
    }
}