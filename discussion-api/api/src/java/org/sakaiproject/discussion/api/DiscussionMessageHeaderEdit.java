/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/discussion/branches/sakai_2-3-x/discussion-api/api/src/java/org/sakaiproject/discussion/api/DiscussionMessageHeaderEdit.java $
 * $Id: DiscussionMessageHeaderEdit.java 8232 2006-04-25 01:11:55Z ggolden@umich.edu $
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

import org.sakaiproject.message.api.MessageHeaderEdit;

/**
 * <p>
 * DiscussionMessageHeaderEdit is an editable DiscussionMessageHeader
 * </p>
 */
public interface DiscussionMessageHeaderEdit extends DiscussionMessageHeader, MessageHeaderEdit
{
	/**
	 * Set the subject of the discussion message.
	 * 
	 * @param subject
	 *        The subject of the discussion message.
	 */
	public void setSubject(String subject);

	/**
	 * Set the category of the discussion message.
	 * 
	 * @param category
	 *        The category of the discussion message.
	 */
	public void setCategory(String category);

	/**
	 * Set the local or resource id of the message this one is a reply to, used in threading.
	 * 
	 * @return The id of the message this one is a reply to, used in threading, or null if none.
	 */
	public void setReplyTo(String id);
}
