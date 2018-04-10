package pe.com.falvarado.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.com.falvarado.paginasamarillasapp.R;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import pe.com.falvarado.paginasamarillasapp.R;
import pe.com.falvarado.paginasamarillasapp.adapters.CompanyAdapter;
import pe.com.falvarado.paginasamarillasapp.repositories.CompanyRepository;

public class SearchResultActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CompanyAdapter companyAdapter = new CompanyAdapter();
        companyAdapter.setCompanies(CompanyRepository.getList());

        recyclerView.setAdapter(companyAdapter);

    }
}
