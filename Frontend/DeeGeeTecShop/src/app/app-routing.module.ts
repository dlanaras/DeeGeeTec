import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FourohfourComponent } from './fourohfour/fourohfour.component';
import { MainComponent } from './main/main.component';

const routes: Routes = [
  { path: "", redirectTo: "mainpage", pathMatch: "full"},
  { path: "mainpage", component: MainComponent},
  { path: "**", component: FourohfourComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
