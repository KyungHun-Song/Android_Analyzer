package kr.co.ssr.analysis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by STGSong on 2015-09-29.
 */
public class FragmentThird extends Fragment {
    // Declare ImageView, TextView
    ImageView ivIcon;
    TextView tvItemName;

    // Declare Constant
    public static final String IMAGE_RESOURCE_ID = "IconResourceID";
    public static final String ITEM_NAME = "itemName";

    // Default Constructor
    public FragmentThird() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate Layout
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Class - Layout Mapping
        ivIcon = (ImageView) view.findViewById(R.id.frag3_icon);
        ivIcon.setImageDrawable(view.getResources().getDrawable(
                getArguments().getInt(IMAGE_RESOURCE_ID)));
        tvItemName = (TextView) view.findViewById(R.id.frag3_text);
        tvItemName.setText(getArguments().getString(ITEM_NAME));

        return view;
    }
}
