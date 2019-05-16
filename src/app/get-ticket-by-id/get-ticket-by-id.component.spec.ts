import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetTicketByIdComponent } from './get-ticket-by-id.component';

describe('GetTicketByIdComponent', () => {
  let component: GetTicketByIdComponent;
  let fixture: ComponentFixture<GetTicketByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetTicketByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetTicketByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
