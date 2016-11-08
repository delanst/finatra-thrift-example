package thrift

import com.twitter.finatra.thrift.Controller
import be.sdtechnologies.thrift.EmployeeService
import be.sdtechnologies.thrift.EmployeeService.{AllCompanies, AllEmployees, FindCompany, FindEmployee}
import com.google.inject.Inject

class ThriftController @Inject() (thriftRouter: ThriftRouter) extends Controller
  with EmployeeService.BaseServiceIface {

  override def allEmployees = handle(AllEmployees) { args: AllEmployees.Args =>
    thriftRouter.allEmployees
  }

  override def findEmployee = handle(FindEmployee) { args: FindEmployee.Args =>
    thriftRouter.findEmployee(args.employeeKey)
  }

  override def allCompanies = handle(AllCompanies) { args: AllCompanies.Args =>
    thriftRouter.allCompanies
  }

  override def findCompany = handle(FindCompany) { args: FindCompany.Args =>
    thriftRouter.findCompany(args.key)
  }

}
