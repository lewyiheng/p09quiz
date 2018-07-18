package com.example.a17010407.p09quiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<FormulaStuff> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaStuff> objects) {
        super(context, resource, objects);
        this.parent_context = parent_context;
        this.layout_id = layout_id;
        this.formulaList = formulaList;

    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater infLater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = infLater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);

        FormulaStuff currentItem = formulaList.get(position);
        tvName.setText(currentItem.getFormName());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());


        return rowView;
    }
}