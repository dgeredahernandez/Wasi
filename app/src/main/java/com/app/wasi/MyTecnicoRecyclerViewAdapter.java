package com.app.wasi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.app.wasi.ListaTecnicoFragment.OnListFragmentInteractionListener;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyTecnicoRecyclerViewAdapter extends RecyclerView.Adapter<MyTecnicoRecyclerViewAdapter.ViewHolder> {

    private final List<Tecnico> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyTecnicoRecyclerViewAdapter(List<Tecnico> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_tecnico, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewNombres.setText(holder.mItem.getNombres());
        holder.textViewDistrito.setText(holder.mItem.getDistrito());
        holder.ratingBarValoracionTecnico.setRating(holder.mItem.getValoracion());
        holder.textViewValoracion.setText(holder.mItem.getValoracion().toString());
        holder.textViewComentarios.setText("Comentarios (".concat(holder.mItem.getNumeroComentarios().toString()).concat(")"));

        Picasso.get()
                .load(holder.mItem.getUrlFoto())
                .into(holder.imageViewTecnico);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;

        public final TextView textViewNombres;
        public final TextView textViewDistrito;
        public final ImageView imageViewTecnico;
        public final TextView textViewValoracion;
        public final RatingBar ratingBarValoracionTecnico;
        public final TextView textViewComentarios;

        public Tecnico mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewNombres = view.findViewById(R.id.textViewNombres);
            textViewDistrito = view.findViewById(R.id.textViewDistrito);
            textViewValoracion = view.findViewById(R.id.textViewValoracion);
            textViewComentarios = view.findViewById(R.id.textViewComentarios);
            imageViewTecnico = view.findViewById(R.id.imageViewTecnico);
            ratingBarValoracionTecnico = view.findViewById(R.id.ratingBarValoracionTecnico);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewNombres.getText() + "'";
        }
    }
}
