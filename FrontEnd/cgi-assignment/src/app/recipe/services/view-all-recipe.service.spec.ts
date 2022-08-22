import { HttpClient, HttpClientModule } from '@angular/common/http';
import { async, inject, TestBed } from '@angular/core/testing';
import {
  HttpClientTestingModule,
  HttpTestingController,
} from '@angular/common/http/testing';
import { ViewAllRecipeService } from './view-all-recipe.service';

describe('ViewAllRecipeService', () => {
  let viewAllRecipeService: ViewAllRecipeService;
  let url = 'http://localhost:8080';
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ViewAllRecipeService],
    });

    viewAllRecipeService = TestBed.inject(ViewAllRecipeService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should be created', () => {
    expect(viewAllRecipeService).toBeTruthy();
  });

  it('should call getRecipes() and return an array of recipes', () => {
    const recipes = [
      {
        title: 'Barbecued Grilled Portobello Sandwich',
        href: 'http://www.kraftfoods.com/kf/recipes/barbecued-grilled-portobello-sandwich-53215.aspx',
        ingredients: [
          'mushrooms',
          'barbecue sauce',
          'sandwich rolls',
          'lettuce',
          'tomato',
        ],
        thumbnail: 'http://img.recipepuppy.com/646777.jpg',
      },
      {
        title: 'Barbecued Grilled Portobello Sandwich',
        href: 'http://www.kraftfoods.com/kf/recipes/barbecued-grilled-portobello-sandwich-53215.aspx?cm_re=1-_-1-_-RecipeAlsoEnjoy',
        ingredients: [
          'mushrooms',
          'barbecue sauce',
          'sandwich rolls',
          'lettuce',
          'tomato',
        ],
        thumbnail: 'http://img.recipepuppy.com/675080.jpg',
      },
    ];

    viewAllRecipeService.getRecipes().subscribe((res) => {
      expect(res).toEqual(recipes);
    });

    const req = httpMock.expectOne({
      method: 'GET',
      url: `${url}/recipes`,
    });
    req.flush(recipes);
  });
});
