package student_system;

public class User {
    //属性
    private String username;
    private String password;
    private String id;
    private String phone;

    //无参构造函数
    public User() {

    }
    //有参构造函数
    public User(String username, String password, String id, String phone) {

        //用户名
        if (checkUsername(username)) {
            this.username = username;
        } else {
            this.username = null;
            System.out.println("用户名输入格式有误，重新输入");
        }

        //密码
        this.password = password;

        //身份证号码
        if (checkId(id)) {
            this.id = id;
        }else {
            this.id = null;
            System.out.println("身份证号码输入格式有误，重新输入");
        }

        //手机号验证
        if(checkPhone(phone)) {
            this.phone = phone;
        }else {
            this.phone = null;
            System.out.println("手机号码输入格式有误，重新输入");
        }

    }

    //方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (checkUsername(username)) {
            this.username = username;
        } else {
            this.username = null;
            System.out.println("用户名输入格式有误，重新输入");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (checkId(id)) {
            this.id = id;
        }else {
            this.id = null;
            System.out.println("身份证号码输入格式有误，重新输入");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(checkPhone(phone)) {
            this.phone = phone;
        }else {
            this.phone = null;
            System.out.println("手机号码输入格式有误，重新输入");
        }
    }

    private boolean checkUsername(String username) {
        StringBuilder userName = new StringBuilder();
        userName.append(username);
        int numberLetter = 0;
        int numberDigtial = 0;
        if (userName.length() >= 3 && userName.length() <= 15) {
            for (int i = 0; i < userName.length(); i++) {
                if (Character.isLetter(userName.charAt(i))) {
                    numberLetter++;
                } else if (Character.isDigit(userName.charAt(i))) {
                    numberDigtial++;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        if (numberDigtial != 0 && numberLetter != 0) {
            return true;
        } else {
            return false;
        }

    }

    private boolean checkId(String id) {
        StringBuilder userId = new StringBuilder();
        userId.append(id);
        int numberDigtial = 0;
        if (userId.length() == 18) {
            if (userId.charAt(0) == '0') {
                return false;
            }
            if (userId.charAt(userId.length()) == 'X' || userId.charAt(userId.length()) == 'x' || Character.isDigit(userId.charAt(userId.length()))) {

            } else {
                return false;
            }
            for (int i = 0; i < userId.length() - 1; i++) {

                if (Character.isDigit(userId.charAt(i))) {
                    numberDigtial++;
                }
            }
            return numberDigtial == 17;
        } else {
            return false;
        }
    }

    private boolean checkPhone(String phone) {
        StringBuilder userPhone = new StringBuilder();
        userPhone.append(phone);
        int numberDigtial = 0;
        if(userPhone.charAt(0) == '0') {
            return false;
        }
        if (userPhone.length() == 11) {
            for (int i = 0; i < userPhone.length(); i++) {
                if (Character.isDigit(userPhone.charAt(i))) {
                    numberDigtial++;
                }
            }
            return numberDigtial == 11;
        }
        else {
            return false;
        }
    }

}
