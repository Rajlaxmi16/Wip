import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TicketCustomerComponent } from './ticket-customer.component';

describe('TicketCustomerComponent', () => {
  let component: TicketCustomerComponent;
  let fixture: ComponentFixture<TicketCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TicketCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TicketCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
