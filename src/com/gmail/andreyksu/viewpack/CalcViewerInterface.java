package com.gmail.andreyksu.viewpack;

import java.awt.Button;
import java.awt.TextField;

public interface CalcViewerInterface {

	TextField getExpressionField();

	Button getPerformanceButton();

	TextField getResultField();

	Button getSaveButton();

	TextField getPathField();

	void showHint(String message);

	void hideHint();

}
