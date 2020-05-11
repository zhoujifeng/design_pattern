package com.kind.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author zhoujifeng
 * @date 2020/5/3 4:57 下午
 */
public class MailUtil {

    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址：{1},邮件内容：{2},发送邮件";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));

    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail：" + mail.getContent());

    }
}
