
class StringBuilderBufferDiff
{
              public static void main(String args[])
              {
                    long startTime=System.currentTimeMillis();

                    StringBuffer sb=new StringBuffer("Java");

                    for(int i=0;i<10000;i++)
                    {
                       sb.append("is easy");
                    }

                   System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime));

                    startTime=System.currentTimeMillis();

                    StringBuilder sb1=new StringBuilder("Java");

                    for(int i=0;i<10000;i++)
                    {
                       sb1.append("is easy");
                    }

                   System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime));
              }
}

//StringBuilder is faster than StringBuffer
//StringBuilder is non-thread safe and StringBuffer is thread safe
