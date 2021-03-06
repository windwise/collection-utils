package com.guardanis.collections.list.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.guardanis.collections.adapters.AdapterViewModule;

public abstract class ListViewModule<T> extends AdapterViewModule<T, ModularArrayAdapter> {

    protected View convertView;

    public ListViewModule(int layoutResId) {
        super(layoutResId);
    }

    @Override
    public View build(Context context, ViewGroup parent){
        this.convertView = inflate(context, parent);

        locateViewComponents(convertView);

        return convertView;
    }

    protected abstract void locateViewComponents(View convertView);

    public View getConvertView(){
        return convertView;
    }

}
