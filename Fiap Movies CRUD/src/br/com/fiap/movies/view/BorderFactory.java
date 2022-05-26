package br.com.fiap.movies.view;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public abstract class BorderFactory {
	public static Border create() {
		return new LineBorder(new Color(255, 0, 0));
	}
}