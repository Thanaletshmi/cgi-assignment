import { Component } from '@angular/core';
import { FilterRecipeService } from './services/filter-recipe.service';
import { Subscription } from 'rxjs';
import { ViewAllRecipeService } from './services/view-all-recipe.service';
import { RECIPE } from './models/recipe-info.model';


@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.scss'],
})
export class RecipeComponent {
  dataSource: RECIPE[];
  selected: any;
  params: any;
  error: any;
  subscription = new Subscription();
  viewEnabled: boolean = false;
  ingredients: String[] = [
    'mushrooms',
    'barbecue sauce',
    'sandwich rolls',
    'lettuce',
    'tomato',
    'onions',
    'ham',
    'garlic',
    'italian bread',
    'rice',
    'butter',
    'bacon',
    'eggs',
    'mustard',
    'pastry',
    'pita bread',
    'dijon mustard',
    'vinegar',
    'salmon',
    'red onions',
    'italian dressing',
    'mayonaise',
    'balsamic vinegar',
    'vegetable oil',
    'rosemary',
    'olive oil',
    'salt',
    'pancetta',
    'water',
    'heavy cream',
    'port wine',
    'chicken',
    'black pepper',
    'blue cheese',
    'soy sauce',
    'romano cheese',
  ];
  displayedColumns: string[] = ['title', 'href', 'ingredients', 'thumbnail'];

  constructor(
    private viewAllRecipeService: ViewAllRecipeService,
    private filterRecipeService: FilterRecipeService
  ) {}

  viewRecipes() {
    this.viewEnabled = true;
    this.selected = null;
    this.subscription.add(
      this.viewAllRecipeService.getRecipes().subscribe(
        (response) => {
          this.dataSource = response;
        },
        (error) => {
          console.log(error);
        }
      )
    );
  }

  selectedIngredients(e) {
    this.params = e.toString();
  }

  filterRecipes() {
    this.subscription.add(
      this.filterRecipeService.filterRecipes(this.params).subscribe(
        (response) => {
          this.viewEnabled = true;
          this.dataSource = response;
        },
        (error) => {
          this.error = error;
          this.viewEnabled = false;
        }
      )
    );
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}
