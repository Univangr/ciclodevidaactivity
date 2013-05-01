package com.fran.ciclovida;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

/**
 * Para mis hijos. Este proyecto ha sido creado para mostraros el ciclo de vida
 * de una Activity, que es una clase como esta (hereda de Activity).
 * 
 * Para ver un diagrama del ciclo de vida id a:
 * http://www.android-app-market.com/wp-content/uploads/2012/03/Android-Activity-Lifecycle.png
 * 
 * Lo que voy a hacer en esta Activity es simplemente sobreescribir todos los métodos posibles para 
 * manejar el ciclo de vida de una Activity, en una aplicación real rara vez es necesario 
 * reescribir todos ellos, pero es solo para que la ejecuteis y veais cuando es llamado cada uno de ellos
 * 
 * Así que en cada método simplemente voy a llamar a la clase Toast, que muestra una notificación sencilla
 * por pantalla 
 * @author Fran
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
	}

   
    
}
