package com.example.admin.coach;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdvertFragment extends Fragment {
    private List<BaseDataModel> itemsToDisplay;
    private OnFragmentInteractionListener mlistener;
    private final int HorizontalScrollImages[] = {R.drawable.electromagnetics,R.drawable.thermodynamics,R.drawable.solidmechanics,R.drawable.shm,R.drawable.optics,R.drawable.fluidmechanics};
    private final int staggeredList[] = {R.drawable.medals,R.drawable.calculus,R.drawable.calculus,R.drawable.calculus};
    public AdvertFragment() {
        itemsToDisplay = new ArrayList<>();
        //AdvertDataModel adv = new AdvertDataModel(R.drawable.advert,"");
       // itemsToDisplay.add(adv);
        //Physcis horizontal scroll



        //itemsToDisplay.add(stagList1);
        ScrollDataList HorizontalScroll;
        List<BaseDataModel> innerList = new ArrayList<>();
        for(int x = 1; x < 10; x++) {
            ScrollDataModel sm = new ScrollDataModel("Physics"+Integer.toString(x),R.drawable.cheese_3);
            innerList.add(sm);
        }
        HorizontalScroll = new ScrollDataList(innerList,"Senior Physics");
        //itemsToDisplay.add(HorizontalScroll);
        ScrollDataList HorizontalScroll1;
        List<BaseDataModel> innerList1 = new ArrayList<>();
        for(int x = 0; x < 6; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollImages[x]);
            innerList1.add(sm);
        }
        HorizontalScroll1 = new ScrollDataList(innerList1,"Senior Physics");
        itemsToDisplay.add(HorizontalScroll1);
        //AdvertDataModel adv1 = new AdvertDataModel(R.drawable.cheese_5,"Chemistry"+Integer.toString(1));
        //itemsToDisplay.add(adv);
        for (int x = 0; x < 10 ; x++) {
            CardDataModel cardX = new CardDataModel("Earth","Distance from Sun is 150Nm km","Weight of the Earth is 24.5","Acceleration is 9.8",R.drawable.cheese_3);
            //itemsToDisplay.add(cardX);
        }

        List<BaseDataModel> GridList = new ArrayList<>();
        for(int x = 0; x < 3; x++) {
            int img;
            if (x % 3 == 0) {
                img = 0;
            } else if (x % 3 == 1) {
                img = 1;
            } else {
                img = 2;
            }
            CardsGridModel sm = new CardsGridModel("Text grid model",staggeredList[img],x,"staggered");
            GridList.add(sm);

        }
        CardGridList stagList = new CardGridList(GridList,"Offerings");
        itemsToDisplay.add(stagList);
        AdvertDataModel adv = new AdvertDataModel(R.drawable.brochure,"","About Us");
        itemsToDisplay.add(adv);
        List<BaseDataModel> GridList1 = new ArrayList<>();
        for(int x = 0; x < 4; x++) {
            int imgx;
            if (x % 2 == 1) {
                imgx = R.drawable.calculus;
            } else {
                imgx = R.drawable.algebra;
            }
            CardsGridModel sm = new CardsGridModel("Text grid model",imgx,x,"unstaggered");
            GridList1.add(sm);

        }
        CardGridList stagList1 = new CardGridList(GridList1,"Mathematics Topics");
        itemsToDisplay.add(stagList1);
        AdvertDataModel adv2 = new AdvertDataModel(R.drawable.advert2,"","Preparatory Tests");
        itemsToDisplay.add(adv2);
        List<BaseDataModel> GridList2 = new ArrayList<>();
        for(int x = 0; x < 2; x++) {
            int imgx;
            if (x % 2 == 1) {
                imgx = R.drawable.test1;
            } else {
                imgx = R.drawable.test2;
            }
            CardsGridModel sm = new CardsGridModel("Text grid model",imgx,x,"unstaggered");
            GridList2.add(sm);

        }
        CardGridList stagList2 = new CardGridList(GridList2,"UpComing Events");
        itemsToDisplay.add(stagList2);

    }
    public static AdvertFragment newInstance() {
        AdvertFragment fragment;
        fragment = new AdvertFragment();


        return fragment;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AdvertFragment.OnFragmentInteractionListener) {
            mlistener = (AdvertFragment.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mlistener = null;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mainfragment,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.mainRecyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ProductDataAdapter adapter = new ProductDataAdapter(itemsToDisplay,this.getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }
}
