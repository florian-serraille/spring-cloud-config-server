**Demo project to test Spring cloud config and these different Environment Repository strategies**

---

To provide properties through **file system**, run server with '**native**' profile;

To provide properties through **git repository**, run server with '**git**' profile;

To provide properties through **jdbc**, run server with '**jdbc**' profile;

---

To refresh client bootstrap context:

`curl -H "Content-Type: application/json" -d {} http://localhost:8080/actuator/refresh`

---

Spring cloud config [documentation](https://cloud.spring.io/spring-cloud-config/reference/html/)