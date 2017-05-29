$(document).ready( function () 
		{
	 var table = $('#categoryTable').DataTable({
			"sAjaxSource": "categories",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "c_id"},
		      { "mData": "c_name" },
			    { "mData": "products" }
			]
	 });
	 var table1 = $('#supplierTable').DataTable({
			"sAjaxSource": "suppliers",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "s_id"},
		      { "mData": "s_name" },
		      { "mData": "product" }
				 
			]

	 });
});
/*
$(document).ready( function () {
	 var table = $('#supplierTable').DataTable({
			"sAjaxSource": "/suppliers",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "S_ID"},
		      { "mData": "S_NAME" }
				 
			]

)
});
*/
