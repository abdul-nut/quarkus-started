package org.learning.core.util.jackson;

import java.time.LocalDateTime;

import org.learning.core.util.FormatUtil;

import com.fasterxml.jackson.databind.util.StdConverter;

public class TimeSerialize extends StdConverter<LocalDateTime, String> {
  @Override
  public String convert(LocalDateTime time) {
    return FormatUtil.convertToString(time);
  }
}
