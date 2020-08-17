package com.codingwithmitch.swipingviewpager.resources;

import com.codingwithmitch.swipingviewpager.R;
import com.codingwithmitch.swipingviewpager.models.Hat;

import java.math.BigDecimal;

public class Hats {

    public static Hat[] getHats(){
        return SNAPBACKS;
    }

    public static final Hat SNAPBACK_FIRST = new Hat("Black Snapback", R.drawable.img1,
             new String("Activate your token to secure your transaction"), 9377376);
    public static final Hat SNAPBACK_SECOND = new Hat("Camo Snapback", R.drawable.img2,
            new String("Log into your CIB portal to enable your token"), 9377377);
    public static final Hat SNAPBACK_THIRD = new Hat("Grey Snapback", R.drawable.img3,
            new String("Low Risk, High outcome - Authorise transactions using your OTP and 4 digit PIN."), 9377378);
//    public static final Hat SNAPBACK_NAVY = new Hat("Navy Snapback", R.drawable.snapback_navy,
//             new BigDecimal(20.99), 9377379);
//    public static final Hat SNAPBACK_RED = new Hat("Red Snapback", R.drawable.snapback_red,
//             new BigDecimal(20.99), 9377380);
//    public static final Hat SNAPBACK_TEAL = new Hat("Teal Snapback", R.drawable.snapback_teal,
//             new BigDecimal(20.99), 9377381);

    public static final Hat[] SNAPBACKS = {SNAPBACK_FIRST, SNAPBACK_SECOND, SNAPBACK_THIRD};



}