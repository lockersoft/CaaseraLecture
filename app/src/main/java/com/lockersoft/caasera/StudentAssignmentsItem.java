package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class StudentAssignmentsItem {
  @JsonProperty("isDenied")
  @DatabaseField(columnName = Column.ISDENIED)
  private Boolean isDenied;
  @JsonProperty("studentFeedback")
  @DatabaseField(columnName = Column.STUDENTFEEDBACK)
  private List studentFeedback;
  @JsonProperty("uploadUrl")
  @DatabaseField(columnName = Column.UPLOADURL)
  private JSONObject$Null uploadUrl;
  @JsonProperty("completedOn")
  @DatabaseField(columnName = Column.COMPLETEDON)
  private JSONObject$Null completedOn;
  @JsonProperty("description")
  @DatabaseField(columnName = Column.DESCRIPTION)
  private String description;
  @JsonProperty("reasonDenied")
  @DatabaseField(columnName = Column.REASONDENIED)
  private JSONObject$Null reasonDenied;
  @JsonProperty("title")
  @DatabaseField(columnName = Column.TITLE)
  private String title;
  @JsonProperty("assignmentId")
  @DatabaseField(columnName = Column.ASSIGNMENTID)
  private String assignmentId;
  @JsonProperty("createdOn")
  @DatabaseField(columnName = Column.CREATEDON)
  private String createdOn;

  public interface Column {
    String ISDENIED = "ISDENIED";
    String STUDENTFEEDBACK = "STUDENTFEEDBACK";
    String UPLOADURL = "UPLOADURL";
    String COMPLETEDON = "COMPLETEDON";
    String DESCRIPTION = "DESCRIPTION";
    String REASONDENIED = "REASONDENIED";
    String TITLE = "TITLE";
    String ASSIGNMENTID = "ASSIGNMENTID";
    String CREATEDON = "CREATEDON";

  }
}