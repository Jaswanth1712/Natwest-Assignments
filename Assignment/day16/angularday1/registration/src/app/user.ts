export class User {
    firstname:string;
    middlename:string
    lastname:string;
    fathername:string;
    mobilenumber:string;
    emailid:string;
    Aadharcardnumber:string;
    dateofbirth:string;
    occupation:string;
    address:string;
    photo:string;
  constructor(firstname:string,middlename:string,lastname:string,fathername:string,mobilenumber:string,emailid:string,Aadharcardnumber:string,dateofbirth:string,occupation:string,address:string,photo:string) {
    this.firstname=firstname;
    this.middlename=middlename;
    this.lastname=lastname;
    this.fathername=fathername;
    this.mobilenumber=mobilenumber;
    this.emailid=emailid;
    this.Aadharcardnumber=Aadharcardnumber;
    this.dateofbirth=dateofbirth;
    this.occupation=occupation;
    this.address=address;
    this.photo=photo;
}}