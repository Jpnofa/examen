package jpnofa.com.examenparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTextView;
    TextView txtTextView2;
    TextView txtTextView3;
    TextView txtTextView4;
    TextView txtTextView5;
    TextView txtTextView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relación de TextView en la interfaz con la variable que vamos a trabajr

        txtTextView = (TextView) findViewById(R.id.textView);
        txtTextView2 = (TextView) findViewById(R.id.textView2);
        txtTextView3 = (TextView) findViewById(R.id.textView3);
        txtTextView4 = (TextView) findViewById(R.id.textView4);
        txtTextView5 = (TextView) findViewById(R.id.textView5);
        txtTextView6 = (TextView) findViewById(R.id.textView6);

        txtTextView.setText("A dog's way home");
        txtTextView2.setText("Green Book");
        txtTextView3.setText("Aventura de cariñoso perro que quiere regresar a casa");
        txtTextView4.setText("El chofer de un artista negro lo acompaña y proteje durante un tour por sudamerica en los peores años del racismo");
        txtTextView5.setText("Una pelicula de una guerrera que involucra amor y aventura");
        txtTextView6.setText("Alita: Battle Angel");

    }
}
