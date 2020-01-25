package com.sample.togglz.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum MyFeatures implements Feature {

//	@EnabledByDefault
	@Label("Personal Details")
	FEATURE_PERSONAL_DETAILS,

//	@EnabledByDefault
	@Label("Identification Details")
	FEATURE_IDENTIFICATION_DETAILS,

//	@EnabledByDefault
	@Label("Contact Details")
	FEATURE_CONTACT_DETAILS,

//	@EnabledByDefault
	@Label("Employment Details")
	FEATURE_EMPLOYMENT_DETAILS;

}