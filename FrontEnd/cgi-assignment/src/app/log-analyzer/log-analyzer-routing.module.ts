import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogAnalyzerComponent } from './log-analyzer.component';

const routes: Routes = [{ path: '', component: LogAnalyzerComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LogAnalyzerRoutingModule { }
