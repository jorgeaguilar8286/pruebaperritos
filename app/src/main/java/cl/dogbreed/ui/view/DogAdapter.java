package cl.dogbreed.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.dogbreed.R;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.ViewHolder> {
    private List<String> mvalues;


    public List<String> getMvalues() {
        return mvalues;
    }

    private OnListFragmentInteractionListener listener;

    public DogAdapter(List<String> mvalues) {
        this.mvalues = mvalues;
    }

    public DogAdapter(OnListFragmentInteractionListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public DogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list_dog, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapter.ViewHolder holder, int position) {
        holder.mItem = mvalues.get(position);
        holder.midview.setText(mvalues.get(position));
        holder.mname.setText(mvalues.get(position));


    }

    @Override
    public int getItemCount() {
        return mvalues.size();
    }

    public void updateBreeds(List<String> dogList) {
        mvalues.clear();
        mvalues.addAll(dogList);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private View mview;
        private TextView midview;
        private TextView mname;
        private String mItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mview = itemView;
            midview = itemView.findViewById(R.id.ite_number);
            mname = itemView.findViewById(R.id.name_dog);
            itemView.setOnClickListener(this);
            midview.setOnClickListener(this);
            mname.setOnClickListener(this);
        }

        @Override
        public String toString() {
            return "ViewHolder{" +
                    "mname=" + mname +
                    '}';
        }

        @Override
        public void onClick(View v) {
            listener.onListFragmentInterctionListener(getId(getAdapterPosition()));

        }


        private String getId(int adapterPosition) {
            return adapterPosition != RecyclerView.NO_POSITION ? mvalues.get(adapterPosition) : "No";
        }
    }
}