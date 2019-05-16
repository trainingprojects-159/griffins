import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetPassengerByIdComponent } from './get-passenger-by-id.component';

describe('GetPassengerByIdComponent', () => {
  let component: GetPassengerByIdComponent;
  let fixture: ComponentFixture<GetPassengerByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetPassengerByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetPassengerByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
