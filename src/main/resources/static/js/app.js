'use strict';
(function () {
    angular.module('ticTacToeApp', ['ngRoute']).
        config(function ($routeProvider) {
            $routeProvider.when('/',
                {
                    templateUrl: '/routes/board.html',
                    controller: 'GameController'
                }
            )
        }
        )
}
)();
