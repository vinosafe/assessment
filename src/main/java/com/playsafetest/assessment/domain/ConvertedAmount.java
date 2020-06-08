package com.playsafetest.assessment.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConvertedAmount {

  //celsius
  private Double convertedAmount;

  public ConvertedAmount(Double convertedAmount){
    this.convertedAmount = convertedAmount;
  }
}
