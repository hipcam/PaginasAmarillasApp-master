package pe.com.falvarado.paginasamarillasapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import pe.com.falvarado.paginasamarillasapp.R;
import pe.com.falvarado.paginasamarillasapp.activities.DetailActivity;
import pe.com.falvarado.paginasamarillasapp.models.Company;

import java.util.List;
/**
 * Created by Alumno on 5/04/2018.
 */
public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    private List<Company> companies;
    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        TextView addressText;
        TextView phoneText;
        public ViewHolder(View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.logo_image);
            nameText = itemView.findViewById(R.id.name_text);
            addressText = itemView.findViewById(R.id.address_text);
            phoneText = itemView.findViewById(R.id.phone_text);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final CompanyAdapter.ViewHolder holder, int position) {
        final Company company = companies.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(company.getLogo(), "drawable", holder.itemView.getContext().getPackageName());
        holder.logoImage.setImageResource(resId);
        holder.nameText.setText(company.getName());
        holder.addressText.setText(company.getAddress());
        holder.phoneText.setText(" "+company.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(holder.itemView.getContext(), DetailActivity.class);
                Context ctx = holder.itemView.getContext();
                i.putExtra("logo",company.getLogo());
                i.putExtra("info",company.getInfo());
                i.putExtra("numero",company.getPhone());
                ctx.startActivity(i);
            }
            });

    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

}

