package f原型模式;

// 简历原型类
public class Resume implements Cloneable {
    private String name;
    private String birthday;
    private String sex;
    private String school;

    private WorkExperence work; //引用工作经历对象

    Resume(String name){
        this.name = name;
        work = new WorkExperence();
    }

    // 设置个人信息
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    // 设置工作经验
    public void setWorkExperience(String timeArea,String company){
        work.setTimeArea(timeArea);
        work.setCompany(company);
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + work.getTimeArea() + ",公司:" + work.getCompany());
    }

    public Object clone(){
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getName(){
        return name;
    }
}
