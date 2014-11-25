package br.furb.wordhunter.activities;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import br.furb.wordhunter.core.HistoricalManager;
import br.furb.wordhunter.core.WordHunter;
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
	private Button huntButton;
	private EditText searchWord;
	
	//Outros atributos
	private WordHunter wordHunter = new WordHunter();
	private HistoricalManager historicalManager = new HistoricalManager();

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);		
		setContentView(R.layout.activity_hunt_screen);
		
		this.initTabs();
		this.initScreenComponents();	
		this.initDialogs();
	}
	
	//Métodos de inicialização da Activity.
	
	/**
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
		this.liveTab.setTabListener(new WordHunterTabListener(this.liveFragmentTab, WordHunter.LIVE));
		this.archiveTab.setTabListener(new WordHunterTabListener(this.archiveFragmentTab, WordHunter.ARCHIVE));
		
		//Adiciona as tabs na actionBar.
		actionBar.addTab(this.liveTab);
		actionBar.addTab(this.archiveTab);		
	}
		
	/**
	 * Inicializa os componentes de tela (carrega, seta listeners, e o que for necessário).
	 */
	private void initScreenComponents() {
		//Botão de busca.
		this.huntButton = (Button) findViewById(R.id.hunt_screen_hunt_button);
		this.huntButton.setEnabled(false);
		this.huntButton.setOnClickListener(this.getOnHuntButtonClickListener());
		//Campo de texto.
		this.searchWord = (EditText) findViewById(R.id.hunt_screen_search_word);
		searchWord.addTextChangedListener(this.getTextChangeWatcher());
	}	
	
	private void initDialogs() {
		
	}
	
	//Listeners.
	
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
	 * @return TextWatcher para habilitar ou não o botão de busca de acordo com a presença ou não de texto no campo de busca de palavra.
	 */
	private TextWatcher getTextChangeWatcher() {
		return new TextWatcher() {			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,int arg3) {}
			
			@Override
			public void afterTextChanged(Editable editable) {
				boolean hasText =  HuntScreenActivity.this.searchWord.getText().toString().trim().length() > 0;
				HuntScreenActivity.this.huntButton.setEnabled(hasText);	
			}
		};
	}
	
	//Ações.
	
	/**
	 * Ação de busca de palavra na imagem de input.
	 */
	private void huntWord() {
		this.getImage(); 		
		//TODO
	}
	
	/**
	 * @return Imagem à ser processada.
	 */
	private byte[] getImage() {
		//Verifica qual fragment está ativo e recupera a imagem dele.
		Fragment tempArchiveFragment = getFragmentManager().findFragmentByTag(WordHunter.ARCHIVE);
		if (tempArchiveFragment != null && tempArchiveFragment.isVisible()) {
			return ((ArchiveFragmentTab)this.archiveFragmentTab).getImage();
		} else { //if (tempLiveFragment != null && tempLiveFragment.isVisible()) {
			return ((LiveFragmentTab)this.liveFragmentTab).getImage();
		}
	}
	
}
