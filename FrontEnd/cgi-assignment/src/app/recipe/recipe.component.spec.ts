import { HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Subscription } from 'rxjs';
import { RecipeComponent } from './recipe.component';
import { FilterRecipeService } from './services/filter-recipe.service';
import { ViewAllRecipeService } from './services/view-all-recipe.service';

describe('RecipeComponent', () => {
  let component: RecipeComponent;
  let subscription: Subscription;
  let fixture: ComponentFixture<RecipeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientModule],
      declarations: [RecipeComponent],
      providers: [ViewAllRecipeService, FilterRecipeService],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RecipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('ViewAllRecipeService unsubscribes when destroyed', () => {
    component.subscription = new Subscription();
    spyOn(component.subscription, 'unsubscribe');
    component.ngOnDestroy();
    expect(component.subscription.unsubscribe).toHaveBeenCalledTimes(1);
  });
});
