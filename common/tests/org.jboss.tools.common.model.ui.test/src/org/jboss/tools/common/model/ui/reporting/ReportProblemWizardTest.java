/*******************************************************************************
 * Copyright (c) 2007 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.common.model.ui.reporting;

import junit.framework.TestCase;

import org.eclipse.swt.widgets.Shell;
import org.jboss.tools.common.model.ui.ModelUIPlugin;
import org.jboss.tools.common.model.ui.wizards.query.IQueryDialog;

/**
 * @author eskimo
 *
 */
public class ReportProblemWizardTest extends TestCase {

  //FIXME(modular)
	public void testReportProblemWizardFixMe() {
		try {
			Shell shell = ModelUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
			IQueryDialog reportWiz = new ReportProblemWizard().createDialog(shell);
			reportWiz.getDialog().setBlockOnOpen(false);
			reportWiz.getDialog().open();
			reportWiz.getDialog().close();
		} catch (NullPointerException e) {
			return;
		}
		fail("Expected NullPointerException");
	}
}