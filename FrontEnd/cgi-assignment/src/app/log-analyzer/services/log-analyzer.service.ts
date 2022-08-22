import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LogAnalyzerService {
  constructor(private httpClient: HttpClient) {}

  viewLogs(loglevel: any): Observable<any> {
    let url = `http://localhost:8080/logs/${loglevel}`;
    return this.httpClient.get(url);
  }
}
