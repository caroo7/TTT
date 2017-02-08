'use strict';

(function () {
    angular.module('ticTacToeApp').controller('GameController',
        function GameController($scope, GameService) {
            $scope.endOfGame=function(){
             return GameService.endOfGame;
            }

            $scope.board = GameService.getBoard();
            $scope.drawSign = function (fieldId) {
                GameService.drawSign(fieldId);
            }

            $scope.refresh = function(){
                GameService.refresh();
            }

            $scope.restartGame=function(){
            GameService.restartGame();
            }
        }
    )
}
)();


