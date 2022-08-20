package com.cgi.nl.model;

import com.cgi.nl.constants.LogLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogAnalyzer {

    private String logType;

    private List<LogData> logDataList;
}
