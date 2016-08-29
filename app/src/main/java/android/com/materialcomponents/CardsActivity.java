package android.com.materialcomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

// Paso a paso ---------------------------- http://www.hermosaprogramacion.com/2015/02/android-recyclerview-cardview/
public class CardsActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Inicializar DataExample
        List items = new ArrayList();

        items.add(new DataExample(R.drawable.neoris, "Data example 1", "Detail 1"));
        items.add(new DataExample(R.drawable.neoris, "Data example 2", "Detail 2"));
        items.add(new DataExample(R.drawable.neoris, "Data example 3", "Detail 3"));
        items.add(new DataExample(R.drawable.neoris, "Data example 4", "Detail 4"));
        items.add(new DataExample(R.drawable.neoris, "Data example 5", "Detail 5"));
        items.add(new DataExample(R.drawable.neoris, "Data example 6", "Detail 6"));
        items.add(new DataExample(R.drawable.neoris, "Data example 7", "Detail 7"));



        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new Adapter(items);
        recycler.setAdapter(adapter);
    }

}
