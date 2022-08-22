import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class FilterRecipeService {
  constructor(private httpClient: HttpClient) {}

  filterRecipes(ingredients: string): Observable<any> {
    let params = new HttpParams().append('ingredients', ingredients);
    return this.httpClient.get(
      environment.baseUrl + '/recipes' + '/ingredients',
      { params }
    );
  }
}
