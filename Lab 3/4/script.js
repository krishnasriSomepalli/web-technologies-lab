function calculate(){
    var in1 = parseInt(document.getElementById('in1').value);
    var in2 = parseInt(document.getElementById('in2').value);
    var add = in1+in2;
    var sub = in1-in2;
    var mul = in1*in2;
    var div = in1/in2;
    var result = "";
    result += "<p>a+b = " + add + "<p/>"
        + "<p>a-b = " + sub + "<p/>"
        + "<p>a*b = " + mul + "<p/>"
        + "<p>a/b = " + div + "<p/>";
    document.getElementById('result').innerHTML = result;
}