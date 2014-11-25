package br.furb.wordhunter.activities;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import br.furb.wordhunter.models.Rect;

import com.example.wordhunter.R;

/**
 * Activity da tela de resultados.
 * 
 * @author Will Gl�ck
 * @created 19/11/2014
 *
 */
public class ResultScreenActivity extends Activity {
	
	//Atributos
	List<Rect> resultList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_result_screen);
		
		this.initScreenComponents();
		this.prepareResult();
	}
	
	/**
	 * Inicializa os componentes de tela (carrega, seta listeners, e o que for necess�rio).
	 */
	private void initScreenComponents() {
		
	}
	
	private void prepareResult() {
		
	}
	
	//Listeners
	
	/** 
	 * @return Listener do bot�o previousResult.
	 */
	private OnClickListener getOnPreviousResultClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ResultScreenActivity.this.previousResult();
			}
		};
	}
	
	/** 
	 * @return Listener do bot�o nextResult.
	 */
	private OnClickListener getOnNextResultClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ResultScreenActivity.this.nextResult();
			}
		};
	}
	
	/** 
	 * @return Listener do bot�o zoomOut.
	 */
	private OnClickListener getOnZoomOutClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ResultScreenActivity.this.zoomOut();
			}
		};
	}
	
	/** 
	 * @return Listener do bot�o goBack.
	 */
	private OnClickListener getOnGoBackClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ResultScreenActivity.this.goBack();
			}
		};
	}
	
	//A��es/
	
	/**
	 * Navega para o pr�ximo resultado.
	 */
	private void nextResult() {
		//TODO
	}
	
	/**
	 * Navega para o resultado anterior.
	 */
	private void previousResult() {
		//TODO
	}
	
	/**
	 * Zoom Out na imagem
	 */
	private void zoomOut() {
		//TODO
	}
	
	/**
	 * Retorna para a tela de busca.
	 */
	private void goBack() {
		//TODO
	}
	

}
