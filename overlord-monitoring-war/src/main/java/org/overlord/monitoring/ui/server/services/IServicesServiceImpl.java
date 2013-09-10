/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.monitoring.ui.server.services;

import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;
import org.overlord.monitoring.ui.client.shared.beans.QName;
import org.overlord.monitoring.ui.client.shared.beans.ReferenceBean;
import org.overlord.monitoring.ui.client.shared.beans.ReferenceResultSetBean;
import org.overlord.monitoring.ui.client.shared.beans.ServiceBean;
import org.overlord.monitoring.ui.client.shared.beans.ServiceResultSetBean;
import org.overlord.monitoring.ui.client.shared.beans.ServicesFilterBean;
import org.overlord.monitoring.ui.client.shared.exceptions.UiException;

/**
 * Provides a way to manage services.
 *
 * @author eric.wittmann@redhat.com
 */
@Remote
public interface IServicesServiceImpl {

    /**
     * Return a list of all application names.
     * @throws UiException
     */
    public List<QName> getApplicationNames() throws UiException;

    /**
     * Search for services using the given filters.
     * @param filters
     * @param page
     * @param sortColumn
     * @param ascending
     * @throws UiException
     */
    public ServiceResultSetBean findServices(ServicesFilterBean filters, int page, String sortColumn,
            boolean ascending) throws UiException;

    /**
     * Search for references using the given filters.
     * @param filters
     * @param page
     * @param sortColumn
     * @param ascending
     * @throws UiException
     */
    public ReferenceResultSetBean findReferences(ServicesFilterBean filters, int page,
            String sortColumn, boolean ascending) throws UiException;

    /**
     * Fetches a full service by its name.
     * @param serviceId
     * @throws UiException
     */
    public ServiceBean getService(String serviceId) throws UiException;

    /**
     * Fetches a full reference by its id.
     * @param referenceId
     * @throws UiException
     */
    public ReferenceBean getReference(String referenceId) throws UiException;

}
