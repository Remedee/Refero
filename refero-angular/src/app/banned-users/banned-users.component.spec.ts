import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BannedUsersComponent } from './banned-users.component';

describe('BannedUsersComponent', () => {
  let component: BannedUsersComponent;
  let fixture: ComponentFixture<BannedUsersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BannedUsersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BannedUsersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

});
