import javax.swing.*;

//让用户输入信息
public class Test02 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("please enter your name");
        System.out.println("name:"+name);
        JOptionPane.showMessageDialog(null,"您的姓名长度是"+name.length()+"个字符");
    }
}
