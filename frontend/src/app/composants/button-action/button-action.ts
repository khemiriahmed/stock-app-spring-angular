import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-button-action',
  imports: [CommonModule],
  templateUrl: './button-action.html',
  styleUrl: './button-action.scss',
})
export class ButtonAction {
  @Input()
  isNouveauVisible = true;
  @Input()
  isExporterVisible = true;
  @Input()
  isImporterVisible = true;

  @Output()
  clickEvent = new EventEmitter();

  constructor() {}

  ngOnInit(): void {}

  bouttonNouveauClick(): void {
    this.clickEvent.emit();
  }
}
