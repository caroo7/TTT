'use strict';

(function () {
    angular.module('ticTacToeApp').controller('GameController',
        function GameController($scope, GameService) {
            $scope.board = GameService.getBoard();
            $scope.drawSign = function (fieldId) {
                GameService.drawSign(fieldId);
            }

        }
    )
}
)();


