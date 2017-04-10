package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class CurrentSubscription {
  @JsonProperty("currentLesson")
  @DatabaseField(columnName = Column.CURRENTLESSON)
  private CurrentLesson currentLesson;
  @JsonProperty("sportCategory")
  @DatabaseField(columnName = Column.SPORTCATEGORY)
  private String sportCategory;
  @JsonProperty("availableLessons")
  @DatabaseField(columnName = Column.AVAILABLELESSONS)
  private List<AvailableLessonsItem> availableLessons;
  @JsonProperty("subscriptionId")
  @DatabaseField(columnName = Column.SUBSCRIPTIONID)
  private String subscriptionId;
  @JsonProperty("type")
  @DatabaseField(columnName = Column.TYPE)
  private Integer type;
  @JsonProperty("coach")
  @DatabaseField(columnName = Column.COACH)
  private Coach coach;
  @JsonProperty("sport")
  @DatabaseField(columnName = Column.SPORT)
  private String sport;
  @JsonProperty("status")
  @DatabaseField(columnName = Column.STATUS)
  private Integer status;

  public interface Column {
    String CURRENTLESSON = "CURRENTLESSON";
    String SPORTCATEGORY = "SPORTCATEGORY";
    String AVAILABLELESSONS = "AVAILABLELESSONS";
    String SUBSCRIPTIONID = "SUBSCRIPTIONID";
    String TYPE = "TYPE";
    String COACH = "COACH";
    String SPORT = "SPORT";
    String STATUS = "STATUS";

  }
}