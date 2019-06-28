var mjAPI = require("mathjax-node");
mjAPI.config({
    displayErrors: false,
    undefinedCharError: false, 
    MathJax: {
        jax: ["input/TeX", "input/MathML", "output/SVG", "output/PreviewHTML"],
        extensions: ["tex2jax.js", "mml2jax.js", "MathMenu.js", "MathZoom.js", "fast-preview.js", "AssistiveMML.js", "a11y/accessibility-menu.js"],
        TeX: {
            extensions: ["AMSmath.js", "AMSsymbols.js", "noErrors.js", "noUndefined.js"]
        }
    }
});
mjAPI.start();

var yourMath = '$\\lim_{x \\rightarrow x_0} f(x) = f(x_0)中$';

mjAPI.typeset({
    math: yourMath,
    format: "TeX", // or "inline-TeX", "MathML", "Tex"
    svg: true,      // or svg:true, or html:true
}, function (data) {
    if (!data.errors) { console.log(data.svg) }
    // will produce:
    // <math xmlns="http://www.w3.org/1998/Math/MathML" display="block">
    //   <mi>E</mi>
    //   <mo>=</mo>
    //   <mi>m</mi>
    //   <msup>
    //     <mi>c</mi>
    //     <mn>2</mn>
    //   </msup>
    // </math>
});