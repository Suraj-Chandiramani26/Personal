package com.project.core.models.impl;
import com.project.core.models.HomeAbout;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
@Model(
        adaptables = Resource.class,
        adapters = HomeAbout.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeAboutImpl implements HomeAbout{
    @Inject
    @Default(values = "About Me")
    String myfirsttext;

    @Inject
    @Default(values = " Personal Details")
    String secondtext;

    @Inject
    @Default(values = "Here, I focus on a range of items and features that we use in life without giving them a second thought. such as Coca Cola. Dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.\n" )
    String multilinefield;

    @Inject
    @Default(values = "View Full Details")
    String button;

    @ValueMapValue
    String fileReference;

    @Override
    public String getAbout() {
        return myfirsttext;
    }

    @Override
    public String getDetails() {
        return secondtext;
    }

    @Override
    public String getIntro() {
        return multilinefield;
    }

    @Override
    public String getButton() {
        return button;
    }

    @Override
    public String getImage() {
        return fileReference;
    }

    //final protected static String RESOURCE_TYPE="";
}

