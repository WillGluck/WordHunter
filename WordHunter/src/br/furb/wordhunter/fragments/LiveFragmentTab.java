package br.furb.wordhunter.fragments;

import java.io.IOException;

import android.app.Fragment;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import com.example.wordhunter.R;

/**
 * 
 * Fragment da busca de palavras via câmera.
 * 
 * @author Will Glück
 * @created 12/11/2014
 *
 */
public class LiveFragmentTab extends Fragment implements TextureView.SurfaceTextureListener {
		
	private Camera camera;
	private TextureView textureView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_live_tab, container, false);		
		this.initCamera(view);		
		return view;
	}
	
	/**
	 * Inicializa câmera e joga imagem no textureView.
	 */
	private void initCamera(View view) {
		this.textureView = (TextureView) view.findViewById(R.id.live_tab_view);
		this.textureView.setSurfaceTextureListener(this);
	}

	@Override
	public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {		
		this.camera = Camera.open();
		try {
			this.camera.setPreviewTexture(surfaceTexture);
			this.camera.setDisplayOrientation(90);
			this.camera.startPreview();			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	@Override
	public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
		this.camera.stopPreview();
		this.camera.release();
		return true;
	}

	@Override
	public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {

	}

	@Override
	public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
		//Nadica.
	}

}
