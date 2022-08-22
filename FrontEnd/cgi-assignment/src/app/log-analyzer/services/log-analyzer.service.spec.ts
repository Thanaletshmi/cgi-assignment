import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { LogAnalyzerService } from './log-analyzer.service';

describe('LogAnalyzerService', () => {
  let service: LogAnalyzerService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    service = TestBed.inject(LogAnalyzerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call viewLogs() and return an array of logData', () => {
    const loglevel = 'INFO';
    const logs = {
      logType: 'INFO',
      logDataList: [
        {
          logName: 'PaymentService:',
          logMessage: 'payment observers size 4',
          logCount: 28,
        },
        {
          logName: 'LifecycleService:',
          logMessage:
            '[127.0.0.1]:5701 [dev] [3.2.5] Address[127.0.0.1]:5701 is STARTING',
          logCount: 26,
        },
      ],
    };

    service.viewLogs(loglevel).subscribe((res) => {
      expect(res).toEqual(logs);
    });
  });
});
