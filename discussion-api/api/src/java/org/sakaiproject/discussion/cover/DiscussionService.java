/**********************************************************************************
 * $URL$
 * $Id$
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

package org.sakaiproject.discussion.cover;

import org.sakaiproject.component.cover.ComponentManager;

/**
 * <p>
 * DiscussionService is a static Cover for the {@link org.sakaiproject.discussion.api.DiscussionService DiscussionService}; see that interface for usage details.
 * </p>
 */
public class DiscussionService
{
	/**
	 * Access the component instance: special cover only method.
	 * 
	 * @return the component instance.
	 */
	public static org.sakaiproject.discussion.api.DiscussionService getInstance()
	{
		if (ComponentManager.CACHE_COMPONENTS)
		{
			if (m_instance == null)
				m_instance = (org.sakaiproject.discussion.api.DiscussionService) ComponentManager
						.get(org.sakaiproject.discussion.api.DiscussionService.class);
			return m_instance;
		}
		else
		{
			return (org.sakaiproject.discussion.api.DiscussionService) ComponentManager
					.get(org.sakaiproject.discussion.api.DiscussionService.class);
		}
	}

	private static org.sakaiproject.discussion.api.DiscussionService m_instance = null;

	public static java.lang.String APPLICATION_ID = org.sakaiproject.discussion.api.DiscussionService.APPLICATION_ID;

	public static java.lang.String REFERENCE_ROOT = org.sakaiproject.discussion.api.DiscussionService.REFERENCE_ROOT;

	public static java.lang.String SECURE_ADD_TOPIC = org.sakaiproject.discussion.api.DiscussionService.SECURE_ADD_TOPIC;

	public static java.lang.String SECURE_READ = org.sakaiproject.discussion.api.DiscussionService.SECURE_READ;

	public static java.lang.String SECURE_ADD = org.sakaiproject.discussion.api.DiscussionService.SECURE_ADD;

	public static java.lang.String SECURE_REMOVE_OWN = org.sakaiproject.discussion.api.DiscussionService.SECURE_REMOVE_OWN;

	public static java.lang.String SECURE_REMOVE_ANY = org.sakaiproject.discussion.api.DiscussionService.SECURE_REMOVE_ANY;

	public static java.lang.String SECURE_UPDATE_OWN = org.sakaiproject.discussion.api.DiscussionService.SECURE_UPDATE_OWN;

	public static java.lang.String SECURE_UPDATE_ANY = org.sakaiproject.discussion.api.DiscussionService.SECURE_UPDATE_ANY;

	public static java.lang.String REF_TYPE_CHANNEL = org.sakaiproject.discussion.api.DiscussionService.REF_TYPE_CHANNEL;

	public static java.lang.String REF_TYPE_MESSAGE = org.sakaiproject.discussion.api.DiscussionService.REF_TYPE_MESSAGE;

	public static org.sakaiproject.discussion.api.DiscussionChannel getDiscussionChannel(java.lang.String param0)
			throws org.sakaiproject.exception.IdUnusedException, org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getDiscussionChannel(param0);
	}

	public static org.sakaiproject.discussion.api.DiscussionChannelEdit addDiscussionChannel(java.lang.String param0)
			throws org.sakaiproject.exception.IdUsedException, org.sakaiproject.exception.IdInvalidException,
			org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.addDiscussionChannel(param0);
	}

	public static java.util.List getChannels()
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getChannels();
	}

	public static boolean allowGetChannel(java.lang.String param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return false;

		return service.allowGetChannel(param0);
	}

	public static boolean allowAddChannel(java.lang.String param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return false;

		return service.allowAddChannel(param0);
	}

	public static org.sakaiproject.message.api.MessageChannelEdit addChannel(java.lang.String param0)
			throws org.sakaiproject.exception.IdUsedException, org.sakaiproject.exception.IdInvalidException,
			org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.addChannel(param0);
	}

	public static boolean allowEditChannel(java.lang.String param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return false;

		return service.allowEditChannel(param0);
	}

	public static org.sakaiproject.message.api.MessageChannelEdit editChannel(java.lang.String param0)
			throws org.sakaiproject.exception.IdUnusedException, org.sakaiproject.exception.PermissionException,
			org.sakaiproject.exception.InUseException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.editChannel(param0);
	}

	public static void commitChannel(org.sakaiproject.message.api.MessageChannelEdit param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return;

		service.commitChannel(param0);
	}

	public static void cancelChannel(org.sakaiproject.message.api.MessageChannelEdit param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return;

		service.cancelChannel(param0);
	}

	public static boolean allowRemoveChannel(java.lang.String param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return false;

		return service.allowRemoveChannel(param0);
	}

	public static void removeChannel(org.sakaiproject.message.api.MessageChannelEdit param0)
			throws org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return;

		service.removeChannel(param0);
	}

	public static java.lang.String channelReference(java.lang.String param0, java.lang.String param1)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.channelReference(param0, param1);
	}

	public static java.lang.String messageReference(java.lang.String param0, java.lang.String param1, java.lang.String param2)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.messageReference(param0, param1, param2);
	}

	public static java.lang.String messageReference(java.lang.String param0, java.lang.String param1)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.messageReference(param0, param1);
	}

	public static void cancelMessage(org.sakaiproject.message.api.MessageEdit param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return;

		service.cancelMessage(param0);
	}

	public static java.util.List getMessages(java.lang.String param0, org.sakaiproject.time.api.Time param1, int param2,
			boolean param3, boolean param4, boolean param5) throws org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getMessages(param0, param1, param2, param3, param4, param5);
	}

	public static java.util.List getChannelIds(java.lang.String param0)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getChannelIds(param0);
	}

	public static org.sakaiproject.message.api.Message getMessage(org.sakaiproject.entity.api.Reference param0)
			throws org.sakaiproject.exception.IdUnusedException, org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getMessage(param0);
	}

	public static org.sakaiproject.message.api.MessageChannel getChannel(java.lang.String param0)
			throws org.sakaiproject.exception.IdUnusedException, org.sakaiproject.exception.PermissionException
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getChannel(param0);
	}

	public static java.lang.String merge(java.lang.String param0, org.w3c.dom.Element param1, java.lang.String param2,
			java.lang.String param3, java.util.Map param4, java.util.HashMap param5, java.util.Set param6)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.merge(param0, param1, param2, param3, param4, param5, param6);
	}

	public static java.lang.String getLabel()
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.getLabel();
	}

	public static java.lang.String archive(java.lang.String param0, org.w3c.dom.Document param1, java.util.Stack param2,
			java.lang.String param3, java.util.List param4)
	{
		org.sakaiproject.discussion.api.DiscussionService service = getInstance();
		if (service == null) return null;

		return service.archive(param0, param1, param2, param3, param4);
	}
}
