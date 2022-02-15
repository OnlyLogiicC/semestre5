/*********************************************
 * OPL 20.1.0.0 Model
 * Author: perezm
 * Creation Date: 15 févr. 2022 at 10:35:05
 *********************************************/

 using CP ;
 dvar int x in 5..12 ;
 dvar int y in 2..17 ;
 constraints{
   x + y == 17 ;
   x - y == 5 ;
 }