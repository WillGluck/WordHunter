package br.furb.wordhunter.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wordhunter.R;

/**
 * 
 * Fragment da busca de palavras via imagens da galeria.
 * 
 * @author Will Glück
 * @created 12/11/2014
 *
 */
public class ArchiveFragmentTab extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_archive_tab, container, false);
		return view;
	}

}
