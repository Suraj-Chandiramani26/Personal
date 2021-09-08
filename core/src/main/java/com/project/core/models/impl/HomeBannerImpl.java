package com.project.core.models.impl;

import com.project.core.models.HomeAbout;
import com.project.core.models.HomeBanner;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
    @Model(
            adaptables = Resource.class,
            adapters = HomeBanner.class,
//resourceType =HomeAbout.RESOURCE_TYPE,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public class HomeBannerImpl implements HomeBanner {
        @Inject
        @Default(values = "This is me")
        String myfirsttext;

        @Inject
        @Default(values = "Philip Gilbert")
        String mysecondtext;

        @Inject
        @Default(values = "You will begin to realise why this exercise is called the Dickens Pattern with reference to the ghost showing Scrooge some different futures.\n")
        String multilinefield;

        @Inject
        @Default(values = "Discover Now")
        String button;

        @ValueMapValue
        String fileReference;

        @Inject
        String path;

        @Override
        public String getBio() {
            return myfirsttext;
        }

        @Override
        public String getFullName() {
            return mysecondtext;
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
    }