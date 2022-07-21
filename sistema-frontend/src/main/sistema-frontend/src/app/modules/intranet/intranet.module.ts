import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { IntranetRoutingModule } from './intranet-routing.module';
import { HomeComponent } from './components/home/home.component';
import { MaterialModule } from '../material.module';
import { NavbarComponent } from './components/shared/navbar/navbar.component';


@NgModule({
  declarations: [
    HomeComponent,
    NavbarComponent
  ],
  imports: [
    CommonModule,
    IntranetRoutingModule,
    MaterialModule,
  ]
})
export class IntranetModule { }
