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
 * Model definition for PartyQueueApiMessagesPlaylistResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the party_queue. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartyQueueApiMessagesPlaylistResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errmsg;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long pid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PartyQueueApiMessagesSongMessage> songs;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getErrmsg() {
    return errmsg;
  }

  /**
   * @param errmsg errmsg or {@code null} for none
   */
  public PartyQueueApiMessagesPlaylistResponse setErrmsg(java.lang.String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public PartyQueueApiMessagesPlaylistResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPid() {
    return pid;
  }

  /**
   * @param pid pid or {@code null} for none
   */
  public PartyQueueApiMessagesPlaylistResponse setPid(java.lang.Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<PartyQueueApiMessagesSongMessage> getSongs() {
    return songs;
  }

  /**
   * @param songs songs or {@code null} for none
   */
  public PartyQueueApiMessagesPlaylistResponse setSongs(java.util.List<PartyQueueApiMessagesSongMessage> songs) {
    this.songs = songs;
    return this;
  }

  @Override
  public PartyQueueApiMessagesPlaylistResponse set(String fieldName, Object value) {
    return (PartyQueueApiMessagesPlaylistResponse) super.set(fieldName, value);
  }

  @Override
  public PartyQueueApiMessagesPlaylistResponse clone() {
    return (PartyQueueApiMessagesPlaylistResponse) super.clone();
  }

}