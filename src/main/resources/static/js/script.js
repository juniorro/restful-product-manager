/*$(document).ready(function(){
$("#mytable #checkall").click(function () {
        if ($("#mytable #checkall").is(':checked')) {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", true);
            });

        } else {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", false);
            });
        }
    });
    
    $("[data-toggle=tooltip]").tooltip();
});*/


/* API method to get paging information */

'use strict';
var $ = jQuery;
$.getScript("https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.js", function(){
   
        $('#example').DataTable( {
            "paging":   true,
            "ordering": true,
            "info":     false
        } );
});
