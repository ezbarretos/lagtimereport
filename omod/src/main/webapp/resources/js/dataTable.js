/**
 * 
 */

jQuery(document).ready(function() {
	var table = $('#reportTable').DataTable({
		"bPaginate" : true,
		"iDisplayLength" : 10,
		"bLengthChange" : false,
		"bFilter" : true,
		"bSort" : false,
		"bInfo" : true,
		"bAutoWidth" : true,
		"bSortable" : false,
	});

});
