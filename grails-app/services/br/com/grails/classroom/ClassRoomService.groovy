package br.com.grails.classroom

import grails.gorm.transactions.Transactional

@Transactional
class ClassRoomService {

    def get(id){
        ClassRoom.get(id)
    }

    def list() {
        ClassRoom.list()
    }

    def save(classRoom){
        classRoom.save()
    }

    def delete(id){
        ClassRoom.get(id).delete()
    }
}
