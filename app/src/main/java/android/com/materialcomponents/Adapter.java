package android.com.materialcomponents;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juan.brusco on 29/08/2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.DataExampleViewHolder> {
    private List<DataExample> items;

    public static class DataExampleViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView detalle;

        public DataExampleViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            detalle = (TextView) v.findViewById(R.id.detalle);
        }
    }

    public Adapter(List<DataExample> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public DataExampleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card, viewGroup, false);
        return new DataExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DataExampleViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.detalle.setText(items.get(i).getDetalle());
    }
}
