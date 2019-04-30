package com.example.admin.coach;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

public class AdvertFragment extends Fragment {
    private List<BaseDataModel> itemsToDisplay;
    private OnFragmentInteractionListener mlistener;
    private final int HorizontalScrollImages[] = {R.drawable.electromagnetics,R.drawable.thermodynamics,R.drawable.solidmechanics,R.drawable.shm,R.drawable.optics,R.drawable.fluidmechanics};
    private final int HorizontalScrollPhysics[] = {R.drawable.calculus,R.drawable.trigonometry,R.drawable.probablity,R.drawable.conics,R.drawable.algebra};
    private final int HorizontalScrollPrimaryMaths[] = {R.drawable.numbers,R.drawable.basicalgebra,R.drawable.fractions, R.drawable.measurement,R.drawable.logarithms};
   // private final int HorizontalScrollPrimaryMaths[] = {R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers};
    private final int staggeredList[] = {R.drawable.medals,R.drawable.calculus,R.drawable.conics,R.drawable.probablity};
    //private final int staggeredList[] = {R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers};
    private final int HorizontalScrollCenterFacilities[] = {R.drawable.gd,R.drawable.visits,R.drawable.peek,R.drawable.pick,R.drawable.library,R.drawable.faculty};
    private final int unstaggeredList[] = {R.drawable.test1,R.drawable.test2,R.drawable.advert2};
    private final int MathsGridTopics[] = {R.drawable.conics,R.drawable.probablity,R.drawable.calculus,R.drawable.algebra};
    private final int PhysicsGridTopics[] = {R.drawable.electromagnetics,R.drawable.solidmechanics,R.drawable.fluidmechanics,R.drawable.calculus};
    //private final int HorizontalScrollCenterFacilities[] = {R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers,R.drawable.numbers};
    public AdvertFragment() {
        itemsToDisplay = new ArrayList<>();
        //AdvertDataModel adv = new AdvertDataModel(R.drawable.advert,"");
       // itemsToDisplay.add(adv);
        //Physcis horizontal scroll



        //itemsToDisplay.add(stagList1);

        ScrollDataList HorizontalScroll1;
        List<BaseDataModel> innerList1 = new ArrayList<>();
        for(int x = 0; x < 6; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollImages[x],1);
            innerList1.add(sm);
        }
        HorizontalScroll1 = new ScrollDataList(innerList1,"Senior Physics",1,"Linear");
        itemsToDisplay.add(HorizontalScroll1);

