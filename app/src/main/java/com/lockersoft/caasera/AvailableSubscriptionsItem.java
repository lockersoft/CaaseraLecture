package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AvailableSubscriptionsItem {
  @JsonProperty("sportCategory")
  @DatabaseField(columnName = Column.SPORTCATEGORY)
  private String sportCategory;
  @JsonProperty("subscriptionId")
  @DatabaseField(columnName = Column.SUBSCRIPTIONID)
  private String subscriptionId;
  @JsonProperty("sport")
  @DatabaseField(columnName = Column.SPORT)
  private String sport;

  public interface Column {
    String SPORTCATEGORY = "SPORTCATEGORY";
    String SUBSCRIPTIONID = "SUBSCRIPTIONID";
    String SPORT = "SPORT";

  }
}