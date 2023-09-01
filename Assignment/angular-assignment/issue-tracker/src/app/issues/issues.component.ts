import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-issue-tracker',
  templateUrl: './issues.component.html',
  styleUrls: ['./issues.component.css']
})
export class IssuesComponent implements OnInit {
  issues: any[] = [];
  newIssue: any = {};
  // title:any;
  // description:any;
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getIssues();
  }
  apiurl='http://localhost:3000/issues';
  getIssues(): void {
    this.http.get<any[]>(this.apiurl).subscribe(issues => {
      this.issues = issues;
    });
  }

  addIssue(): void {
    this.http.post(this.apiurl, this.newIssue).subscribe(() => {
      this.getIssues();
      this.newIssue = {}; // Clear the new issue form
    });
  }

  deleteIssue(id: number): void {
    this.http.delete(this.apiurl+'/'+id).subscribe(() => {
      this.getIssues();
    });
  }
}
