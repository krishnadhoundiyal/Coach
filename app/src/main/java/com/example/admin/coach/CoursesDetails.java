package com.example.admin.coach;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CoursesDetails.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CoursesDetails#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CoursesDetails extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CoursesDetails() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment coursesdetails.
     */
    // TODO: Rename and change types and number of parameters
    public static CoursesDetails newInstance(String param1, String param2) {
        CoursesDetails fragment = new CoursesDetails();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.cardcourses, container, false);
        ArrayList<CardCourse> courseCards = new ArrayList<CardCourse>();
        createCourseCards(courseCards);
        Log.d("Test-----------------",Integer.toString(courseCards.size()));
        CardCourseAdapter adapterCourse = new CardCourseAdapter(courseCards,this.getContext());
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(this.getContext());
        //RecyclerView.LayoutManager mlayout = new GridLayoutManager(this.getContext(),2);
        RecyclerView mrecycle = (RecyclerView) view.findViewById(R.id.recycleView);
        mrecycle.setLayoutManager(mlayout);
        mrecycle.setItemAnimator(new DefaultItemAnimator());
        mrecycle.setHasFixedSize(true);
        mrecycle.setAdapter(adapterCourse);

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
        void onFragmentInteraction(Uri uri);
    }
    private void createCourseCards(ArrayList<CardCourse> courseCards) {
        for (int i=0; i <20;i++) {
            CardCourse objx = new CardCourse(R.drawable.algebra,4,"Physics");
            courseCards.add(objx);
        }
    }
}
