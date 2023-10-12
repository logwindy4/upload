package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호를 입력하세요 : ");
        int number =sc.nextInt();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("부서를 입력하세요 : ");
        String dept = sc.next();

        System.out.print("직업을 입력하세요 : ");
        String job = sc.next();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        System.out.print("월급을 입력하세요 : ");
        int salary = sc.nextInt();

        System.out.print("보너스 % 입력하세요 : ");
        double bonusPoint = sc.nextInt();

        System.out.print("전화번호를 입력하세요 : ");
        String phone = sc.next();

        System.out.print("주소를 입력하세요 : ");
        String address = sc.next();

        EmployeeDTO employee = new EmployeeDTO();

        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());

    }
}
