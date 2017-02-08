'use strict';

(
    function () {
        angular.module('ticTacToeApp').service('DrawSignsService',
            function ($http) {
              var url="http://localhost:8080/game"

                this.drawXAndReturnEndOfGame = function (field) {
                    
<<<<<<< HEAD
                   var context = field.getContext('2d');
                   field.isTaken=true;
=======
                    var context = field.getContext('2d');

                    var myField ={}

                     myField.sign = 'x';
                     myField.id=field.id;
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9

                    context.beginPath();
                    context.moveTo(10, 10);
                    context.lineTo(40, 40);
                    context.moveTo(40, 10);
                    context.lineTo(10, 40);
                    context.stroke();
                    context.closePath();
                    context.stroke();

<<<<<<< HEAD
                    return $http.post(url,new Move(field.id,'x') );
=======
                    return $http.post(url,myField);
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9

                }

                this.drawOAndReturnEndOfGame = function (field) {
<<<<<<< HEAD
                    var context = field.getContext('2d');
                    field.isTaken=true;

                     var myField ={}

                     myField.sign = 'o';

                     myField.id=field.id;

=======
                   
                    var context = field.getContext('2d');

                    field.sign = 'o';
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9

                    context.beginPath();
                    context.arc(25, 25, 25, 0, 2 * Math.PI);
                    context.stroke();

<<<<<<< HEAD
                    return $http.post(url,new Move(field.id,'o'));

                }

                function Move(id,sign){
                       this.id=id;
                       this.sign=sign;
=======
                    return $http.post(url,field);

>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9
                }
            }
        )
    }
)
    ();