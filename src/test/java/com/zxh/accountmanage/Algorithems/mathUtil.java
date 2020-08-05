package com.zxh.accountmanage.Algorithems;

import org.junit.jupiter.api.Test;

public class mathUtil {
       @Test
       public void lineFitting() {
           double x[] = {1.0,2.0,2.3,3.4,4.5,6.5};
           double y[] = {1.3,2.3,3.4,4.0,5.6,7.2};
           int size = x.length;
           double xmean = 0.0;
           double ymean = 0.0;
           double xNum = 0.0;
           double yNum = 0.0;
           double xyNum = 0;
           double xNum2 = 0;
           double yNum2 = 0;
           double rss = 0;
           double tss = 0;
           double result[] = new double[8];

           for (int i = 0; i < size; i++) {
               xmean += x[i];
               ymean += y[i];
               xNum2 += x[i] * x[i];
               yNum2 += y[i] * y[i];
               xyNum += x[i] * y[i];
           }
           xNum = xmean;
           yNum = ymean;
           xmean /= size;
           ymean /= size;

           double sumx2 = 0.0f;
           double sumxy = 0.0f;
           for (int i = 0; i < size; i++) {
               sumx2 += (x[i] - xmean) * (x[i] - xmean);
               sumxy += (y[i] - ymean) * (x[i] - xmean);
           }

           double b = sumxy / sumx2;
           double a = ymean - b * xmean;

           result[0] = a;
           result[1] = b;
           System.out.println("a = " + a + ", b=" + b);

           double correlation = (xyNum - xNum * yNum / size)
                   / Math.sqrt((xNum2 - xNum * xNum / size) * (yNum2 - yNum * yNum / size));

           System.out.println("相关系数：" + correlation);
           result[2] = correlation;

           for (int i = 0; i < size; i++) {
               rss += (y[i] - (a + b * x[i])) * (y[i] - (a + b * x[i]));
               tss += (y[i] - ymean) * (y[i] - ymean);
           }

           double r2 = 1 - (rss / (size - 1 - 1)) / (tss / (size - 1));

           result[3] = r2;
           System.out.println("决定系数" + r2);
           result[4] = x.length;
           result[5] = x.length - 1 - 1;
           for(double d : result) {
               System.out.println(d);
           }
       }
}
