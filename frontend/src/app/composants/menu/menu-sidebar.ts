export interface Menu {
  id?: string;
  titre?: string;
  icon?: string;
  url?: string;
  active?: boolean;
  open?: boolean;
  sousMenu?: Array<Menu>;
}
