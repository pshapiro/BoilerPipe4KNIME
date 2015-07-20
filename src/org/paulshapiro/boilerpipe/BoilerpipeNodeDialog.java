package org.paulshapiro.boilerpipe;

import org.knime.core.data.StringValue;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;
import org.knime.core.node.defaultnodesettings.SettingsModelString;
import org.paulshapiro.boilerpipe.BoilerpipeNodeModel;

/**
 * <code>NodeDialog</code> for the "Boilerpipe" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Paul Shapiro
 */
public class BoilerpipeNodeDialog extends DefaultNodeSettingsPane {
    private final SettingsModelString m_url = BoilerpipeNodeModel.getUrl();
protected BoilerpipeNodeDialog(){
	super();
	DialogComponentColumnNameSelection urlcolumn = new DialogComponentColumnNameSelection(m_url, "Select URL", 0, StringValue.class);
	addDialogComponent(urlcolumn);
}
}