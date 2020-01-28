import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angularlab2801';
  storedEmps = [];

  onEmpAdded(employee){
    this.storedEmps.push(employee);
  }

}
