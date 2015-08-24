$(function () {
    var textarea = document.getElementById('editor');
    textarea.onkeydown = function () {
        autosize(textarea);
        document.getElementById('preview').innerHTML = marked(textarea.value);
        if (textarea.value.empty()) {
            document.getElementById('preview').innerHTML = "<h1>Preview Area</h1>";
        }
    };

    $(function () {
        $("input[type=submit], button")
            .button()
            .click(function (event) {
                event.preventDefault();
            });
    });
});