        //ANother horizontal scroll
        ScrollDataList HorizontalScroll2;
        List<BaseDataModel> innerList2 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPhysics.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPhysics[x],1);
            innerList2.add(sm);
        }
        HorizontalScroll2 = new ScrollDataList(innerList2,"Senior Mathematics",1,"Linear");
        itemsToDisplay.add(HorizontalScroll2);



         /*
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll3;
        List<BaseDataModel> innerList3 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList3.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList3.add(sm);
        }
        HorizontalScroll3 = new ScrollDataList(innerList3,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll3);
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll4;
        List<BaseDataModel> innerList4 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList4.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList4.add(sm);
        }
        HorizontalScroll4 = new ScrollDataList(innerList4,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll4);

        //Horizontal scroll for primary maths

        ScrollDataList HorizontalScroll5;
        List<BaseDataModel> innerList5 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList5.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList5.add(sm);
        }
        HorizontalScroll5 = new ScrollDataList(innerList5,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll5);
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll6;
        List<BaseDataModel> innerList6 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList6.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList6.add(sm);
        }
        HorizontalScroll6 = new ScrollDataList(innerList6,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll6);
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll7;
        List<BaseDataModel> innerList7 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList7.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList7.add(sm);
        }
        HorizontalScroll7 = new ScrollDataList(innerList7,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll7);
        */
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll3;
        List<BaseDataModel> innerList3 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList3.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList3.add(sm);
        }
        HorizontalScroll3 = new ScrollDataList(innerList3,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll3);

        //AdvertDataModel adv1 = new AdvertDataModel(R.drawable.cheese_5,"Chemistry"+Integer.toString(1));
        //itemsToDisplay.add(adv);
        for (int x = 0; x < 10 ; x++) {
           // CardDataModel cardX = new CardDataModel("Earth","Distance from Sun is 150Nm km","Weight of the Earth is 24.5","Acceleration is 9.8",R.drawable.cheese_3);
           // itemsToDisplay.add(cardX);
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
        // Horzontal Scroll for Facility Facilities
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll4;
        List<BaseDataModel> innerList4 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollCenterFacilities.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollCenterFacilities[x],2);
            innerList4.add(sm);
        }

        HorizontalScroll4 = new ScrollDataList(innerList4,"Center Facilities",2,"Linear");
        itemsToDisplay.add(HorizontalScroll4);
        AdvertDataModel adv = new AdvertDataModel(R.drawable.brochure,"","About Us");
        //itemsToDisplay.add(adv);
        List<BaseDataModel> GridList1 = new ArrayList<>();
        for(int x = 0; x < MathsGridTopics.length; x++) {
            CardsGridModel sm = new CardsGridModel("MultiRow",MathsGridTopics[x],x,"unstaggered");
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
            CardsGridModel sm = new CardsGridModel("SingleRow",imgx,x,"unstaggered");
            GridList2.add(sm);

        }
        CardGridList stagList2 = new CardGridList(GridList2,"UpComing Events");
        itemsToDisplay.add(stagList2);
        //Horizontal scroll for primary maths


        ScrollDataList HorizontalScroll5;
        List<BaseDataModel> innerList5 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList5.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList5.add(sm);
        }
        HorizontalScroll5 = new ScrollDataList(innerList5,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll5);
        List<BaseDataModel> GridList11 = new ArrayList<>();
        for(int x = 0; x < PhysicsGridTopics.length; x++) {
            CardsGridModel sm = new CardsGridModel("MultiRow",PhysicsGridTopics[x],x,"unstaggered");
            GridList11.add(sm);

        }
        CardGridList stagList11 = new CardGridList(GridList11,"Physics Topics");
        itemsToDisplay.add(stagList11);
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll6;
        List<BaseDataModel> innerList6 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList6.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList6.add(sm);
        }
        HorizontalScroll6 = new ScrollDataList(innerList6,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll6);
        //Horizontal scroll for primary maths
        ScrollDataList HorizontalScroll7;
        List<BaseDataModel> innerList7 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList7.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList7.add(sm);
        }
        HorizontalScroll7 = new ScrollDataList(innerList7,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll7);
        ScrollDataList HorizontalScroll8;
        List<BaseDataModel> innerList8 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList8.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList8.add(sm);
        }
        HorizontalScroll8 = new ScrollDataList(innerList8,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll8);
        ScrollDataList HorizontalScroll9;
        List<BaseDataModel> innerList9 = new ArrayList<>();
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList9.add(sm);
        }
        for(int x = 0; x < HorizontalScrollPrimaryMaths.length; x++) {
            ScrollDataModel sm = new ScrollDataModel("",HorizontalScrollPrimaryMaths[x],2);
            innerList9.add(sm);
        }
        HorizontalScroll9 = new ScrollDataList(innerList9,"Elementary Mathematics",2,"Center");
        itemsToDisplay.add(HorizontalScroll9);


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
        //
        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = Resources.getSystem().getDisplayMetrics().heightPixels;
        HashMap<Integer,Bitmap> imageLookup = new HashMap<>();
        setImageLookUpMap(view,HorizontalScrollPrimaryMaths,imageLookup,width);
        setImageLookUpMap(view,HorizontalScrollCenterFacilities,imageLookup,width);
        setImageLookUpMap(view,HorizontalScrollPhysics,imageLookup,width);
        setImageLookUpMap(view,HorizontalScrollImages,imageLookup,width);
        setImageLookUpMap(view,unstaggeredList,imageLookup,width);
        setImageLookUpMap(view,staggeredList,imageLookup,width);
        RecyclerView recyclerView = view.findViewById(R.id.mainRecyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        ProductDataAdapter adapter = new ProductDataAdapter(itemsToDisplay,this.getContext(),imageLookup,width,height);
        recyclerView.setAdapter(adapter);
        return view;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }
    public void setImageLookUpMap(View v,int[] imgId,HashMap<Integer,Bitmap> lookup, int screenWidth) {
        for (int x = 0; x < imgId.length; x++)  {
            Bitmap bMap = BitmapFactory.decodeResource(v.getResources(),imgId[x]);
            Bitmap bMapScaled = BitmapScaler.scaleToFitWidth(bMap, screenWidth);
            lookup.put(imgId[x],bMapScaled);
        }

    }
}
