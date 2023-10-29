<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Success</title>
</head>
<body>
    <h1>付款成功!!!</h1>
    <p>購買人: ${user}</p>
    <p>儲值金額: ${points}</p>
</body>
<script type="text/javascript">
const userId = "${user}";
const totalAmount = "${totalAmount}";

fetch('', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({
      merchantTradeNo: merchantTradeNo,
      merchantTradeDate: merchantTradeDate,
      userId: userId,
      totalAmount: totalAmount,
      itemName: itemName,
    })
})
.then(response => response.json())
.then(data => {
    console.log("Order saved:", data);
})
.catch(error => {
    console.log("Error saving order:", error);
});
</script>
</html>
