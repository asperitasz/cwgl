
(function ($) {
    $.fn.preview = function (T, html, id) {
        var xOffset = 10;
        var yOffset = -20;
        var w = $(window).width();

        $(T).click(function (e) {
            if ($("#" + id).length == 0) {
                if ($(this).html() != "") {
                 
                    $("body").append("<div id='" + id + "'><div>" + html + "</div></div>");
                }
            } else {
                $("#" + id).css({ "display": "block" });
            }
            $("#" + id).css({
                position: "absolute",
                padding: "4px",
                border: "1px solid #f3f3f3",
                backgroundColor: "#eeeeee",
                top: (e.pageY - yOffset) + "px",
                zIndex: 1000
            });
            $("#" + id + " > div").css({
                padding: "5px",
                backgroundColor: "white",
                border: "1px solid #cccccc"
            });
            $("#" + id + " > div > p").css({
                textAlign: "center",
                fontSize: "12px",
                // padding: "8px 0 3px",
                margin: "0"
            });

            $("#" + id).css("left", "15px").fadeIn("fast");
            //            if (e.pageX < w / 2) {
            //                $("#preview").css({
            //                    left: e.pageX + xOffset + "px",
            //                    right: "auto"
            //                }).fadeIn("fast");
            //            } else {
            //                $("#preview").css("right", (w - e.pageX + yOffset) + "px").css("left", "auto").fadeIn("fast");
            //            }
//            $(T).on("mouseout", function () {
//                $("#" + id).remove();
//            });
        });

    };
})(jQuery);