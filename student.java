class student{
  String name;
  String address;
  int numCourses = 0;
  String courses[] = new String[30];
  int grades[] = new int[30];

  public String getName(){
    return name;
  }


  public String getAddress(){
    return address;
  }


  public void setAddress(String newAddress){
    this.address = newAddress;
  }


  public String toString(){
    System.out.println(name+"("+address+")");
  }


  public void addCourseGrade(String course, int grade){
    courses[numCourses] = course;
    grades[numCourses] = grade;
    numcourses = numCourses +1;
  }


  public void printGrades(){
    String nameCourseGrade = name;
    for (int x = 0; x< numCourses; x++){
      nameCourseGrade = nameCourseGrade + " " + courses[x] + ":" + grades[x];
    }
    System.out.println(nameCourseGrade);
  }


  public double getAverageGrade(){
    double sumOfGrade = 0;
    for (int i= 0; i< numCourses; i++){
      sumOfGrade = sumOfGrade + grade[i];
    }
    return sumOfGrade/numCourses;
  }
}
