import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetalllocationsComponent } from './getalllocations.component';

describe('GetalllocationsComponent', () => {
  let component: GetalllocationsComponent;
  let fixture: ComponentFixture<GetalllocationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetalllocationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetalllocationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
