package com.playsafetest.assessment.controller;

import com.playsafetest.assessment.domain.ConvertedAmount;
import com.playsafetest.assessment.service.ConversionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conversions")
public class ConversionsController {

  @Autowired
  private ConversionsService conversionsService;

  @GetMapping("/ktoc")
  public ConvertedAmount ktoc(@RequestParam(value = "kelvin") Double kelvin) {
    return conversionsService.convertKelvinToCelsius(kelvin);
  }

  @GetMapping("/ctok")
  public ConvertedAmount ctok(@RequestParam(value = "celsius") Double celsius) {
    return conversionsService.convertCelsiusToKelvin(celsius);
  }

  @GetMapping("/mtok")
  public ConvertedAmount mtok(@RequestParam(value = "miles") Double miles) {
    return conversionsService.convertMilesToKilometers(miles);
  }

  @GetMapping("/ktom")
  public ConvertedAmount ktom(@RequestParam(value = "kilometers") Double kilometers) {
    return conversionsService.convertKilometersToMiles(kilometers);
  }
}
