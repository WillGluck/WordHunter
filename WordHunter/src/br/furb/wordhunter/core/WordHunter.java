package br.furb.wordhunter.core;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;

import android.graphics.Rect;


/**
 * Classe respons�vel pela busca de palavras em uma imagem.
 * 
 * @author Will Gl�ck
 * @created 19/11/2014
 *
 */
public class WordHunter {
	
	//Campos est�ticos
	public static final String ARCHIVE = "ARCHIVE";
	public static final String LIVE = "LIVE";
	
	/** 
	 * @param processedImage Imagem j� processada
	 * @return Lista de ret�ngulos das palavras encontradas.
	 */
	public List<Rect> findWord(Mat processedImage) {
		return new ArrayList<Rect>();
	}
	
	/**
	 * @param image Imagem crua recebida da c�mera ou galeria.
	 * @return Imagem processada.
	 */
	public Mat processImage(byte[] Rawimage) {
		return new Mat();
	}

}
