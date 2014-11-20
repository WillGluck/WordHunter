package br.furb.wordhunter.activities;

import java.util.List;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;

/**
 * Activity da tela de resultados.
 * 
 * @author Will Glück
 * @created 19/11/2014
 *
 */
public class ResultScreenActivity extends Activity {
	
	//Atributos
	List<Rect> resultList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		this.initScreenComponents();
		this.prepareResult();
	}
	
	/**
	 * Inicializa os componentes de tela (carrega, seta listeners, e o que for necessário).
	 */
	private void initScreenComponents() {
		
	}
	
	private void prepareResult() {
		
	}
	
	

}
