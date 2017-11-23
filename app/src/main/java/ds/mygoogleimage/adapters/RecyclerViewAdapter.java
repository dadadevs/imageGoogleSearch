package ds.mygoogleimage.adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import ds.mygoogleimage.Constants;
import ds.mygoogleimage.R;
import ds.mygoogleimage.activity.DatailsActivity;
import ds.mygoogleimage.model.responsemodel.Item;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    ArrayList<Item> items;
    Context context;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    public RecyclerViewAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(items.get(position).getTitle());
        try {
            Picasso.with(context).load(items.get(position).getPagemap().getCseThumbnail().get(0).getSrc()).into(holder.imageView);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        CardView cardView;
        ImageView imageView;
        TextView textView;

        public ViewHolder(final View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            imageView = (ImageView) itemView.findViewById(R.id.image_view);
            textView = (TextView) itemView.findViewById(R.id.text_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(context, DatailsActivity.class);
                    intent.putExtra(Constants.title, items.get(position).getTitle());
                    intent.putExtra(Constants.imageSrc, items.get(position).getPagemap().getCseImage().get(0).getSrc());
                    context.startActivity(intent);

                }
            });

        }
    }
}
