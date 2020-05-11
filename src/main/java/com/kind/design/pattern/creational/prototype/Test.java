package com.kind.design.pattern.creational.prototype;

/**
 * @author zhoujifeng
 * @date 2020/5/3 5:01 下午
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");

        for (int i = 0; i <10 ; i++) {
            Mail mailTemp = (Mail)mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i + "@kind.com");
            mailTemp.setContent("更新您，此次活动，您中奖了");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
