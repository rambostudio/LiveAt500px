package com.example.rambo.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rambo.liveat500px.manager.PhotoListManager;
import com.example.rambo.liveat500px.view.PhotoListItem;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by rambo on 27/3/2560.
 */

public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null) {
            return 0;
        }
        if (PhotoListManager.getInstance().getDao().getData() == null) {
            return 0;
        }
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PhotoListItem item;
        if (view != null) {
            item = (PhotoListItem) view;

        } else {
            item = new PhotoListItem(viewGroup.getContext());

        }
        return item;

    }
}
