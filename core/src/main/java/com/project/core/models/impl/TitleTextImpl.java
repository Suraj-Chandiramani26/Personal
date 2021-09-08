package com.project.core.models.impl;

import com.project.core.models.TitleText;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        adapters = TitleText.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImpl implements TitleText{

    @Inject
    @Default(values = "title")
    String title;

    @Inject
    @Default(values = "At about this time of the year, some months after new year a resolution has been made")
    String info;

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public String getInfo(){
        return info;
    }
}
