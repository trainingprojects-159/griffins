import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallscheduleComponent } from './getallschedule.component';

describe('GetallscheduleComponent', () => {
  let component: GetallscheduleComponent;
  let fixture: ComponentFixture<GetallscheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallscheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallscheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
