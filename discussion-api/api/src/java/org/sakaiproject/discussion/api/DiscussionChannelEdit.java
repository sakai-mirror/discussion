/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/discussion/tags/sakai_2-2-1/discussion-api/api/src/java/org/sakaiproject/discussion/api/DiscussionChannelEdit.java $
 * $Id: DiscussionChannelEdit.java 8232 2006-04-25 01:11:55Z ggolden@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *      http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.discussion.api;

import java.util.List;

import org.sakaiproject.exception.PermissionException;
import org.sakaiproject.message.api.MessageChannelEdit;

/**
 * <p>
 * DiscussionChannel is an editable DiscussionChannel
 * </p>
 */
public interface DiscussionChannelEdit extends DiscussionChannel, MessageChannelEdit
{
	/**
	 * Set categories for this channel.
	 * 
	 * @param category
	 *        The category string to be set.
	 * @exception PermissionException
	 *            If the user does not have write permission to the channel.
	 */
	public void setCategories(List categories) throws PermissionException;
}
