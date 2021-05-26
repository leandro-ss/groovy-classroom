package br.com.grails.classroom

import grails.gorm.transactions.Transactional

@Transactional
class TeacherService {

    def get(id){
        Teacher.get(id)
    }

    def list() {
        Teacher.list()
    }

    def save(teacher){
        teacher.save()
    }

    def delete(id){
        Teacher.get(id).delete()
    }
}
