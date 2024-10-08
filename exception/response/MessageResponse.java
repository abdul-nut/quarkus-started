package org.learning.exception.response;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

/**
 * Gunakan exception ini jika malas bangod ngetik.
 *
 * @author Bayu , Gus Anta
 * @since 26 Des 2022
 */

public class MessageResponse {

  private MessageResponse() {
  }

  public static WebApplicationException fetchMessageException(
      Long id,
      String object) {
    return new WebApplicationException(
        Response
            .status(400)
            .entity(
                "{\"field\":\"" +
                    object +
                    "\",  \n  \t\"id\": " +
                    id +
                    ",\n  \t\"message\":\"NOT FOUND OR FORMAT NOT VALID\"}")
            .build());
  }

  public static Response deleteSucces(Long id) {
    return Response
        .status(200)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"SUCCES DELETED\"}")
        .build();
  }

  public static Response deleteSucces(Integer id) {
    return Response
        .status(200)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"SUCCES DELETED\"}")
        .build();
  }

  public static Response deleteSucces(String id) {
    return Response
        .status(200)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"SUCCES DELETED\"}")
        .build();
  }

  public static Response idNotFound(Long id) {
    return Response
        .status(404)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
        .build();
  }

  public static Response idNotFound(Integer id) {
    return Response
        .status(404)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
        .build();
  }

  public static Response idNotFound(String id) {
    return Response
        .status(404)
        .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
        .build();
  }

  public static WebApplicationException idNotFoundException(Long id) {
    return new WebApplicationException(
        Response
            .status(404)
            .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
            .build());
  }

  public static WebApplicationException idNotFoundException(Integer id) {
    return new WebApplicationException(
        Response
            .status(404)
            .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
            .build());
  }

  public static WebApplicationException idNotFoundException(String id) {
    return new WebApplicationException(
        Response
            .status(404)
            .entity("{\"id\": " + id + ",\n  \t\"message\":\"NOT FOUND\"}")
            .build());
  }
}
