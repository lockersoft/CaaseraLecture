package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class CurrentLesson {
  @JsonProperty("studentExercises")
  @DatabaseField(columnName = Column.STUDENTEXERCISES)
  private List studentExercises;
  @JsonProperty("notes")
  @DatabaseField(columnName = Column.NOTES)
  private String notes;
  @JsonProperty("completedOn")
  @DatabaseField(columnName = Column.COMPLETEDON)
  private JSONObject$Null completedOn;
  @JsonProperty("studentAssignments")
  @DatabaseField(columnName = Column.STUDENTASSIGNMENTS)
  private List<StudentAssignmentsItem> studentAssignments;
  @JsonProperty("title")
  @DatabaseField(columnName = Column.TITLE)
  private String title;
  @JsonProperty("createdOn")
  @DatabaseField(columnName = Column.CREATEDON)
  private String createdOn;
  @JsonProperty("status")
  @DatabaseField(columnName = Column.STATUS)
  private Integer status;

  public interface Column {
    String STUDENTEXERCISES = "STUDENTEXERCISES";
    String NOTES = "NOTES";
    String COMPLETEDON = "COMPLETEDON";
    String STUDENTASSIGNMENTS = "STUDENTASSIGNMENTS";
    String TITLE = "TITLE";
    String CREATEDON = "CREATEDON";
    String STATUS = "STATUS";

  }
}