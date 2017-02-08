'use strict';

(
    function () {
        angular.module('ticTacToeApp').service('DrawSignsService',
            function ($http) {
              var url="http://localhost:8080/game"

                this.drawXAndReturnEndOfGame = function (field) {
                    
                    var context = field.getContext('2d');

                    var myField ={}

                     myField.sign = 'x';
                     myField.id=field.id;

                    context.beginPath();
                    context.moveTo(10, 10);
                    context.lineTo(40, 40);
                    context.moveTo(40, 10);
                    context.lineTo(10, 40);
                    context.stroke();
                    context.closePath();
                    context.stroke();

                    return $http.post(url,myField);

                }

                this.drawOAndReturnEndOfGame = function (field) {
                   
                    var context = field.getContext('2d');

                    field.sign = 'o';

                    context.beginPath();
                    context.arc(25, 25, 25, 0, 2 * Math.PI);
                    context.stroke();

                    return $http.post(url,field);

                }
            }
        )
    }
)
    ();