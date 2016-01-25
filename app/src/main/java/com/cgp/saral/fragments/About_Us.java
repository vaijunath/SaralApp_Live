package com.cgp.saral.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cgp.saral.R;

import java.io.InputStream;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by WeeSync on 17/10/15.
 */
public class About_Us extends Fragment{

    View view;

    @Bind(R.id.tvAbout)
    TextView tvAbout;
    String str;

    private static final String ARG_PAGE_NUMBER = "page_number";

    public About_Us() {

    }

   // String currentURL="http://saralvaastu.com/";

    public static About_Us newInstance(int page) {
        About_Us fragment = new About_Us();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_us, container, false);

        ButterKnife.bind(this,view);
        String s=getResources().getString(R.string.about_us);

        /*tvAbout.setText(Html.fromHtml(s));
        tvAbout.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);*/
        return view;
    }


}