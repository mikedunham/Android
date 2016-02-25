package com.example.mike.taskit;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mike on 2/11/2015.
 */
public class Task implements Serializable {
    private static final String TAG = "Task";

    private String mName;
    private Date mDueDate;
    private boolean mDone;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    public void setDueDate(Date dueDate) {
        mDueDate = dueDate;
    }

    public Boolean isDone() {
        return mDone;
    }

    public void setDone(Boolean done) {
        mDone = done;
    }

    public String toString(){
        return mName;
    }
}
