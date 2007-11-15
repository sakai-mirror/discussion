/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/discussion/tags/sakai_2-2-0/discussion-api/api/src/java/org/sakaiproject/discussion/api/DiscussionMessageHeader.java $
 * $Id: DiscussionMessageHeader.java 8232 2006-04-25 01:11:55Z ggolden@umich.edu $
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

import org.sakaiproject.message.api.MessageHeader;

/**
 * <p>
 * DiscussionMessageHeader is the Interface for a Sakai Discussion Message header.
 * </p>
 * <p>
 * In addition to the usual body, from and time fields of MessageHeader, discussion messages have:
 * </p>
 * <p>
 * Category: a selection from a limited set of strings which categorizes a message.
 * </p>
 * <p>
 * Subject: an unrestricted user entered text that describes the message.
 * </p>
 * <p>
 * ReplyTo: a message reference to which this message is a direct reply.
 * </p>
 * <p>
 * Draft: a value that lets us have messages that are stored but are still in the process of being created and are not publically available yet.
 * </p>
 */
public interface DiscussionMessageHeader extends MessageHeader
{
	/**
	 * Access the subject of the discussion message.
	 * 
	 * @return The subject of the discussion message.
	 */
	public String getSubject();

	/**
	 * Access the category of the discussion message.
	 * 
	 * @return The category of the discussion message.
	 */
	public String getCategory();

	/**
	 * Access the local or resource id of the message this one is a reply to, used in threading.
	 * 
	 * @return The id of the message this one is a reply to, used in threading, or null if none.
	 */
	public String getReplyTo();
}
