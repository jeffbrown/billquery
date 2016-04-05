package demo

class PersonController {

    def visible() {
        def people = Person.visibleToUser('abc', 'def', 'ghi').list()
        [people: people]
    }
}
