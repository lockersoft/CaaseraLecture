package com.lockersoft.caasera;

/**
 * Created by JacksonGenerator on 2/28/17.
 */

import com.j256.ormlite.field.DatabaseField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Test {
  @JsonProperty("currentSubscription")
  @DatabaseField(columnName = Column.CURRENTSUBSCRIPTION)
  private CurrentSubscription currentSubscription;
  @JsonProperty("firstName")
  @DatabaseField(columnName = Column.FIRSTNAME)
  private String firstName;
  @JsonProperty("availableSubscriptions")
  @DatabaseField(columnName = Column.AVAILABLESUBSCRIPTIONS)
  private List<AvailableSubscriptionsItem> availableSubscriptions;

  public interface Column {
    String CURRENTSUBSCRIPTION = "CURRENTSUBSCRIPTION";
    String FIRSTNAME = "FIRSTNAME";
    String AVAILABLESUBSCRIPTIONS = "AVAILABLESUBSCRIPTIONS";

  }
}