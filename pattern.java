
     //    5 4 3 2 1 1 2 3 4 5
     //    4 3 2 1     1 2 3 4
     //    3 2 1         1 2 3
     //    2 1             1 2
     //    1                 1
     //    1                 1
     //    2 1             1 2
     //    3 2 1         1 2 3
     //    4 3 2 1     1 2 3 4
     //    5 4 3 2 1 1 2 3 4 5

        int f=0;
       for (int i=5;i>0;i--)
       {
           for (int j=i;j>0;j--)
           {
               System.out.printf("%d ",j);
           }
           for (int k=(5-i)*2;k>=1;k--)
           {
               System.out.printf("  ");
           }
           for (int m=1;m<=i;m++)
           {
               System.out.printf("%d ",m);
           }
           System.out.println();
       }

        for (int i=1;i<=5;i++)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.printf("%d ",j);
            }
            for (int k=(5-i)*2;k>=1;k--)
            {
                System.out.printf("  ");
            }
            for (int m=1;m<=i;m++)
            {
                System.out.printf("%d ",m);
            }
            System.out.println();
        }