import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetFlightByIdComponent } from './get-flight-by-id.component';

describe('GetFlightByIdComponent', () => {
  let component: GetFlightByIdComponent;
  let fixture: ComponentFixture<GetFlightByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetFlightByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetFlightByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
