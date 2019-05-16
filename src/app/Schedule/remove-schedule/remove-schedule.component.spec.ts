import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemoveScheduleComponent } from './remove-schedule.component';

describe('RemoveScheduleComponent', () => {
  let component: RemoveScheduleComponent;
  let fixture: ComponentFixture<RemoveScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemoveScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemoveScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
