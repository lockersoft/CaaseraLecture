package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AvailableLessonsItem {
  @JsonProperty("lessonNumber")
  @DatabaseField(columnName = Column.LESSONNUMBER)
  private Integer lessonNumber;
  @JsonProperty("completedOn")
  @DatabaseField(columnName = Column.COMPLETEDON)
  private String completedOn;
  @JsonProperty("lessonId")
  @DatabaseField(columnName = Column.LESSONID)
  private String lessonId;
  @JsonProperty("createdOn")
  @DatabaseField(columnName = Column.CREATEDON)
  private String createdOn;
  @JsonProperty("status")
  @DatabaseField(columnName = Column.STATUS)
  private Integer status;

  public interface Column {
    String LESSONNUMBER = "LESSONNUMBER";
    String COMPLETEDON = "COMPLETEDON";
    String LESSONID = "LESSONID";
    String CREATEDON = "CREATEDON";
    String STATUS = "STATUS";

  }
}