import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovePassengerComponent } from './remove-passenger.component';

describe('RemovePassengerComponent', () => {
  let component: RemovePassengerComponent;
  let fixture: ComponentFixture<RemovePassengerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemovePassengerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovePassengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
