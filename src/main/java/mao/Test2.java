package mao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project name(项目名称)：java报表_Word转PDF
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/7
 * Time(创建时间)： 20:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        System.out.println("提示：输入“-1”转换当前路径下的所有docx文件");
        System.out.print("请输入docx文件名：");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        if (!fileName.equals("-1"))
        {
            Test1.docxToPdf(fileName);
        }
        else
        {
            //转换当前路径下的所有docx文件
            List<String> fileList = new ArrayList<>();
            File[] files = new File("./").listFiles();
            if (files == null || files.length == 0)
            {
                return;
            }
            System.out.println("---");
            for (File file : files)
            {
                if (file.getName().endsWith(".docx"))
                {
                    System.out.println("即将转换的文件：" + file.getName());
                    fileList.add(file.getName());
                }
            }
            System.out.println("---");
            for (String docxFile : fileList)
            {
                Test1.docxToPdf(docxFile);
            }
        }
    }
}
