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
		setContentView(R.layout.activity_result_screen);
		
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
	
	//Listeners
	
	/** 
	 * @return Listener do botão previousResult.
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
	 * @return Listener do botão nextResult.
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
	 * @return Listener do botão zoomOut.
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
	 * @return Listener do botão goBack.
	 */
	private OnClickListener getOnGoBackClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ResultScreenActivity.this.goBack();
			}
		};
	}
	
	//Ações/
	
	/**
	 * Navega para o próximo resultado.
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
