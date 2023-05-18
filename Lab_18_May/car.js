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
var Car = /** @class */ (function () {
    function Car(regNo) {
        this.regNo = regNo;
    }
    return Car;
}());
var Maruti = /** @class */ (function (_super) {
    __extends(Maruti, _super);
    function Maruti(regNo, brake) {
        var _this = _super.call(this, regNo) || this;
        _this.brake = brake;
        return _this;
    }
    Maruti.prototype.brakingsystem = function () {
        var car_brake = this.brake;
        console.log("braking System of car regNo is " + this.regNo + " is " + car_brake);
    };
    return Maruti;
}(Car));
var Suzuki = /** @class */ (function (_super) {
    __extends(Suzuki, _super);
    function Suzuki(regNo, brake) {
        var _this = _super.call(this, regNo) || this;
        _this.brake = brake;
        return _this;
    }
    Suzuki.prototype.brakingsystem = function () {
        var car_brake = this.brake;
        console.log("braking System of car regNo is " + this.regNo + " is " + car_brake);
    };
    return Suzuki;
}(Car));
var swift = new Maruti(1234, "bad");
swift.brakingsystem();
var Alto = new Suzuki(5678, "good brakinga and have abs system");
Alto.brakingsystem();
