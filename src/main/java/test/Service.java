package test;

import com.elasticemail.app.FileData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private SendAPI sendAPI;

    public String sendMessage() {
        String result = "";
        ArrayList<FileData> files = new ArrayList<>();
        HashMap<String, String> values = new HashMap<>();
        values.put("apikey", "eed94d6f-e27b-40fc-a2a0-b8cbfd2e5e30");
        values.put("from", "adam-hitbtc@listing.me");
        values.put("fromName", "HitBTC Listing");
        values.put("to", "s.banerjee@yocoin.org");
        values.put("subject", "YoCoin Listing");
        values.put("bodyHtml", "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "<table border=\"0\" align=\"center\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151main-template\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "    <tbody>\n" +
                "    <tr style=\"display:none!important;font-size:1px\">\n" +
                "        <td></td>\n" +
                "        <td></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td align=\"center\" valign=\"top\">\n" +
                "            \n" +
                "            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"m_-8059325564055538151templateContainer\" style=\"max-width:590px!important;width:590px\">\n" +
                "                <tbody>\n" +
                "                <tr>\n" +
                "                    <td align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                        <table class=\"m_-8059325564055538151rnb-del-min-width\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" style=\"min-width:590px;background-color:#f9fafc\" name=\"Layout_0\" id=\"m_-8059325564055538151Layout_0\">\n" +
                "                            <tbody>\n" +
                "                            <tr>\n" +
                "                                <td class=\"m_-8059325564055538151rnb-del-min-width\" valign=\"top\" align=\"center\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\">\n" +
                "                                    <table width=\"100%\" cellpadding=\"0\" border=\"0\" height=\"30\" cellspacing=\"0\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                                        <tbody>\n" +
                "                                        <tr>\n" +
                "                                            <td valign=\"top\" height=\"30\">\n" +
                "                                                <img width=\"20\" height=\"30\" style=\"display:block;max-height:30px;max-width:20px\" alt=\"\" src=\"https://ci4.googleusercontent.com/proxy/fN1GFqWE3hBQvi3h5pc468X64tvD9BiI8UkRekZKN9N79UGTPpNxNzazJ8FXZCWfSZ83ivFw=s0-d-e1-ft#https://hitbtc.com//mail/_blank.gif\" class=\"CToWUd\">\n" +
                "                                            </td>\n" +
                "                                        </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            </tbody>\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                        <div>\n" +
                "                            \n" +
                "\n" +
                "                            \n" +
                "                            <table class=\"m_-8059325564055538151rnb-del-min-width\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\" name=\"Layout_1\" id=\"m_-8059325564055538151Layout_1\">\n" +
                "                                <tbody>\n" +
                "                                <tr>\n" +
                "                                    <td class=\"m_-8059325564055538151rnb-del-min-width\" align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\">\n" +
                "                                        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151rnb-container\" bgcolor=\"#ffffff\" style=\"background-color:rgb(255,255,255);border-radius:0px;padding-left:0px;padding-right:0px;border-collapse:separate\">\n" +
                "                                            <tbody>\n" +
                "                                            <tr>\n" +
                "                                                <td height=\"0\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                            </tr>\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" class=\"m_-8059325564055538151rnb-container-padding\" bgcolor=\"#ffffff\" style=\"background-color:#ffffff\" align=\"left\">\n" +
                "                                                    <table width=\"100%\" cellpadding=\"0\" border=\"0\" align=\"center\" cellspacing=\"0\">\n" +
                "                                                        <tbody>\n" +
                "                                                        <tr>\n" +
                "                                                            <td valign=\"top\" align=\"center\">\n" +
                "                                                                <table cellpadding=\"0\" border=\"0\" align=\"center\" cellspacing=\"0\" class=\"m_-8059325564055538151logo-img-center\">\n" +
                "                                                                    <tbody>\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td valign=\"middle\" align=\"center\">\n" +
                "                                                                            <div style=\"border-top:0px None #000;border-right:0px None #000;border-bottom:0px None #000;border-left:0px None #000;display:inline-block\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" +
                "                                                                                <div><img width=\"590\" vspace=\"0\" hspace=\"0\" border=\"0\" alt=\"HitBTC\" style=\"float:left;max-width:590px;display:block\" class=\"m_-8059325564055538151rnb-logo-img CToWUd a6T\" src=\"https://ci5.googleusercontent.com/proxy/uoRy35BQFGPTagFeUM5hhIAYEzmAg3RF_hbuc0SzmdrGnk18bENy2ya_qsvXb803S0KaAEt0Whg174vd65Qe=s0-d-e1-ft#https://hitbtc.com//mail/mail_new_header.png\" tabindex=\"0\"><div class=\"a6S\" dir=\"ltr\" style=\"opacity: 0.01; left: 547.5px; top: 101px;\"><div id=\":wu\" class=\"T-I J-J5-Ji aQv T-I-ax7 L3 a5q\" role=\"button\" tabindex=\"0\" aria-label=\"Скачать файл \" data-tooltip-class=\"a1V\" data-tooltip=\"Скачать\"><div class=\"aSK J-J5-Ji aYr\"></div></div></div></div>\n" +
                "                                                                            </div>\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                    </tbody>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                        </tbody>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                            <tr>\n" +
                "                                                <td height=\"0\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                            </tr>\n" +
                "                                            </tbody>\n" +
                "                                        </table>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                                </tbody>\n" +
                "                            </table>\n" +
                "                            \n" +
                "\n" +
                "                            \n" +
                "                        </div>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                        <div>\n" +
                "                            \n" +
                "\n" +
                "                            \n" +
                "                            <table class=\"m_-8059325564055538151rnb-del-min-width\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#f9fafc\" style=\"min-width:100%;background-color:#f9fafc\" name=\"Layout_5\">\n" +
                "                                <tbody>\n" +
                "                                <tr>\n" +
                "                                    <td class=\"m_-8059325564055538151rnb-del-min-width\" align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                                        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151rnb-container\" bgcolor=\"#ffffff\" style=\"background-color:rgb(255,255,255);padding-left:20px;padding-right:20px;border-collapse:separate;border-radius:0px;border-bottom:0px none rgb(200,200,200)\">\n" +
                "                                            <tbody>\n" +
                "                                            <tr>\n" +
                "                                                <td height=\"20\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                            </tr>\n" +
                "                                            <tr>\n" +
                "                                                <td valign=\"top\" class=\"m_-8059325564055538151rnb-container-padding\" bgcolor=\"#ffffff\" style=\"background-color:#ffffff\" align=\"left\">\n" +
                "                                                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151rnb-columns-container\">\n" +
                "                                                        <tbody>\n" +
                "                                                        <tr>\n" +
                "                                                            <td class=\"m_-8059325564055538151rnb-force-col\" valign=\"top\" style=\"padding-right:0px\">\n" +
                "                                                                <table border=\"0\" valign=\"top\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" align=\"left\" class=\"m_-8059325564055538151rnb-col-1\">\n" +
                "                                                                    <tbody>\n" +
                "                                                                    <tr>\n" +
                "                                                                        <td style=\"font-size:14px;font-family:Arial,Helvetica,sans-serif,sans-serif;color:#3c4858;line-height:21px\">\n" +
                "                                                                                <h1 style=\"font-size:25px;font-weight:bold;color:#000;margin-bottom:26px\">New listing on Hitbtc.com</h1>\n" +
                "\n" +
                "    Greetings Sir,\n" +
                "    <br><br>\n" +
                "\tMy name is Adam. I am the head of coin listing department. We have recently got the business proposal from our partner Tomas (CEO of ICOray agency) about listing of YoCoin on our exchange. We can not do that this week but we are ready to do that on 15th November.\n" +
                "    <br><br>\n" +
                "\n" +
                "    The price is 3 BTC and 20 million YOC coins. The price includes 1 trading pair BTC/YOC and notification about listing in our twitter and facebook accounts.\n" +
                "<br><br>\n" +
                "If this deal is acceptable for you, please make a payment of listing fee 3 BTC to the address below within 24 hours or deal  will be cancelled.  Once you paid – reply to this message and send us TXID. 20 million YOC coins have to be transferred to our address as well but within 3 days after date of listing. We will write you an address for YOC payment later after the listing. Keep in mind, if you make a delay with YOC transfer you are risking to be kicked off the exchange. So, make sure your will be able to transfer YOC coins in time.\n" +
                "    <br><br>\n" +
                "BTC address for the payment:\n" +
                "18hTTbXZ9sczxYnv8dXtFALcijtMJnsQBD\n" +
                "<br><br>\n" +
                "\n" +
                "    Best regards, Adam<br>\n" +
                "    HitBTC Team\n" +
                "                                                                        </td>\n" +
                "                                                                    </tr>\n" +
                "                                                                    </tbody>\n" +
                "                                                                </table>\n" +
                "                                                            </td>\n" +
                "                                                        </tr>\n" +
                "                                                        </tbody>\n" +
                "                                                    </table>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                            <tr>\n" +
                "                                                <td height=\"20\" style=\"font-size:1px;line-height:1px;border-bottom:0px\">&nbsp;</td>\n" +
                "                                            </tr>\n" +
                "                                            </tbody>\n" +
                "                                        </table>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                                </tbody>\n" +
                "                            </table>\n" +
                "                            \n" +
                "\n" +
                "                                        </div>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                        <table class=\"m_-8059325564055538151rnb-del-min-width m_-8059325564055538151rnb-tmpl-width\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\" name=\"Layout_\" id=\"m_-8059325564055538151Layout_\">\n" +
                "                            <tbody>\n" +
                "                            <tr>\n" +
                "                                <td class=\"m_-8059325564055538151rnb-del-min-width\" align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\">\n" +
                "                                    <table width=\"590\" class=\"m_-8059325564055538151rnb-container\" cellpadding=\"0\" border=\"0\" align=\"center\" cellspacing=\"0\">\n" +
                "                                        <tbody>\n" +
                "                                        <tr>\n" +
                "                                            <td height=\"20\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td valign=\"top\" class=\"m_-8059325564055538151rnb-container-padding\" style=\"font-size:14px;font-family:Arial,Helvetica,sans-serif;color:#888888\" align=\"center\">\n" +
                "                                                <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151rnb-columns-container\">\n" +
                "                                                    <tbody>\n" +
                "                                                    <tr>\n" +
                "                                                        <td class=\"m_-8059325564055538151rnb-force-col m_-8059325564055538151rnb-social-width2\" valign=\"top\" style=\"padding-right:28px;padding-left:28px\">\n" +
                "                                                            <table border=\"0\" valign=\"top\" cellspacing=\"0\" cellpadding=\"0\" width=\"533\" align=\"center\" class=\"m_-8059325564055538151rnb-last-col-2\">\n" +
                "                                                                <tbody>\n" +
                "                                                                <tr>\n" +
                "                                                                    <td valign=\"top\">\n" +
                "                                                                        <table cellpadding=\"0\" border=\"0\" cellspacing=\"0\" class=\"m_-8059325564055538151rnb-social-align2\" align=\"center\">\n" +
                "                                                                            <tbody>\n" +
                "                                                                            <tr>\n" +
                "                                                                                <td valign=\"middle\" class=\"m_-8059325564055538151rnb-text-center\" width=\"533\" align=\"center\">\n" +
                "                                                                                    \n" +
                "                                                                                    <div class=\"m_-8059325564055538151rnb-social-center\" style=\"display:inline-block\">\n" +
                "                                                                                        \n" +
                "                                                                                        <table align=\"left\" style=\"float:left;display:inline-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                                                                            <tbody>\n" +
                "                                                                                            <tr>\n" +
                "                                                                                                <td style=\"padding:0px 12px 5px 0px\" align=\"left\">\n" +
                "                                                                            <span style=\"color:#ffffff;font-weight:normal\">\n" +
                "                                                                                <a href=\"https://u7397791.ct.sendgrid.net/wf/click?upn=Cj7OdfZijFT4zFZEJBTyN1On7hwmnJmvTKpZu5ekhbuM-2FmF4Api3mDHQsTV-2FU61i_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBfCRfE7is2FX5NFgfGSDasbltAN8hFSyOj0ke1wG-2FwxINHlc9hh0EOwdKRn6plRjUa0CpkBVxaTBSaCHgDQTieAYEcxaoc-2B-2F197lemIGfAZAH-2BUkHGUWyAYmLv6IhUZ-2BaW95jpQx4hqWMFNwyjzAM6eVIFgngu1wKio7zE-2FzwK4g-3D\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=ru&amp;q=https://u7397791.ct.sendgrid.net/wf/click?upn%3DCj7OdfZijFT4zFZEJBTyN1On7hwmnJmvTKpZu5ekhbuM-2FmF4Api3mDHQsTV-2FU61i_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBfCRfE7is2FX5NFgfGSDasbltAN8hFSyOj0ke1wG-2FwxINHlc9hh0EOwdKRn6plRjUa0CpkBVxaTBSaCHgDQTieAYEcxaoc-2B-2F197lemIGfAZAH-2BUkHGUWyAYmLv6IhUZ-2BaW95jpQx4hqWMFNwyjzAM6eVIFgngu1wKio7zE-2FzwK4g-3D&amp;source=gmail&amp;ust=1541592078680000&amp;usg=AFQjCNEFQKzHIzlxfL-qe7lhiXr2ldoi3w\"><img alt=\"Facebook\" border=\"0\" hspace=\"0\" vspace=\"0\" style=\"vertical-align:top\" src=\"https://ci4.googleusercontent.com/proxy/wAC7Q5i0R80--unRu7ZTp9hm0CgxoQQfZS1upIhI-hFIUdUpqhgB202pywSQR-GRbN3-jyh50ds=s0-d-e1-ft#https://hitbtc.com//mail/facebook.png\" class=\"CToWUd\"></a></span>\n" +
                "                                                                                                </td>\n" +
                "                                                                                            </tr>\n" +
                "                                                                                            </tbody>\n" +
                "                                                                                        </table>\n" +
                "                                                                                        \n" +
                "                                                                                    </div>\n" +
                "                                                                                    <div class=\"m_-8059325564055538151rnb-social-center\" style=\"display:inline-block\">\n" +
                "                                                                                        \n" +
                "                                                                                        <table align=\"left\" style=\"float:left;display:inline-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                                                                            <tbody>\n" +
                "                                                                                            <tr>\n" +
                "                                                                                                <td style=\"padding:0px 12px 5px 0px\" align=\"left\">\n" +
                "                                                                            <span style=\"color:#ffffff;font-weight:normal\">\n" +
                "                                                                                <a href=\"https://u7397791.ct.sendgrid.net/wf/click?upn=Cj7OdfZijFT4zFZEJBTyNwM4GbDFwb1vpLVQAeJJMaE-3D_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBxTeB-2BhATAzI-2FwGm8KIX2KnsYC6qgB7bnuJd8jyUCuc4eaZtWjZAQUpMCc8rR35yL-2FIypYSMPtrm8dY7w2kX6d3CqxUAvlYClQ5Tr-2F-2FhpTKlno8RTYaB1WKa0dtwDRAOfkPspIsVM9puezlVdo-2Br5koj3zrjFDuqDUAQmP0t64gw-3D\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=ru&amp;q=https://u7397791.ct.sendgrid.net/wf/click?upn%3DCj7OdfZijFT4zFZEJBTyNwM4GbDFwb1vpLVQAeJJMaE-3D_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBxTeB-2BhATAzI-2FwGm8KIX2KnsYC6qgB7bnuJd8jyUCuc4eaZtWjZAQUpMCc8rR35yL-2FIypYSMPtrm8dY7w2kX6d3CqxUAvlYClQ5Tr-2F-2FhpTKlno8RTYaB1WKa0dtwDRAOfkPspIsVM9puezlVdo-2Br5koj3zrjFDuqDUAQmP0t64gw-3D&amp;source=gmail&amp;ust=1541592078680000&amp;usg=AFQjCNHmGJAP5UVgFQFs8xWHuQmJZOrCzw\"><img alt=\"Twitter\" border=\"0\" hspace=\"0\" vspace=\"0\" style=\"vertical-align:top\" src=\"https://ci6.googleusercontent.com/proxy/6_rlEMlOKs1nrWUyF2MORHkgGOqsa6L_Iq-EDRPd1SmJW3AiL1AYIqSZncjpXBg8TV5VrF18Dw=s0-d-e1-ft#https://hitbtc.com//mail/twitter.png\" class=\"CToWUd\"></a></span>\n" +
                "                                                                                                </td>\n" +
                "                                                                                            </tr>\n" +
                "                                                                                            </tbody>\n" +
                "                                                                                        </table>\n" +
                "                                                                                        \n" +
                "                                                                                    </div>\n" +
                "                                                                                    <div class=\"m_-8059325564055538151rnb-social-center\" style=\"display:inline-block\">\n" +
                "                                                                                        \n" +
                "                                                                                        <table align=\"left\" style=\"float:left;display:inline-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                                                                            <tbody>\n" +
                "                                                                                            <tr>\n" +
                "                                                                                                <td style=\"padding:0px 12px 5px 0px\" align=\"left\">\n" +
                "                                                                            <span style=\"color:#ffffff;font-weight:normal\">\n" +
                "                                                                                <a href=\"https://u7397791.ct.sendgrid.net/wf/click?upn=Cj7OdfZijFT4zFZEJBTyNxNP6WGoCJjyQCGOp9BQ8dc-3D_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBqSxZ2cHLDQze7amAlBGfMBKaIPxBoQUStvuBvA5UpoMUwox1HlM-2B1mm7AWugPJUxM0oser-2F7VEhG1tVytRRZo2q35-2Ftkq-2FWRH8rOeSNuPeyoOQJ-2FIolDDz-2FbPHoIMZz4ITQbxt2UT29uDd1pbJKBnVGXCa1YH7H5vIRYoyijWxI-3D\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=ru&amp;q=https://u7397791.ct.sendgrid.net/wf/click?upn%3DCj7OdfZijFT4zFZEJBTyNxNP6WGoCJjyQCGOp9BQ8dc-3D_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBqSxZ2cHLDQze7amAlBGfMBKaIPxBoQUStvuBvA5UpoMUwox1HlM-2B1mm7AWugPJUxM0oser-2F7VEhG1tVytRRZo2q35-2Ftkq-2FWRH8rOeSNuPeyoOQJ-2FIolDDz-2FbPHoIMZz4ITQbxt2UT29uDd1pbJKBnVGXCa1YH7H5vIRYoyijWxI-3D&amp;source=gmail&amp;ust=1541592078680000&amp;usg=AFQjCNE8WGxA1hscgHtrFl2heKVtzHnVMQ\"><img alt=\"Telegram\" border=\"0\" hspace=\"0\" vspace=\"0\" style=\"vertical-align:top\" src=\"https://ci5.googleusercontent.com/proxy/NQRBe29MvO5h-zI3mrS-zt_9iDtJm3MNGfz-7RkntWax3b3DbkYHwdpOpJ6xkRo33UcpY5eSqyo=s0-d-e1-ft#https://hitbtc.com//mail/telegram.png\" class=\"CToWUd\"></a></span>\n" +
                "                                                                                                </td>\n" +
                "                                                                                            </tr>\n" +
                "                                                                                            </tbody>\n" +
                "                                                                                        </table>\n" +
                "                                                                                        \n" +
                "                                                                                    </div>\n" +
                "                                                                                    <div class=\"m_-8059325564055538151rnb-social-center\" style=\"display:inline-block\">\n" +
                "                                                                                        \n" +
                "                                                                                        <table align=\"left\" style=\"float:left;display:inline-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                                                                            <tbody>\n" +
                "                                                                                            <tr>\n" +
                "                                                                                                <td style=\"padding:0px 12px 5px 0px\" align=\"left\">\n" +
                "                                                                            <span style=\"color:#ffffff;font-weight:normal\">\n" +
                "                                                                                <a href=\"https://u7397791.ct.sendgrid.net/wf/click?upn=Cj7OdfZijFT4zFZEJBTyN01M-2BR0ajpF95toZH5nSlUWELyY5xF8CO12BpmcklTyE_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBBLF6wqaMJI55z8TMVxJVnA5VGqrM4G1fIaaFnbBbjwWtS3U1uqV7IbfOoWdpA7kgbV5XAHCMesIyT2vqaECxBGUqhBHOp4pSmRKtcfNNVBYVChdzJLTLDrJAGfFTSCtodUKEqTqLeW4CbYmpuvl9SzvUqQIdyIoKyJCtXj2WbFw-3D\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=ru&amp;q=https://u7397791.ct.sendgrid.net/wf/click?upn%3DCj7OdfZijFT4zFZEJBTyN01M-2BR0ajpF95toZH5nSlUWELyY5xF8CO12BpmcklTyE_qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBBLF6wqaMJI55z8TMVxJVnA5VGqrM4G1fIaaFnbBbjwWtS3U1uqV7IbfOoWdpA7kgbV5XAHCMesIyT2vqaECxBGUqhBHOp4pSmRKtcfNNVBYVChdzJLTLDrJAGfFTSCtodUKEqTqLeW4CbYmpuvl9SzvUqQIdyIoKyJCtXj2WbFw-3D&amp;source=gmail&amp;ust=1541592078680000&amp;usg=AFQjCNHxZdAM27Ubdavr8V7TT6_aVzTbFQ\"><img alt=\"Reddit\" border=\"0\" hspace=\"0\" vspace=\"0\" style=\"vertical-align:top\" src=\"https://ci4.googleusercontent.com/proxy/H1ZLUO2Elia2bns0utFOXX_8M9pV5VnRA6Qd7pIl7Nh2PbInBIqkepeIZwqyboWUdDM2MTxH=s0-d-e1-ft#https://hitbtc.com//mail/reddit.png\" class=\"CToWUd\"></a></span>\n" +
                "                                                                                                </td>\n" +
                "                                                                                            </tr>\n" +
                "                                                                                            </tbody>\n" +
                "                                                                                        </table>\n" +
                "                                                                                        \n" +
                "                                                                                    </div>\n" +
                "                                                                                    \n" +
                "                                                                                </td>\n" +
                "                                                                            </tr>\n" +
                "                                                                            </tbody>\n" +
                "                                                                        </table>\n" +
                "                                                                    </td>\n" +
                "                                                                </tr>\n" +
                "                                                                </tbody>\n" +
                "                                                            </table>\n" +
                "                                                        </td>\n" +
                "                                                    </tr>\n" +
                "                                                    </tbody>\n" +
                "                                                </table>\n" +
                "                                            </td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td height=\"20\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                        </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            </tbody>\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"background-color:#f9fafc\">\n" +
                "                        <table class=\"m_-8059325564055538151rnb-del-min-width m_-8059325564055538151rnb-tmpl-width\" width=\"100%\" cellpadding=\"0\" border=\"0\" cellspacing=\"0\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\" name=\"Layout_3\" id=\"m_-8059325564055538151Layout_3\">\n" +
                "                            <tbody>\n" +
                "                            <tr>\n" +
                "                                <td class=\"m_-8059325564055538151rnb-del-min-width\" align=\"center\" valign=\"top\" bgcolor=\"#f9fafc\" style=\"min-width:590px;background-color:#f9fafc\">\n" +
                "                                    <table width=\"590\" class=\"m_-8059325564055538151rnb-container\" cellpadding=\"0\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"padding-right:20px;padding-left:20px\">\n" +
                "                                        <tbody>\n" +
                "                                        <tr>\n" +
                "                                            <td height=\"10\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td>\n" +
                "                                                <div style=\"font-size:14px;color:#888888;font-weight:normal;text-align:center;font-family:Arial,Helvetica,sans-serif\">\n" +
                "  <div>\n" +
                "      \n" +
                "      <div class=\"logo-wrapper\">\n" +
                "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"115\" height=\"50\" viewBox=\"0 0 57 24\" fill=\"none\">\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M9.46285 -1.87714e-07L8.23062 4.69492L4.66265e-07 5.7674L9.46285 -1.87714e-07Z\" transform=\"translate(30.4037 4.99414)\" fill=\"#57BAE5\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M0.610044 9.62671L2.66254 1.10027L-1.07332e-06 2.10163e-07L0.610044 9.62671Z\" transform=\"translate(41.4889 14.3032)\" fill=\"#005472\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M8.23063 -3.98775e-07L6.06416 4.44454L4.66266e-07 1.07248L8.23063 -3.98775e-07Z\" transform=\"translate(30.4037 9.6875)\" fill=\"#34AFE4\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M5.63114 9.79645L5.02109 0.169734L1.49814e-06 4.97313e-07L5.63114 9.79645Z\" transform=\"translate(36.468 14.1333)\" fill=\"#0076A7\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.16647 -3.98775e-07L5.0211 4.61427L9.0372e-07 4.44454L2.16647 -3.98775e-07Z\" transform=\"translate(36.468 9.6875)\" fill=\"#009DE2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M1.23222 -1.87714e-07L8.0649 0.857113L-1.14127e-06 4.69492L1.23222 -1.87714e-07Z\" transform=\"translate(38.6343 4.99414)\" fill=\"#7ACDF2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M4.30071 6.70006e-08L2.18796e-07 4.99433L0.302021 0.373795L4.30071 6.70006e-08Z\" transform=\"translate(49.8758 2.86133)\" fill=\"#7ACDF2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.38367 0L-1.6112e-06 2.86081L1.8604 3.08762L2.38367 0Z\" transform=\"translate(54.1765)\" fill=\"#7ACDF2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M-9.42587e-07 2.59695L4.17851 0.226675L2.31811 4.53703e-08L-9.42587e-07 2.59695Z\" transform=\"translate(51.8584 2.86133)\" fill=\"#00ABE7\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.66254 5.73184L2.86496 4.49985e-07L6.83294e-07 4.63157L2.66254 5.73184Z\" transform=\"translate(41.4889 9.67188)\" fill=\"#0076A7\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M5.71959 -3.76432e-07L2.85463 4.63157L-1.14127e-06 0.0173007L5.71959 -3.76432e-07Z\" transform=\"translate(38.6343 9.67188)\" fill=\"#008DBE\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M8.06489 1.61085e-07L5.71959 3.8205L7.67823e-07 3.8378L8.06489 1.61085e-07Z\" transform=\"translate(38.6342 5.85156)\" fill=\"#57BAE5\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M0.202416 -3.76432e-07L5.75935e-07 5.73184L5.24374 11.0949L0.202416 -3.76432e-07Z\" transform=\"translate(44.1513 9.67188)\" fill=\"#00698D\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.76884 6.87298L-1.88518e-06 -2.83044e-07L0.0265067 9.86893L2.76884 6.87298Z\" transform=\"translate(49.3685 10.897)\" fill=\"#09A1CB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M5.52205 -5.74697e-08L5.01482 3.04199L-1.46607e-06 1.81598L5.52205 -5.74697e-08Z\" transform=\"translate(44.3538 7.85596)\" fill=\"#09A1CB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M3.047 4.13177L1.04696e-06 3.04199L0.507231 2.53113e-07L3.047 4.13177Z\" transform=\"translate(49.3685 7.85596)\" fill=\"#8BDAFF\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M3.3242 5.31895L1.3935e-06 2.34527e-07H1.89835L3.3242 5.31895Z\" transform=\"translate(50.1828 12.2598)\" fill=\"#7ACDF2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M-4.12042e-07 1.48578L2.55247 4.62054L2.85449 -2.67738e-08L-4.12042e-07 1.48578Z\" transform=\"translate(47.3233 3.23486)\" fill=\"#57BAE5\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M5.01482 1.226L4.29709e-07 -3.76432e-07L5.04119 11.0949L5.01482 1.226Z\" transform=\"translate(44.3538 9.67188)\" fill=\"#008DBE\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.7288 -4.52944e-07L3.83422 0.61709L-1.14154e-07 2.99594L2.7288 -4.52944e-07Z\" transform=\"translate(49.4087 17.771)\" fill=\"#0076A7\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M4.13833 6.62165L1.76722e-06 1.1935e-07L2.76884 6.87298L4.13833 6.62165Z\" transform=\"translate(49.3687 10.897)\" fill=\"#57BAE5\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.96958 2.06479e-07L1.60522e-06 4.95074L5.52205 3.13475L2.96958 2.06479e-07Z\" transform=\"translate(44.3538 4.72021)\" fill=\"#7ACDF2\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M0.124017 2.3745L0.929084 2.78316L1.73443 2.3745V7.00648H0.124017V2.3745ZM2.2097e-08 0.806573C2.2097e-08 0.362896 0.412926 -8.95983e-08 0.929224 -8.95983e-08C1.44552 -8.95983e-08 1.85845 0.362896 1.85845 0.806573C1.85845 1.26019 1.44552 1.61301 0.929224 1.61301C0.412926 1.61301 2.2097e-08 1.26019 2.2097e-08 0.806573Z\" transform=\"translate(7.65079 16.9233)\" fill=\"#42ACDB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M3.99534 1.71405e-07V2.71178H1.75508V1.71405e-07H0V7.05688H1.75508V4.33488H3.99534V7.05688H5.75042V1.71405e-07H3.99534Z\" transform=\"translate(0 16.8721)\" fill=\"#42ACDB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M2.25059 6.73431H0.629712V3.21594H-1.96291e-07V1.69366H0.629712V-1.67444e-07H2.25059V1.69366H2.88044V3.21594H2.25059V6.73431Z\" transform=\"translate(10.841 17.1958)\" fill=\"#42ACDB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M1.75507 5.43379H3.19013C3.74758 5.43379 3.92308 5.09105 3.92308 4.79872C3.92308 4.51646 3.73726 4.17373 3.19013 4.17373H1.75507V5.43379ZM1.75507 2.7017H3.06612C3.58227 2.7017 3.69611 2.34889 3.69611 2.15736C3.69611 1.96583 3.5926 1.61301 3.06612 1.61301H1.75507V2.7017ZM2.86998 2.82e-07C5.00701 2.82e-07 5.358 1.27041 5.358 1.91556C5.358 2.722 4.92456 3.17562 4.4702 3.39739C5.12056 3.55868 5.57478 4.19375 5.57478 4.99025C5.57478 6.09923 4.93475 7.05688 2.8185 7.05688H-9.79823e-08V2.82e-07H2.86998Z\" transform=\"translate(15.3633 16.8721)\" fill=\"#42ACDB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M3.60292 7.05688H1.84798V1.61301H-1.51798e-07V2.82e-07H5.45104V1.61301H3.60292V7.05688Z\" transform=\"translate(21.8471 16.8721)\" fill=\"#42ACDB\"/>\n" +
                "<path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M6.40092 1.16934L5.26495 2.19768C4.83152 1.81449 4.28439 1.61301 3.67532 1.61301C2.60172 1.61301 1.75494 2.38921 1.75494 3.599C1.75494 4.80866 2.60172 5.57491 3.67532 5.57491C4.28439 5.57491 4.83152 5.38338 5.26495 5.00019L6.40092 6.02853C5.71917 6.74425 4.74893 7.19787 3.67532 7.19787C1.64152 7.19787 -7.67551e-07 5.58486 -7.67551e-07 3.599C-7.67551e-07 1.61301 1.64152 1.74707e-07 3.67532 1.74707e-07C4.74893 1.74707e-07 5.71917 0.453622 6.40092 1.16934Z\" transform=\"translate(28.2073 16.8018)\" fill=\"#42ACDB\"/>\n" +
                "</svg>\n" +
                "<div class=\"landingHeader__slogan\">Operating since 2013</div>\n" +
                "</div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "                                            </td>\n" +
                "                                        </tr>\n" +
                "                                        <tr>\n" +
                "                                            <td height=\"10\" style=\"font-size:1px;line-height:1px\">&nbsp;</td>\n" +
                "                                        </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            </tbody>\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                </tbody>\n" +
                "            </table>\n" +
                "            \n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<img src=\"https://ci4.googleusercontent.com/proxy/pSlon1sXj3WQqIcI1Ob0u5l6TAGXhKJprGR8zkJQ_R0_0BAEhvsJOPJvD36o_K4xoR2PnUcmfSz8HVTBbPXAq9uowdFr-5ALESUEwoFt_XW185adEtjfnQfQZ7Jbx0V-QMH0FPLiQaGUjeR-rXOTnbRGZ31_PbkvqZxZlZ6RhP9YVADLvFgmnP32IQluItjeFPGPuqQankkp-XZvFqfaqQDOGL6F2X0HL6J8SM-CG8rA8ufGSimD49aYpZv1YsU-iiPBEKbjpfa1tJxpBhUJELWrIwBrnwWcHG3R99WrihXWRW4IvjJjaeTF2waV1TBEHi5Bt_W7YTk15cUHSIQoM16NYb4ftlglU9LFwKNJ9NscRRY9FnR3WqivFFW7ckOmqF9NwOxYm5VZ7TePdQD1eh6UY_49TFg=s0-d-e1-ft#https://u7397791.ct.sendgrid.net/wf/open?upn=qVflXOVh4SVkkOxIM6uidY4URdyXqnq4r2bjLCkl86Pe8RzkRO0dMULaEe6z8HoBpE5svg18J9kPrg8GhaM7fJhCTVhKdp3c0w7-2BrMjTqpsGbxm7pDB5wQhIiM5ZvtLX5ayvww8Xmm5q30kd7V2fCnk6JMlCb475x40fM7LLU4bQlb-2Brd9DwTPi4p4-2BT0zMpjmiBQGDSJY2aA4Vtk-2Bwr4MYvbrBDm6BGDchzaxMTtB0-3D\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" style=\"height:1px!important;width:1px!important;border-width:0!important;margin-top:0!important;margin-bottom:0!important;margin-right:0!important;margin-left:0!important;padding-top:0!important;padding-bottom:0!important;padding-right:0!important;padding-left:0!important\" class=\"CToWUd\"><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "</div></div>\n" +
                "</body\n" +
                "</html>");

        /*if(message.getAttachmentId() != null) {
            FbaAttachment attachment = fbaAttachmentService.findbyId(message.getAttachmentId());
            FileData fileData = new FileData();
            fileData.contentType = attachment.getContentType();
            fileData.fileName = attachment.getFileName();
            fileData.content = attachment.getFile();
            files.add(fileData);
        }*/

        //TODO add attachments
        try {
            result = sendAPI.httpPostFile("/email/send", files, values);
            System.out.println(result);


        } catch (Exception ex) {
            System.out.println("there was an error within sending email");
        }
        return result;
    }

}
