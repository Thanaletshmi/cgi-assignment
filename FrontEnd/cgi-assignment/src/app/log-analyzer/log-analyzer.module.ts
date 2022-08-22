import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { LogAnalyzerRoutingModule } from './log-analyzer-routing.module';
import { LogAnalyzerComponent } from './log-analyzer.component';
import { HttpClientModule } from '@angular/common/http';
import { MatRadioModule } from '@angular/material/radio';
import { MatTableModule } from '@angular/material/table';

@NgModule({
  declarations: [LogAnalyzerComponent],
  imports: [
    CommonModule,
    LogAnalyzerRoutingModule,
    FormsModule,
    HttpClientModule,
    MatRadioModule,
    MatTableModule,
  ],
})
export class LogAnalyzerModule {}
