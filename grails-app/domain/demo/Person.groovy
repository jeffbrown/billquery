package demo

class Person {
    String name
    Integer age

    static namedQueries = {
        visibleToUser{String createdBy, String actingAs, String application ->
           // ...
        }
    }
}
