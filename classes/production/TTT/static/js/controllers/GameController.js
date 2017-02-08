'use strict';

(function () {
    angular.module('ticTacToeApp').controller('GameController',
        function GameController($scope, GameService) {
<<<<<<< HEAD
            $scope.endOfGame=function(){
             return GameService.endOfGame;
            }

=======
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9
            $scope.board = GameService.getBoard();
            $scope.drawSign = function (fieldId) {
                GameService.drawSign(fieldId);
            }

<<<<<<< HEAD
            $scope.refresh = function(){
                GameService.refresh();
            }

            $scope.restartGame=function(){
            GameService.restartGame();
            }
=======
>>>>>>> 5e48ad8a18abbc98602aa27957ff4d060633fcc9
        }
    )
}
)();


