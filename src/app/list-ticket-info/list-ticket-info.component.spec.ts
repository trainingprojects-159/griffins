import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListTicketInfoComponent } from './list-ticket-info.component';

describe('ListTicketInfoComponent', () => {
  let component: ListTicketInfoComponent;
  let fixture: ComponentFixture<ListTicketInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListTicketInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListTicketInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
