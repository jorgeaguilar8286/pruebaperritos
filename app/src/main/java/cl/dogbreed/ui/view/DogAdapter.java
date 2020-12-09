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
 private final List<String> mvalues;

    public DogAdapter(List<String> mvalues) {
        this.mvalues = mvalues;
    }

    @NonNull
    @Override
    public DogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list_dog,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapter.ViewHolder holder, int position) {
        holder.midview.setText( mvalues.get(position));
        holder.mname.setText(mvalues.get(position));



    }

    @Override
    public int getItemCount() {
        return mvalues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final View mview;
        public final TextView midview;
        public final TextView mname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mview = itemView;
            midview = itemView.findViewById(R.id.ite_number);
            mname = itemView.findViewById(R.id.name_dog);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
