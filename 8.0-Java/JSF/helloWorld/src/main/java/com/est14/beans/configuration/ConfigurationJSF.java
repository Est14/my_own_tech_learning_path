package com.est14.beans.configuration;

import jakarta.faces.annotation.FacesConfig;
import jakarta.faces.bean.ApplicationScoped;

import static jakarta.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(
        // Activate the CDI build-in beans
        version = JSF_2_3
)
@ApplicationScoped
public class ConfigurationJSF {
}
