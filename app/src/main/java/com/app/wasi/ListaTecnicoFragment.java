package com.app.wasi;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class ListaTecnicoFragment extends Fragment {

    RecyclerView recyclerView;
    MyTecnicoRecyclerViewAdapter adapterTecnicos;
    List<Tecnico> tecnicosList;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ListaTecnicoFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ListaTecnicoFragment newInstance(int columnCount) {
        ListaTecnicoFragment fragment = new ListaTecnicoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecnico_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            // Lista de tecnicos
            tecnicosList = new ArrayList<>();
            tecnicosList.add(new Tecnico(1,"Benito Vigil Perez","Pueblo Libre",5.0F,5,"http://photos1.blogger.com/blogger/5621/1887/320/Foto%20Jos%3F%3F%20carnet.jpg"));
            tecnicosList.add(new Tecnico(2,"Oscar Gonzales S.","Jesús María",3.5F,4,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFBbkW68zFffrRh7rlhJZXjV6oZAyY4WKNuIroaTJG28FcpsyA"));
            tecnicosList.add(new Tecnico(3,"Alex Zapata Galvez","Breña",3.0F,3,"http://photos1.blogger.com/blogger/5621/1887/320/Foto%20Jos%3F%3F%20carnet.jpg"));
            tecnicosList.add(new Tecnico(4,"Luis Sanchez R.","Pueblo Libre",2.5F,2,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFBbkW68zFffrRh7rlhJZXjV6oZAyY4WKNuIroaTJG28FcpsyA"));
            tecnicosList.add(new Tecnico(5,"Percy Cornejo F.","Jesús María",2.0F,1,"http://photos1.blogger.com/blogger/5621/1887/320/Foto%20Jos%3F%3F%20carnet.jpg"));
            tecnicosList.add(new Tecnico(6,"Andrea Meneses Pardo","Breña",2.0F,2,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4FWmP80i0YlmFZoSAmMV_rpq_NleYPkuIOxlzmzm_Pogyjxmc7g"));

            adapterTecnicos = new MyTecnicoRecyclerViewAdapter(tecnicosList, mListener);
            recyclerView.setAdapter(adapterTecnicos);
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Tecnico item);
    }
}
