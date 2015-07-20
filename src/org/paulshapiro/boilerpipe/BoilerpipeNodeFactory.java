package org.paulshapiro.boilerpipe;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "Boilerpipe" Node.
 * 
 *
 * @author Paul Shapiro
 */
public class BoilerpipeNodeFactory 
        extends NodeFactory<BoilerpipeNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public BoilerpipeNodeModel createNodeModel() {
        return new BoilerpipeNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<BoilerpipeNodeModel> createNodeView(final int viewIndex,
            final BoilerpipeNodeModel nodeModel) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new BoilerpipeNodeDialog();
    }

}

