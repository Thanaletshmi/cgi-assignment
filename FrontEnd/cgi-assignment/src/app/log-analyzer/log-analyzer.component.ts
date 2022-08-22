import { Component } from '@angular/core';
import { MatRadioChange } from '@angular/material/radio';
import { LogAnalyzerService } from './services/log-analyzer.service';
import { Subscription } from 'rxjs';
import { LogData } from './models/log-data.model';

@Component({
  selector: 'app-log-analyzer',
  templateUrl: './log-analyzer.component.html',
  styleUrls: ['./log-analyzer.component.scss'],
})
export class LogAnalyzerComponent {
  isSubmitted = false;
  logLevels: string[] = ['INFO', 'DEBUG', 'WARN', 'ERROR'];
  displayedColumns: string[] = ['logName', 'logMessage', 'logCount'];
  dataSource: LogData[];
  subscription = new Subscription();

  constructor(private logAnalyzerService: LogAnalyzerService) {}

  onChange(logLevel: MatRadioChange) {
    this.subscription = this.logAnalyzerService
      .viewLogs(logLevel.value)
      .subscribe(
        (response) => {
          this.dataSource = response.logDataList;
        },
        (error) => {
          console.log(error);
        }
      );
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}
