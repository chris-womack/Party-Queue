/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-03-25 20:06:55 UTC)
 * on 2016-04-07 at 02:10:33 UTC 
 * Modify at your own risk.
 */

package com.appspot.party_queue_1243.party_queue.model;

/**
 * Model definition for PartyQueueApiMessagesAccountResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the party_queue. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartyQueueApiMessagesAccountResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errmsg;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public PartyQueueApiMessagesAccountResponse setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getErrmsg() {
    return errmsg;
  }

  /**
   * @param errmsg errmsg or {@code null} for none
   */
  public PartyQueueApiMessagesAccountResponse setErrmsg(java.lang.String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public PartyQueueApiMessagesAccountResponse setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * @param username username or {@code null} for none
   */
  public PartyQueueApiMessagesAccountResponse setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public PartyQueueApiMessagesAccountResponse set(String fieldName, Object value) {
    return (PartyQueueApiMessagesAccountResponse) super.set(fieldName, value);
  }

  @Override
  public PartyQueueApiMessagesAccountResponse clone() {
    return (PartyQueueApiMessagesAccountResponse) super.clone();
  }

}
