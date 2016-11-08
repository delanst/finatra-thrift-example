namespace java be.sdtechnologies.thrift
#@namespace scala be.sdtechnologies.thrift

# define namespaces for the language you would like to support (in this case Scala, Java and Ruby)
# The order of the struct are important. In this case Company must be declared before Employee.
# further documentation https://twitter.github.io/scrooge/

struct Company {
    1: optional i64 key ;
    2: required string companyName ;
}

struct Employee {
    1: optional i64 key;
    2: required string firstName ;
    3: required string lastName ;
    4: required Company company ;
}

service EmployeeService {
    list<Employee> allEmployees()
    Employee findEmployee(
        1: required i64 employeeKey;
    )
    list<Company> allCompanies()
    Company findCompany(
        1: required i64 key;
    )
}