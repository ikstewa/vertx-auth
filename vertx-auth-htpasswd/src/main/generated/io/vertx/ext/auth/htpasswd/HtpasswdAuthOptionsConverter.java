package io.vertx.ext.auth.htpasswd;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions}.
 * NOTE: This class has been automatically generated from the {@link "io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions} original class using Vert.x codegen.
 */
public class HtpasswdAuthOptionsConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, HtpasswdAuthOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "enabledCryptPwd":
          break;
        case "enabledPlainTextPwd":
          break;
        case "htpasswdFile":
          if (member.getValue() instanceof String) {
            obj.setHtpasswdFile((String)member.getValue());
          }
          break;
        case "usersAuthorizedForEverything":
          if (member.getValue() instanceof Boolean) {
            obj.setUsersAuthorizedForEverything((Boolean)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(HtpasswdAuthOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(HtpasswdAuthOptions obj, java.util.Map<String, Object> json) {
    json.put("enabledCryptPwd", obj.isEnabledCryptPwd());
    json.put("enabledPlainTextPwd", obj.isEnabledPlainTextPwd());
    if (obj.getHtpasswdFile() != null) {
      json.put("htpasswdFile", obj.getHtpasswdFile());
    }
  }
}
