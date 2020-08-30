import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { AddEventComponent } from './add-event/add-event.component';
import { LoginComponent } from './login/login.component';
import { RegisteruserComponent } from './registeruser/registeruser.component';
import { MyeventComponent } from './myevent/myevent.component';

const routes: Routes = [
  { path: "", pathMatch: "full", redirectTo: "home" },
  { path: "home" ,component: HomeComponent },
  { path: "about", component: AboutComponent },
  { path: "register", component: RegisterComponent },
  { path: "add-event", component: AddEventComponent },
  { path: "login", component: LoginComponent },
  { path: 'registeruser', component: RegisteruserComponent },
  { path: "myevent", component: MyeventComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

//import { ContactListComponent } from './contact-list/contact-list.component';
//import { ContactCreateComponent } from './contact-create/contact-create.component';


//const routes: Routes = [
  //{path:  "", pathMatch:  "full",redirectTo:  "home"},
  //{path: "home", component: HomeComponent},
  //{path: "contact-create", component: ContactCreateComponent},
  //{path: "contact-list", component: ContactListComponent}  
//];
