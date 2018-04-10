package pe.com.falvarado.paginasamarillasapp.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.com.falvarado.paginasamarillasapp.models.Company;
/**
 * Created by Alumno on 5/04/2018.
 */

public class CompanyRepository {
    private static List<Company> companies = new ArrayList<>();
    static {
        companies.add(new Company( 100, "Restaurantes", "La Casa del Tacu Tacu", "Jr. Pelotillehue 53-48 Int 84", "informes@lacasadeltacutacu.com", 012242625, "www.lacasadeltacutacu.com",
                "ic_company1", "Déjese cautivar por el mejor sabor criollo…" ));

        companies.add(new Company( 200, "Restaurantes", "La Bisteca", "Jr. Pelotillehue 53-48 Int 84", "informes@lacasadeltacutacu.com", 012242625, "www.lacasadeltacutacu.com",
                "ic_company2", "Déjese cautivar por el mejor sabor criollo…" ));

        companies.add(new Company( 300, "Bares", "Tinki Kaya", "Jr. Pelotillehue 53-48 Int 84", "informes@lacasadeltacutacu.com", 012242625, "www.lacasadeltacutacu.com",
                "ic_company3", "Déjese cautivar por el mejor sabor criollo…" ));

        companies.add(new Company( 400, "Bares", "Farra", "Jr. Pelotillehue 53-48 Int 84", "informes@lacasadeltacutacu.com", 012242625, "www.lacasadeltacutacu.com",
                "ic_company4", "Déjese cautivar por el mejor sabor criollo…" ));

        companies.add(new Company( 500, "Cafeterias", "La Casa del Alfajor", "Jr. Pelotillehue 53-48 Int 84", "informes@lacasadeltacutacu.com", 012242625, "www.lacasadeltacutacu.com",
                "ic_company5", "Déjese cautivar por el mejor sabor criollo…" ));

    }
    public static List<Company> getList(){
        return companies;
    }
}
