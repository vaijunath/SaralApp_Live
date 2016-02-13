package com.cgp.saral.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import com.cgp.saral.fragments.BookNowTabFragment;
import com.cgp.saral.fragments.CompassFragment;
import com.cgp.saral.fragments.HomeTabFragment;
import com.cgp.saral.fragments.InviteTabFragment;
import com.cgp.saral.fragments.YouFragment;

import java.util.ArrayList;


/**
 * Created by karamjeetsingh on 19/09/15.
 */
public class Tabadapter extends FragmentStatePagerAdapter {
String title[];

    static ArrayList<Fragment> mPlaceHolderFragmentArray = new ArrayList<Fragment>();


    public Tabadapter(FragmentManager fm, String tie[]) {
        super(fm);
        this.title=tie;
        try{
            if(mPlaceHolderFragmentArray.size()<=0){
                initFragments();
            }

        }catch (Throwable t){
            Log.e("Tabadapter",t.getMessage(),t);
        }
        // TODO Auto-generated constructor stub

    }

    private void initFragments()
    {
        int i= 0;
        mPlaceHolderFragmentArray.add(HomeTabFragment.newInstance(i++));
        mPlaceHolderFragmentArray.add(CompassFragment.newInstance(i++));
        mPlaceHolderFragmentArray.add(BookNowTabFragment.newInstance(i++));
        mPlaceHolderFragmentArray.add(InviteTabFragment.newInstance(i++));
        mPlaceHolderFragmentArray.add(YouFragment.newInstance(i++));
    }

    @Override
    public Fragment getItem(int i) {

       /* Fragment fragment = mPlaceHolderFragmentArray.get(i);
        if(fragment == null){
            fragment = PlaceholderFragment.newInstance(position);
            mPlaceHolderFragmentArray.put(position, fragment);
        }
        return fragment;*/
       /* switch (i) {
            case 0:
                //Fragement for Android Tab
                return HomeTabFragment.newInstance(0);
            case 1:
                //Fragment for Ios Tab
                // YouFragment.newInstance(2);

                // CompassFragment.newInstance(1);
                return  CompassFragment.newInstance(1);
            case 2:
                //Fragment for Windows Tab
                return  BookNowTabFragment.newInstance(2);
            case 3:
                //Fragment for Windows Tab
                return  InviteTabFragment.newInstance(3);
           case 4:
                //Fragment for Windows Tab
               return  YouFragment.newInstance(4);
        }
        return null;*/
        return mPlaceHolderFragmentArray.get(i);

    }

    @Override
    public CharSequence getPageTitle(int position) {
       // CharSequence title = null;
        /*if (position == 0) {
            title = "One";
        } else if (position == 1) {
            title = "Two";
        } else if (position == 2) {
            title = "Three";
        }*/
        return  title[position];
    }

    @Override
    public int getCount() {

        return mPlaceHolderFragmentArray.size(); //No of Tabs
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }



}
