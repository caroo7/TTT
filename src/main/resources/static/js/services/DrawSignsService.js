'use strict';

(
    function () {
        angular.module('ticTacToeApp').service('DrawSignsService',
            function ($http) {
              var url="http://localhost:8080/game"

                this.drawXAndReturnEndOfGame = function (field) {
                    
                   var context = field.getContext('2d');
                   field.isTaken=true;

                    context.beginPath();
                    context.moveTo(10, 10);
                    context.lineTo(40, 40);
                    context.moveTo(40, 10);
                    context.lineTo(10, 40);
                    context.stroke();
                    context.closePath();
                    context.stroke();

                    return $http.post(url,new Move(field.id,'x') );

                }

                this.drawOAndReturnEndOfGame = function (field) {
                    var context = field.getContext('2d');
                    field.isTaken=true;

                     var myField ={}

                     myField.sign = 'o';

                     myField.id=field.id;


                    context.beginPath();
                    context.arc(25, 25, 25, 0, 2 * Math.PI);
                    context.stroke();

                    return $http.post(url,new Move(field.id,'o'));

                }

                function Move(id,sign){
                       this.id=id;
                       this.sign=sign;
                }
            }
        )
    }
)
    ();