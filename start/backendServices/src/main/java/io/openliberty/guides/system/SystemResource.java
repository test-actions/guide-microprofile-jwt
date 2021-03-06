// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
// tag::jwt[]
package io.openliberty.guides.system;

import java.util.Properties;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.annotation.security.RolesAllowed;

@RequestScoped
@Path("properties")
public class SystemResource {
  @GET
  //Add the @RolesAllowed({ "admin", "user" }) annotation here.
  @Produces(MediaType.APPLICATION_JSON)
  public Properties getProperties() {
    return System.getProperties();
  }
}
// end::jwt[]
