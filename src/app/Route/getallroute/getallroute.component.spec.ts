import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallrouteComponent } from './getallroute.component';

describe('GetallrouteComponent', () => {
  let component: GetallrouteComponent;
  let fixture: ComponentFixture<GetallrouteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallrouteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallrouteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
