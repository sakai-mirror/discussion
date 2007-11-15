/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/discussion/branches/sakai_2-3-x/discussion-api/api/src/java/org/sakaiproject/discussion/api/DiscussionMessageEdit.java $
 * $Id: DiscussionMessageEdit.java 8232 2006-04-25 01:11:55Z ggolden@umich.edu $
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

import org.sakaiproject.message.api.MessageEdit;

/**
 * <p>
 * DiscussionMessage is the Interface for a Sakai Discussion message.
 * </p>
 * <p>
 * The discussion message has header fields (from, date) and a body (text). Each message also has an id, unique within the channel. All fields are read only.
 * </p>
 */
public interface DiscussionMessageEdit extends DiscussionMessage, MessageEdit
{
	/**
	 * A (DiscussionMessageHeaderEdit) cover for getHeaderEdit to access the announcement message header.
	 * 
	 * @return The announcement message header.
	 */
	public DiscussionMessageHeaderEdit getDiscussionHeaderEdit();
}
