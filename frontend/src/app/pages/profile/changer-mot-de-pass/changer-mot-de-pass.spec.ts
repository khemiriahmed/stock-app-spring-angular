import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangerMotDePass } from './changer-mot-de-pass';

describe('ChangerMotDePass', () => {
  let component: ChangerMotDePass;
  let fixture: ComponentFixture<ChangerMotDePass>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ChangerMotDePass]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChangerMotDePass);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
