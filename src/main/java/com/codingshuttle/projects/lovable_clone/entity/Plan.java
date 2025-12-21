package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;
    String stripePriceId;

    Integer maxProjects;
    Integer maxTokenPerDay;
    Integer maxPreviews; //max number of previews allowed per plan

    Boolean unlimitedAi; //unlimited access to LLM, ignore maxTokenPerDay if true
    Boolean active;

}
