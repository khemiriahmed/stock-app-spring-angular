import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageStatistique } from './page-statistique';

describe('PageStatistique', () => {
  let component: PageStatistique;
  let fixture: ComponentFixture<PageStatistique>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PageStatistique]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageStatistique);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
