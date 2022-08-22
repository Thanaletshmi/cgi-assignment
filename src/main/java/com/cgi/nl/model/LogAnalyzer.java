package com.cgi.nl.model;

import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(notes = "Log Type", example = "ERROR")
    private String logType;

    @ApiModelProperty(notes = "List of Log Information")
    private List<LogData> logDataList;
}
