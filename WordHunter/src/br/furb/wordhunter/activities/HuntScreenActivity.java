package br.furb.wordhunter.activities;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.furb.wordhunter.fragments.ArchiveFragmentTab;
import br.furb.wordhunter.fragments.LiveFragmentTab;
import br.furb.wordhunter.listeners.WordHunterTabListener;

import com.example.wordhunter.R;

/**
 * Activity responsável pela tela de busca de palavras em imagens, via galeria ou câmera.
 * 
 * @author Will Glück
 * @created 12/11/2014 
 *
 */
public class HuntScreenActivity extends FragmentActivity {
	
	//Tabs e fragments.
	private ActionBar.Tab liveTab;
	private ActionBar.Tab archiveTab;
	private Fragment liveFragmentTab = new LiveFragmentTab();
	private Fragment archiveFragmentTab = new ArchiveFragmentTab();
	
	//Componentes de tela que manteremos referência.
	Button huntButton;
	

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);		
		setContentView(R.layout.activity_hunt_screen);
		
		this.initTabs();
		this.initScreenComponents();
				
	}
	
	/**b
	 * Inicializa as Tabs, seus listeners e por ai vai. 
	 */
	private void initTabs() {
		
		//Recupera a actionBar e deixa ela do jeito que a gente quer.
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//Cria as tabs e seta seus listeners.
		this.liveTab = actionBar.newTab().setText(R.string.hunt_screen_live_tab);
		this.archiveTab = actionBar.newTab().setText(R.string.hunt_screen_archive_tab);
		this.liveTab.setTabListener(new WordHunterTabListener(this.liveFragmentTab));
		this.archiveTab.setTabListener(new WordHunterTabListener(this.archiveFragmentTab));
		
		//Adiciona as tabs na actionBar.
		actionBar.addTab(this.liveTab);
		actionBar.addTab(this.archiveTab);		
	}
		
	/**
	 * Inicializa os componentes de tela (carrega, seta listeners, e o que for necessário).
	 */
	private void initScreenComponents() {
		this.huntButton = (Button) findViewById(R.id.hunt_screen_hunt_button);
		this.huntButton.setEnabled(false);
		this.huntButton.setOnClickListener(this.getOnHuntButtonClickListener());		
	}	
	
	/**
	 * @return OnClickListener do botão huntWord.
	 */
	private OnClickListener getOnHuntButtonClickListener() {
		return new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				HuntScreenActivity.this.huntWord();				
			}
		};
	}
	
	/**
	 * Ação de busca de palavra na imagem de input.
	 */
	private void huntWord() {
		Toast.makeText(this, "Busca!", Toast.LENGTH_LONG).show();
	}
}
