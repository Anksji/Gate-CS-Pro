﻿/*       P1      */
 while (true)
 {
        wants1 = true;
        while (wants2==true);

             /* Critical
              Section */

        wants1=false;
 }
/* Remainder section */

/*       P2       */
while (true)
 {
      wants2 = true;
       while (wants1==true);

              /* Critical
               Section */

         Wants2=false;
}
/* Remainder section */