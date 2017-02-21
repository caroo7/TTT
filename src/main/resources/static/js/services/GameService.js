'use strict';

(function () {
    angular.module('ticTacToeApp').service('GameService',
        function (CreateBoardService, DrawSignsService,$http,$route) {
            var self = this;
            var isXTurn = true;

            self.endOfGame = false;
            self.isADraw = false;

            self.getBoard = function () {
                return CreateBoardService.getBoard();
            }

            self.drawSign = function (fieldId) {
                var field = document.getElementById(fieldId);

                if (!field.isTaken && !self.endOfGame) {

                    if(isXTurn) {
                        field.className = "X";
                    } else {
                        field.className = "O";
                    }

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
}
)();