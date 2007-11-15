/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/discussion/trunk/discussion-api/api/src/java/org/sakaiproject/discussion/api/DiscussionMessage.java $
 * $Id: DiscussionMessage.java 8232 2006-04-25 01:11:55Z ggolden@umich.edu $
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

import java.util.Iterator;

import org.sakaiproject.message.api.Message;

/**
 * <p>
 * DiscussionMessage is the Interface for a Sakai Discussion message.
 * </p>
 * <p>
 * The discussion message has header fields (from, date) and a body (text). Each message also has an id, unique within the channel. All fields are read only.
 * </p>
 */
public interface DiscussionMessage extends Message
{
	/**
	 * A (DiscussionMessageHeader) cover for getHeader to access the discussion message header.
	 * 
	 * @return The discussion message header.
	 */
	public DiscussionMessageHeader getDiscussionHeader();

	/**
	 * Iterate over the messages that are a reply to this message
	 * 
	 * @return an Iterator on DiscussionMessage objects that are replies to this message (may be empty).
	 */
	public Iterator getReplies();

	/**
	 * Are there any replys to this message?
	 * 
	 * @return true if there are replies to this message, false if now.
	 */
	public boolean hasReplies();

	/**
	 * Return the depth of replyTo value for this message. Messages that are not a reply to any other message have depth = 0. If the message is a reply to a message, this message's depth is the replyTo's depth + 1.
	 * 
	 * @return The depth of replyTo value for this message.
	 */
	public int getReplyToDepth();

	/**
	 * Access the most recent reply to this message, if any.
	 * 
	 * @return the most recent DiscussionMessage reply to this message, or null if there are no replies.
	 */
	public DiscussionMessage getLatestReply();

	/**
	 * Count the number of replies to this message (i.e. the size of the getReplies iterator).
	 * 
	 * @return the number of replies to this message.
	 */
	public int getNumberOfReplies();
}
