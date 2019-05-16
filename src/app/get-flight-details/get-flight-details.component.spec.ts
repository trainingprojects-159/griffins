import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetFlightDetailsComponent } from './get-flight-details.component';

describe('GetFlightDetailsComponent', () => {
  let component: GetFlightDetailsComponent;
  let fixture: ComponentFixture<GetFlightDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetFlightDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetFlightDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
