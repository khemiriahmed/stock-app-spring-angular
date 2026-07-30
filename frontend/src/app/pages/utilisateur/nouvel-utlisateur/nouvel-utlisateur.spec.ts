import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvelUtlisateur } from './nouvel-utlisateur';

describe('NouvelUtlisateur', () => {
  let component: NouvelUtlisateur;
  let fixture: ComponentFixture<NouvelUtlisateur>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NouvelUtlisateur]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NouvelUtlisateur);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
