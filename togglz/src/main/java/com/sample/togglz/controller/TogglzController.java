package com.sample.togglz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.togglz.core.manager.FeatureManager;

import com.sample.togglz.config.MyFeatures;

@Controller
@RequestMapping("/kyc")
public class TogglzController {

	private FeatureManager manager;

	public TogglzController(FeatureManager manager) {
		this.manager = manager;
	}

	@GetMapping("/toggles")
	public ResponseEntity<?> index() {
		if (manager.isActive(MyFeatures.FEATURE_PERSONAL_DETAILS)) {
			System.out.println("FEATURE_PERSONAL_DETAILS is toggled ON");
		} else {
			System.out.println("FEATURE_PERSONAL_DETAILS is toggled OFF");
		}

		if (manager.isActive(MyFeatures.FEATURE_IDENTIFICATION_DETAILS)) {
			System.out.println("FEATURE_IDENTIFICATION_DETAILS is toggled ON");
		} else {
			System.out.println("FEATURE_IDENTIFICATION_DETAILS is toggled OFF");
		}

		if (manager.isActive(MyFeatures.FEATURE_CONTACT_DETAILS)) {
			System.out.println("FEATURE_CONTACT_DETAILS is toggled ON");
		} else {
			System.out.println("FEATURE_CONTACT_DETAILS is toggled OFF");
		}

		if (manager.isActive(MyFeatures.FEATURE_EMPLOYMENT_DETAILS)) {
			System.out.println("FEATURE_EMPLOYMENT_DETAILS is toggled ON");
		} else {
			System.out.println("FEATURE_EMPLOYMENT_DETAILS is toggled OFF");
		}
		return null;
	}

}
