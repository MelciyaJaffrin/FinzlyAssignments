"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.dog = void 0;
var pet_1 = require("./pet");
var dog = /** @class */ (function (_super) {
    __extends(dog, _super);
    function dog(name) {
        var _this = _super.call(this) || this;
        _this.name = name;
        return _this;
    }
    dog.prototype.display = function () {
        console.log("This is dog class");
        console.log("Name of dog is: " + this.name);
    };
    return dog;
}(pet_1.pet));
exports.dog = dog;
