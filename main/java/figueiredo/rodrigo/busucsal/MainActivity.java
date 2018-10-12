package figueiredo.rodrigo.busucsal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public static List<Roteiro> roteiros(){
        ArrayList<Roteiro> retorno = new ArrayList<>();

        Roteiro roteiro1 = new Roteiro();
        roteiro1.setNumero(1);
        roteiro1.setPercuso("Saída: UCSAL - Pituaçu\n" +
                "Única parada - Av. Paralela(sentido aeroporto) - ponto do estádio de pituaçu");
        roteiro1.setHorarios("6h30min  7h40min  \n6h45min  17h10min \n7h   18h 20min\n7h20min    18h40min\n ");
        retorno.add(roteiro1);

        Roteiro roteiro2 = new Roteiro();
        roteiro2.setNumero(2);
        roteiro2.setPercuso("Saída: UCSAL Pituaçu \n " +
                "1 Parada - Av. Pinto de Aguiar (Sentido paralela) - Atrás do primeiro ponto Ônibus \n " +
                "2 Parada - Av.Pinto de Aguiar (Sentido Paralela) - Ponto do condomínio Greenville \n" +
                "3 Parada - Terminal Pituaçu - 1 Andar, Plataforma E, 17");
        roteiro2.setHorarios("8h25min (SAB)  11h30min (SAB)  \n9h30min  11h45min \n10h   12h15min\n11h15min \n ");
        retorno.add(roteiro2);

        Roteiro roteiro3 = new Roteiro();
        roteiro3.setNumero(3);
        roteiro3.setPercuso("Saída: UCSAL - Pituaçu \n " +
                "1 Parada - Av.Pinto de Aguiar (Sentido Paralela) - Ponto do Greenville \n " +
                "2 Parada - Av.Pinto de Aguiar (Sentido Paralela) - Atrás do primeiro ponto ônibus \n " +
                "3 Parada - Av.Paralela (Sentido aeroporto) - Ponto Estádio de Pituaçu");
        roteiro3.setHorarios("20h30min  \n20h55min  \n21h20min \n");
        retorno.add(roteiro3);

        Roteiro roteiro4 = new Roteiro();
        roteiro4.setNumero(4);
        roteiro4.setPercuso("Saída: UCSAL Pituaçu \n " +
                "1 Parada - Av.Pinto de Aguiar (sentido Paralela) - Ponto do Greenville\n" +
                "2 Parada - Av.Paralela (Sentido centro) - Ponto do estádio Pituaçu \n" +
                "3 Parada - Av.Paralela (Sentido aeroporto) - Ponto Extra Paralela \n" +
                "4 Parada - Av.Paralela (Sentido aeroporto) - Ponto Extra Paralela \n" +
                "5 Parada - Avenida Luís Viana Filho (Sentido aeroporto) - Ponto estádio de Pituaçu");
        roteiro4.setHorarios("9h50min (SAB)  \n12h30min (SAB)  \n13h30min  \n22h15min\n ");
        retorno.add(roteiro4);

        Roteiro roteiro5 = new Roteiro();
        roteiro5.setNumero(5);
        roteiro5.setPercuso("Saída: UCSAL - Pituaçu \n" +
                "1 Parada - Av.Pinto de Aguiar (Sentido Orla) - Ponto do Greenville \n" +
                "2 Parada - Av.Pinto de Aguiar (Sentido Paralela) - Atrás do primeiro ponto de ônibus \n" +
                "3 Parada - Av.Paralela (Sentido aeroporto) - Ponto Wall Street Empresarial \n" +
                "4 Parada - Av.paralela (Sentido aeroporto) - ponto Posto Menos Preço \n" +
                "5 Parada - Av.Paralela (Sentido centro) - Ponto em frente ao Colégio Villa \n" +
                "6 Parada - Av.Paralela (Sentido centro) - Ponto próximo a entrada do Flamboyant \n" +
                "7 Parada - Av.Paralela (Sentido centro) - Ponto em frente ao Condomínio Brisas \n" +
                "8 Parada - Av.Paralela (Sentido centro) - Ponto de Estação de Metrô Pituaçu \n" +
                "9 Parada - Av.Paralela (Sentido centro) - Ponto Extra Paralela \n" +
                "10 Parada - Av.Paralela (Sentido aeroporto) - Ponto Extra paralela \n" +
                "11 Parada - Av.Paralela (Sentido aeroporto) - Ponto Estádio de Pituaçu");
        roteiro5.setHorarios("10h30min  \n12h45min  \n21h40min  \n ");
        retorno.add(roteiro5);

        return retorno;
    }


    public Roteiro buscarRoteiro (Integer n){

        for (Roteiro roteiro:roteiros()) {
            if(roteiro.getNumero().equals(n)){
                return roteiro;
            }
        }
    return null;
    }



    public void chamarRoteiro1 (View view){
        Intent intent = new Intent(this, RoteiroActivity.class);
        intent.putExtra("roteiro", buscarRoteiro(1));


        startActivity(intent);
    }

    public void chamarRoteiro2 (View view){
        Intent intent = new Intent(this, RoteiroActivity.class);
        intent.putExtra("roteiro", buscarRoteiro(2));


        startActivity(intent);
    }

    public void chamarRoteiro3 (View view){
        Intent intent = new Intent(this, RoteiroActivity.class);
        intent.putExtra("roteiro", buscarRoteiro(3));


        startActivity(intent);
    }

    public void chamarRoteiro4 (View view){
        Intent intent = new Intent(this, RoteiroActivity.class);
        intent.putExtra("roteiro", buscarRoteiro(4));


        startActivity(intent);
    }

    public void chamarRoteiro5(View view){
        Intent intent = new Intent(this, RoteiroActivity.class);
        intent.putExtra("roteiro", buscarRoteiro(5));


        startActivity(intent);
    }
}
