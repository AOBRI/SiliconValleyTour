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
import com.aobri.siliconvalleytour.model.Landmark;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.ViewHolder> {

    private ArrayList<Landmark> mLandmarksList;
    private Context mContext;

    // Provide a reference to the views for each data item Complex data items may need more than one
    // view per item, and you provide access to all the views for a data item in a view holder
    class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView mLandmarkImageView;
        TextView mLandmarkNameTextView;
        TextView mLandmarkDescriptionTextView;
        AppCompatImageButton mLandmarkLocationImageButton;

        ViewHolder(CardView cardView) {
            super(cardView);
            mLandmarkImageView = cardView.findViewById(R.id.landmark_iv);
            mLandmarkNameTextView = cardView.findViewById(R.id.landmark_name_tv);
            mLandmarkDescriptionTextView = cardView.findViewById(R.id.landmark_description_tv);
            mLandmarkLocationImageButton = cardView.findViewById(R.id.landmark_location_ib);

            mLandmarkLocationImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mLandmarksList.get(getAdapterPosition()).getLocation().showAddressInMap(mContext);
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public LandmarkAdapter(Context context, ArrayList<Landmark> landmarksList) {
        mContext = context;
        mLandmarksList = landmarksList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_landmark, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mLandmarkImageView.setImageResource(mLandmarksList.get(position).getImageResourceId());
        holder.mLandmarkNameTextView.setText(mLandmarksList.get(position).getName());
        holder.mLandmarkDescriptionTextView.setText(mLandmarksList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mLandmarksList.size();
    }
}