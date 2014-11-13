package br.furb.wordhunter.activities;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
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
	
	private ActionBar.Tab liveTab;
	private ActionBar.Tab archiveTab;
	private Fragment liveFragmentTab = new LiveFragmentTab();
	private Fragment archiveFragmentTab = new ArchiveFragmentTab();

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);		
		setContentView(R.layout.activity_hunt_screen);
		
		this.initTabs();
				
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
	
	
	
	
}
