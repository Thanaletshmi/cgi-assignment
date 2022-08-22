import { LogDataList } from "./log-datalist.model";

export interface LogData extends LogDataList {
    logType: String;
    logDataList: LogDataList[];
  }
  