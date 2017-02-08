'use strict';

(function () {
    angular.module('ticTacToeApp').service('GameService',
        function (CreateBoardService, DrawSignsService, $window) {
            var self = this;
            var isXTurn = true;

            self.endOfGame = false;

            self.getBoard = function () {
                return CreateBoardService.getBoard();
            }

            self.drawSign = function (fieldId) {
                var field = document.getElementById(fieldId);

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


}
)();