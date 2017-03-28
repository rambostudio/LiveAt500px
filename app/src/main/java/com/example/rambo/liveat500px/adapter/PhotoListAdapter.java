package com.example.rambo.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rambo.liveat500px.dao.PhotoItemCollectionDao;
import com.example.rambo.liveat500px.dao.PhotoItemDao;
import com.example.rambo.liveat500px.manager.PhotoListManager;
import com.example.rambo.liveat500px.view.PhotoListItem;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by rambo on 27/3/2560.
 */

public class PhotoListAdapter extends BaseAdapter {
    PhotoItemCollectionDao dao;

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    @Override
    public int getCount() {
        if (dao == null) {
            return 0;
        }
        if (dao.getData() == null) {
            return 0;
        }
        return dao.getData().size();
    }

    @Override
    public Object getItem(int i) {

        return dao.getData().get(i);
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
        PhotoItemDao dao = (PhotoItemDao) getItem(i);
        item.setNameText(dao.getCaption());
        item.setDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImageUrl(dao.getImageUrl());

        return item;

    }
}
