/*******************************************************************************
 * Copyright (c) 2013 takoyaki.ch.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     takoyaki.ch - Initial version
 ******************************************************************************/
package ch.takoyaki.email.html.client.service;

import java.util.List;

public interface FileService {

	boolean isSupported();

	String getNewName();

	void store(String fname, String text);

	String retrieve(String fname);

	List<String> list();

	void rename(String previousName, String newName);

	void delete(String fname);

	String retrieveAllAsZipBase64();

}
