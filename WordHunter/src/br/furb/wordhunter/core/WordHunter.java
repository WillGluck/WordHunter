package br.furb.wordhunter.core;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;

import android.graphics.Rect;


/**
 * Classe responsável pela busca de palavras em uma imagem.
 * 
 * @author Will Glück
 * @created 19/11/2014
 *
 */
public class WordHunter {
	
	//Campos estáticos
	public static final String ARCHIVE = "ARCHIVE";
	public static final String LIVE = "LIVE";
	
	/** 
	 * @param processedImage Imagem já processada
	 * @return Lista de retângulos das palavras encontradas.
	 */
	public List<Rect> findWord(Mat processedImage) {
		return new ArrayList<Rect>();
	}
	
	/**
	 * @param image Imagem crua recebida da câmera ou galeria.
	 * @return Imagem processada.
	 */
	public Mat processImage(byte[] Rawimage) {
		return new Mat();
	}

}
