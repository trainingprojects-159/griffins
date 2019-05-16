import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetRouteByIdComponent } from './get-route-by-id.component';

describe('GetRouteByIdComponent', () => {
  let component: GetRouteByIdComponent;
  let fixture: ComponentFixture<GetRouteByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetRouteByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetRouteByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
