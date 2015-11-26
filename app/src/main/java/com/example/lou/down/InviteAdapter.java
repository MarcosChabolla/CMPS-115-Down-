package com.example.lou.down;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.parse.ParseUser;

/**
 * Created by Robin on 11/25/2015.
 */

public class InviteAdapter extends ParseQueryAdapter<ParseObject>{

    public InviteAdapter(Context context) {
        super(context, new ParseQueryAdapter.QueryFactory<ParseObject>() {
            public ParseQuery create() {
                ParseQuery query = new ParseQuery("event");
                query.whereEqualTo("inviteeList", ParseUser.getCurrentUser().getUsername());
                return query;
            }
        });
    }

    @Override
    public View getItemView(ParseObject object, View v, ViewGroup parent) {
        if (v == null) {
            v = View.inflate(getContext(), R.layout.event_layout, null);
        }
        super.getItemView(object, v, parent);

        TextView eventNameView = (TextView) v.findViewById(R.id.text1);
        eventNameView.setText(object.getString("eventName"));

        TextView eventDescriptionView = (TextView) v.findViewById(R.id.text2);
        eventDescriptionView.setText(object.getString("eventDiscription"));
        return v;
    }
}
