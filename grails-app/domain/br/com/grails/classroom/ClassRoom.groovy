package br.com.grails.classroom

class ClassRoom {

    Teacher teacher
    List<Student> students
    String location
    Boolean online

    static constraints = {
    }
}
