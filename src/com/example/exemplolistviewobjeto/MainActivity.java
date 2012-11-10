package com.example.exemplolistviewobjeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente("Fulaninha", new Date(1999, 3, 12)));
        clientes.add(new Cliente("Sicrano", new Date(1980, 4, 2)));
        clientes.add(new Cliente("Beltrano", new Date(1989, 6, 20)));
        clientes.add(new Cliente("Fulaninha", new Date(1999, 3, 12)));
        clientes.add(new Cliente("Sicrano", new Date(1980, 4, 2)));
        clientes.add(new Cliente("Beltrano", new Date(1989, 6, 20)));
        clientes.add(new Cliente("Fulaninha", new Date(1999, 3, 12)));
        clientes.add(new Cliente("Sicrano", new Date(1980, 4, 2)));
        clientes.add(new Cliente("Beltrano", new Date(1989, 6, 20)));
        clientes.add(new Cliente("Fulaninha", new Date(1999, 3, 12)));
        clientes.add(new Cliente("Sicrano", new Date(1980, 4, 2)));
        clientes.add(new Cliente("Beltrano", new Date(1989, 6, 20)));
       
        setListAdapter(new ClienteAdapter(this, clientes));
        
    }

}
