package com.spidernet.dashboard.entity;

public class EmployeeInfo
{
    
    private String er;
    private String hr;
    private String name;
    private String eName;
    private String buName;
    private String projectName;
    
    
    public String getEr()
    {
        return er;
    }
    public void setEr(String er)
    {
        this.er = er;
    }
    public String getHr()
    {
        return hr;
    }
    public void setHr(String hr)
    {
        this.hr = hr;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String geteName()
    {
        return eName;
    }
    public void seteName(String eName)
    {
        this.eName = eName;
    }
    public String getBuName()
    {
        return buName;
    }
    public void setBuName(String buName)
    {
        this.buName = buName;
    }
    public String getProjectName()
    {
        return projectName;
    }
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
    public EmployeeInfo(String er, String hr, String name, String eName,
            String buName, String projectName)
    {
        super();
        this.er = er;
        this.hr = hr;
        this.name = name;
        this.eName = eName;
        this.buName = buName;
        this.projectName = projectName;
    }
    public EmployeeInfo()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
}