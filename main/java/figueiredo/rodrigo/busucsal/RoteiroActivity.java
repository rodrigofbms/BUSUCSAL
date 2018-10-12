package figueiredo.rodrigo.busucsal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class RoteiroActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roteiro);

        TextView percuso = findViewById(R.id.percusoModify);
        TextView horas = findViewById(R.id.horasModify);

        Intent intent = getIntent();

        if (intent != null){
            Bundle bundle = intent.getExtras();
            if(bundle != null){
                Roteiro roteiro =  (Roteiro) bundle.get("roteiro");
                percuso.setText(roteiro.getPercuso());
                horas.setText(roteiro.getHorarios());
                Log.d("PontoDescricao", roteiro.getPercuso());
            }
        }

    }
}
