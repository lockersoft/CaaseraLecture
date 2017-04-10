package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Coach {
  @JsonProperty("avatarUri")
  @DatabaseField(columnName = Column.AVATARURI)
  private String avatarUri;
  @JsonProperty("name")
  @DatabaseField(columnName = Column.NAME)
  private String name;

  public interface Column {
    String AVATARURI = "AVATARURI";
    String NAME = "NAME";

  }
}