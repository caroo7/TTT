'use strict';

(
    function () {
        angular.module('ticTacToeApp').service('CreateBoardService',
            function () {

                function Field(id) {
                    this.id = id;
                    this.sign = null;
                }

                this.getBoard = function () {
                    var board = [];

                    for (var fieldId = 0; fieldId < 9; fieldId++) {
                        board.push(new Field(fieldId + ""));
                    }
                    return board;
                }

            })
    }
)
    ();