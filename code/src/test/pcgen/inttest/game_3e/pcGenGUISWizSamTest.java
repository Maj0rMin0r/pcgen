/*
 * Copyright 2015 (C) Andrew Maitland <amaitland@users.sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created/Reinstated on 2015-11-24
 *
 */
package pcgen.inttest.game_3e;

import pcgen.inttest.pcGenGUITestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Tests a 3e 1st level Halfling Wizard(Transmuter).
 * 
 * See PCG file for details.
 */
@SuppressWarnings("nls")
public class pcGenGUISWizSamTest extends pcGenGUITestCase
{
	/**
	 * Run the tests.
	 * @param args
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(pcGenGUISWizSamTest.class);
	}

	/** 
	 * Standard JUnit style constructor
	 * 
	 * @param name
	 */
	public pcGenGUISWizSamTest(String name)
	{
		super(name);
	}

	/**
	 * Return test
	 * @return Test
	 */
	public static Test suite()
	{
		return new TestSuite(pcGenGUISWizSamTest.class);
	}

	/**
	 * Run test
	 * @throws Exception
	 */
	public void testSWizSam() throws Exception
	{
		runTest("3e_SWizSam", "3e");
	}
}
