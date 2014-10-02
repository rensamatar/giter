package com.tarconcept.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tarconcept.ahoy.R;
import com.tarconcept.model.ItemGit;
import com.tarconcept.model.ItemGitArrayAdapter;

import java.util.ArrayList;

public class UpdatingFragment extends Fragment {

    private ListView listTerm;
    private String[] head;
    private String[] body;
    private ArrayList<ItemGit> allItem = null;
    private ItemGitArrayAdapter gitAdapter = null;

    public UpdatingFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initializeComponentData();
    }

    private void initializeComponentData() {

        head = getResources().getStringArray(R.array.updating_command);
        body = getResources().getStringArray(R.array.updating_description);

        allItem = new ArrayList<ItemGit>();
        allItem.add(new ItemGit(head[0], body[0]));
        allItem.add(new ItemGit(head[1], body[1]));
        allItem.add(new ItemGit(head[2], body[2]));

        gitAdapter = new ItemGitArrayAdapter(getActivity(), allItem);
        listTerm = (ListView) getActivity().findViewById(R.id.listTerm);
        listTerm.setAdapter(gitAdapter);
    }

}
