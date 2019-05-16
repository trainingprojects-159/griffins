import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEditPassengerComponent } from './add-edit-passenger.component';

describe('AddEditPassengerComponent', () => {
  let component: AddEditPassengerComponent;
  let fixture: ComponentFixture<AddEditPassengerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddEditPassengerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEditPassengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
