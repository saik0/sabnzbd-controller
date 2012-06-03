package com.gmail.at.faint545.adapters;

import java.util.List;

import android.widget.BaseAdapter;

import com.gmail.at.faint545.NzoItem;

public abstract class SabAdapter extends BaseAdapter {
  public boolean isEven(int position) {
    return position%2 == 0 ? true : false;
  }
  
  public abstract void setAllChecked(boolean isChecked);
  public abstract String getCheckedIds();
  public abstract void reset();
  
  public abstract void add(NzoItem item);
  public abstract void addAll(List<NzoItem> items);
  public abstract void clearData();
}
