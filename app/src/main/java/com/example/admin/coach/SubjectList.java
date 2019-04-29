package com.example.admin.coach;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SubjectList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class SubjectList extends Fragment {

    private OnFragmentInteractionListener mListener;
    private ArrayList<CardCourse> itemsToDisplay;
    public SubjectList() {
        // Required empty public constructor
        itemsToDisplay = new ArrayList<CardCourse>();
        for (int i = 0;  i < 20; i++){
            CardCourse subject = new CardCourse(R.drawable.algebra,2,"Physics");
            itemsToDisplay.add(subject);
            Log.d("Counter",Integer.toString(i));
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.subject_gridlist,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.subjectlist);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        SubjectItems adapter = new SubjectItems(this.getContext(),itemsToDisplay);
        recyclerView.setAdapter(adapter);
        Log.d("Createview","Test");
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public static SubjectList newInstance() {
        SubjectList fragment;
        fragment = new SubjectList();


        return fragment;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }
}
