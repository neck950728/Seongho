let checkResult = [true, true];


let original_totalPrice = parseInt($("input[name='totalPrice']").val());
let original_count = parseInt($("input[name='purchaseQuantity']").val())
let perPiecePrice = original_totalPrice / original_count;
$(function(){
	$("input[name='purchaseQuantity']").change(function(){
		let curCount = parseInt($(this).val());
		$("input[name='totalPrice']").val(perPiecePrice * curCount);
	});
});