"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.student = void 0;
var student = /** @class */ (function () {
    function student(id, name, dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    student.prototype.display = function () {
        console.log("\n                id  :".concat(this.id, "\n                name:").concat(this.name, "\n                Dept:").concat(this.dept, "\n        "));
    };
    return student;
}());
exports.student = student;
// let obj=new student(1,"jaff","CSE")
// obj.display()
