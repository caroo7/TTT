'use strict';

(function () {
    angular.module('ticTacToeApp').service('GameService',
<<<<<<< HEAD
        function (CreateBoardService, DrawSignsService,$http,$route) {
=======
        function (CreateBoardService, DrawSignsService, $window) {
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9
            var self = this;
            var isXTurn = true;

            self.endOfGame = false;
<<<<<<< HEAD
            self.isADraw = false;
=======
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9

            self.getBoard = function () {
                return CreateBoardService.getBoard();
            }

            self.drawSign = function (fieldId) {
                var field = document.getElementById(fieldId);

<<<<<<< HEAD
                if (!field.isTaken && !self.endOfGame) {
                    var promise = isXTurn ? DrawSignsService.drawXAndReturnEndOfGame(field) :
                        DrawSignsService.drawOAndReturnEndOfGame(field);

                        self.checkEndOfGame(promise);
                }
            }


            self.checkEndOfGame = function (promise) {
                promise.then(
                    function (response) {
                        self.endOfGame = response.data.endOfGame;
                        self.isADraw = response.data.isADraw;
                    }
                )
                isXTurn = !isXTurn;

            }

           self.refresh=function(){
                  $http.put("http://localhost:8080/game/restart");
           }

          self.restartGame=function(){
            self.endOfGame = false;
            self.refresh();
            $route.reload();
           }
        }
    )
=======
                if (!field.sign  && !self.endOfGame) {
                   var promise = isXTurn ? DrawSignsService.drawXAndReturnEndOfGame(field) :
                        DrawSignsService.drawOAndReturnEndOfGame(field)

                    promise.then(
                       function(response){$window.alert(response.data)}
                    )

                    isXTurn = !isXTurn;
                }

            }
        }
    )


>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9
}
)();