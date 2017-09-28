package com.i017114.tallerdos.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i017114.tallerdos.Models.Country;
import com.i017114.tallerdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reyes on 26/09/2017.
 */

public class AdapterCountry extends RecyclerView.Adapter<AdapterCountry.ViewHolder> {

    List<Country> countryList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterCountry(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View itemdos = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdos, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemdos);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes
        holder.textViewName.setText(countryList.get(position).getName());
        holder.textViewCapital.setText(countryList.get(position).getCapital());
        holder.textViewAlphs.setText(countryList.get(position).getAlphacode());
        holder.textViewRegion.setText(countryList.get(position).getRegion());
        holder.textViewSubregion.setText(countryList.get(position).getSubregion());
        holder.textViewPopulation.setText(""+countryList.get(position).getPopulation());


    }
    @Override
    public int getItemCount() {
        return countryList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewAlphs;
        TextView textViewRegion;
        TextView textViewSubregion;
        TextView textViewPopulation;

        public ViewHolder(View itemdos) {
            super(itemdos);
            textViewName = (TextView) itemdos.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) itemdos.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) itemdos.findViewById(R.id.id_tv_item_nameabbreviation);
            textViewRegion=(TextView) itemdos.findViewById(R.id.id_tv_item_region);
            textViewSubregion=(TextView) itemdos.findViewById(R.id.id_tv_item_subregion);
            textViewPopulation=(TextView) itemdos.findViewById(R.id.id_tv_item_population);

        }
    }

}
