/*
 * Copyright (c) 2011-2013 The original author or authors
 *  ------------------------------------------------------
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
/**
 * ==== Setting headers on messages
 *
 * Messages sent over the event bus can also contain _headers_. This can be specified by setting options when sending or
 * publishing:
 *
 * [source,groovy]
 * ----
 * def options = [
 *   headers: [
 *    "some-header" : "some-value"
 *   ]
 * ]
 * vertx.eventBus().send("news.uk.sport", "Yay! Someone kicked a ball", options);
 * ----
 *
 * On the other side, a consumer can retrieve the headers as follows:
 *
 * [source,groovy]
 * ----
 * vertx.eventBus().consumer("news.uk.sport",  { e ->
 *  println e.headers()["some-header"];
 * });
 * ----
 *
 */
@Document(fileName = "override/eventbus_headers.adoc")
package docoverride.eventbus.headers;

import io.vertx.docgen.Document;