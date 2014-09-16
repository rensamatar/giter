package com.tarconcept.fragment;

import com.tarconcept.model.ItemGit;
import com.tarconcept.model.ItemGitArrayAdapter;
import com.tarconcept.ahoy.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TerminologyFragment extends Fragment {

    private ListView listTerm;
    private String[] head;
    private String[] body;
    private ArrayList<ItemGit> allItem = null;
    private ItemGitArrayAdapter gitAdapter = null;

    public TerminologyFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_terminology, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initializeComponentData();
    }

    private void initializeComponentData() {

        head = getResources().getStringArray(R.array.terminology_command);
        body = getResources().getStringArray(R.array.terminology_description);

        allItem = new ArrayList<ItemGit>();
        allItem.add(new ItemGit(head[0], body[0]));
        allItem.add(new ItemGit(head[1], body[1]));
        allItem.add(new ItemGit(head[2], body[2]));
        allItem.add(new ItemGit(head[3], body[3]));
        allItem.add(new ItemGit(head[4], body[4]));
        allItem.add(new ItemGit(head[5], body[5]));
        allItem.add(new ItemGit(head[6], body[6]));
        allItem.add(new ItemGit(head[7], body[7]));
        allItem.add(new ItemGit(head[8], body[8]));

        gitAdapter = new ItemGitArrayAdapter(getActivity(), allItem);
        listTerm = (ListView) getActivity().findViewById(R.id.listTerm);
        listTerm.setAdapter(gitAdapter);
    }

}
