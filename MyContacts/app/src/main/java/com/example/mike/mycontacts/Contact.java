package com.example.mike.mycontacts;

import java.io.Serializable;

/**
 * Created by Mike on 3/3/2015.
 */
public class Contact implements Serializable {

    private static final String TAG = "Contact";

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    private String mName;

}
