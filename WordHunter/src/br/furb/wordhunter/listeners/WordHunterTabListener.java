package br.furb.wordhunter.listeners;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Fragment;
import android.app.FragmentTransaction;

import com.example.wordhunter.R;

/**
 * 
 * Listener da mudança de Tab da tela de busca de palavras.
 * 
 * @author Will Glück
 * @created 12/11/2014
 *
 */
public class WordHunterTabListener implements TabListener {
	
	private Fragment fragmentTab;

	/**
	 * Construtor
	 * @param fragmentTab tab
	 */
	public WordHunterTabListener(Fragment fragmentTab) {
		this.fragmentTab = fragmentTab;
	}
	
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction) {
		fragmentTransaction.replace(R.id.hunt_screen_tab_content, this.fragmentTab);
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction) {
		fragmentTransaction.remove(this.fragmentTab);
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction) {
		//Nada.
	}

}
