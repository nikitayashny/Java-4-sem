package yashny.team.manager;

import yashny.team.CustomComparator;
import yashny.team.Human;
import yashny.team.itCompany;
import java.util.ArrayList;

public class CompanyManager extends Human {
    public void printCompany(itCompany comp)
    {
        for (Human k : comp.getItCompany())
        {
            System.out.println("Имя " + k.name + " Зарплата: "+ k.salary);
        }
    }
    public int TeamSize(itCompany comp)
    {
        return comp.getItCompany().size();
    }
    public void Sort(ArrayList<Human> list) {
        list.sort(new CustomComparator());
    }
    public void CompanyInfo(itCompany company)
    {
        System.out.println("Имя комании: " + company.companyName + "\n" + "Кол-во сотрудников: " + company.getCountTeam());
    }
}
