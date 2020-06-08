package com.playsafetest.assessment.service;

import com.playsafetest.assessment.domain.ConvertedAmount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConversionsService {

  private static final Double KELVIN_CELSIUS_CONVERSION_CONST = 273.15;
  private static final Double MILES_KILOMETER_CONVERSION_CONST = 1.60934;

  private static final Logger logger= LoggerFactory.getLogger(ConversionsService.class);

  public ConvertedAmount convertKelvinToCelsius(Double kelvinToConvert){
    long startTime = System.currentTimeMillis();
    Double celsius = kelvinToConvert - KELVIN_CELSIUS_CONVERSION_CONST;
    long endTime = System.currentTimeMillis();
    logger.info("convertKelvinToCelsius () execution duration : " + (endTime - startTime) + " milliseconds");
    return new ConvertedAmount(celsius);
  }

  public ConvertedAmount convertCelsiusToKelvin(Double celsius){
    long startTime = System.currentTimeMillis();
    Double kelvin = celsius + KELVIN_CELSIUS_CONVERSION_CONST;
    long endTime = System.currentTimeMillis();
    logger.info("convertCelsiusToKelvin () execution duration : " + (endTime - startTime) + " milliseconds");
    return new ConvertedAmount(kelvin);
  }

  public ConvertedAmount convertMilesToKilometers(Double miles){
    long startTime = System.currentTimeMillis();
    Double kilometers = miles * MILES_KILOMETER_CONVERSION_CONST;
    long endTime = System.currentTimeMillis();
    logger.info("convertMilesToKilometers () execution duration : " + (endTime - startTime) + " milliseconds");
    return new ConvertedAmount(kilometers);
  }

  public ConvertedAmount convertKilometersToMiles(Double kilometers){
    long startTime = System.currentTimeMillis();
    Double miles = kilometers / MILES_KILOMETER_CONVERSION_CONST;
    long endTime = System.currentTimeMillis();
    logger.info("convertKilometersToMiles () execution duration : " + (endTime - startTime) + " milliseconds");
    return new ConvertedAmount(miles);
  }

}
