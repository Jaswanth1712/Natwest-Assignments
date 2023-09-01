import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersoninfoComponent } from './personinfo/personinfo.component';
import { SearchDeleteComponent } from './search-delete/search-delete.component';

const routes: Routes = [
  {path:'',redirectTo:'register', pathMatch:'full'},
  {path:'register',component:PersoninfoComponent},
  {path:'search',component:SearchDeleteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
