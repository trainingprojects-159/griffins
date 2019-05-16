import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListschedulesComponent } from './listschedules.component';

describe('ListschedulesComponent', () => {
  let component: ListschedulesComponent;
  let fixture: ComponentFixture<ListschedulesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListschedulesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListschedulesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
