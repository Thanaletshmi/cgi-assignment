package com.cgi.nl.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogData {

    @ApiModelProperty(notes = "Log Name", example = "java.lang.NullPointerException")
    private String logName;

    @ApiModelProperty(notes = "Log Message/Description", example = "Exception in com.fluentgrid.repapp.web.rest.EventsResource.search() with cause = null java.lang.NullPointerException: null")
    private String logMessage;

    @ApiModelProperty(notes = "Number of occurrences", example = "8")
    private int logCount;
}
