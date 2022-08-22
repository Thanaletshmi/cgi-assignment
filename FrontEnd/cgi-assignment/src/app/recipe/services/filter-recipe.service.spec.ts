import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { FilterRecipeService } from './filter-recipe.service';

describe('FilterRecipeService', () => {
  let filterRecipeService: FilterRecipeService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    filterRecipeService = TestBed.inject(FilterRecipeService);
  });

  it('should be created', () => {
    expect(filterRecipeService).toBeTruthy();
  });
});
