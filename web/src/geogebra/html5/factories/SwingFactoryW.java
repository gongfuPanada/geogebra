package geogebra.html5.factories;

import geogebra.common.euclidian.Drawable;
import geogebra.common.factories.SwingFactory;
import geogebra.common.gui.inputfield.AutoCompleteTextField;
import geogebra.common.javax.swing.AbstractJComboBox;
import geogebra.common.javax.swing.GBox;
import geogebra.common.javax.swing.GLabel;
import geogebra.common.main.App;

public class SwingFactoryW extends SwingFactory {

	@Override
	public AutoCompleteTextField newAutoCompleteTextField(int length,
	        App application, Drawable drawTextField) {
		return new geogebra.html5.gui.inputfield.AutoCompleteTextFieldW(length, application, drawTextField);
	}

	@Override
	public GLabel newJLabel(String string) {
		return new geogebra.html5.javax.swing.GLabelW(string);
	}

	@Override
	public GBox createHorizontalBox() {
		return new geogebra.html5.javax.swing.GBoxW();
	}

	@Override
    public AbstractJComboBox newJComboBox() {
	    return new geogebra.html5.javax.swing.GComboBoxW();
    }

}
